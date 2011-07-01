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
 * A representation of the model object '<em><b>Ifc Electrical Base Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputVoltageAsString <em>Input Voltage As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputFrequencyAsString <em>Input Frequency As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrentAsString <em>Full Load Current As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrentAsString <em>Minimum Circuit Current As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInputAsString <em>Maximum Power Input As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInputAsString <em>Rated Power Input As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties()
 * @model
 * @generated
 */
public interface IfcElectricalBaseProperties extends IfcEnergyProperties
{
	/**
	 * Returns the value of the '<em><b>Electric Current Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcElectricCurrentEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric Current Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric Current Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcElectricCurrentEnum
	 * @see #setElectricCurrentType(IfcElectricCurrentEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_ElectricCurrentType()
	 * @model
	 * @generated
	 */
	IfcElectricCurrentEnum getElectricCurrentType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getElectricCurrentType <em>Electric Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcElectricCurrentEnum
	 * @see #getElectricCurrentType()
	 * @generated
	 */
	void setElectricCurrentType(IfcElectricCurrentEnum value);

	/**
	 * Returns the value of the '<em><b>Input Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Voltage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Voltage</em>' attribute.
	 * @see #setInputVoltage(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputVoltage()
	 * @model
	 * @generated
	 */
	float getInputVoltage();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputVoltage <em>Input Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Voltage</em>' attribute.
	 * @see #getInputVoltage()
	 * @generated
	 */
	void setInputVoltage(float value);

	/**
	 * Returns the value of the '<em><b>Input Voltage As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Voltage As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Voltage As String</em>' attribute.
	 * @see #setInputVoltageAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputVoltageAsString()
	 * @model
	 * @generated
	 */
	String getInputVoltageAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputVoltageAsString <em>Input Voltage As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Voltage As String</em>' attribute.
	 * @see #getInputVoltageAsString()
	 * @generated
	 */
	void setInputVoltageAsString(String value);

	/**
	 * Returns the value of the '<em><b>Input Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Frequency</em>' attribute.
	 * @see #setInputFrequency(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputFrequency()
	 * @model
	 * @generated
	 */
	float getInputFrequency();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputFrequency <em>Input Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Frequency</em>' attribute.
	 * @see #getInputFrequency()
	 * @generated
	 */
	void setInputFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Input Frequency As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Frequency As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Frequency As String</em>' attribute.
	 * @see #setInputFrequencyAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputFrequencyAsString()
	 * @model
	 * @generated
	 */
	String getInputFrequencyAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputFrequencyAsString <em>Input Frequency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Frequency As String</em>' attribute.
	 * @see #getInputFrequencyAsString()
	 * @generated
	 */
	void setInputFrequencyAsString(String value);

