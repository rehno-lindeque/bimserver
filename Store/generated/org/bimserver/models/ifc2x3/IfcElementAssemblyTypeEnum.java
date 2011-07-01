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
 * A representation of the literals of the enumeration '<em><b>Ifc Element Assembly Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcElementAssemblyTypeEnum()
 * @model
 * @generated
 */
public enum IfcElementAssemblyTypeEnum implements Enumerator
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
	 * The '<em><b>SLAB FIELD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAB_FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	SLAB_FIELD(1, "SLAB_FIELD", "SLAB_FIELD"),

	/**
	 * The '<em><b>BEAM GRID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAM_GRID_VALUE
	 * @generated
	 * @ordered
	 */
	BEAM_GRID(2, "BEAM_GRID", "BEAM_GRID"),

	/**
	 * The '<em><b>ARCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCH_VALUE
	 * @generated
	 * @ordered
	 */
	ARCH(3, "ARCH", "ARCH"),

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
	 * The '<em><b>REINFORCEMENT UNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REINFORCEMENT_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	REINFORCEMENT_UNIT(5, "REINFORCEMENT_UNIT", "REINFORCEMENT_UNIT"),

	/**
	 * The '<em><b>BRACED FRAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRACED_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	BRACED_FRAME(6, "BRACED_FRAME", "BRACED_FRAME"),

	/**
	 * The '<em><b>GIRDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIRDER_VALUE
	 * @generated
	 * @ordered
	 */
	GIRDER(7, "GIRDER", "GIRDER"),

	/**
	 * The '<em><b>RIGID FRAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGID_FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	RIGID_FRAME(8, "RIGID_FRAME", "RIGID_FRAME"),

	/**
	 * The '<em><b>TRUSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUSS_VALUE
	 * @generated
	 * @ordered
	 */
	TRUSS(9, "TRUSS", "TRUSS"),

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
	 * The '<em><b>ACCESSORY ASSEMBLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSORY_ASSEMBLY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSORY_ASSEMBLY(11, "ACCESSORY_ASSEMBLY", "ACCESSORY_ASSEMBLY");

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
	 * The '<em><b>SLAB FIELD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SLAB FIELD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLAB_FIELD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SLAB_FIELD_VALUE = 1;

	/**
	 * The '<em><b>BEAM GRID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEAM GRID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAM_GRID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEAM_GRID_VALUE = 2;

	/**
	 * The '<em><b>ARCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCH_VALUE = 3;

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
	 * The '<em><b>REINFORCEMENT UNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REINFORCEMENT UNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REINFORCEMENT_UNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REINFORCEMENT_UNIT_VALUE = 5;

	/**
	 * The '<em><b>BRACED FRAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BRACED FRAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRACED_FRAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRACED_FRAME_VALUE = 6;

	/**
	 * The '<em><b>GIRDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIRDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIRDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIRDER_VALUE = 7;

	/**
	 * The '<em><b>RIGID FRAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGID FRAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGID_FRAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGID_FRAME_VALUE = 8;

	/**
	 * The '<em><b>TRUSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRUSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUSS_VALUE = 9;

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
	 * The '<em><b>ACCESSORY ASSEMBLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCESSORY ASSEMBLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCESSORY_ASSEMBLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSORY_ASSEMBLY_VALUE = 11;

	/**
	 * An array of all the '<em><b>Ifc Element Assembly Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcElementAssemblyTypeEnum[] VALUES_ARRAY =
		new IfcElementAssemblyTypeEnum[] {
			NULL,
			SLAB_FIELD,
			BEAM_GRID,
			ARCH,
			NOTDEFINED,
			REINFORCEMENT_UNIT,
			BRACED_FRAME,
			GIRDER,
			RIGID_FRAME,
			TRUSS,
			USERDEFINED,
			ACCESSORY_ASSEMBLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Element Assembly Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcElementAssemblyTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Element Assembly Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElementAssemblyTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcElementAssemblyTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Element Assembly Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElementAssemblyTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcElementAssemblyTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Element Assembly Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcElementAssemblyTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case SLAB_FIELD_VALUE: return SLAB_FIELD;
			case BEAM_GRID_VALUE: return BEAM_GRID;
			case ARCH_VALUE: return ARCH;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case REINFORCEMENT_UNIT_VALUE: return REINFORCEMENT_UNIT;
			case BRACED_FRAME_VALUE: return BRACED_FRAME;
			case GIRDER_VALUE: return GIRDER;
			case RIGID_FRAME_VALUE: return RIGID_FRAME;
			case TRUSS_VALUE: return TRUSS;
			case USERDEFINED_VALUE: return USERDEFINED;
			case ACCESSORY_ASSEMBLY_VALUE: return ACCESSORY_ASSEMBLY;
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
	private IfcElementAssemblyTypeEnum(int value, String name, String literal)
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
	
} //IfcElementAssemblyTypeEnum
