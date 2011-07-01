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
 * A representation of the literals of the enumeration '<em><b>Ifc Sanitary Terminal Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSanitaryTerminalTypeEnum()
 * @model
 * @generated
 */
public enum IfcSanitaryTerminalTypeEnum implements Enumerator
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
	 * The '<em><b>TOILETPAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOILETPAN_VALUE
	 * @generated
	 * @ordered
	 */
	TOILETPAN(1, "TOILETPAN", "TOILETPAN"),

	/**
	 * The '<em><b>BATH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATH_VALUE
	 * @generated
	 * @ordered
	 */
	BATH(2, "BATH", "BATH"),

	/**
	 * The '<em><b>CISTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CISTERN_VALUE
	 * @generated
	 * @ordered
	 */
	CISTERN(3, "CISTERN", "CISTERN"),

	/**
	 * The '<em><b>BIDET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIDET_VALUE
	 * @generated
	 * @ordered
	 */
	BIDET(4, "BIDET", "BIDET"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(5, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>WASHHANDBASIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WASHHANDBASIN_VALUE
	 * @generated
	 * @ordered
	 */
	WASHHANDBASIN(6, "WASHHANDBASIN", "WASHHANDBASIN"),

	/**
	 * The '<em><b>SANITARYFOUNTAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SANITARYFOUNTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	SANITARYFOUNTAIN(7, "SANITARYFOUNTAIN", "SANITARYFOUNTAIN"),

	/**
	 * The '<em><b>URINAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URINAL_VALUE
	 * @generated
	 * @ordered
	 */
	URINAL(8, "URINAL", "URINAL"),

	/**
	 * The '<em><b>SINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINK_VALUE
	 * @generated
	 * @ordered
	 */
	SINK(9, "SINK", "SINK"),

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
	 * The '<em><b>WCSEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WCSEAT_VALUE
	 * @generated
	 * @ordered
	 */
	WCSEAT(11, "WCSEAT", "WCSEAT"),

	/**
	 * The '<em><b>SHOWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOWER_VALUE
	 * @generated
	 * @ordered
	 */
	SHOWER(12, "SHOWER", "SHOWER");

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
	 * The '<em><b>TOILETPAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOILETPAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOILETPAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOILETPAN_VALUE = 1;

	/**
	 * The '<em><b>BATH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BATH_VALUE = 2;

	/**
	 * The '<em><b>CISTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CISTERN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CISTERN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CISTERN_VALUE = 3;

	/**
	 * The '<em><b>BIDET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIDET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIDET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIDET_VALUE = 4;

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
	public static final int NOTDEFINED_VALUE = 5;

	/**
	 * The '<em><b>WASHHANDBASIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WASHHANDBASIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WASHHANDBASIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WASHHANDBASIN_VALUE = 6;

	/**
	 * The '<em><b>SANITARYFOUNTAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SANITARYFOUNTAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SANITARYFOUNTAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SANITARYFOUNTAIN_VALUE = 7;

	/**
	 * The '<em><b>URINAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URINAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URINAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int URINAL_VALUE = 8;

	/**
	 * The '<em><b>SINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINK_VALUE = 9;

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
	 * The '<em><b>WCSEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WCSEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WCSEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WCSEAT_VALUE = 11;

	/**
	 * The '<em><b>SHOWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHOWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHOWER_VALUE = 12;

	/**
	 * An array of all the '<em><b>Ifc Sanitary Terminal Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcSanitaryTerminalTypeEnum[] VALUES_ARRAY =
		new IfcSanitaryTerminalTypeEnum[] {
			NULL,
			TOILETPAN,
			BATH,
			CISTERN,
			BIDET,
			NOTDEFINED,
			WASHHANDBASIN,
			SANITARYFOUNTAIN,
			URINAL,
			SINK,
			USERDEFINED,
			WCSEAT,
			SHOWER,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Sanitary Terminal Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcSanitaryTerminalTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Sanitary Terminal Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcSanitaryTerminalTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcSanitaryTerminalTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Sanitary Terminal Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcSanitaryTerminalTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcSanitaryTerminalTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Sanitary Terminal Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcSanitaryTerminalTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case TOILETPAN_VALUE: return TOILETPAN;
			case BATH_VALUE: return BATH;
			case CISTERN_VALUE: return CISTERN;
			case BIDET_VALUE: return BIDET;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case WASHHANDBASIN_VALUE: return WASHHANDBASIN;
			case SANITARYFOUNTAIN_VALUE: return SANITARYFOUNTAIN;
			case URINAL_VALUE: return URINAL;
			case SINK_VALUE: return SINK;
			case USERDEFINED_VALUE: return USERDEFINED;
			case WCSEAT_VALUE: return WCSEAT;
			case SHOWER_VALUE: return SHOWER;
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
	private IfcSanitaryTerminalTypeEnum(int value, String name, String literal)
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
	
} //IfcSanitaryTerminalTypeEnum
