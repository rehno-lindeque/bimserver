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
 * A representation of the literals of the enumeration '<em><b>Ifc Light Emission Source Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightEmissionSourceEnum()
 * @model
 * @generated
 */
public enum IfcLightEmissionSourceEnum implements Enumerator
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
	 * The '<em><b>LOWVOLTAGEHALOGEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWVOLTAGEHALOGEN_VALUE
	 * @generated
	 * @ordered
	 */
	LOWVOLTAGEHALOGEN(1, "LOWVOLTAGEHALOGEN", "LOWVOLTAGEHALOGEN"),

	/**
	 * The '<em><b>MAINVOLTAGEHALOGEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINVOLTAGEHALOGEN_VALUE
	 * @generated
	 * @ordered
	 */
	MAINVOLTAGEHALOGEN(2, "MAINVOLTAGEHALOGEN", "MAINVOLTAGEHALOGEN"),

	/**
	 * The '<em><b>HIGHPRESSUREMERCURY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSUREMERCURY_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHPRESSUREMERCURY(3, "HIGHPRESSUREMERCURY", "HIGHPRESSUREMERCURY"),

	/**
	 * The '<em><b>COMPACTFLUORESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACTFLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACTFLUORESCENT(4, "COMPACTFLUORESCENT", "COMPACTFLUORESCENT"),

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
	 * The '<em><b>TUNGSTENFILAMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNGSTENFILAMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TUNGSTENFILAMENT(6, "TUNGSTENFILAMENT", "TUNGSTENFILAMENT"),

	/**
	 * The '<em><b>METALHALIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METALHALIDE_VALUE
	 * @generated
	 * @ordered
	 */
	METALHALIDE(7, "METALHALIDE", "METALHALIDE"),

	/**
	 * The '<em><b>LOWPRESSURESODIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWPRESSURESODIUM_VALUE
	 * @generated
	 * @ordered
	 */
	LOWPRESSURESODIUM(8, "LOWPRESSURESODIUM", "LOWPRESSURESODIUM"),

	/**
	 * The '<em><b>HIGHPRESSURESODIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSURESODIUM_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHPRESSURESODIUM(9, "HIGHPRESSURESODIUM", "HIGHPRESSURESODIUM"),

	/**
	 * The '<em><b>LIGHTEMITTINGDIODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTEMITTINGDIODE_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTEMITTINGDIODE(10, "LIGHTEMITTINGDIODE", "LIGHTEMITTINGDIODE"),

	/**
	 * The '<em><b>FLUORESCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENT(11, "FLUORESCENT", "FLUORESCENT");

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
	 * The '<em><b>LOWVOLTAGEHALOGEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWVOLTAGEHALOGEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWVOLTAGEHALOGEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWVOLTAGEHALOGEN_VALUE = 1;

	/**
	 * The '<em><b>MAINVOLTAGEHALOGEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAINVOLTAGEHALOGEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINVOLTAGEHALOGEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAINVOLTAGEHALOGEN_VALUE = 2;

	/**
	 * The '<em><b>HIGHPRESSUREMERCURY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHPRESSUREMERCURY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSUREMERCURY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHPRESSUREMERCURY_VALUE = 3;

	/**
	 * The '<em><b>COMPACTFLUORESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPACTFLUORESCENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPACTFLUORESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPACTFLUORESCENT_VALUE = 4;

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
	 * The '<em><b>TUNGSTENFILAMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TUNGSTENFILAMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNGSTENFILAMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TUNGSTENFILAMENT_VALUE = 6;

	/**
	 * The '<em><b>METALHALIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METALHALIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METALHALIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METALHALIDE_VALUE = 7;

	/**
	 * The '<em><b>LOWPRESSURESODIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWPRESSURESODIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWPRESSURESODIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWPRESSURESODIUM_VALUE = 8;

	/**
	 * The '<em><b>HIGHPRESSURESODIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHPRESSURESODIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHPRESSURESODIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHPRESSURESODIUM_VALUE = 9;

	/**
	 * The '<em><b>LIGHTEMITTINGDIODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHTEMITTINGDIODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHTEMITTINGDIODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTEMITTINGDIODE_VALUE = 10;

	/**
	 * The '<em><b>FLUORESCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLUORESCENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENT_VALUE = 11;

	/**
	 * An array of all the '<em><b>Ifc Light Emission Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcLightEmissionSourceEnum[] VALUES_ARRAY =
		new IfcLightEmissionSourceEnum[] {
			NULL,
			LOWVOLTAGEHALOGEN,
			MAINVOLTAGEHALOGEN,
			HIGHPRESSUREMERCURY,
			COMPACTFLUORESCENT,
			NOTDEFINED,
			TUNGSTENFILAMENT,
			METALHALIDE,
			LOWPRESSURESODIUM,
			HIGHPRESSURESODIUM,
			LIGHTEMITTINGDIODE,
			FLUORESCENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Light Emission Source Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcLightEmissionSourceEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Light Emission Source Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLightEmissionSourceEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLightEmissionSourceEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Light Emission Source Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLightEmissionSourceEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcLightEmissionSourceEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Light Emission Source Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcLightEmissionSourceEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case LOWVOLTAGEHALOGEN_VALUE: return LOWVOLTAGEHALOGEN;
			case MAINVOLTAGEHALOGEN_VALUE: return MAINVOLTAGEHALOGEN;
			case HIGHPRESSUREMERCURY_VALUE: return HIGHPRESSUREMERCURY;
			case COMPACTFLUORESCENT_VALUE: return COMPACTFLUORESCENT;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case TUNGSTENFILAMENT_VALUE: return TUNGSTENFILAMENT;
			case METALHALIDE_VALUE: return METALHALIDE;
			case LOWPRESSURESODIUM_VALUE: return LOWPRESSURESODIUM;
			case HIGHPRESSURESODIUM_VALUE: return HIGHPRESSURESODIUM;
			case LIGHTEMITTINGDIODE_VALUE: return LIGHTEMITTINGDIODE;
			case FLUORESCENT_VALUE: return FLUORESCENT;
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
	private IfcLightEmissionSourceEnum(int value, String name, String literal)
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
	
} //IfcLightEmissionSourceEnum
