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
 * A representation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricDistributionPoint()
 * @model
 * @generated
 */
public interface IfcElectricDistributionPoint extends IfcFlowController
{
	/**
	 * Returns the value of the '<em><b>Distribution Point Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcElectricDistributionPointFunctionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Point Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Point Function</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcElectricDistributionPointFunctionEnum
	 * @see #setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricDistributionPoint_DistributionPointFunction()
	 * @model
	 * @generated
	 */
	IfcElectricDistributionPointFunctionEnum getDistributionPointFunction();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Point Function</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcElectricDistributionPointFunctionEnum
	 * @see #getDistributionPointFunction()
	 * @generated
	 */
	void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Function</em>' attribute.
	 * @see #isSetUserDefinedFunction()
	 * @see #unsetUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricDistributionPoint_UserDefinedFunction()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedFunction();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Function</em>' attribute.
	 * @see #isSetUserDefinedFunction()
	 * @see #unsetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @generated
	 */
	void setUserDefinedFunction(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @generated
	 */
	void unsetUserDefinedFunction();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Function</em>' attribute is set.
	 * @see #unsetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @generated
	 */
	boolean isSetUserDefinedFunction();

} // IfcElectricDistributionPoint
