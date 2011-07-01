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
 * A representation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstructionResource()
 * @model
 * @generated
 */
public interface IfcConstructionResource extends IfcResource
{
	/**
	 * Returns the value of the '<em><b>Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Identifier</em>' attribute.
	 * @see #isSetResourceIdentifier()
	 * @see #unsetResourceIdentifier()
	 * @see #setResourceIdentifier(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstructionResource_ResourceIdentifier()
	 * @model unsettable="true"
	 * @generated
	 */
	String getResourceIdentifier();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Identifier</em>' attribute.
	 * @see #isSetResourceIdentifier()
	 * @see #unsetResourceIdentifier()
	 * @see #getResourceIdentifier()
	 * @generated
	 */
	void setResourceIdentifier(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceIdentifier()
	 * @see #getResourceIdentifier()
	 * @see #setResourceIdentifier(String)
	 * @generated
	 */
	void unsetResourceIdentifier();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceIdentifier <em>Resource Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Identifier</em>' attribute is set.
	 * @see #unsetResourceIdentifier()
	 * @see #getResourceIdentifier()
	 * @see #setResourceIdentifier(String)
	 * @generated
	 */
	boolean isSetResourceIdentifier();

	/**
	 * Returns the value of the '<em><b>Resource Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group</em>' attribute.
	 * @see #isSetResourceGroup()
	 * @see #unsetResourceGroup()
	 * @see #setResourceGroup(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstructionResource_ResourceGroup()
	 * @model unsettable="true"
	 * @generated
	 */
	String getResourceGroup();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Group</em>' attribute.
	 * @see #isSetResourceGroup()
	 * @see #unsetResourceGroup()
	 * @see #getResourceGroup()
	 * @generated
	 */
	void setResourceGroup(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResourceGroup()
	 * @see #getResourceGroup()
	 * @see #setResourceGroup(String)
	 * @generated
	 */
	void unsetResourceGroup();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceGroup <em>Resource Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resource Group</em>' attribute is set.
	 * @see #unsetResourceGroup()
	 * @see #getResourceGroup()
	 * @see #setResourceGroup(String)
	 * @generated
	 */
	boolean isSetResourceGroup();

	/**
	 * Returns the value of the '<em><b>Resource Consumption</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcResourceConsumptionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Consumption</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcResourceConsumptionEnum
	 * @see #setResourceConsumption(IfcResourceConsumptionEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstructionResource_ResourceConsumption()
	 * @model
	 * @generated
	 */
	IfcResourceConsumptionEnum getResourceConsumption();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getResourceConsumption <em>Resource Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Consumption</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcResourceConsumptionEnum
	 * @see #getResourceConsumption()
	 * @generated
	 */
	void setResourceConsumption(IfcResourceConsumptionEnum value);

	/**
	 * Returns the value of the '<em><b>Base Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Quantity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Quantity</em>' reference.
	 * @see #isSetBaseQuantity()
	 * @see #unsetBaseQuantity()
	 * @see #setBaseQuantity(IfcMeasureWithUnit)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConstructionResource_BaseQuantity()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMeasureWithUnit getBaseQuantity();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Quantity</em>' reference.
	 * @see #isSetBaseQuantity()
	 * @see #unsetBaseQuantity()
	 * @see #getBaseQuantity()
	 * @generated
	 */
	void setBaseQuantity(IfcMeasureWithUnit value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseQuantity()
	 * @see #getBaseQuantity()
	 * @see #setBaseQuantity(IfcMeasureWithUnit)
	 * @generated
	 */
	void unsetBaseQuantity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConstructionResource#getBaseQuantity <em>Base Quantity</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Quantity</em>' reference is set.
	 * @see #unsetBaseQuantity()
	 * @see #getBaseQuantity()
	 * @see #setBaseQuantity(IfcMeasureWithUnit)
	 * @generated
	 */
	boolean isSetBaseQuantity();

} // IfcConstructionResource
