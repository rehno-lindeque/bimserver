/**
 *  (c) Copyright bimserver.org 2009
 *  Licensed under GNU GPLv3
 *  http://www.gnu.org/licenses/gpl-3.0.txt
 *  For more information mail to license@bimserver.org
 *  
 *  Bimserver.org is free software: you can redistribute it and/or modify 
 *  it under the terms of the GNU General Public License as published by 
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Bimserver.org is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License a 
 *  long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style For Defined Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont#getColour <em>Colour</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyleForDefinedFont()
 * @model
 * @generated
 */
public interface IfcTextStyleForDefinedFont extends IfcCharacterStyleSelect
{
	/**
	 * Returns the value of the '<em><b>Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour</em>' reference.
	 * @see #setColour(IfcColour)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyleForDefinedFont_Colour()
	 * @model
	 * @generated
	 */
	IfcColour getColour();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont#getColour <em>Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' reference.
	 * @see #getColour()
	 * @generated
	 */
	void setColour(IfcColour value);

	/**
	 * Returns the value of the '<em><b>Background Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Colour</em>' reference.
	 * @see #isSetBackgroundColour()
	 * @see #unsetBackgroundColour()
	 * @see #setBackgroundColour(IfcColour)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyleForDefinedFont_BackgroundColour()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcColour getBackgroundColour();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Colour</em>' reference.
	 * @see #isSetBackgroundColour()
	 * @see #unsetBackgroundColour()
	 * @see #getBackgroundColour()
	 * @generated
	 */
	void setBackgroundColour(IfcColour value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBackgroundColour()
	 * @see #getBackgroundColour()
	 * @see #setBackgroundColour(IfcColour)
	 * @generated
	 */
	void unsetBackgroundColour();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Background Colour</em>' reference is set.
	 * @see #unsetBackgroundColour()
	 * @see #getBackgroundColour()
	 * @see #setBackgroundColour(IfcColour)
	 * @generated
	 */
	boolean isSetBackgroundColour();

} // IfcTextStyleForDefinedFont
