package org.bimserver.clients.j3d.behavior;
/*
 * $RCSfile: ViewPlatformAWTBehavior.java,v $
 *
 * Copyright (c) 2007 Sun Microsystems, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistribution of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * Neither the name of Sun Microsystems, Inc. or the names of
 * contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 * EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL
 * NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
 * USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR
 * ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL,
 * CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND
 * REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF OR
 * INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that this software is not designed, licensed or
 * intended for use in the design, construction, operation or
 * maintenance of any nuclear facility.
 *
 * $Revision: 1.5 $
 * $Date: 2007/02/09 17:20:15 $
 * $State: Exp $
 */

/*
 * ViewPlatformAWTBehaviorInterim is based on "com.sun.j3d.utils.behaviors.vp.ViewPlatformAWTBehavior".
 *
 * Redistribution and use are permitted according to the copyrigth notice above mentioned.
 * 
 * Author: August Lammersdorf, www.InteractiveMesh.com/org
 * Version: 1.1
 * Date: June 26, 2007 
 * 
 */

/*
 * Release notes: see OrbitBehaviorInterim 
 * 
 */

//package com.sun.j3d.utils.behaviors.vp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupCondition;
import javax.media.j3d.WakeupOnBehaviorPost;
import javax.media.j3d.WakeupOnElapsedFrames;

/**
 * Abstract class which implements much of the event tracking and
 * state updating in a thread safe manner.
 *
 * AWT Events are captured and placed in a queue.
 *
 * While there are pending events or motion the behavior will wake
 * up every frame, call processAWTEvents and integrateTransforms. 
 *
 * @since Java 3D 1.2.1   
 */
