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
 * A representation of the literals of the enumeration '<em><b>Ifc Window Style Operation Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWindowStyleOperationEnum()
 * @model
 * @generated
 */
public enum IfcWindowStyleOperationEnum implements Enumerator
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
	 * The '<em><b>TRIPLE PANEL RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_PANEL_RIGHT(1, "TRIPLE_PANEL_RIGHT", "TRIPLE_PANEL_RIGHT"),

	/**
	 * The '<em><b>TRIPLE PANEL VERTICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_PANEL_VERTICAL(2, "TRIPLE_PANEL_VERTICAL", "TRIPLE_PANEL_VERTICAL"),

	/**
	 * The '<em><b>TRIPLE PANEL LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_PANEL_LEFT(3, "TRIPLE_PANEL_LEFT", "TRIPLE_PANEL_LEFT"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(4, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>TRIPLE PANEL BOTTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_PANEL_BOTTOM(5, "TRIPLE_PANEL_BOTTOM", "TRIPLE_PANEL_BOTTOM"),

	/**
	 * The '<em><b>TRIPLE PANEL HORIZONTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_PANEL_HORIZONTAL(6, "TRIPLE_PANEL_HORIZONTAL", "TRIPLE_PANEL_HORIZONTAL"),

	/**
	 * The '<em><b>TRIPLE PANEL TOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_PANEL_TOP(7, "TRIPLE_PANEL_TOP", "TRIPLE_PANEL_TOP"),

	/**
	 * The '<em><b>DOUBLE PANEL VERTICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PANEL_VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_PANEL_VERTICAL(8, "DOUBLE_PANEL_VERTICAL", "DOUBLE_PANEL_VERTICAL"),

	/**
	 * The '<em><b>SINGLE PANEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_PANEL_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_PANEL(9, "SINGLE_PANEL", "SINGLE_PANEL"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(10, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>DOUBLE PANEL HORIZONTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PANEL_HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_PANEL_HORIZONTAL(11, "DOUBLE_PANEL_HORIZONTAL", "DOUBLE_PANEL_HORIZONTAL");

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
	 * The '<em><b>TRIPLE PANEL RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIPLE PANEL RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_PANEL_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>TRIPLE PANEL VERTICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIPLE PANEL VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_VERTICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_PANEL_VERTICAL_VALUE = 2;

	/**
	 * The '<em><b>TRIPLE PANEL LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIPLE PANEL LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_PANEL_LEFT_VALUE = 3;

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
	public static final int NOTDEFINED_VALUE = 4;

	/**
	 * The '<em><b>TRIPLE PANEL BOTTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIPLE PANEL BOTTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_BOTTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_PANEL_BOTTOM_VALUE = 5;

	/**
	 * The '<em><b>TRIPLE PANEL HORIZONTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIPLE PANEL HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_HORIZONTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_PANEL_HORIZONTAL_VALUE = 6;

	/**
	 * The '<em><b>TRIPLE PANEL TOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIPLE PANEL TOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_PANEL_TOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_PANEL_TOP_VALUE = 7;

	/**
	 * The '<em><b>DOUBLE PANEL VERTICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE PANEL VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PANEL_VERTICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PANEL_VERTICAL_VALUE = 8;

	/**
	 * The '<em><b>SINGLE PANEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE PANEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_PANEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_PANEL_VALUE = 9;

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
	public static final int USERDEFINED_VALUE = 10;

	/**
	 * The '<em><b>DOUBLE PANEL HORIZONTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE PANEL HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PANEL_HORIZONTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PANEL_HORIZONTAL_VALUE = 11;

	/**
	 * An array of all the '<em><b>Ifc Window Style Operation Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcWindowStyleOperationEnum[] VALUES_ARRAY =
		new IfcWindowStyleOperationEnum[] {
			NULL,
			TRIPLE_PANEL_RIGHT,
			TRIPLE_PANEL_VERTICAL,
			TRIPLE_PANEL_LEFT,
			NOTDEFINED,
			TRIPLE_PANEL_BOTTOM,
			TRIPLE_PANEL_HORIZONTAL,
			TRIPLE_PANEL_TOP,
			DOUBLE_PANEL_VERTICAL,
			SINGLE_PANEL,
			USERDEFINED,
			DOUBLE_PANEL_HORIZONTAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Window Style Operation Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcWindowStyleOperationEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Window Style Operation Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWindowStyleOperationEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcWindowStyleOperationEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Window Style Operation Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWindowStyleOperationEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcWindowStyleOperationEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Window Style Operation Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcWindowStyleOperationEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case TRIPLE_PANEL_RIGHT_VALUE: return TRIPLE_PANEL_RIGHT;
			case TRIPLE_PANEL_VERTICAL_VALUE: return TRIPLE_PANEL_VERTICAL;
			case TRIPLE_PANEL_LEFT_VALUE: return TRIPLE_PANEL_LEFT;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case TRIPLE_PANEL_BOTTOM_VALUE: return TRIPLE_PANEL_BOTTOM;
			case TRIPLE_PANEL_HORIZONTAL_VALUE: return TRIPLE_PANEL_HORIZONTAL;
			case TRIPLE_PANEL_TOP_VALUE: return TRIPLE_PANEL_TOP;
			case DOUBLE_PANEL_VERTICAL_VALUE: return DOUBLE_PANEL_VERTICAL;
			case SINGLE_PANEL_VALUE: return SINGLE_PANEL;
			case USERDEFINED_VALUE: return USERDEFINED;
			case DOUBLE_PANEL_HORIZONTAL_VALUE: return DOUBLE_PANEL_HORIZONTAL;
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
	private IfcWindowStyleOperationEnum(int value, String name, String literal)
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
	
} //IfcWindowStyleOperationEnum
