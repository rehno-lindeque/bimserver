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
 * A representation of the literals of the enumeration '<em><b>Ifc Cost Schedule Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcCostScheduleTypeEnum()
 * @model
 * @generated
 */
public enum IfcCostScheduleTypeEnum implements Enumerator
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
	 * The '<em><b>TENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENDER_VALUE
	 * @generated
	 * @ordered
	 */
	TENDER(1, "TENDER", "TENDER"),

	/**
	 * The '<em><b>BUDGET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUDGET_VALUE
	 * @generated
	 * @ordered
	 */
	BUDGET(2, "BUDGET", "BUDGET"),

	/**
	 * The '<em><b>COSTPLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSTPLAN_VALUE
	 * @generated
	 * @ordered
	 */
	COSTPLAN(3, "COSTPLAN", "COSTPLAN"),

	/**
	 * The '<em><b>PRICEDBILLOFQUANTITIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRICEDBILLOFQUANTITIES_VALUE
	 * @generated
	 * @ordered
	 */
	PRICEDBILLOFQUANTITIES(4, "PRICEDBILLOFQUANTITIES", "PRICEDBILLOFQUANTITIES"),

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
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(6, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>UNPRICEDBILLOFQUANTITIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPRICEDBILLOFQUANTITIES_VALUE
	 * @generated
	 * @ordered
	 */
	UNPRICEDBILLOFQUANTITIES(7, "UNPRICEDBILLOFQUANTITIES", "UNPRICEDBILLOFQUANTITIES"),

	/**
	 * The '<em><b>SCHEDULEOFRATES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULEOFRATES_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULEOFRATES(8, "SCHEDULEOFRATES", "SCHEDULEOFRATES"),

	/**
	 * The '<em><b>ESTIMATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTIMATE_VALUE
	 * @generated
	 * @ordered
	 */
	ESTIMATE(9, "ESTIMATE", "ESTIMATE");

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
	 * The '<em><b>TENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TENDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TENDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TENDER_VALUE = 1;

	/**
	 * The '<em><b>BUDGET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUDGET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUDGET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUDGET_VALUE = 2;

	/**
	 * The '<em><b>COSTPLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COSTPLAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COSTPLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COSTPLAN_VALUE = 3;

	/**
	 * The '<em><b>PRICEDBILLOFQUANTITIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRICEDBILLOFQUANTITIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRICEDBILLOFQUANTITIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRICEDBILLOFQUANTITIES_VALUE = 4;

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
	 * The '<em><b>UNPRICEDBILLOFQUANTITIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNPRICEDBILLOFQUANTITIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNPRICEDBILLOFQUANTITIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNPRICEDBILLOFQUANTITIES_VALUE = 7;

	/**
	 * The '<em><b>SCHEDULEOFRATES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCHEDULEOFRATES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULEOFRATES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULEOFRATES_VALUE = 8;

	/**
	 * The '<em><b>ESTIMATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESTIMATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTIMATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESTIMATE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Ifc Cost Schedule Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcCostScheduleTypeEnum[] VALUES_ARRAY =
		new IfcCostScheduleTypeEnum[] {
			NULL,
			TENDER,
			BUDGET,
			COSTPLAN,
			PRICEDBILLOFQUANTITIES,
			NOTDEFINED,
			USERDEFINED,
			UNPRICEDBILLOFQUANTITIES,
			SCHEDULEOFRATES,
			ESTIMATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Cost Schedule Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcCostScheduleTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Cost Schedule Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCostScheduleTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCostScheduleTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cost Schedule Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCostScheduleTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcCostScheduleTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Cost Schedule Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcCostScheduleTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case TENDER_VALUE: return TENDER;
			case BUDGET_VALUE: return BUDGET;
			case COSTPLAN_VALUE: return COSTPLAN;
			case PRICEDBILLOFQUANTITIES_VALUE: return PRICEDBILLOFQUANTITIES;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case USERDEFINED_VALUE: return USERDEFINED;
			case UNPRICEDBILLOFQUANTITIES_VALUE: return UNPRICEDBILLOFQUANTITIES;
			case SCHEDULEOFRATES_VALUE: return SCHEDULEOFRATES;
			case ESTIMATE_VALUE: return ESTIMATE;
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
	private IfcCostScheduleTypeEnum(int value, String name, String literal)
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
	
} //IfcCostScheduleTypeEnum
