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
 * A representation of the model object '<em><b>Ifc Service Life Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getMostUsedValue <em>Most Used Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeFactor()
 * @model
 * @generated
 */
public interface IfcServiceLifeFactor extends IfcPropertySetDefinition
{
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcServiceLifeFactorTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcServiceLifeFactorTypeEnum
	 * @see #setPredefinedType(IfcServiceLifeFactorTypeEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeFactor_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcServiceLifeFactorTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcServiceLifeFactorTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcServiceLifeFactorTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' reference.
	 * @see #isSetUpperValue()
	 * @see #unsetUpperValue()
	 * @see #setUpperValue(IfcMeasureValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeFactor_UpperValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMeasureValue getUpperValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getUpperValue <em>Upper Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' reference.
	 * @see #isSetUpperValue()
	 * @see #unsetUpperValue()
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(IfcMeasureValue value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getUpperValue <em>Upper Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperValue()
	 * @see #getUpperValue()
	 * @see #setUpperValue(IfcMeasureValue)
	 * @generated
	 */
	void unsetUpperValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getUpperValue <em>Upper Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Value</em>' reference is set.
	 * @see #unsetUpperValue()
	 * @see #getUpperValue()
	 * @see #setUpperValue(IfcMeasureValue)
	 * @generated
	 */
	boolean isSetUpperValue();

	/**
	 * Returns the value of the '<em><b>Most Used Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Most Used Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Most Used Value</em>' reference.
	 * @see #setMostUsedValue(IfcMeasureValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeFactor_MostUsedValue()
	 * @model
	 * @generated
	 */
	IfcMeasureValue getMostUsedValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getMostUsedValue <em>Most Used Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Most Used Value</em>' reference.
	 * @see #getMostUsedValue()
	 * @generated
	 */
	void setMostUsedValue(IfcMeasureValue value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' reference.
	 * @see #isSetLowerValue()
	 * @see #unsetLowerValue()
	 * @see #setLowerValue(IfcMeasureValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeFactor_LowerValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMeasureValue getLowerValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getLowerValue <em>Lower Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' reference.
	 * @see #isSetLowerValue()
	 * @see #unsetLowerValue()
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(IfcMeasureValue value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getLowerValue <em>Lower Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerValue()
	 * @see #getLowerValue()
	 * @see #setLowerValue(IfcMeasureValue)
	 * @generated
	 */
	void unsetLowerValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor#getLowerValue <em>Lower Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Value</em>' reference is set.
	 * @see #unsetLowerValue()
	 * @see #getLowerValue()
	 * @see #setLowerValue(IfcMeasureValue)
	 * @generated
	 */
	boolean isSetLowerValue();

} // IfcServiceLifeFactor
