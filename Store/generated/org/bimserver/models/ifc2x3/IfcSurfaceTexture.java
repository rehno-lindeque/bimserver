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

import org.bimserver.emf.IdEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getRepeatS <em>Repeat S</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getRepeatT <em>Repeat T</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceTexture()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcSurfaceTexture extends IdEObject
{
	/**
	 * Returns the value of the '<em><b>Repeat S</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat S</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #setRepeatS(Tristate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceTexture_RepeatS()
	 * @model
	 * @generated
	 */
	Tristate getRepeatS();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getRepeatS <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat S</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #getRepeatS()
	 * @generated
	 */
	void setRepeatS(Tristate value);

	/**
	 * Returns the value of the '<em><b>Repeat T</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat T</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #setRepeatT(Tristate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceTexture_RepeatT()
	 * @model
	 * @generated
	 */
	Tristate getRepeatT();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getRepeatT <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat T</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #getRepeatT()
	 * @generated
	 */
	void setRepeatT(Tristate value);

	/**
	 * Returns the value of the '<em><b>Texture Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcSurfaceTextureEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceTextureEnum
	 * @see #setTextureType(IfcSurfaceTextureEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceTexture_TextureType()
	 * @model
	 * @generated
	 */
	IfcSurfaceTextureEnum getTextureType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceTextureEnum
	 * @see #getTextureType()
	 * @generated
	 */
	void setTextureType(IfcSurfaceTextureEnum value);

	/**
	 * Returns the value of the '<em><b>Texture Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Transform</em>' reference.
	 * @see #isSetTextureTransform()
	 * @see #unsetTextureTransform()
	 * @see #setTextureTransform(IfcCartesianTransformationOperator2D)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceTexture_TextureTransform()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCartesianTransformationOperator2D getTextureTransform();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Transform</em>' reference.
	 * @see #isSetTextureTransform()
	 * @see #unsetTextureTransform()
	 * @see #getTextureTransform()
	 * @generated
	 */
	void setTextureTransform(IfcCartesianTransformationOperator2D value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureTransform()
	 * @see #getTextureTransform()
	 * @see #setTextureTransform(IfcCartesianTransformationOperator2D)
	 * @generated
	 */
	void unsetTextureTransform();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Transform</em>' reference is set.
	 * @see #unsetTextureTransform()
	 * @see #getTextureTransform()
	 * @see #setTextureTransform(IfcCartesianTransformationOperator2D)
	 * @generated
	 */
	boolean isSetTextureTransform();

} // IfcSurfaceTexture
