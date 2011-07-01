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
 * A representation of the literals of the enumeration '<em><b>Ifc Waste Terminal Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWasteTerminalTypeEnum()
 * @model
 * @generated
 */
public enum IfcWasteTerminalTypeEnum implements Enumerator
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
	 * The '<em><b>PETROLINTERCEPTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PETROLINTERCEPTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PETROLINTERCEPTOR(1, "PETROLINTERCEPTOR", "PETROLINTERCEPTOR"),

	/**
	 * The '<em><b>GULLYTRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GULLYTRAP_VALUE
	 * @generated
	 * @ordered
	 */
	GULLYTRAP(2, "GULLYTRAP", "GULLYTRAP"),

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
	 * The '<em><b>WASTETRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTETRAP_VALUE
	 * @generated
	 * @ordered
	 */
	WASTETRAP(4, "WASTETRAP", "WASTETRAP"),

	/**
	 * The '<em><b>FLOORTRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOORTRAP_VALUE
	 * @generated
	 * @ordered
	 */
	FLOORTRAP(5, "FLOORTRAP", "FLOORTRAP"),

	/**
	 * The '<em><b>ROOFDRAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOFDRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROOFDRAIN(6, "ROOFDRAIN", "ROOFDRAIN"),

	/**
	 * The '<em><b>GREASEINTERCEPTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREASEINTERCEPTOR_VALUE
	 * @generated
	 * @ordered
	 */
	GREASEINTERCEPTOR(7, "GREASEINTERCEPTOR", "GREASEINTERCEPTOR"),

	/**
	 * The '<em><b>GULLYSUMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GULLYSUMP_VALUE
	 * @generated
	 * @ordered
	 */
	GULLYSUMP(8, "GULLYSUMP", "GULLYSUMP"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(9, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>WASTEDISPOSALUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASTEDISPOSALUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	WASTEDISPOSALUNIT(10, "WASTEDISPOSALUNIT", "WASTEDISPOSALUNIT"),

	/**
	 * The '<em><b>OILINTERCEPTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OILINTERCEPTOR_VALUE
	 * @generated
	 * @ordered
	 */
	OILINTERCEPTOR(11, "OILINTERCEPTOR", "OILINTERCEPTOR"),

	/**
	 * The '<em><b>FLOORWASTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOORWASTE_VALUE
	 * @generated
	 * @ordered
	 */
	FLOORWASTE(12, "FLOORWASTE", "FLOORWASTE");

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
	 * The '<em><b>PETROLINTERCEPTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PETROLINTERCEPTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PETROLINTERCEPTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PETROLINTERCEPTOR_VALUE = 1;

	/**
	 * The '<em><b>GULLYTRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GULLYTRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GULLYTRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GULLYTRAP_VALUE = 2;

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
	 * The '<em><b>WASTETRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WASTETRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WASTETRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WASTETRAP_VALUE = 4;

	/**
	 * The '<em><b>FLOORTRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOORTRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOORTRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOORTRAP_VALUE = 5;

	/**
	 * The '<em><b>ROOFDRAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOFDRAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOFDRAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOFDRAIN_VALUE = 6;

	/**
	 * The '<em><b>GREASEINTERCEPTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREASEINTERCEPTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREASEINTERCEPTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREASEINTERCEPTOR_VALUE = 7;

	/**
	 * The '<em><b>GULLYSUMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GULLYSUMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GULLYSUMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GULLYSUMP_VALUE = 8;

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
	public static final int USERDEFINED_VALUE = 9;

	/**
	 * The '<em><b>WASTEDISPOSALUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WASTEDISPOSALUNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WASTEDISPOSALUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WASTEDISPOSALUNIT_VALUE = 10;

	/**
	 * The '<em><b>OILINTERCEPTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OILINTERCEPTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OILINTERCEPTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OILINTERCEPTOR_VALUE = 11;

	/**
	 * The '<em><b>FLOORWASTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOORWASTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOORWASTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOORWASTE_VALUE = 12;

	/**
	 * An array of all the '<em><b>Ifc Waste Terminal Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcWasteTerminalTypeEnum[] VALUES_ARRAY =
		new IfcWasteTerminalTypeEnum[] {
			NULL,
			PETROLINTERCEPTOR,
			GULLYTRAP,
			NOTDEFINED,
			WASTETRAP,
			FLOORTRAP,
			ROOFDRAIN,
			GREASEINTERCEPTOR,
			GULLYSUMP,
			USERDEFINED,
			WASTEDISPOSALUNIT,
			OILINTERCEPTOR,
			FLOORWASTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Waste Terminal Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcWasteTerminalTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Waste Terminal Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWasteTerminalTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcWasteTerminalTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Waste Terminal Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWasteTerminalTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcWasteTerminalTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Waste Terminal Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWasteTerminalTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case PETROLINTERCEPTOR_VALUE: return PETROLINTERCEPTOR;
			case GULLYTRAP_VALUE: return GULLYTRAP;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case WASTETRAP_VALUE: return WASTETRAP;
			case FLOORTRAP_VALUE: return FLOORTRAP;
			case ROOFDRAIN_VALUE: return ROOFDRAIN;
			case GREASEINTERCEPTOR_VALUE: return GREASEINTERCEPTOR;
			case GULLYSUMP_VALUE: return GULLYSUMP;
			case USERDEFINED_VALUE: return USERDEFINED;
			case WASTEDISPOSALUNIT_VALUE: return WASTEDISPOSALUNIT;
			case OILINTERCEPTOR_VALUE: return OILINTERCEPTOR;
			case FLOORWASTE_VALUE: return FLOORWASTE;
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
	private IfcWasteTerminalTypeEnum(int value, String name, String literal)
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
	
} //IfcWasteTerminalTypeEnum
