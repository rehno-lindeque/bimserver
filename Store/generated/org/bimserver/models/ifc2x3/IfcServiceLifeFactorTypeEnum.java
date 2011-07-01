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
 * A representation of the literals of the enumeration '<em><b>Ifc Service Life Factor Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeFactorTypeEnum()
 * @model
 * @generated
 */
public enum IfcServiceLifeFactorTypeEnum implements Enumerator
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
	 * The '<em><b>EOUTDOORENVIRONMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EOUTDOORENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EOUTDOORENVIRONMENT(1, "E_OUTDOORENVIRONMENT", "E_OUTDOORENVIRONMENT"),

	/**
	 * The '<em><b>FINUSECONDITIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINUSECONDITIONS_VALUE
	 * @generated
	 * @ordered
	 */
	FINUSECONDITIONS(2, "F_INUSECONDITIONS", "F_INUSECONDITIONS"),

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
	 * The '<em><b>DINDOORENVIRONMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINDOORENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DINDOORENVIRONMENT(4, "D_INDOORENVIRONMENT", "D_INDOORENVIRONMENT"),

	/**
	 * The '<em><b>GMAINTENANCELEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GMAINTENANCELEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	GMAINTENANCELEVEL(5, "G_MAINTENANCELEVEL", "G_MAINTENANCELEVEL"),

	/**
	 * The '<em><b>BDESIGNLEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BDESIGNLEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	BDESIGNLEVEL(6, "B_DESIGNLEVEL", "B_DESIGNLEVEL"),

	/**
	 * The '<em><b>CWORKEXECUTIONLEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CWORKEXECUTIONLEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	CWORKEXECUTIONLEVEL(7, "C_WORKEXECUTIONLEVEL", "C_WORKEXECUTIONLEVEL"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(8, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>AQUALITYOFCOMPONENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AQUALITYOFCOMPONENTS_VALUE
	 * @generated
	 * @ordered
	 */
	AQUALITYOFCOMPONENTS(9, "A_QUALITYOFCOMPONENTS", "A_QUALITYOFCOMPONENTS");

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
	 * The '<em><b>EOUTDOORENVIRONMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EOUTDOORENVIRONMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EOUTDOORENVIRONMENT
	 * @model name="E_OUTDOORENVIRONMENT"
	 * @generated
	 * @ordered
	 */
	public static final int EOUTDOORENVIRONMENT_VALUE = 1;

	/**
	 * The '<em><b>FINUSECONDITIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINUSECONDITIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINUSECONDITIONS
	 * @model name="F_INUSECONDITIONS"
	 * @generated
	 * @ordered
	 */
	public static final int FINUSECONDITIONS_VALUE = 2;

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
	 * The '<em><b>DINDOORENVIRONMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DINDOORENVIRONMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DINDOORENVIRONMENT
	 * @model name="D_INDOORENVIRONMENT"
	 * @generated
	 * @ordered
	 */
	public static final int DINDOORENVIRONMENT_VALUE = 4;

	/**
	 * The '<em><b>GMAINTENANCELEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GMAINTENANCELEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GMAINTENANCELEVEL
	 * @model name="G_MAINTENANCELEVEL"
	 * @generated
	 * @ordered
	 */
	public static final int GMAINTENANCELEVEL_VALUE = 5;

	/**
	 * The '<em><b>BDESIGNLEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BDESIGNLEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BDESIGNLEVEL
	 * @model name="B_DESIGNLEVEL"
	 * @generated
	 * @ordered
	 */
	public static final int BDESIGNLEVEL_VALUE = 6;

	/**
	 * The '<em><b>CWORKEXECUTIONLEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CWORKEXECUTIONLEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CWORKEXECUTIONLEVEL
	 * @model name="C_WORKEXECUTIONLEVEL"
	 * @generated
	 * @ordered
	 */
	public static final int CWORKEXECUTIONLEVEL_VALUE = 7;

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
	public static final int USERDEFINED_VALUE = 8;

	/**
	 * The '<em><b>AQUALITYOFCOMPONENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AQUALITYOFCOMPONENTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AQUALITYOFCOMPONENTS
	 * @model name="A_QUALITYOFCOMPONENTS"
	 * @generated
	 * @ordered
	 */
	public static final int AQUALITYOFCOMPONENTS_VALUE = 9;

	/**
	 * An array of all the '<em><b>Ifc Service Life Factor Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcServiceLifeFactorTypeEnum[] VALUES_ARRAY =
		new IfcServiceLifeFactorTypeEnum[] {
			NULL,
			EOUTDOORENVIRONMENT,
			FINUSECONDITIONS,
			NOTDEFINED,
			DINDOORENVIRONMENT,
			GMAINTENANCELEVEL,
			BDESIGNLEVEL,
			CWORKEXECUTIONLEVEL,
			USERDEFINED,
			AQUALITYOFCOMPONENTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Service Life Factor Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcServiceLifeFactorTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Service Life Factor Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeFactorTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcServiceLifeFactorTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Service Life Factor Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeFactorTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcServiceLifeFactorTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Service Life Factor Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeFactorTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case EOUTDOORENVIRONMENT_VALUE: return EOUTDOORENVIRONMENT;
			case FINUSECONDITIONS_VALUE: return FINUSECONDITIONS;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case DINDOORENVIRONMENT_VALUE: return DINDOORENVIRONMENT;
			case GMAINTENANCELEVEL_VALUE: return GMAINTENANCELEVEL;
			case BDESIGNLEVEL_VALUE: return BDESIGNLEVEL;
			case CWORKEXECUTIONLEVEL_VALUE: return CWORKEXECUTIONLEVEL;
			case USERDEFINED_VALUE: return USERDEFINED;
			case AQUALITYOFCOMPONENTS_VALUE: return AQUALITYOFCOMPONENTS;
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
	private IfcServiceLifeFactorTypeEnum(int value, String name, String literal)
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
	
} //IfcServiceLifeFactorTypeEnum
