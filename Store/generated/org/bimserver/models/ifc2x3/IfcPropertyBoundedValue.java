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
 * A representation of the model object '<em><b>Ifc Property Bounded Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPropertyBoundedValue()
 * @model
 * @generated
 */
public interface IfcPropertyBoundedValue extends IfcSimpleProperty
{
	/**
	 * Returns the value of the '<em><b>Upper Bound Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound Value</em>' reference.
	 * @see #isSetUpperBoundValue()
	 * @see #unsetUpperBoundValue()
	 * @see #setUpperBoundValue(IfcValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPropertyBoundedValue_UpperBoundValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcValue getUpperBoundValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound Value</em>' reference.
	 * @see #isSetUpperBoundValue()
	 * @see #unsetUpperBoundValue()
	 * @see #getUpperBoundValue()
	 * @generated
	 */
	void setUpperBoundValue(IfcValue value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperBoundValue()
	 * @see #getUpperBoundValue()
	 * @see #setUpperBoundValue(IfcValue)
	 * @generated
	 */
	void unsetUpperBoundValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUpperBoundValue <em>Upper Bound Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Bound Value</em>' reference is set.
	 * @see #unsetUpperBoundValue()
	 * @see #getUpperBoundValue()
	 * @see #setUpperBoundValue(IfcValue)
	 * @generated
	 */
	boolean isSetUpperBoundValue();

	/**
	 * Returns the value of the '<em><b>Lower Bound Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound Value</em>' reference.
	 * @see #isSetLowerBoundValue()
	 * @see #unsetLowerBoundValue()
	 * @see #setLowerBoundValue(IfcValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPropertyBoundedValue_LowerBoundValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcValue getLowerBoundValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound Value</em>' reference.
	 * @see #isSetLowerBoundValue()
	 * @see #unsetLowerBoundValue()
	 * @see #getLowerBoundValue()
	 * @generated
	 */
	void setLowerBoundValue(IfcValue value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerBoundValue()
	 * @see #getLowerBoundValue()
	 * @see #setLowerBoundValue(IfcValue)
	 * @generated
	 */
	void unsetLowerBoundValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getLowerBoundValue <em>Lower Bound Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Bound Value</em>' reference is set.
	 * @see #unsetLowerBoundValue()
	 * @see #getLowerBoundValue()
	 * @see #setLowerBoundValue(IfcValue)
	 * @generated
	 */
	boolean isSetLowerBoundValue();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(IfcUnit)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPropertyBoundedValue_Unit()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcUnit getUnit();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(IfcUnit value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(IfcUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue#getUnit <em>Unit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' reference is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(IfcUnit)
	 * @generated
	 */
	boolean isSetUnit();

} // IfcPropertyBoundedValue
