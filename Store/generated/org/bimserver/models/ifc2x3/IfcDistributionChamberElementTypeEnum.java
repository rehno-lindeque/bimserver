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
 * A representation of the literals of the enumeration '<em><b>Ifc Distribution Chamber Element Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDistributionChamberElementTypeEnum()
 * @model
 * @generated
 */
public enum IfcDistributionChamberElementTypeEnum implements Enumerator
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
	 * The '<em><b>METERCHAMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METERCHAMBER_VALUE
	 * @generated
	 * @ordered
	 */
	METERCHAMBER(1, "METERCHAMBER", "METERCHAMBER"),

	/**
	 * The '<em><b>MANHOLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	MANHOLE(2, "MANHOLE", "MANHOLE"),

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
	 * The '<em><b>VALVECHAMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALVECHAMBER_VALUE
	 * @generated
	 * @ordered
	 */
	VALVECHAMBER(4, "VALVECHAMBER", "VALVECHAMBER"),

	/**
	 * The '<em><b>INSPECTIONPIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTIONPIT_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTIONPIT(5, "INSPECTIONPIT", "INSPECTIONPIT"),

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
	 * The '<em><b>SUMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMP_VALUE
	 * @generated
	 * @ordered
	 */
	SUMP(7, "SUMP", "SUMP"),

	/**
	 * The '<em><b>TRENCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRENCH_VALUE
	 * @generated
	 * @ordered
	 */
	TRENCH(8, "TRENCH", "TRENCH"),

	/**
	 * The '<em><b>INSPECTIONCHAMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSPECTIONCHAMBER_VALUE
	 * @generated
	 * @ordered
	 */
	INSPECTIONCHAMBER(9, "INSPECTIONCHAMBER", "INSPECTIONCHAMBER"),

	/**
	 * The '<em><b>FORMEDDUCT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMEDDUCT_VALUE
	 * @generated
	 * @ordered
	 */
	FORMEDDUCT(10, "FORMEDDUCT", "FORMEDDUCT");

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
	 * The '<em><b>METERCHAMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METERCHAMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METERCHAMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METERCHAMBER_VALUE = 1;

	/**
	 * The '<em><b>MANHOLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANHOLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANHOLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANHOLE_VALUE = 2;

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
	 * The '<em><b>VALVECHAMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VALVECHAMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALVECHAMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VALVECHAMBER_VALUE = 4;

	/**
	 * The '<em><b>INSPECTIONPIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSPECTIONPIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSPECTIONPIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTIONPIT_VALUE = 5;

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
	 * The '<em><b>SUMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUMP_VALUE = 7;

	/**
	 * The '<em><b>TRENCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRENCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRENCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRENCH_VALUE = 8;

	/**
	 * The '<em><b>INSPECTIONCHAMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSPECTIONCHAMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSPECTIONCHAMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSPECTIONCHAMBER_VALUE = 9;

	/**
	 * The '<em><b>FORMEDDUCT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORMEDDUCT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMEDDUCT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FORMEDDUCT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Ifc Distribution Chamber Element Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcDistributionChamberElementTypeEnum[] VALUES_ARRAY =
		new IfcDistributionChamberElementTypeEnum[] {
			NULL,
			METERCHAMBER,
			MANHOLE,
			NOTDEFINED,
			VALVECHAMBER,
			INSPECTIONPIT,
			USERDEFINED,
			SUMP,
			TRENCH,
			INSPECTIONCHAMBER,
			FORMEDDUCT,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Distribution Chamber Element Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcDistributionChamberElementTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Distribution Chamber Element Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDistributionChamberElementTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDistributionChamberElementTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Distribution Chamber Element Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDistributionChamberElementTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcDistributionChamberElementTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Distribution Chamber Element Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcDistributionChamberElementTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case METERCHAMBER_VALUE: return METERCHAMBER;
			case MANHOLE_VALUE: return MANHOLE;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case VALVECHAMBER_VALUE: return VALVECHAMBER;
			case INSPECTIONPIT_VALUE: return INSPECTIONPIT;
			case USERDEFINED_VALUE: return USERDEFINED;
			case SUMP_VALUE: return SUMP;
			case TRENCH_VALUE: return TRENCH;
			case INSPECTIONCHAMBER_VALUE: return INSPECTIONCHAMBER;
			case FORMEDDUCT_VALUE: return FORMEDDUCT;
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
	private IfcDistributionChamberElementTypeEnum(int value, String name, String literal)
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
	
} //IfcDistributionChamberElementTypeEnum
