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
 * A representation of the literals of the enumeration '<em><b>Ifc Condenser Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCondenserTypeEnum()
 * @model
 * @generated
 */
public enum IfcCondenserTypeEnum implements Enumerator
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
	 * The '<em><b>EVAPORATIVECOOLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVAPORATIVECOOLED_VALUE
	 * @generated
	 * @ordered
	 */
	EVAPORATIVECOOLED(1, "EVAPORATIVECOOLED", "EVAPORATIVECOOLED"),

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
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(3, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>WATERCOOLEDSHELLTUBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDSHELLTUBE_VALUE
	 * @generated
	 * @ordered
	 */
	WATERCOOLEDSHELLTUBE(4, "WATERCOOLEDSHELLTUBE", "WATERCOOLEDSHELLTUBE"),

	/**
	 * The '<em><b>WATERCOOLEDTUBEINTUBE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDTUBEINTUBE_VALUE
	 * @generated
	 * @ordered
	 */
	WATERCOOLEDTUBEINTUBE(5, "WATERCOOLEDTUBEINTUBE", "WATERCOOLEDTUBEINTUBE"),

	/**
	 * The '<em><b>WATERCOOLEDBRAZEDPLATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDBRAZEDPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	WATERCOOLEDBRAZEDPLATE(6, "WATERCOOLEDBRAZEDPLATE", "WATERCOOLEDBRAZEDPLATE"),

	/**
	 * The '<em><b>WATERCOOLEDSHELLCOIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDSHELLCOIL_VALUE
	 * @generated
	 * @ordered
	 */
	WATERCOOLEDSHELLCOIL(7, "WATERCOOLEDSHELLCOIL", "WATERCOOLEDSHELLCOIL"),

	/**
	 * The '<em><b>AIRCOOLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRCOOLED_VALUE
	 * @generated
	 * @ordered
	 */
	AIRCOOLED(8, "AIRCOOLED", "AIRCOOLED");

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
	 * The '<em><b>EVAPORATIVECOOLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EVAPORATIVECOOLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVAPORATIVECOOLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVAPORATIVECOOLED_VALUE = 1;

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
	public static final int USERDEFINED_VALUE = 3;

	/**
	 * The '<em><b>WATERCOOLEDSHELLTUBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WATERCOOLEDSHELLTUBE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDSHELLTUBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATERCOOLEDSHELLTUBE_VALUE = 4;

	/**
	 * The '<em><b>WATERCOOLEDTUBEINTUBE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WATERCOOLEDTUBEINTUBE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDTUBEINTUBE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATERCOOLEDTUBEINTUBE_VALUE = 5;

	/**
	 * The '<em><b>WATERCOOLEDBRAZEDPLATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WATERCOOLEDBRAZEDPLATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDBRAZEDPLATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATERCOOLEDBRAZEDPLATE_VALUE = 6;

	/**
	 * The '<em><b>WATERCOOLEDSHELLCOIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WATERCOOLEDSHELLCOIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WATERCOOLEDSHELLCOIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WATERCOOLEDSHELLCOIL_VALUE = 7;

	/**
	 * The '<em><b>AIRCOOLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIRCOOLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIRCOOLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIRCOOLED_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ifc Condenser Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcCondenserTypeEnum[] VALUES_ARRAY =
		new IfcCondenserTypeEnum[] {
			NULL,
			EVAPORATIVECOOLED,
			NOTDEFINED,
			USERDEFINED,
			WATERCOOLEDSHELLTUBE,
			WATERCOOLEDTUBEINTUBE,
			WATERCOOLEDBRAZEDPLATE,
			WATERCOOLEDSHELLCOIL,
			AIRCOOLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Condenser Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcCondenserTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Condenser Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCondenserTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCondenserTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Condenser Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCondenserTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCondenserTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Condenser Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCondenserTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case EVAPORATIVECOOLED_VALUE: return EVAPORATIVECOOLED;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case USERDEFINED_VALUE: return USERDEFINED;
			case WATERCOOLEDSHELLTUBE_VALUE: return WATERCOOLEDSHELLTUBE;
			case WATERCOOLEDTUBEINTUBE_VALUE: return WATERCOOLEDTUBEINTUBE;
			case WATERCOOLEDBRAZEDPLATE_VALUE: return WATERCOOLEDBRAZEDPLATE;
			case WATERCOOLEDSHELLCOIL_VALUE: return WATERCOOLEDSHELLCOIL;
			case AIRCOOLED_VALUE: return AIRCOOLED;
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
	private IfcCondenserTypeEnum(int value, String name, String literal)
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
	
} //IfcCondenserTypeEnum
