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
 * A representation of the model object '<em><b>Ifc Fluid Flow Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFluid <em>Fluid</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValueAsString <em>Temperature Single Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValueAsString <em>Wet Bulb Temperature Single Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValueAsString <em>Flow Condition Single Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValueAsString <em>Velocity Single Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValueAsString <em>Pressure Single Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties()
 * @model
 * @generated
 */
public interface IfcFluidFlowProperties extends IfcPropertySetDefinition
{
	/**
	 * Returns the value of the '<em><b>Property Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcPropertySourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Source</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcPropertySourceEnum
	 * @see #setPropertySource(IfcPropertySourceEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_PropertySource()
	 * @model
	 * @generated
	 */
	IfcPropertySourceEnum getPropertySource();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPropertySource <em>Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Source</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcPropertySourceEnum
	 * @see #getPropertySource()
	 * @generated
	 */
	void setPropertySource(IfcPropertySourceEnum value);

	/**
	 * Returns the value of the '<em><b>Flow Condition Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Time Series</em>' reference.
	 * @see #isSetFlowConditionTimeSeries()
	 * @see #unsetFlowConditionTimeSeries()
	 * @see #setFlowConditionTimeSeries(IfcTimeSeries)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_FlowConditionTimeSeries()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getFlowConditionTimeSeries();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Time Series</em>' reference.
	 * @see #isSetFlowConditionTimeSeries()
	 * @see #unsetFlowConditionTimeSeries()
	 * @see #getFlowConditionTimeSeries()
	 * @generated
	 */
	void setFlowConditionTimeSeries(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowConditionTimeSeries()
	 * @see #getFlowConditionTimeSeries()
	 * @see #setFlowConditionTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	void unsetFlowConditionTimeSeries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionTimeSeries <em>Flow Condition Time Series</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Condition Time Series</em>' reference is set.
	 * @see #unsetFlowConditionTimeSeries()
	 * @see #getFlowConditionTimeSeries()
	 * @see #setFlowConditionTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetFlowConditionTimeSeries();

	/**
	 * Returns the value of the '<em><b>Velocity Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Time Series</em>' reference.
	 * @see #isSetVelocityTimeSeries()
	 * @see #unsetVelocityTimeSeries()
	 * @see #setVelocityTimeSeries(IfcTimeSeries)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_VelocityTimeSeries()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getVelocityTimeSeries();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Time Series</em>' reference.
	 * @see #isSetVelocityTimeSeries()
	 * @see #unsetVelocityTimeSeries()
	 * @see #getVelocityTimeSeries()
	 * @generated
	 */
	void setVelocityTimeSeries(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVelocityTimeSeries()
	 * @see #getVelocityTimeSeries()
	 * @see #setVelocityTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	void unsetVelocityTimeSeries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocityTimeSeries <em>Velocity Time Series</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Velocity Time Series</em>' reference is set.
	 * @see #unsetVelocityTimeSeries()
	 * @see #getVelocityTimeSeries()
	 * @see #setVelocityTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetVelocityTimeSeries();

	/**
	 * Returns the value of the '<em><b>Flowrate Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate Time Series</em>' reference.
	 * @see #isSetFlowrateTimeSeries()
	 * @see #unsetFlowrateTimeSeries()
	 * @see #setFlowrateTimeSeries(IfcTimeSeries)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_FlowrateTimeSeries()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getFlowrateTimeSeries();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate Time Series</em>' reference.
	 * @see #isSetFlowrateTimeSeries()
	 * @see #unsetFlowrateTimeSeries()
	 * @see #getFlowrateTimeSeries()
	 * @generated
	 */
	void setFlowrateTimeSeries(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowrateTimeSeries()
	 * @see #getFlowrateTimeSeries()
	 * @see #setFlowrateTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	void unsetFlowrateTimeSeries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateTimeSeries <em>Flowrate Time Series</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flowrate Time Series</em>' reference is set.
	 * @see #unsetFlowrateTimeSeries()
	 * @see #getFlowrateTimeSeries()
	 * @see #setFlowrateTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetFlowrateTimeSeries();

	/**
	 * Returns the value of the '<em><b>Fluid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fluid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fluid</em>' reference.
	 * @see #setFluid(IfcMaterial)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_Fluid()
	 * @model
	 * @generated
	 */
	IfcMaterial getFluid();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFluid <em>Fluid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluid</em>' reference.
	 * @see #getFluid()
	 * @generated
	 */
	void setFluid(IfcMaterial value);

	/**
	 * Returns the value of the '<em><b>Pressure Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Time Series</em>' reference.
	 * @see #isSetPressureTimeSeries()
	 * @see #unsetPressureTimeSeries()
	 * @see #setPressureTimeSeries(IfcTimeSeries)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_PressureTimeSeries()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getPressureTimeSeries();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Time Series</em>' reference.
	 * @see #isSetPressureTimeSeries()
	 * @see #unsetPressureTimeSeries()
	 * @see #getPressureTimeSeries()
	 * @generated
	 */
	void setPressureTimeSeries(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureTimeSeries()
	 * @see #getPressureTimeSeries()
	 * @see #setPressureTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	void unsetPressureTimeSeries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureTimeSeries <em>Pressure Time Series</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Time Series</em>' reference is set.
	 * @see #unsetPressureTimeSeries()
	 * @see #getPressureTimeSeries()
	 * @see #setPressureTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetPressureTimeSeries();

	/**
	 * Returns the value of the '<em><b>User Defined Property Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Property Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #isSetUserDefinedPropertySource()
	 * @see #unsetUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_UserDefinedPropertySource()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedPropertySource();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Property Source</em>' attribute.
	 * @see #isSetUserDefinedPropertySource()
	 * @see #unsetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @generated
	 */
	void setUserDefinedPropertySource(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @generated
	 */
	void unsetUserDefinedPropertySource();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getUserDefinedPropertySource <em>User Defined Property Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Property Source</em>' attribute is set.
	 * @see #unsetUserDefinedPropertySource()
	 * @see #getUserDefinedPropertySource()
	 * @see #setUserDefinedPropertySource(String)
	 * @generated
	 */
	boolean isSetUserDefinedPropertySource();

	/**
	 * Returns the value of the '<em><b>Temperature Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Single Value</em>' attribute.
	 * @see #isSetTemperatureSingleValue()
	 * @see #unsetTemperatureSingleValue()
	 * @see #setTemperatureSingleValue(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_TemperatureSingleValue()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTemperatureSingleValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Single Value</em>' attribute.
	 * @see #isSetTemperatureSingleValue()
	 * @see #unsetTemperatureSingleValue()
	 * @see #getTemperatureSingleValue()
	 * @generated
	 */
	void setTemperatureSingleValue(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperatureSingleValue()
	 * @see #getTemperatureSingleValue()
	 * @see #setTemperatureSingleValue(float)
	 * @generated
	 */
	void unsetTemperatureSingleValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValue <em>Temperature Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature Single Value</em>' attribute is set.
	 * @see #unsetTemperatureSingleValue()
	 * @see #getTemperatureSingleValue()
	 * @see #setTemperatureSingleValue(float)
	 * @generated
	 */
	boolean isSetTemperatureSingleValue();

	/**
	 * Returns the value of the '<em><b>Temperature Single Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Single Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Single Value As String</em>' attribute.
	 * @see #isSetTemperatureSingleValueAsString()
	 * @see #unsetTemperatureSingleValueAsString()
	 * @see #setTemperatureSingleValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_TemperatureSingleValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTemperatureSingleValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValueAsString <em>Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Single Value As String</em>' attribute.
	 * @see #isSetTemperatureSingleValueAsString()
	 * @see #unsetTemperatureSingleValueAsString()
	 * @see #getTemperatureSingleValueAsString()
	 * @generated
	 */
	void setTemperatureSingleValueAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValueAsString <em>Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperatureSingleValueAsString()
	 * @see #getTemperatureSingleValueAsString()
	 * @see #setTemperatureSingleValueAsString(String)
	 * @generated
	 */
	void unsetTemperatureSingleValueAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureSingleValueAsString <em>Temperature Single Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature Single Value As String</em>' attribute is set.
	 * @see #unsetTemperatureSingleValueAsString()
	 * @see #getTemperatureSingleValueAsString()
	 * @see #setTemperatureSingleValueAsString(String)
	 * @generated
	 */
	boolean isSetTemperatureSingleValueAsString();

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Single Value</em>' attribute.
	 * @see #isSetWetBulbTemperatureSingleValue()
	 * @see #unsetWetBulbTemperatureSingleValue()
	 * @see #setWetBulbTemperatureSingleValue(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_WetBulbTemperatureSingleValue()
	 * @model unsettable="true"
	 * @generated
	 */
	float getWetBulbTemperatureSingleValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Single Value</em>' attribute.
	 * @see #isSetWetBulbTemperatureSingleValue()
	 * @see #unsetWetBulbTemperatureSingleValue()
	 * @see #getWetBulbTemperatureSingleValue()
	 * @generated
	 */
	void setWetBulbTemperatureSingleValue(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWetBulbTemperatureSingleValue()
	 * @see #getWetBulbTemperatureSingleValue()
	 * @see #setWetBulbTemperatureSingleValue(float)
	 * @generated
	 */
	void unsetWetBulbTemperatureSingleValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValue <em>Wet Bulb Temperature Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wet Bulb Temperature Single Value</em>' attribute is set.
	 * @see #unsetWetBulbTemperatureSingleValue()
	 * @see #getWetBulbTemperatureSingleValue()
	 * @see #setWetBulbTemperatureSingleValue(float)
	 * @generated
	 */
	boolean isSetWetBulbTemperatureSingleValue();

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Single Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Single Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Single Value As String</em>' attribute.
	 * @see #isSetWetBulbTemperatureSingleValueAsString()
	 * @see #unsetWetBulbTemperatureSingleValueAsString()
	 * @see #setWetBulbTemperatureSingleValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_WetBulbTemperatureSingleValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWetBulbTemperatureSingleValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValueAsString <em>Wet Bulb Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Single Value As String</em>' attribute.
	 * @see #isSetWetBulbTemperatureSingleValueAsString()
	 * @see #unsetWetBulbTemperatureSingleValueAsString()
	 * @see #getWetBulbTemperatureSingleValueAsString()
	 * @generated
	 */
	void setWetBulbTemperatureSingleValueAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValueAsString <em>Wet Bulb Temperature Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWetBulbTemperatureSingleValueAsString()
	 * @see #getWetBulbTemperatureSingleValueAsString()
	 * @see #setWetBulbTemperatureSingleValueAsString(String)
	 * @generated
	 */
	void unsetWetBulbTemperatureSingleValueAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureSingleValueAsString <em>Wet Bulb Temperature Single Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wet Bulb Temperature Single Value As String</em>' attribute is set.
	 * @see #unsetWetBulbTemperatureSingleValueAsString()
	 * @see #getWetBulbTemperatureSingleValueAsString()
	 * @see #setWetBulbTemperatureSingleValueAsString(String)
	 * @generated
	 */
	boolean isSetWetBulbTemperatureSingleValueAsString();

	/**
	 * Returns the value of the '<em><b>Wet Bulb Temperature Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wet Bulb Temperature Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wet Bulb Temperature Time Series</em>' reference.
	 * @see #isSetWetBulbTemperatureTimeSeries()
	 * @see #unsetWetBulbTemperatureTimeSeries()
	 * @see #setWetBulbTemperatureTimeSeries(IfcTimeSeries)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_WetBulbTemperatureTimeSeries()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getWetBulbTemperatureTimeSeries();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wet Bulb Temperature Time Series</em>' reference.
	 * @see #isSetWetBulbTemperatureTimeSeries()
	 * @see #unsetWetBulbTemperatureTimeSeries()
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @generated
	 */
	void setWetBulbTemperatureTimeSeries(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWetBulbTemperatureTimeSeries()
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @see #setWetBulbTemperatureTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	void unsetWetBulbTemperatureTimeSeries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getWetBulbTemperatureTimeSeries <em>Wet Bulb Temperature Time Series</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wet Bulb Temperature Time Series</em>' reference is set.
	 * @see #unsetWetBulbTemperatureTimeSeries()
	 * @see #getWetBulbTemperatureTimeSeries()
	 * @see #setWetBulbTemperatureTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetWetBulbTemperatureTimeSeries();

	/**
	 * Returns the value of the '<em><b>Temperature Time Series</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Time Series</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Time Series</em>' reference.
	 * @see #isSetTemperatureTimeSeries()
	 * @see #unsetTemperatureTimeSeries()
	 * @see #setTemperatureTimeSeries(IfcTimeSeries)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_TemperatureTimeSeries()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTimeSeries getTemperatureTimeSeries();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Time Series</em>' reference.
	 * @see #isSetTemperatureTimeSeries()
	 * @see #unsetTemperatureTimeSeries()
	 * @see #getTemperatureTimeSeries()
	 * @generated
	 */
	void setTemperatureTimeSeries(IfcTimeSeries value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTemperatureTimeSeries()
	 * @see #getTemperatureTimeSeries()
	 * @see #setTemperatureTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	void unsetTemperatureTimeSeries();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getTemperatureTimeSeries <em>Temperature Time Series</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Temperature Time Series</em>' reference is set.
	 * @see #unsetTemperatureTimeSeries()
	 * @see #getTemperatureTimeSeries()
	 * @see #setTemperatureTimeSeries(IfcTimeSeries)
	 * @generated
	 */
	boolean isSetTemperatureTimeSeries();

	/**
	 * Returns the value of the '<em><b>Flowrate Single Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate Single Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate Single Value</em>' reference.
	 * @see #isSetFlowrateSingleValue()
	 * @see #unsetFlowrateSingleValue()
	 * @see #setFlowrateSingleValue(IfcDerivedMeasureValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_FlowrateSingleValue()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcDerivedMeasureValue getFlowrateSingleValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate Single Value</em>' reference.
	 * @see #isSetFlowrateSingleValue()
	 * @see #unsetFlowrateSingleValue()
	 * @see #getFlowrateSingleValue()
	 * @generated
	 */
	void setFlowrateSingleValue(IfcDerivedMeasureValue value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowrateSingleValue()
	 * @see #getFlowrateSingleValue()
	 * @see #setFlowrateSingleValue(IfcDerivedMeasureValue)
	 * @generated
	 */
	void unsetFlowrateSingleValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowrateSingleValue <em>Flowrate Single Value</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flowrate Single Value</em>' reference is set.
	 * @see #unsetFlowrateSingleValue()
	 * @see #getFlowrateSingleValue()
	 * @see #setFlowrateSingleValue(IfcDerivedMeasureValue)
	 * @generated
	 */
	boolean isSetFlowrateSingleValue();

	/**
	 * Returns the value of the '<em><b>Flow Condition Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Single Value</em>' attribute.
	 * @see #isSetFlowConditionSingleValue()
	 * @see #unsetFlowConditionSingleValue()
	 * @see #setFlowConditionSingleValue(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_FlowConditionSingleValue()
	 * @model unsettable="true"
	 * @generated
	 */
	float getFlowConditionSingleValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Single Value</em>' attribute.
	 * @see #isSetFlowConditionSingleValue()
	 * @see #unsetFlowConditionSingleValue()
	 * @see #getFlowConditionSingleValue()
	 * @generated
	 */
	void setFlowConditionSingleValue(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowConditionSingleValue()
	 * @see #getFlowConditionSingleValue()
	 * @see #setFlowConditionSingleValue(float)
	 * @generated
	 */
	void unsetFlowConditionSingleValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValue <em>Flow Condition Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Condition Single Value</em>' attribute is set.
	 * @see #unsetFlowConditionSingleValue()
	 * @see #getFlowConditionSingleValue()
	 * @see #setFlowConditionSingleValue(float)
	 * @generated
	 */
	boolean isSetFlowConditionSingleValue();

	/**
	 * Returns the value of the '<em><b>Flow Condition Single Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Condition Single Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Condition Single Value As String</em>' attribute.
	 * @see #isSetFlowConditionSingleValueAsString()
	 * @see #unsetFlowConditionSingleValueAsString()
	 * @see #setFlowConditionSingleValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_FlowConditionSingleValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFlowConditionSingleValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValueAsString <em>Flow Condition Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Condition Single Value As String</em>' attribute.
	 * @see #isSetFlowConditionSingleValueAsString()
	 * @see #unsetFlowConditionSingleValueAsString()
	 * @see #getFlowConditionSingleValueAsString()
	 * @generated
	 */
	void setFlowConditionSingleValueAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValueAsString <em>Flow Condition Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowConditionSingleValueAsString()
	 * @see #getFlowConditionSingleValueAsString()
	 * @see #setFlowConditionSingleValueAsString(String)
	 * @generated
	 */
	void unsetFlowConditionSingleValueAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getFlowConditionSingleValueAsString <em>Flow Condition Single Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Condition Single Value As String</em>' attribute is set.
	 * @see #unsetFlowConditionSingleValueAsString()
	 * @see #getFlowConditionSingleValueAsString()
	 * @see #setFlowConditionSingleValueAsString(String)
	 * @generated
	 */
	boolean isSetFlowConditionSingleValueAsString();

	/**
	 * Returns the value of the '<em><b>Velocity Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Single Value</em>' attribute.
	 * @see #isSetVelocitySingleValue()
	 * @see #unsetVelocitySingleValue()
	 * @see #setVelocitySingleValue(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_VelocitySingleValue()
	 * @model unsettable="true"
	 * @generated
	 */
	float getVelocitySingleValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Single Value</em>' attribute.
	 * @see #isSetVelocitySingleValue()
	 * @see #unsetVelocitySingleValue()
	 * @see #getVelocitySingleValue()
	 * @generated
	 */
	void setVelocitySingleValue(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVelocitySingleValue()
	 * @see #getVelocitySingleValue()
	 * @see #setVelocitySingleValue(float)
	 * @generated
	 */
	void unsetVelocitySingleValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValue <em>Velocity Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Velocity Single Value</em>' attribute is set.
	 * @see #unsetVelocitySingleValue()
	 * @see #getVelocitySingleValue()
	 * @see #setVelocitySingleValue(float)
	 * @generated
	 */
	boolean isSetVelocitySingleValue();

	/**
	 * Returns the value of the '<em><b>Velocity Single Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity Single Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity Single Value As String</em>' attribute.
	 * @see #isSetVelocitySingleValueAsString()
	 * @see #unsetVelocitySingleValueAsString()
	 * @see #setVelocitySingleValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_VelocitySingleValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getVelocitySingleValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValueAsString <em>Velocity Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity Single Value As String</em>' attribute.
	 * @see #isSetVelocitySingleValueAsString()
	 * @see #unsetVelocitySingleValueAsString()
	 * @see #getVelocitySingleValueAsString()
	 * @generated
	 */
	void setVelocitySingleValueAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValueAsString <em>Velocity Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVelocitySingleValueAsString()
	 * @see #getVelocitySingleValueAsString()
	 * @see #setVelocitySingleValueAsString(String)
	 * @generated
	 */
	void unsetVelocitySingleValueAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getVelocitySingleValueAsString <em>Velocity Single Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Velocity Single Value As String</em>' attribute is set.
	 * @see #unsetVelocitySingleValueAsString()
	 * @see #getVelocitySingleValueAsString()
	 * @see #setVelocitySingleValueAsString(String)
	 * @generated
	 */
	boolean isSetVelocitySingleValueAsString();

	/**
	 * Returns the value of the '<em><b>Pressure Single Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Single Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Single Value</em>' attribute.
	 * @see #isSetPressureSingleValue()
	 * @see #unsetPressureSingleValue()
	 * @see #setPressureSingleValue(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_PressureSingleValue()
	 * @model unsettable="true"
	 * @generated
	 */
	float getPressureSingleValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Single Value</em>' attribute.
	 * @see #isSetPressureSingleValue()
	 * @see #unsetPressureSingleValue()
	 * @see #getPressureSingleValue()
	 * @generated
	 */
	void setPressureSingleValue(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureSingleValue()
	 * @see #getPressureSingleValue()
	 * @see #setPressureSingleValue(float)
	 * @generated
	 */
	void unsetPressureSingleValue();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValue <em>Pressure Single Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Single Value</em>' attribute is set.
	 * @see #unsetPressureSingleValue()
	 * @see #getPressureSingleValue()
	 * @see #setPressureSingleValue(float)
	 * @generated
	 */
	boolean isSetPressureSingleValue();

	/**
	 * Returns the value of the '<em><b>Pressure Single Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure Single Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Single Value As String</em>' attribute.
	 * @see #isSetPressureSingleValueAsString()
	 * @see #unsetPressureSingleValueAsString()
	 * @see #setPressureSingleValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFluidFlowProperties_PressureSingleValueAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPressureSingleValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValueAsString <em>Pressure Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Single Value As String</em>' attribute.
	 * @see #isSetPressureSingleValueAsString()
	 * @see #unsetPressureSingleValueAsString()
	 * @see #getPressureSingleValueAsString()
	 * @generated
	 */
	void setPressureSingleValueAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValueAsString <em>Pressure Single Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPressureSingleValueAsString()
	 * @see #getPressureSingleValueAsString()
	 * @see #setPressureSingleValueAsString(String)
	 * @generated
	 */
	void unsetPressureSingleValueAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties#getPressureSingleValueAsString <em>Pressure Single Value As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pressure Single Value As String</em>' attribute is set.
	 * @see #unsetPressureSingleValueAsString()
	 * @see #getPressureSingleValueAsString()
	 * @see #setPressureSingleValueAsString(String)
	 * @generated
	 */
	boolean isSetPressureSingleValueAsString();

} // IfcFluidFlowProperties