	/**
	 * Returns the value of the '<em><b>Full Load Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Load Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Load Current</em>' attribute.
	 * @see #isSetFullLoadCurrent()
	 * @see #unsetFullLoadCurrent()
	 * @see #setFullLoadCurrent(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_FullLoadCurrent()
	 * @model unsettable="true"
	 * @generated
	 */
	float getFullLoadCurrent();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Load Current</em>' attribute.
	 * @see #isSetFullLoadCurrent()
	 * @see #unsetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @generated
	 */
	void setFullLoadCurrent(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @see #setFullLoadCurrent(float)
	 * @generated
	 */
	void unsetFullLoadCurrent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrent <em>Full Load Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Load Current</em>' attribute is set.
	 * @see #unsetFullLoadCurrent()
	 * @see #getFullLoadCurrent()
	 * @see #setFullLoadCurrent(float)
	 * @generated
	 */
	boolean isSetFullLoadCurrent();

	/**
	 * Returns the value of the '<em><b>Full Load Current As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Load Current As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Load Current As String</em>' attribute.
	 * @see #isSetFullLoadCurrentAsString()
	 * @see #unsetFullLoadCurrentAsString()
	 * @see #setFullLoadCurrentAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_FullLoadCurrentAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFullLoadCurrentAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrentAsString <em>Full Load Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Load Current As String</em>' attribute.
	 * @see #isSetFullLoadCurrentAsString()
	 * @see #unsetFullLoadCurrentAsString()
	 * @see #getFullLoadCurrentAsString()
	 * @generated
	 */
	void setFullLoadCurrentAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrentAsString <em>Full Load Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullLoadCurrentAsString()
	 * @see #getFullLoadCurrentAsString()
	 * @see #setFullLoadCurrentAsString(String)
	 * @generated
	 */
	void unsetFullLoadCurrentAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getFullLoadCurrentAsString <em>Full Load Current As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Load Current As String</em>' attribute is set.
	 * @see #unsetFullLoadCurrentAsString()
	 * @see #getFullLoadCurrentAsString()
	 * @see #setFullLoadCurrentAsString(String)
	 * @generated
	 */
	boolean isSetFullLoadCurrentAsString();

	/**
	 * Returns the value of the '<em><b>Minimum Circuit Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Circuit Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Circuit Current</em>' attribute.
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_MinimumCircuitCurrent()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMinimumCircuitCurrent();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Circuit Current</em>' attribute.
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @generated
	 */
	void setMinimumCircuitCurrent(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(float)
	 * @generated
	 */
	void unsetMinimumCircuitCurrent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrent <em>Minimum Circuit Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Circuit Current</em>' attribute is set.
	 * @see #unsetMinimumCircuitCurrent()
	 * @see #getMinimumCircuitCurrent()
	 * @see #setMinimumCircuitCurrent(float)
	 * @generated
	 */
	boolean isSetMinimumCircuitCurrent();

	/**
	 * Returns the value of the '<em><b>Minimum Circuit Current As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Circuit Current As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Circuit Current As String</em>' attribute.
	 * @see #isSetMinimumCircuitCurrentAsString()
	 * @see #unsetMinimumCircuitCurrentAsString()
	 * @see #setMinimumCircuitCurrentAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_MinimumCircuitCurrentAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMinimumCircuitCurrentAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrentAsString <em>Minimum Circuit Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Circuit Current As String</em>' attribute.
	 * @see #isSetMinimumCircuitCurrentAsString()
	 * @see #unsetMinimumCircuitCurrentAsString()
	 * @see #getMinimumCircuitCurrentAsString()
	 * @generated
	 */
	void setMinimumCircuitCurrentAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrentAsString <em>Minimum Circuit Current As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumCircuitCurrentAsString()
	 * @see #getMinimumCircuitCurrentAsString()
	 * @see #setMinimumCircuitCurrentAsString(String)
	 * @generated
	 */
	void unsetMinimumCircuitCurrentAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMinimumCircuitCurrentAsString <em>Minimum Circuit Current As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Circuit Current As String</em>' attribute is set.
	 * @see #unsetMinimumCircuitCurrentAsString()
	 * @see #getMinimumCircuitCurrentAsString()
	 * @see #setMinimumCircuitCurrentAsString(String)
	 * @generated
	 */
	boolean isSetMinimumCircuitCurrentAsString();

	/**
	 * Returns the value of the '<em><b>Maximum Power Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Power Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Power Input</em>' attribute.
	 * @see #isSetMaximumPowerInput()
	 * @see #unsetMaximumPowerInput()
	 * @see #setMaximumPowerInput(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_MaximumPowerInput()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMaximumPowerInput();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Power Input</em>' attribute.
	 * @see #isSetMaximumPowerInput()
	 * @see #unsetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @generated
	 */
	void setMaximumPowerInput(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @see #setMaximumPowerInput(float)
	 * @generated
	 */
	void unsetMaximumPowerInput();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInput <em>Maximum Power Input</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Power Input</em>' attribute is set.
	 * @see #unsetMaximumPowerInput()
	 * @see #getMaximumPowerInput()
	 * @see #setMaximumPowerInput(float)
	 * @generated
	 */
	boolean isSetMaximumPowerInput();

	/**
	 * Returns the value of the '<em><b>Maximum Power Input As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Power Input As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Power Input As String</em>' attribute.
	 * @see #isSetMaximumPowerInputAsString()
	 * @see #unsetMaximumPowerInputAsString()
	 * @see #setMaximumPowerInputAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_MaximumPowerInputAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMaximumPowerInputAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInputAsString <em>Maximum Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Power Input As String</em>' attribute.
	 * @see #isSetMaximumPowerInputAsString()
	 * @see #unsetMaximumPowerInputAsString()
	 * @see #getMaximumPowerInputAsString()
	 * @generated
	 */
	void setMaximumPowerInputAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInputAsString <em>Maximum Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumPowerInputAsString()
	 * @see #getMaximumPowerInputAsString()
	 * @see #setMaximumPowerInputAsString(String)
	 * @generated
	 */
	void unsetMaximumPowerInputAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getMaximumPowerInputAsString <em>Maximum Power Input As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Power Input As String</em>' attribute is set.
	 * @see #unsetMaximumPowerInputAsString()
	 * @see #getMaximumPowerInputAsString()
	 * @see #setMaximumPowerInputAsString(String)
	 * @generated
	 */
	boolean isSetMaximumPowerInputAsString();

	/**
	 * Returns the value of the '<em><b>Rated Power Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power Input</em>' attribute.
	 * @see #isSetRatedPowerInput()
	 * @see #unsetRatedPowerInput()
	 * @see #setRatedPowerInput(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_RatedPowerInput()
	 * @model unsettable="true"
	 * @generated
	 */
	float getRatedPowerInput();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power Input</em>' attribute.
	 * @see #isSetRatedPowerInput()
	 * @see #unsetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @generated
	 */
	void setRatedPowerInput(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @see #setRatedPowerInput(float)
	 * @generated
	 */
	void unsetRatedPowerInput();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInput <em>Rated Power Input</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Power Input</em>' attribute is set.
	 * @see #unsetRatedPowerInput()
	 * @see #getRatedPowerInput()
	 * @see #setRatedPowerInput(float)
	 * @generated
	 */
	boolean isSetRatedPowerInput();

	/**
	 * Returns the value of the '<em><b>Rated Power Input As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rated Power Input As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rated Power Input As String</em>' attribute.
	 * @see #isSetRatedPowerInputAsString()
	 * @see #unsetRatedPowerInputAsString()
	 * @see #setRatedPowerInputAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_RatedPowerInputAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getRatedPowerInputAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInputAsString <em>Rated Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rated Power Input As String</em>' attribute.
	 * @see #isSetRatedPowerInputAsString()
	 * @see #unsetRatedPowerInputAsString()
	 * @see #getRatedPowerInputAsString()
	 * @generated
	 */
	void setRatedPowerInputAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInputAsString <em>Rated Power Input As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatedPowerInputAsString()
	 * @see #getRatedPowerInputAsString()
	 * @see #setRatedPowerInputAsString(String)
	 * @generated
	 */
	void unsetRatedPowerInputAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getRatedPowerInputAsString <em>Rated Power Input As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rated Power Input As String</em>' attribute is set.
	 * @see #unsetRatedPowerInputAsString()
	 * @see #getRatedPowerInputAsString()
	 * @see #setRatedPowerInputAsString(String)
	 * @generated
	 */
	boolean isSetRatedPowerInputAsString();

	/**
	 * Returns the value of the '<em><b>Input Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Phase</em>' attribute.
	 * @see #setInputPhase(int)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricalBaseProperties_InputPhase()
	 * @model
	 * @generated
	 */
	int getInputPhase();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties#getInputPhase <em>Input Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Phase</em>' attribute.
	 * @see #getInputPhase()
	 * @generated
	 */
	void setInputPhase(int value);

} // IfcElectricalBaseProperties
