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
 * A representation of the literals of the enumeration '<em><b>Ifc Ramp Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRampTypeEnum()
 * @model
 * @generated
 */
public enum IfcRampTypeEnum implements Enumerator
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
	 * The '<em><b>QUARTER TURN RAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUARTER_TURN_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	QUARTER_TURN_RAMP(1, "QUARTER_TURN_RAMP", "QUARTER_TURN_RAMP"),

	/**
	 * The '<em><b>SPIRAL RAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	SPIRAL_RAMP(2, "SPIRAL_RAMP", "SPIRAL_RAMP"),

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
	 * The '<em><b>STRAIGHT RUN RAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_RUN_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	STRAIGHT_RUN_RAMP(4, "STRAIGHT_RUN_RAMP", "STRAIGHT_RUN_RAMP"),

	/**
	 * The '<em><b>TWO STRAIGHT RUN RAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_STRAIGHT_RUN_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_STRAIGHT_RUN_RAMP(5, "TWO_STRAIGHT_RUN_RAMP", "TWO_STRAIGHT_RUN_RAMP"),

	/**
	 * The '<em><b>HALF TURN RAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_TURN_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	HALF_TURN_RAMP(6, "HALF_TURN_RAMP", "HALF_TURN_RAMP"),

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
	 * The '<em><b>TWO QUARTER TURN RAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_QUARTER_TURN_RAMP_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_QUARTER_TURN_RAMP(8, "TWO_QUARTER_TURN_RAMP", "TWO_QUARTER_TURN_RAMP");

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
	 * The '<em><b>QUARTER TURN RAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUARTER TURN RAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUARTER_TURN_RAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUARTER_TURN_RAMP_VALUE = 1;

	/**
	 * The '<em><b>SPIRAL RAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPIRAL RAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPIRAL_RAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPIRAL_RAMP_VALUE = 2;

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
	 * The '<em><b>STRAIGHT RUN RAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRAIGHT RUN RAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRAIGHT_RUN_RAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRAIGHT_RUN_RAMP_VALUE = 4;

	/**
	 * The '<em><b>TWO STRAIGHT RUN RAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO STRAIGHT RUN RAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_STRAIGHT_RUN_RAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_STRAIGHT_RUN_RAMP_VALUE = 5;

	/**
	 * The '<em><b>HALF TURN RAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALF TURN RAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF_TURN_RAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALF_TURN_RAMP_VALUE = 6;

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
	 * The '<em><b>TWO QUARTER TURN RAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWO QUARTER TURN RAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_QUARTER_TURN_RAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWO_QUARTER_TURN_RAMP_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ifc Ramp Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcRampTypeEnum[] VALUES_ARRAY =
		new IfcRampTypeEnum[] {
			NULL,
			QUARTER_TURN_RAMP,
			SPIRAL_RAMP,
			NOTDEFINED,
			STRAIGHT_RUN_RAMP,
			TWO_STRAIGHT_RUN_RAMP,
			HALF_TURN_RAMP,
			USERDEFINED,
			TWO_QUARTER_TURN_RAMP,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Ramp Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcRampTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Ramp Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcRampTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcRampTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Ramp Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcRampTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcRampTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Ramp Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcRampTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case QUARTER_TURN_RAMP_VALUE: return QUARTER_TURN_RAMP;
			case SPIRAL_RAMP_VALUE: return SPIRAL_RAMP;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case STRAIGHT_RUN_RAMP_VALUE: return STRAIGHT_RUN_RAMP;
			case TWO_STRAIGHT_RUN_RAMP_VALUE: return TWO_STRAIGHT_RUN_RAMP;
			case HALF_TURN_RAMP_VALUE: return HALF_TURN_RAMP;
			case USERDEFINED_VALUE: return USERDEFINED;
			case TWO_QUARTER_TURN_RAMP_VALUE: return TWO_QUARTER_TURN_RAMP;
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
	private IfcRampTypeEnum(int value, String name, String literal)
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
	
} //IfcRampTypeEnum