public abstract class ViewPlatformAWTBehaviorInterim extends ViewPlatformBehaviorInterim
            implements MouseListener, MouseMotionListener, MouseWheelListener { // KeyListener, 

//    private final static boolean DEBUG = false;
    
    /**
     * Behavior PostId used in this behavior
     */
    protected final static int POST_ID = 9998;

    /**
     * The different criterion for the behavior to wakeup
     */
    protected WakeupOnElapsedFrames frameWakeup;
    
    /**
     * The Or of the different criterion for the behavior to wakeup
     */
    protected WakeupOnBehaviorPost postWakeup;

    /**
     * The target Transform3D for this behavior
     */
    protected Transform3D targetTransform = new Transform3D();
    
    /**
     * Boolean for whether the mouse is in motion
     */
    protected boolean motion = false;
    
    /**
     * Flag indicating Behavior should listen for Mouse Events
     */
    public final static int MOUSE_LISTENER = 0x01;

    /**
     * Flag indicating Behavior should listen for Mouse Motion Events
     */
    public final static int MOUSE_MOTION_LISTENER = 0x02;

    /**
     * Flag indicating Behavior should listen for Key Events
     */
    //public final static int KEY_LISTENER = 0x04;

    /**
     * Flag indicating Behavior should listen for MouseWheel Events
     */
    public final static int MOUSE_WHEEL_LISTENER = 0x08;

    /**
     * The Component from which this Behavior gets AWT events
     */
    //protected Component components[];
    protected Component component = null;

    @SuppressWarnings({ "rawtypes" })
	private ArrayList eventQueue = new ArrayList();
    private int listenerFlags = 0;
    private boolean firstEvent = false;

    /**
     * Parameterless constructor for this behavior.  
     * @since Java 3D 1.3
     */
    protected ViewPlatformAWTBehaviorInterim() {
    	super();
    }

    /**
     * Construct a behavior which listens for events specified by the given
     * flags. 
     * 
     * @param listenerFlags Indicates which listener should be registered,
     * one or more of MOUSE_LISTENER, MOUSE_MOTION_LISTENER, MOUSE_WHEEL_LISTENER
     * @since Java 3D 1.3
     */
    protected ViewPlatformAWTBehaviorInterim(int listenerFlags) {
    	super();
    	setListenerFlags(listenerFlags);
    }
    
    /**
     * Sets listener flags for this behavior.
     *
     * @param listenerFlags Indicates which listener should be registered,
     * one or more of MOUSE_LISTENER, MOUSE_MOTION_LISTENER, MOUSE_WHEEL_LISTENER
     * @since Java 3D 1.3
     */
    protected void setListenerFlags(int listenerFlags) {
        this.listenerFlags = listenerFlags;
    }
    
    /**
     * Initializes the behavior.
     * NOTE: Applications should not call this method. It is called by the
     * Java 3D behavior scheduler.
     */
    @Override
    public void initialize() {
        frameWakeup = new WakeupOnElapsedFrames( 0 );
        postWakeup = new WakeupOnBehaviorPost( this, POST_ID );
        
        wakeupOn(postWakeup);
    }

    /**
     * Process a stimulus meant for this behavior. 
     * NOTE: Applications should not call this method. It is called by the
     * Java 3D behavior scheduler.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public void processStimulus( java.util.Enumeration behEnum ) {
        boolean hadPost = false;

        while(behEnum.hasMoreElements()) {
        	
            WakeupCondition wakeup = (WakeupCondition)behEnum.nextElement();
            
            if (wakeup instanceof WakeupOnElapsedFrames) {
            	AWTEvent[] events = null;
            	// access to event queue must be synchronized
            	synchronized(eventQueue) {
                    events = (AWTEvent[])eventQueue.toArray( new AWTEvent[eventQueue.size()] );
                    eventQueue.clear();
            	}
                processAWTEvents(events);
                
                if (motion)
                    integrateTransforms();
            }
            else if (wakeup instanceof WakeupOnBehaviorPost) {
                hadPost = true;
            } 
        }
        
        if (motion || hadPost) {
        	// wake up on behavior posts and elapsed frames if in motion
            wakeupOn(frameWakeup);
        } 
        else {
        	// Asure receiving KeyEvents for other KeyListener (since 1.1)
        	if (component != null)
        		component.requestFocusInWindow();
        	// only wake up on behavior posts if not in motion
            wakeupOn(postWakeup);
        }
    }
    
    /**
     * Overload setEnable from Behavior.
     *
     * Adds/Removes the AWT listeners depending on the requested
     * state.
     */
    @Override
    public void setEnable( boolean state ) {
        if (state == getEnable())
            return;
        
        super.setEnable(state);

        if (component != null && targetTG != null) {
        	enableListeners(state);
        }
    }
    
    private void enableListeners( boolean enable ) {
        
        if (component == null)
            throw new IllegalStateException("No component available !!");
        
        if (enable) {
        	
        	firstEvent = true ; 
        	
            if ( (listenerFlags & MOUSE_LISTENER)!=0)
                 component.addMouseListener(this);

            if ( (listenerFlags & MOUSE_MOTION_LISTENER)!=0)
                component.addMouseMotionListener(this);

            if ( (listenerFlags & MOUSE_WHEEL_LISTENER)!=0)
                component.addMouseWheelListener(this);

            //if ( (listenerFlags & KEY_LISTENER)!=0)
            //    component.addKeyListener(this);
        } 
        else {
            if ( (listenerFlags & MOUSE_LISTENER)!=0)
                component.removeMouseListener(this);

            if ( (listenerFlags & MOUSE_MOTION_LISTENER)!=0)
                component.removeMouseMotionListener(this);

            if ( (listenerFlags & MOUSE_WHEEL_LISTENER)!=0)
                component.removeMouseWheelListener(this);

            //if ( (listenerFlags & KEY_LISTENER)!=0)
            //    component.removeKeyListener(this);
        }
    }
    /**
     * Sets the Component used to listen for mouse,
     * mouse motion, and mouse wheel events.
     * If a subclass overrides this method, it must
     * call super.setAWTComponent(c).
     *
     * @param c the source Component for this behavior
     */
    public void setAWTComponent(Component c) {
 
        if (component != null)
             enableListeners(false);
       
        component = c;

        if (component != null && targetTG != null) {
            if (getEnable())
            	enableListeners(true);
        }                
    }
    
    /**
     * Sets the ViewPlatform's TransformGroup for this behavior.  
     * If a subclass overrides this method, it must
     * call super.setViewingTransformGroup(tg).
     *      
     * @param tg the target TransformGroup for this behavior
     */
    public void setViewingTransformGroup(TransformGroup tg) {    
        
        if (component != null)
             enableListeners(false);
        
        super.setViewingTransformGroup(tg);
        
        if (component != null && targetTG != null) {
            if (getEnable())
            	enableListeners(true);
        }                
    }
    
    /**
     * This is called once per frame if there are any AWT events to
     * process.
     *
     * The <code>motion</code> variable will be true when the method
     * is called. If it is true when the method returns integrateTransforms
     * will be called immediately.
     *
     * The AWTEvents are presented in the array in the order in which they
     * arrived from AWT.
     */
    protected abstract void processAWTEvents( final java.awt.AWTEvent[] events );
    
    /**
     * Called once per frame (if the view is moving) to calculate the new
     * view platform transform
     */
    protected abstract void integrateTransforms();

    /**
     * Queue AWTEvents in a thread safe manner.
     *
     * If subclasses override this method they must call
     * super.queueAWTEvent(e)
     */
    @SuppressWarnings("unchecked")
	protected void queueAWTEvent( AWTEvent e ) {
		// add new event to the queue
		// must be MT safe
		synchronized (eventQueue) {
		    eventQueue.add(e);
		    // Only need to post if this is the only event in the queue.
		    // There have been reports that the first event after
		    // setViewingPlatform() is sometimes missed, so check the
		    // firstEvent flag as well.
		    if (firstEvent || eventQueue.size() == 1) {
		    	firstEvent = false;
		    	postId( POST_ID );
		    }
		}
    }
    
    public void mouseClicked(final MouseEvent e) {
        ;//queueAWTEvent( e ) since 1.1
    }
    
    public void mouseEntered(final MouseEvent e) {
        ;//queueAWTEvent( e ) since 1.1
    }
    
    public void mouseExited(final MouseEvent e) {
        ;//queueAWTEvent( e ) since 1.1
    }

    public void mousePressed(final MouseEvent e) {
        queueAWTEvent( e );
    }

    public void mouseReleased(final MouseEvent e) {
        queueAWTEvent( e );
    }

    public void mouseDragged(final MouseEvent e) {
        queueAWTEvent( e );
    }

    public void mouseMoved(final MouseEvent e) {
        ;//queueAWTEvent( e ) since 1.1
    }
    
    public void mouseWheelMoved( final java.awt.event.MouseWheelEvent e) {
    	queueAWTEvent( e );
    }    
    /*
    public void keyReleased(final java.awt.event.KeyEvent e) {
        queueAWTEvent( e );
    }
    
    public void keyPressed(final java.awt.event.KeyEvent e) {
        queueAWTEvent( e );
    }
    
    public void keyTyped(final java.awt.event.KeyEvent e) {
        queueAWTEvent( e );
    }
    */
}

