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
 * A representation of the literals of the enumeration '<em><b>Ifc Service Life Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcServiceLifeTypeEnum()
 * @model
 * @generated
 */
public enum IfcServiceLifeTypeEnum implements Enumerator
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
	 * The '<em><b>PESSIMISTICREFERENCESERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PESSIMISTICREFERENCESERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	PESSIMISTICREFERENCESERVICELIFE(1, "PESSIMISTICREFERENCESERVICELIFE", "PESSIMISTICREFERENCESERVICELIFE"),

	/**
	 * The '<em><b>EXPECTEDSERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPECTEDSERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPECTEDSERVICELIFE(2, "EXPECTEDSERVICELIFE", "EXPECTEDSERVICELIFE"),

	/**
	 * The '<em><b>REFERENCESERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCESERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCESERVICELIFE(3, "REFERENCESERVICELIFE", "REFERENCESERVICELIFE"),

	/**
	 * The '<em><b>OPTIMISTICREFERENCESERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMISTICREFERENCESERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMISTICREFERENCESERVICELIFE(4, "OPTIMISTICREFERENCESERVICELIFE", "OPTIMISTICREFERENCESERVICELIFE"),

	/**
	 * The '<em><b>ACTUALSERVICELIFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTUALSERVICELIFE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTUALSERVICELIFE(5, "ACTUALSERVICELIFE", "ACTUALSERVICELIFE");

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
	 * The '<em><b>PESSIMISTICREFERENCESERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PESSIMISTICREFERENCESERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PESSIMISTICREFERENCESERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PESSIMISTICREFERENCESERVICELIFE_VALUE = 1;

	/**
	 * The '<em><b>EXPECTEDSERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPECTEDSERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPECTEDSERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPECTEDSERVICELIFE_VALUE = 2;

	/**
	 * The '<em><b>REFERENCESERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFERENCESERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCESERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCESERVICELIFE_VALUE = 3;

	/**
	 * The '<em><b>OPTIMISTICREFERENCESERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPTIMISTICREFERENCESERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIMISTICREFERENCESERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMISTICREFERENCESERVICELIFE_VALUE = 4;

	/**
	 * The '<em><b>ACTUALSERVICELIFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTUALSERVICELIFE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTUALSERVICELIFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTUALSERVICELIFE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Ifc Service Life Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcServiceLifeTypeEnum[] VALUES_ARRAY =
		new IfcServiceLifeTypeEnum[] {
			NULL,
			PESSIMISTICREFERENCESERVICELIFE,
			EXPECTEDSERVICELIFE,
			REFERENCESERVICELIFE,
			OPTIMISTICREFERENCESERVICELIFE,
			ACTUALSERVICELIFE,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Service Life Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcServiceLifeTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Service Life Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcServiceLifeTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Service Life Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcServiceLifeTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Service Life Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcServiceLifeTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case PESSIMISTICREFERENCESERVICELIFE_VALUE: return PESSIMISTICREFERENCESERVICELIFE;
			case EXPECTEDSERVICELIFE_VALUE: return EXPECTEDSERVICELIFE;
			case REFERENCESERVICELIFE_VALUE: return REFERENCESERVICELIFE;
			case OPTIMISTICREFERENCESERVICELIFE_VALUE: return OPTIMISTICREFERENCESERVICELIFE;
			case ACTUALSERVICELIFE_VALUE: return ACTUALSERVICELIFE;
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
	private IfcServiceLifeTypeEnum(int value, String name, String literal)
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
	
} //IfcServiceLifeTypeEnum
