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
 * A representation of the literals of the enumeration '<em><b>Ifc Action Source Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcActionSourceTypeEnum()
 * @model
 * @generated
 */
public enum IfcActionSourceTypeEnum implements Enumerator
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
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(1, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>PRESTRESSING P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESTRESSING_P_VALUE
	 * @generated
	 * @ordered
	 */
	PRESTRESSING_P(2, "PRESTRESSING_P", "PRESTRESSING_P"),

	/**
	 * The '<em><b>SNOW S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SNOW_S_VALUE
	 * @generated
	 * @ordered
	 */
	SNOW_S(3, "SNOW_S", "SNOW_S"),

	/**
	 * The '<em><b>ERECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ERECTION(4, "ERECTION", "ERECTION"),

	/**
	 * The '<em><b>SETTLEMENT U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETTLEMENT_U_VALUE
	 * @generated
	 * @ordered
	 */
	SETTLEMENT_U(5, "SETTLEMENT_U", "SETTLEMENT_U"),

	/**
	 * The '<em><b>IMPACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPACT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPACT(6, "IMPACT", "IMPACT"),

	/**
	 * The '<em><b>LIVE LOAD Q</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVE_LOAD_Q_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE_LOAD_Q(7, "LIVE_LOAD_Q", "LIVE_LOAD_Q"),

	/**
	 * The '<em><b>COMPLETION G1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETION_G1_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETION_G1(8, "COMPLETION_G1", "COMPLETION_G1"),

	/**
	 * The '<em><b>BUOYANCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUOYANCY_VALUE
	 * @generated
	 * @ordered
	 */
	BUOYANCY(9, "BUOYANCY", "BUOYANCY"),

	/**
	 * The '<em><b>EARTHQUAKE E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARTHQUAKE_E_VALUE
	 * @generated
	 * @ordered
	 */
	EARTHQUAKE_E(10, "EARTHQUAKE_E", "EARTHQUAKE_E"),

	/**
	 * The '<em><b>CURRENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENT_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENT(11, "CURRENT", "CURRENT"),

	/**
	 * The '<em><b>FIRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRE(12, "FIRE", "FIRE"),

	/**
	 * The '<em><b>WAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_VALUE
	 * @generated
	 * @ordered
	 */
	WAVE(13, "WAVE", "WAVE"),

	/**
	 * The '<em><b>TEMPERATURE T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_T_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE_T(14, "TEMPERATURE_T", "TEMPERATURE_T"),

	/**
	 * The '<em><b>ICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICE_VALUE
	 * @generated
	 * @ordered
	 */
	ICE(15, "ICE", "ICE"),

	/**
	 * The '<em><b>CREEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREEP_VALUE
	 * @generated
	 * @ordered
	 */
	CREEP(16, "CREEP", "CREEP"),

	/**
	 * The '<em><b>RAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIN_VALUE
	 * @generated
	 * @ordered
	 */
	RAIN(17, "RAIN", "RAIN"),

	/**
	 * The '<em><b>PROPPING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPPING_VALUE
	 * @generated
	 * @ordered
	 */
	PROPPING(18, "PROPPING", "PROPPING"),

	/**
	 * The '<em><b>SYSTEM IMPERFECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_IMPERFECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_IMPERFECTION(19, "SYSTEM_IMPERFECTION", "SYSTEM_IMPERFECTION"),

	/**
	 * The '<em><b>TRANSPORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPORT(20, "TRANSPORT", "TRANSPORT"),

	/**
	 * The '<em><b>IMPULSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPULSE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPULSE(21, "IMPULSE", "IMPULSE"),

	/**
	 * The '<em><b>BRAKES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRAKES_VALUE
	 * @generated
	 * @ordered
	 */
	BRAKES(22, "BRAKES", "BRAKES"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(23, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>SHRINKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHRINKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SHRINKAGE(24, "SHRINKAGE", "SHRINKAGE"),

	/**
	 * The '<em><b>DEAD LOAD G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_LOAD_G_VALUE
	 * @generated
	 * @ordered
	 */
	DEAD_LOAD_G(25, "DEAD_LOAD_G", "DEAD_LOAD_G"),

	/**
	 * The '<em><b>WIND W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIND_W_VALUE
	 * @generated
	 * @ordered
	 */
	WIND_W(26, "WIND_W", "WIND_W"),

	/**
	 * The '<em><b>LACK OF FIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LACK_OF_FIT_VALUE
	 * @generated
	 * @ordered
	 */
	LACK_OF_FIT(27, "LACK_OF_FIT", "LACK_OF_FIT");

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
	public static final int NOTDEFINED_VALUE = 1;

	/**
	 * The '<em><b>PRESTRESSING P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRESTRESSING P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESTRESSING_P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESTRESSING_P_VALUE = 2;

	/**
	 * The '<em><b>SNOW S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SNOW S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SNOW_S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SNOW_S_VALUE = 3;

	/**
	 * The '<em><b>ERECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERECTION_VALUE = 4;

	/**
	 * The '<em><b>SETTLEMENT U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SETTLEMENT U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SETTLEMENT_U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SETTLEMENT_U_VALUE = 5;

	/**
	 * The '<em><b>IMPACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPACT_VALUE = 6;

	/**
	 * The '<em><b>LIVE LOAD Q</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIVE LOAD Q</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVE_LOAD_Q
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_LOAD_Q_VALUE = 7;

	/**
	 * The '<em><b>COMPLETION G1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETION G1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETION_G1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETION_G1_VALUE = 8;

	/**
	 * The '<em><b>BUOYANCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUOYANCY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUOYANCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUOYANCY_VALUE = 9;

	/**
	 * The '<em><b>EARTHQUAKE E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EARTHQUAKE E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARTHQUAKE_E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EARTHQUAKE_E_VALUE = 10;

	/**
	 * The '<em><b>CURRENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURRENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURRENT_VALUE = 11;

	/**
	 * The '<em><b>FIRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRE_VALUE = 12;

	/**
	 * The '<em><b>WAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_VALUE = 13;

	/**
	 * The '<em><b>TEMPERATURE T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPERATURE T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_T
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_T_VALUE = 14;

	/**
	 * The '<em><b>ICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICE_VALUE = 15;

	/**
	 * The '<em><b>CREEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREEP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREEP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREEP_VALUE = 16;

	/**
	 * The '<em><b>RAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAIN_VALUE = 17;

	/**
	 * The '<em><b>PROPPING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROPPING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPPING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROPPING_VALUE = 18;

	/**
	 * The '<em><b>SYSTEM IMPERFECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM IMPERFECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_IMPERFECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_IMPERFECTION_VALUE = 19;

	/**
	 * The '<em><b>TRANSPORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPORT_VALUE = 20;

	/**
	 * The '<em><b>IMPULSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPULSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPULSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPULSE_VALUE = 21;

	/**
	 * The '<em><b>BRAKES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BRAKES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRAKES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRAKES_VALUE = 22;

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
	public static final int USERDEFINED_VALUE = 23;

	/**
	 * The '<em><b>SHRINKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHRINKAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHRINKAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHRINKAGE_VALUE = 24;

	/**
	 * The '<em><b>DEAD LOAD G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEAD LOAD G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEAD_LOAD_G
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEAD_LOAD_G_VALUE = 25;

	/**
	 * The '<em><b>WIND W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIND W</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIND_W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIND_W_VALUE = 26;

	/**
	 * The '<em><b>LACK OF FIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LACK OF FIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LACK_OF_FIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LACK_OF_FIT_VALUE = 27;

	/**
	 * An array of all the '<em><b>Ifc Action Source Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcActionSourceTypeEnum[] VALUES_ARRAY =
		new IfcActionSourceTypeEnum[] {
			NULL,
			NOTDEFINED,
			PRESTRESSING_P,
			SNOW_S,
			ERECTION,
			SETTLEMENT_U,
			IMPACT,
			LIVE_LOAD_Q,
			COMPLETION_G1,
			BUOYANCY,
			EARTHQUAKE_E,
			CURRENT,
			FIRE,
			WAVE,
			TEMPERATURE_T,
			ICE,
			CREEP,
			RAIN,
			PROPPING,
			SYSTEM_IMPERFECTION,
			TRANSPORT,
			IMPULSE,
			BRAKES,
			USERDEFINED,
			SHRINKAGE,
			DEAD_LOAD_G,
			WIND_W,
			LACK_OF_FIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Ifc Action Source Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcActionSourceTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Action Source Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcActionSourceTypeEnum get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcActionSourceTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Action Source Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcActionSourceTypeEnum getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcActionSourceTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Action Source Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcActionSourceTypeEnum get(int value)
	{
		switch (value) {
			case NULL_VALUE: return NULL;
			case NOTDEFINED_VALUE: return NOTDEFINED;
			case PRESTRESSING_P_VALUE: return PRESTRESSING_P;
			case SNOW_S_VALUE: return SNOW_S;
			case ERECTION_VALUE: return ERECTION;
			case SETTLEMENT_U_VALUE: return SETTLEMENT_U;
			case IMPACT_VALUE: return IMPACT;
			case LIVE_LOAD_Q_VALUE: return LIVE_LOAD_Q;
			case COMPLETION_G1_VALUE: return COMPLETION_G1;
			case BUOYANCY_VALUE: return BUOYANCY;
			case EARTHQUAKE_E_VALUE: return EARTHQUAKE_E;
			case CURRENT_VALUE: return CURRENT;
			case FIRE_VALUE: return FIRE;
			case WAVE_VALUE: return WAVE;
			case TEMPERATURE_T_VALUE: return TEMPERATURE_T;
			case ICE_VALUE: return ICE;
			case CREEP_VALUE: return CREEP;
			case RAIN_VALUE: return RAIN;
			case PROPPING_VALUE: return PROPPING;
			case SYSTEM_IMPERFECTION_VALUE: return SYSTEM_IMPERFECTION;
			case TRANSPORT_VALUE: return TRANSPORT;
			case IMPULSE_VALUE: return IMPULSE;
			case BRAKES_VALUE: return BRAKES;
			case USERDEFINED_VALUE: return USERDEFINED;
			case SHRINKAGE_VALUE: return SHRINKAGE;
			case DEAD_LOAD_G_VALUE: return DEAD_LOAD_G;
			case WIND_W_VALUE: return WIND_W;
			case LACK_OF_FIT_VALUE: return LACK_OF_FIT;
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
	private IfcActionSourceTypeEnum(int value, String name, String literal)
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
	
} //IfcActionSourceTypeEnum
