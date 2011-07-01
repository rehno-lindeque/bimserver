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
 * A representation of the literals of the enumeration '<em><b>Ifc Electric Distribution Point Function Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElectricDistributionPointFunctionEnum()
 * @model
 * @generated
 */
public enum IfcElectricDistributionPointFunctionEnum implements Enumerator
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
	 * The '<em><b>CONSUMERUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMERUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMERUNIT(1, "CONSUMERUNIT", "CONSUMERUNIT"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(2, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>SWITCHBOARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCHBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCHBOARD(3, "SWITCHBOARD", "SWITCHBOARD"),

	/**
	 * The '<em><b>MIMICPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIMICPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	MIMICPANEL(4, "MIMICPANEL", "MIMICPANEL"),

	/**
	 * The '<em><b>GASDETECTORPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GASDETECTORPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	GASDETECTORPANEL(5, "GASDETECTORPANEL", "GASDETECTORPANEL"),

	/**
	 * The '<em><b>CONTROLPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLPANEL(6, "CONTROLPANEL", "CONTROLPANEL"),

	/**
	 * The '<em><b>MOTORCONTROLCENTRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTORCONTROLCENTRE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTORCONTROLCENTRE(7, "MOTORCONTROLCENTRE", "MOTORCONTROLCENTRE"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(8, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>INDICATORPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDICATORPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	INDICATORPANEL(9, "INDICATORPANEL", "INDICATORPANEL"),

	/**
	 * The '<em><b>DISTRIBUTIONBOARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTIONBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTIONBOARD(10, "DISTRIBUTIONBOARD", "DISTRIBUTIONBOARD"),

	/**
	 * The '<em><b>ALARMPANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARMPANEL_VALUE
	 * @generated
	 * @ordered
	 */
	ALARMPANEL(11, "ALARMPANEL", "ALARMPANEL");

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
	 * The '<em><b>CONSUMERUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSUMERUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMERUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMERUNIT_VALUE = 1;

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
	public static final int NOTDEFINED_VALUE = 2;

	/**
	 * The '<em><b>SWITCHBOARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWITCHBOARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCHBOARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWITCHBOARD_VALUE = 3;

	/**
	 * The '<em><b>MIMICPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIMICPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIMICPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIMICPANEL_VALUE = 4;

	/**
	 * The '<em><b>GASDETECTORPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GASDETECTORPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GASDETECTORPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GASDETECTORPANEL_VALUE = 5;

	/**
	 * The '<em><b>CONTROLPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTROLPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLPANEL_VALUE = 6;

	/**
	 * The '<em><b>MOTORCONTROLCENTRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOTORCONTROLCENTRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTORCONTROLCENTRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOTORCONTROLCENTRE_VALUE = 7;

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
	public static final int USERDEFINED_VALUE = 8;

	/**
	 * The '<em><b>INDICATORPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INDICATORPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDICATORPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDICATORPANEL_VALUE = 9;

	/**
	 * The '<em><b>DISTRIBUTIONBOARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTRIBUTIONBOARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTIONBOARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTIONBOARD_VALUE = 10;

	/**
	 * The '<em><b>ALARMPANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALARMPANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALARMPANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALARMPANEL_VALUE = 11;

	/**
	 * An array of all the '<em><b>Ifc Electric Distribution Point Function Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcElectricDistributionPointFunctionEnum[] VALUES_ARRAY =
		new IfcElectricDistributionPointFunctionEnum[] {
			NULL,
			CONSUMERUNIT,
			NOTDEFINED,
			SWITCHBOARD,
			MIMICPANEL,
			GASDETECTORPANEL,
			CONTROLPANEL,
			MOTORCONTROLCENTRE,
			USERDEFINED,
			INDICATORPANEL,
			DISTRIBUTIONBOARD,
			ALARMPANEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Electric Distribution Point Function Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcElectricDistributionPointFunctionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Electric Distribution Point Function Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElectricDistributionPointFunctionEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcElectricDistributionPointFunctionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Electric Distribution Point Function Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElectricDistributionPointFunctionEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcElectricDistributionPointFunctionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Electric Distribution Point Function Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElectricDistributionPointFunctionEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case CONSUMERUNIT_VALUE: return CONSUMERUNIT;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case SWITCHBOARD_VALUE: return SWITCHBOARD;
			case MIMICPANEL_VALUE: return MIMICPANEL;
			case GASDETECTORPANEL_VALUE: return GASDETECTORPANEL;
			case CONTROLPANEL_VALUE: return CONTROLPANEL;
			case MOTORCONTROLCENTRE_VALUE: return MOTORCONTROLCENTRE;
			case USERDEFINED_VALUE: return USERDEFINED;
			case INDICATORPANEL_VALUE: return INDICATORPANEL;
			case DISTRIBUTIONBOARD_VALUE: return DISTRIBUTIONBOARD;
			case ALARMPANEL_VALUE: return ALARMPANEL;
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
	private IfcElectricDistributionPointFunctionEnum(int value, String name, String literal)
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
	
} //IfcElectricDistributionPointFunctionEnum
