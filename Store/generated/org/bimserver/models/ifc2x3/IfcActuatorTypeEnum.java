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
 * A representation of the literals of the enumeration '<em><b>Ifc Actuator Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcActuatorTypeEnum()
 * @model
 * @generated
 */
public enum IfcActuatorTypeEnum implements Enumerator
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
	 * The '<em><b>ELECTRICACTUATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICACTUATOR(1, "ELECTRICACTUATOR", "ELECTRICACTUATOR"),

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
	 * The '<em><b>PNEUMATICACTUATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMATICACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMATICACTUATOR(3, "PNEUMATICACTUATOR", "PNEUMATICACTUATOR"),

	/**
	 * The '<em><b>HANDOPERATEDACTUATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HANDOPERATEDACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	HANDOPERATEDACTUATOR(4, "HANDOPERATEDACTUATOR", "HANDOPERATEDACTUATOR"),

	/**
	 * The '<em><b>THERMOSTATICACTUATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMOSTATICACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	THERMOSTATICACTUATOR(5, "THERMOSTATICACTUATOR", "THERMOSTATICACTUATOR"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(6, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>HYDRAULICACTUATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYDRAULICACTUATOR_VALUE
	 * @generated
	 * @ordered
	 */
	HYDRAULICACTUATOR(7, "HYDRAULICACTUATOR", "HYDRAULICACTUATOR");

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
	 * The '<em><b>ELECTRICACTUATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ELECTRICACTUATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICACTUATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICACTUATOR_VALUE = 1;

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
	 * The '<em><b>PNEUMATICACTUATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PNEUMATICACTUATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNEUMATICACTUATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PNEUMATICACTUATOR_VALUE = 3;

	/**
	 * The '<em><b>HANDOPERATEDACTUATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HANDOPERATEDACTUATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HANDOPERATEDACTUATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HANDOPERATEDACTUATOR_VALUE = 4;

	/**
	 * The '<em><b>THERMOSTATICACTUATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THERMOSTATICACTUATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMOSTATICACTUATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THERMOSTATICACTUATOR_VALUE = 5;

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
	public static final int USERDEFINED_VALUE = 6;

	/**
	 * The '<em><b>HYDRAULICACTUATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HYDRAULICACTUATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYDRAULICACTUATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HYDRAULICACTUATOR_VALUE = 7;

	/**
	 * An array of all the '<em><b>Ifc Actuator Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcActuatorTypeEnum[] VALUES_ARRAY =
		new IfcActuatorTypeEnum[] {
			NULL,
			ELECTRICACTUATOR,
			NOTDEFINED,
			PNEUMATICACTUATOR,
			HANDOPERATEDACTUATOR,
			THERMOSTATICACTUATOR,
			USERDEFINED,
			HYDRAULICACTUATOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Actuator Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcActuatorTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Actuator Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcActuatorTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcActuatorTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Actuator Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcActuatorTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcActuatorTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Actuator Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcActuatorTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case ELECTRICACTUATOR_VALUE: return ELECTRICACTUATOR;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case PNEUMATICACTUATOR_VALUE: return PNEUMATICACTUATOR;
			case HANDOPERATEDACTUATOR_VALUE: return HANDOPERATEDACTUATOR;
			case THERMOSTATICACTUATOR_VALUE: return THERMOSTATICACTUATOR;
			case USERDEFINED_VALUE: return USERDEFINED;
			case HYDRAULICACTUATOR_VALUE: return HYDRAULICACTUATOR;
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
	private IfcActuatorTypeEnum(int value, String name, String literal)
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
	
} //IfcActuatorTypeEnum
