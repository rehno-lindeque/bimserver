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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Flow Instrument Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFlowInstrumentTypeEnum()
 * @model
 * @generated
 */
public enum IfcFlowInstrumentTypeEnum implements Enumerator
{
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", "NULL"),

	/**
	 * The '<em><b>PHASEANGLEMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASEANGLEMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PHASEANGLEMETER(1, "PHASEANGLEMETER", "PHASEANGLEMETER"),

	/**
	 * The '<em><b>POWERFACTORMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWERFACTORMETER_VALUE
	 * @generated
	 * @ordered
	 */
	POWERFACTORMETER(2, "POWERFACTORMETER", "POWERFACTORMETER"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(3, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>VOLTMETER RMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTMETER_RMS_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTMETER_RMS(4, "VOLTMETER_RMS", "VOLTMETER_RMS"),

	/**
	 * The '<em><b>PRESSUREGAUGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESSUREGAUGE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESSUREGAUGE(5, "PRESSUREGAUGE", "PRESSUREGAUGE"),

	/**
	 * The '<em><b>FREQUENCYMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCYMETER_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCYMETER(6, "FREQUENCYMETER", "FREQUENCYMETER"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(7, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>VOLTMETER PEAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTMETER_PEAK_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTMETER_PEAK(8, "VOLTMETER_PEAK", "VOLTMETER_PEAK"),

	/**
	 * The '<em><b>AMMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMMETER_VALUE
	 * @generated
	 * @ordered
	 */
	AMMETER(9, "AMMETER", "AMMETER"),

	/**
	 * The '<em><b>THERMOMETER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOMETER_VALUE
	 * @generated
	 * @ordered
	 */
	THERMOMETER(10, "THERMOMETER", "THERMOMETER");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>PHASEANGLEMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHASEANGLEMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASEANGLEMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHASEANGLEMETER_VALUE = 1;

	/**
	 * The '<em><b>POWERFACTORMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POWERFACTORMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POWERFACTORMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POWERFACTORMETER_VALUE = 2;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 3;

	/**
	 * The '<em><b>VOLTMETER RMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLTMETER RMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTMETER_RMS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLTMETER_RMS_VALUE = 4;

	/**
	 * The '<em><b>PRESSUREGAUGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRESSUREGAUGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESSUREGAUGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESSUREGAUGE_VALUE = 5;

	/**
	 * The '<em><b>FREQUENCYMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREQUENCYMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREQUENCYMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCYMETER_VALUE = 6;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 7;

	/**
	 * The '<em><b>VOLTMETER PEAK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLTMETER PEAK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTMETER_PEAK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLTMETER_PEAK_VALUE = 8;

	/**
	 * The '<em><b>AMMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMMETER_VALUE = 9;

	/**
	 * The '<em><b>THERMOMETER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMOMETER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMOMETER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMOMETER_VALUE = 10;

	/**
	 * An array of all the '<em><b>Ifc Flow Instrument Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcFlowInstrumentTypeEnum[] VALUES_ARRAY =
		new IfcFlowInstrumentTypeEnum[] {
			NULL,
			PHASEANGLEMETER,
			POWERFACTORMETER,
			NOTDEFINED,
			VOLTMETER_RMS,
			PRESSUREGAUGE,
			FREQUENCYMETER,
			USERDEFINED,
			VOLTMETER_PEAK,
			AMMETER,
			THERMOMETER,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Flow Instrument Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcFlowInstrumentTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Flow Instrument Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFlowInstrumentTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcFlowInstrumentTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Flow Instrument Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFlowInstrumentTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcFlowInstrumentTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Flow Instrument Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFlowInstrumentTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case PHASEANGLEMETER_VALUE: return PHASEANGLEMETER;
			case POWERFACTORMETER_VALUE: return POWERFACTORMETER;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case VOLTMETER_RMS_VALUE: return VOLTMETER_RMS;
			case PRESSUREGAUGE_VALUE: return PRESSUREGAUGE;
			case FREQUENCYMETER_VALUE: return FREQUENCYMETER;
			case USERDEFINED_VALUE: return USERDEFINED;
			case VOLTMETER_PEAK_VALUE: return VOLTMETER_PEAK;
			case AMMETER_VALUE: return AMMETER;
			case THERMOMETER_VALUE: return THERMOMETER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcFlowInstrumentTypeEnum(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}
	
} //IfcFlowInstrumentTypeEnum
