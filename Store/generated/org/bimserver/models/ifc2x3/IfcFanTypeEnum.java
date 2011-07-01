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
 * A representation of the literals of the enumeration '<em><b>Ifc Fan Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFanTypeEnum()
 * @model
 * @generated
 */
public enum IfcFanTypeEnum implements Enumerator
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
	 * The '<em><b>CENTRIFUGALAIRFOIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALAIRFOIL_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRIFUGALAIRFOIL(1, "CENTRIFUGALAIRFOIL", "CENTRIFUGALAIRFOIL"),

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
	 * The '<em><b>CENTRIFUGALRADIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALRADIAL_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRIFUGALRADIAL(3, "CENTRIFUGALRADIAL", "CENTRIFUGALRADIAL"),

	/**
	 * The '<em><b>CENTRIFUGALBACKWARDINCLINEDCURVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALBACKWARDINCLINEDCURVED_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRIFUGALBACKWARDINCLINEDCURVED(4, "CENTRIFUGALBACKWARDINCLINEDCURVED", "CENTRIFUGALBACKWARDINCLINEDCURVED"),

	/**
	 * The '<em><b>TUBEAXIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUBEAXIAL_VALUE
	 * @generated
	 * @ordered
	 */
	TUBEAXIAL(5, "TUBEAXIAL", "TUBEAXIAL"),

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
	 * The '<em><b>CENTRIFUGALFORWARDCURVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALFORWARDCURVED_VALUE
	 * @generated
	 * @ordered
	 */
	CENTRIFUGALFORWARDCURVED(7, "CENTRIFUGALFORWARDCURVED", "CENTRIFUGALFORWARDCURVED"),

	/**
	 * The '<em><b>PROPELLORAXIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPELLORAXIAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROPELLORAXIAL(8, "PROPELLORAXIAL", "PROPELLORAXIAL"),

	/**
	 * The '<em><b>VANEAXIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VANEAXIAL_VALUE
	 * @generated
	 * @ordered
	 */
	VANEAXIAL(9, "VANEAXIAL", "VANEAXIAL");

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
	 * The '<em><b>CENTRIFUGALAIRFOIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTRIFUGALAIRFOIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALAIRFOIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTRIFUGALAIRFOIL_VALUE = 1;

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
	 * The '<em><b>CENTRIFUGALRADIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTRIFUGALRADIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALRADIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTRIFUGALRADIAL_VALUE = 3;

	/**
	 * The '<em><b>CENTRIFUGALBACKWARDINCLINEDCURVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTRIFUGALBACKWARDINCLINEDCURVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALBACKWARDINCLINEDCURVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTRIFUGALBACKWARDINCLINEDCURVED_VALUE = 4;

	/**
	 * The '<em><b>TUBEAXIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUBEAXIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUBEAXIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUBEAXIAL_VALUE = 5;

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
	 * The '<em><b>CENTRIFUGALFORWARDCURVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTRIFUGALFORWARDCURVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTRIFUGALFORWARDCURVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTRIFUGALFORWARDCURVED_VALUE = 7;

	/**
	 * The '<em><b>PROPELLORAXIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPELLORAXIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPELLORAXIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPELLORAXIAL_VALUE = 8;

	/**
	 * The '<em><b>VANEAXIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VANEAXIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VANEAXIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VANEAXIAL_VALUE = 9;

	/**
	 * An array of all the '<em><b>Ifc Fan Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcFanTypeEnum[] VALUES_ARRAY =
		new IfcFanTypeEnum[] {
			NULL,
			CENTRIFUGALAIRFOIL,
			NOTDEFINED,
			CENTRIFUGALRADIAL,
			CENTRIFUGALBACKWARDINCLINEDCURVED,
			TUBEAXIAL,
			USERDEFINED,
			CENTRIFUGALFORWARDCURVED,
			PROPELLORAXIAL,
			VANEAXIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Fan Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcFanTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Fan Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFanTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcFanTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Fan Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFanTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcFanTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Fan Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcFanTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case CENTRIFUGALAIRFOIL_VALUE: return CENTRIFUGALAIRFOIL;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case CENTRIFUGALRADIAL_VALUE: return CENTRIFUGALRADIAL;
			case CENTRIFUGALBACKWARDINCLINEDCURVED_VALUE: return CENTRIFUGALBACKWARDINCLINEDCURVED;
			case TUBEAXIAL_VALUE: return TUBEAXIAL;
			case USERDEFINED_VALUE: return USERDEFINED;
			case CENTRIFUGALFORWARDCURVED_VALUE: return CENTRIFUGALFORWARDCURVED;
			case PROPELLORAXIAL_VALUE: return PROPELLORAXIAL;
			case VANEAXIAL_VALUE: return VANEAXIAL;
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
	private IfcFanTypeEnum(int value, String name, String literal)
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
	
} //IfcFanTypeEnum
