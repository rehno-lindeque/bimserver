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
 * A representation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ConstantAsString <em>Delta TConstant As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_YAsString <em>Delta TYAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ZAsString <em>Delta TZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature()
 * @model
 * @generated
 */
public interface IfcStructuralLoadTemperature extends IfcStructuralLoadStatic
{
	/**
	 * Returns the value of the '<em><b>Delta TConstant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TConstant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TConstant</em>' attribute.
	 * @see #isSetDeltaT_Constant()
	 * @see #unsetDeltaT_Constant()
	 * @see #setDeltaT_Constant(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_Constant()
	 * @model unsettable="true"
	 * @generated
	 */
	float getDeltaT_Constant();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TConstant</em>' attribute.
	 * @see #isSetDeltaT_Constant()
	 * @see #unsetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @generated
	 */
	void setDeltaT_Constant(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @see #setDeltaT_Constant(float)
	 * @generated
	 */
	void unsetDeltaT_Constant();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Constant <em>Delta TConstant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TConstant</em>' attribute is set.
	 * @see #unsetDeltaT_Constant()
	 * @see #getDeltaT_Constant()
	 * @see #setDeltaT_Constant(float)
	 * @generated
	 */
	boolean isSetDeltaT_Constant();

	/**
	 * Returns the value of the '<em><b>Delta TConstant As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TConstant As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TConstant As String</em>' attribute.
	 * @see #isSetDeltaT_ConstantAsString()
	 * @see #unsetDeltaT_ConstantAsString()
	 * @see #setDeltaT_ConstantAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_ConstantAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDeltaT_ConstantAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ConstantAsString <em>Delta TConstant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TConstant As String</em>' attribute.
	 * @see #isSetDeltaT_ConstantAsString()
	 * @see #unsetDeltaT_ConstantAsString()
	 * @see #getDeltaT_ConstantAsString()
	 * @generated
	 */
	void setDeltaT_ConstantAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ConstantAsString <em>Delta TConstant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_ConstantAsString()
	 * @see #getDeltaT_ConstantAsString()
	 * @see #setDeltaT_ConstantAsString(String)
	 * @generated
	 */
	void unsetDeltaT_ConstantAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ConstantAsString <em>Delta TConstant As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TConstant As String</em>' attribute is set.
	 * @see #unsetDeltaT_ConstantAsString()
	 * @see #getDeltaT_ConstantAsString()
	 * @see #setDeltaT_ConstantAsString(String)
	 * @generated
	 */
	boolean isSetDeltaT_ConstantAsString();

	/**
	 * Returns the value of the '<em><b>Delta TY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TY</em>' attribute.
	 * @see #isSetDeltaT_Y()
	 * @see #unsetDeltaT_Y()
	 * @see #setDeltaT_Y(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_Y()
	 * @model unsettable="true"
	 * @generated
	 */
	float getDeltaT_Y();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TY</em>' attribute.
	 * @see #isSetDeltaT_Y()
	 * @see #unsetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @generated
	 */
	void setDeltaT_Y(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @see #setDeltaT_Y(float)
	 * @generated
	 */
	void unsetDeltaT_Y();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Y <em>Delta TY</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TY</em>' attribute is set.
	 * @see #unsetDeltaT_Y()
	 * @see #getDeltaT_Y()
	 * @see #setDeltaT_Y(float)
	 * @generated
	 */
	boolean isSetDeltaT_Y();

	/**
	 * Returns the value of the '<em><b>Delta TYAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TYAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TYAs String</em>' attribute.
	 * @see #isSetDeltaT_YAsString()
	 * @see #unsetDeltaT_YAsString()
	 * @see #setDeltaT_YAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_YAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDeltaT_YAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_YAsString <em>Delta TYAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TYAs String</em>' attribute.
	 * @see #isSetDeltaT_YAsString()
	 * @see #unsetDeltaT_YAsString()
	 * @see #getDeltaT_YAsString()
	 * @generated
	 */
	void setDeltaT_YAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_YAsString <em>Delta TYAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_YAsString()
	 * @see #getDeltaT_YAsString()
	 * @see #setDeltaT_YAsString(String)
	 * @generated
	 */
	void unsetDeltaT_YAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_YAsString <em>Delta TYAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TYAs String</em>' attribute is set.
	 * @see #unsetDeltaT_YAsString()
	 * @see #getDeltaT_YAsString()
	 * @see #setDeltaT_YAsString(String)
	 * @generated
	 */
	boolean isSetDeltaT_YAsString();

	/**
	 * Returns the value of the '<em><b>Delta TZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TZ</em>' attribute.
	 * @see #isSetDeltaT_Z()
	 * @see #unsetDeltaT_Z()
	 * @see #setDeltaT_Z(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_Z()
	 * @model unsettable="true"
	 * @generated
	 */
	float getDeltaT_Z();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TZ</em>' attribute.
	 * @see #isSetDeltaT_Z()
	 * @see #unsetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @generated
	 */
	void setDeltaT_Z(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @see #setDeltaT_Z(float)
	 * @generated
	 */
	void unsetDeltaT_Z();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_Z <em>Delta TZ</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TZ</em>' attribute is set.
	 * @see #unsetDeltaT_Z()
	 * @see #getDeltaT_Z()
	 * @see #setDeltaT_Z(float)
	 * @generated
	 */
	boolean isSetDeltaT_Z();

	/**
	 * Returns the value of the '<em><b>Delta TZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta TZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta TZAs String</em>' attribute.
	 * @see #isSetDeltaT_ZAsString()
	 * @see #unsetDeltaT_ZAsString()
	 * @see #setDeltaT_ZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralLoadTemperature_DeltaT_ZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDeltaT_ZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ZAsString <em>Delta TZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta TZAs String</em>' attribute.
	 * @see #isSetDeltaT_ZAsString()
	 * @see #unsetDeltaT_ZAsString()
	 * @see #getDeltaT_ZAsString()
	 * @generated
	 */
	void setDeltaT_ZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ZAsString <em>Delta TZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeltaT_ZAsString()
	 * @see #getDeltaT_ZAsString()
	 * @see #setDeltaT_ZAsString(String)
	 * @generated
	 */
	void unsetDeltaT_ZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature#getDeltaT_ZAsString <em>Delta TZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delta TZAs String</em>' attribute is set.
	 * @see #unsetDeltaT_ZAsString()
	 * @see #getDeltaT_ZAsString()
	 * @see #setDeltaT_ZAsString(String)
	 * @generated
	 */
	boolean isSetDeltaT_ZAsString();

} // IfcStructuralLoadTemperature
