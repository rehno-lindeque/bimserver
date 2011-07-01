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
 * A representation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepthAsString <em>Lining Depth As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThicknessAsString <em>Lining Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThicknessAsString <em>Transom Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThicknessAsString <em>Mullion Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffsetAsString <em>First Transom Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffsetAsString <em>Second Transom Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffsetAsString <em>First Mullion Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffsetAsString <em>Second Mullion Offset As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties()
 * @model
 * @generated
 */
public interface IfcWindowLiningProperties extends IfcPropertySetDefinition
{
	/**
	 * Returns the value of the '<em><b>Lining Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Depth</em>' attribute.
	 * @see #isSetLiningDepth()
	 * @see #unsetLiningDepth()
	 * @see #setLiningDepth(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_LiningDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	float getLiningDepth();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Depth</em>' attribute.
	 * @see #isSetLiningDepth()
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @generated
	 */
	void setLiningDepth(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(float)
	 * @generated
	 */
	void unsetLiningDepth();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Depth</em>' attribute is set.
	 * @see #unsetLiningDepth()
	 * @see #getLiningDepth()
	 * @see #setLiningDepth(float)
	 * @generated
	 */
	boolean isSetLiningDepth();

	/**
	 * Returns the value of the '<em><b>Lining Depth As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Depth As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Depth As String</em>' attribute.
	 * @see #isSetLiningDepthAsString()
	 * @see #unsetLiningDepthAsString()
	 * @see #setLiningDepthAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_LiningDepthAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getLiningDepthAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepthAsString <em>Lining Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Depth As String</em>' attribute.
	 * @see #isSetLiningDepthAsString()
	 * @see #unsetLiningDepthAsString()
	 * @see #getLiningDepthAsString()
	 * @generated
	 */
	void setLiningDepthAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepthAsString <em>Lining Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningDepthAsString()
	 * @see #getLiningDepthAsString()
	 * @see #setLiningDepthAsString(String)
	 * @generated
	 */
	void unsetLiningDepthAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningDepthAsString <em>Lining Depth As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Depth As String</em>' attribute is set.
	 * @see #unsetLiningDepthAsString()
	 * @see #getLiningDepthAsString()
	 * @see #setLiningDepthAsString(String)
	 * @generated
	 */
	boolean isSetLiningDepthAsString();

	/**
	 * Returns the value of the '<em><b>Lining Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Thickness</em>' attribute.
	 * @see #isSetLiningThickness()
	 * @see #unsetLiningThickness()
	 * @see #setLiningThickness(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_LiningThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	float getLiningThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Thickness</em>' attribute.
	 * @see #isSetLiningThickness()
	 * @see #unsetLiningThickness()
	 * @see #getLiningThickness()
	 * @generated
	 */
	void setLiningThickness(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(float)
	 * @generated
	 */
	void unsetLiningThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Thickness</em>' attribute is set.
	 * @see #unsetLiningThickness()
	 * @see #getLiningThickness()
	 * @see #setLiningThickness(float)
	 * @generated
	 */
	boolean isSetLiningThickness();

	/**
	 * Returns the value of the '<em><b>Lining Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Thickness As String</em>' attribute.
	 * @see #isSetLiningThicknessAsString()
	 * @see #unsetLiningThicknessAsString()
	 * @see #setLiningThicknessAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_LiningThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getLiningThicknessAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThicknessAsString <em>Lining Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Thickness As String</em>' attribute.
	 * @see #isSetLiningThicknessAsString()
	 * @see #unsetLiningThicknessAsString()
	 * @see #getLiningThicknessAsString()
	 * @generated
	 */
	void setLiningThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThicknessAsString <em>Lining Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLiningThicknessAsString()
	 * @see #getLiningThicknessAsString()
	 * @see #setLiningThicknessAsString(String)
	 * @generated
	 */
	void unsetLiningThicknessAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getLiningThicknessAsString <em>Lining Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lining Thickness As String</em>' attribute is set.
	 * @see #unsetLiningThicknessAsString()
	 * @see #getLiningThicknessAsString()
	 * @see #setLiningThicknessAsString(String)
	 * @generated
	 */
	boolean isSetLiningThicknessAsString();

	/**
	 * Returns the value of the '<em><b>Transom Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Thickness</em>' attribute.
	 * @see #isSetTransomThickness()
	 * @see #unsetTransomThickness()
	 * @see #setTransomThickness(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_TransomThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTransomThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Thickness</em>' attribute.
	 * @see #isSetTransomThickness()
	 * @see #unsetTransomThickness()
	 * @see #getTransomThickness()
	 * @generated
	 */
	void setTransomThickness(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(float)
	 * @generated
	 */
	void unsetTransomThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transom Thickness</em>' attribute is set.
	 * @see #unsetTransomThickness()
	 * @see #getTransomThickness()
	 * @see #setTransomThickness(float)
	 * @generated
	 */
	boolean isSetTransomThickness();

	/**
	 * Returns the value of the '<em><b>Transom Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Thickness As String</em>' attribute.
	 * @see #isSetTransomThicknessAsString()
	 * @see #unsetTransomThicknessAsString()
	 * @see #setTransomThicknessAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_TransomThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTransomThicknessAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThicknessAsString <em>Transom Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Thickness As String</em>' attribute.
	 * @see #isSetTransomThicknessAsString()
	 * @see #unsetTransomThicknessAsString()
	 * @see #getTransomThicknessAsString()
	 * @generated
	 */
	void setTransomThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThicknessAsString <em>Transom Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransomThicknessAsString()
	 * @see #getTransomThicknessAsString()
	 * @see #setTransomThicknessAsString(String)
	 * @generated
	 */
	void unsetTransomThicknessAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getTransomThicknessAsString <em>Transom Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transom Thickness As String</em>' attribute is set.
	 * @see #unsetTransomThicknessAsString()
	 * @see #getTransomThicknessAsString()
	 * @see #setTransomThicknessAsString(String)
	 * @generated
	 */
	boolean isSetTransomThicknessAsString();

	/**
	 * Returns the value of the '<em><b>Mullion Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mullion Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mullion Thickness</em>' attribute.
	 * @see #isSetMullionThickness()
	 * @see #unsetMullionThickness()
	 * @see #setMullionThickness(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_MullionThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMullionThickness();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mullion Thickness</em>' attribute.
	 * @see #isSetMullionThickness()
	 * @see #unsetMullionThickness()
	 * @see #getMullionThickness()
	 * @generated
	 */
	void setMullionThickness(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMullionThickness()
	 * @see #getMullionThickness()
	 * @see #setMullionThickness(float)
	 * @generated
	 */
	void unsetMullionThickness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mullion Thickness</em>' attribute is set.
	 * @see #unsetMullionThickness()
	 * @see #getMullionThickness()
	 * @see #setMullionThickness(float)
	 * @generated
	 */
	boolean isSetMullionThickness();

	/**
	 * Returns the value of the '<em><b>Mullion Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mullion Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mullion Thickness As String</em>' attribute.
	 * @see #isSetMullionThicknessAsString()
	 * @see #unsetMullionThicknessAsString()
	 * @see #setMullionThicknessAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_MullionThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMullionThicknessAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThicknessAsString <em>Mullion Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mullion Thickness As String</em>' attribute.
	 * @see #isSetMullionThicknessAsString()
	 * @see #unsetMullionThicknessAsString()
	 * @see #getMullionThicknessAsString()
	 * @generated
	 */
	void setMullionThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThicknessAsString <em>Mullion Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMullionThicknessAsString()
	 * @see #getMullionThicknessAsString()
	 * @see #setMullionThicknessAsString(String)
	 * @generated
	 */
	void unsetMullionThicknessAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getMullionThicknessAsString <em>Mullion Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mullion Thickness As String</em>' attribute is set.
	 * @see #unsetMullionThicknessAsString()
	 * @see #getMullionThicknessAsString()
	 * @see #setMullionThicknessAsString(String)
	 * @generated
	 */
	boolean isSetMullionThicknessAsString();

	/**
	 * Returns the value of the '<em><b>First Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Transom Offset</em>' attribute.
	 * @see #isSetFirstTransomOffset()
	 * @see #unsetFirstTransomOffset()
	 * @see #setFirstTransomOffset(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_FirstTransomOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	float getFirstTransomOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Transom Offset</em>' attribute.
	 * @see #isSetFirstTransomOffset()
	 * @see #unsetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @generated
	 */
	void setFirstTransomOffset(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @see #setFirstTransomOffset(float)
	 * @generated
	 */
	void unsetFirstTransomOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Transom Offset</em>' attribute is set.
	 * @see #unsetFirstTransomOffset()
	 * @see #getFirstTransomOffset()
	 * @see #setFirstTransomOffset(float)
	 * @generated
	 */
	boolean isSetFirstTransomOffset();

	/**
	 * Returns the value of the '<em><b>First Transom Offset As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Transom Offset As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Transom Offset As String</em>' attribute.
	 * @see #isSetFirstTransomOffsetAsString()
	 * @see #unsetFirstTransomOffsetAsString()
	 * @see #setFirstTransomOffsetAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_FirstTransomOffsetAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFirstTransomOffsetAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffsetAsString <em>First Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Transom Offset As String</em>' attribute.
	 * @see #isSetFirstTransomOffsetAsString()
	 * @see #unsetFirstTransomOffsetAsString()
	 * @see #getFirstTransomOffsetAsString()
	 * @generated
	 */
	void setFirstTransomOffsetAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffsetAsString <em>First Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstTransomOffsetAsString()
	 * @see #getFirstTransomOffsetAsString()
	 * @see #setFirstTransomOffsetAsString(String)
	 * @generated
	 */
	void unsetFirstTransomOffsetAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstTransomOffsetAsString <em>First Transom Offset As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Transom Offset As String</em>' attribute is set.
	 * @see #unsetFirstTransomOffsetAsString()
	 * @see #getFirstTransomOffsetAsString()
	 * @see #setFirstTransomOffsetAsString(String)
	 * @generated
	 */
	boolean isSetFirstTransomOffsetAsString();

	/**
	 * Returns the value of the '<em><b>Second Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Transom Offset</em>' attribute.
	 * @see #isSetSecondTransomOffset()
	 * @see #unsetSecondTransomOffset()
	 * @see #setSecondTransomOffset(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_SecondTransomOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	float getSecondTransomOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Transom Offset</em>' attribute.
	 * @see #isSetSecondTransomOffset()
	 * @see #unsetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @generated
	 */
	void setSecondTransomOffset(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @see #setSecondTransomOffset(float)
	 * @generated
	 */
	void unsetSecondTransomOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Transom Offset</em>' attribute is set.
	 * @see #unsetSecondTransomOffset()
	 * @see #getSecondTransomOffset()
	 * @see #setSecondTransomOffset(float)
	 * @generated
	 */
	boolean isSetSecondTransomOffset();

	/**
	 * Returns the value of the '<em><b>Second Transom Offset As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Transom Offset As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Transom Offset As String</em>' attribute.
	 * @see #isSetSecondTransomOffsetAsString()
	 * @see #unsetSecondTransomOffsetAsString()
	 * @see #setSecondTransomOffsetAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_SecondTransomOffsetAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSecondTransomOffsetAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffsetAsString <em>Second Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Transom Offset As String</em>' attribute.
	 * @see #isSetSecondTransomOffsetAsString()
	 * @see #unsetSecondTransomOffsetAsString()
	 * @see #getSecondTransomOffsetAsString()
	 * @generated
	 */
	void setSecondTransomOffsetAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffsetAsString <em>Second Transom Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondTransomOffsetAsString()
	 * @see #getSecondTransomOffsetAsString()
	 * @see #setSecondTransomOffsetAsString(String)
	 * @generated
	 */
	void unsetSecondTransomOffsetAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondTransomOffsetAsString <em>Second Transom Offset As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Transom Offset As String</em>' attribute is set.
	 * @see #unsetSecondTransomOffsetAsString()
	 * @see #getSecondTransomOffsetAsString()
	 * @see #setSecondTransomOffsetAsString(String)
	 * @generated
	 */
	boolean isSetSecondTransomOffsetAsString();

	/**
	 * Returns the value of the '<em><b>First Mullion Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Mullion Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Mullion Offset</em>' attribute.
	 * @see #isSetFirstMullionOffset()
	 * @see #unsetFirstMullionOffset()
	 * @see #setFirstMullionOffset(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_FirstMullionOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	float getFirstMullionOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Mullion Offset</em>' attribute.
	 * @see #isSetFirstMullionOffset()
	 * @see #unsetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @generated
	 */
	void setFirstMullionOffset(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @see #setFirstMullionOffset(float)
	 * @generated
	 */
	void unsetFirstMullionOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Mullion Offset</em>' attribute is set.
	 * @see #unsetFirstMullionOffset()
	 * @see #getFirstMullionOffset()
	 * @see #setFirstMullionOffset(float)
	 * @generated
	 */
	boolean isSetFirstMullionOffset();

	/**
	 * Returns the value of the '<em><b>First Mullion Offset As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Mullion Offset As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Mullion Offset As String</em>' attribute.
	 * @see #isSetFirstMullionOffsetAsString()
	 * @see #unsetFirstMullionOffsetAsString()
	 * @see #setFirstMullionOffsetAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_FirstMullionOffsetAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFirstMullionOffsetAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffsetAsString <em>First Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Mullion Offset As String</em>' attribute.
	 * @see #isSetFirstMullionOffsetAsString()
	 * @see #unsetFirstMullionOffsetAsString()
	 * @see #getFirstMullionOffsetAsString()
	 * @generated
	 */
	void setFirstMullionOffsetAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffsetAsString <em>First Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstMullionOffsetAsString()
	 * @see #getFirstMullionOffsetAsString()
	 * @see #setFirstMullionOffsetAsString(String)
	 * @generated
	 */
	void unsetFirstMullionOffsetAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getFirstMullionOffsetAsString <em>First Mullion Offset As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Mullion Offset As String</em>' attribute is set.
	 * @see #unsetFirstMullionOffsetAsString()
	 * @see #getFirstMullionOffsetAsString()
	 * @see #setFirstMullionOffsetAsString(String)
	 * @generated
	 */
	boolean isSetFirstMullionOffsetAsString();

	/**
	 * Returns the value of the '<em><b>Second Mullion Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Mullion Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Mullion Offset</em>' attribute.
	 * @see #isSetSecondMullionOffset()
	 * @see #unsetSecondMullionOffset()
	 * @see #setSecondMullionOffset(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_SecondMullionOffset()
	 * @model unsettable="true"
	 * @generated
	 */
	float getSecondMullionOffset();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Mullion Offset</em>' attribute.
	 * @see #isSetSecondMullionOffset()
	 * @see #unsetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @generated
	 */
	void setSecondMullionOffset(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @see #setSecondMullionOffset(float)
	 * @generated
	 */
	void unsetSecondMullionOffset();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Mullion Offset</em>' attribute is set.
	 * @see #unsetSecondMullionOffset()
	 * @see #getSecondMullionOffset()
	 * @see #setSecondMullionOffset(float)
	 * @generated
	 */
	boolean isSetSecondMullionOffset();

	/**
	 * Returns the value of the '<em><b>Second Mullion Offset As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Mullion Offset As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Mullion Offset As String</em>' attribute.
	 * @see #isSetSecondMullionOffsetAsString()
	 * @see #unsetSecondMullionOffsetAsString()
	 * @see #setSecondMullionOffsetAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_SecondMullionOffsetAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSecondMullionOffsetAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffsetAsString <em>Second Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Mullion Offset As String</em>' attribute.
	 * @see #isSetSecondMullionOffsetAsString()
	 * @see #unsetSecondMullionOffsetAsString()
	 * @see #getSecondMullionOffsetAsString()
	 * @generated
	 */
	void setSecondMullionOffsetAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffsetAsString <em>Second Mullion Offset As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondMullionOffsetAsString()
	 * @see #getSecondMullionOffsetAsString()
	 * @see #setSecondMullionOffsetAsString(String)
	 * @generated
	 */
	void unsetSecondMullionOffsetAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getSecondMullionOffsetAsString <em>Second Mullion Offset As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Second Mullion Offset As String</em>' attribute is set.
	 * @see #unsetSecondMullionOffsetAsString()
	 * @see #getSecondMullionOffsetAsString()
	 * @see #setSecondMullionOffsetAsString(String)
	 * @generated
	 */
	boolean isSetSecondMullionOffsetAsString();

	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #isSetShapeAspectStyle()
	 * @see #unsetShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowLiningProperties_ShapeAspectStyle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #isSetShapeAspectStyle()
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	void unsetShapeAspectStyle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Aspect Style</em>' reference is set.
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetShapeAspectStyle();

} // IfcWindowLiningProperties
