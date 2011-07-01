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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcObjective#getResultValues <em>Result Values</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjective()
 * @model
 * @generated
 */
public interface IfcObjective extends IfcConstraint
{
	/**
	 * Returns the value of the '<em><b>Benchmark Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benchmark Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benchmark Values</em>' reference.
	 * @see #isSetBenchmarkValues()
	 * @see #unsetBenchmarkValues()
	 * @see #setBenchmarkValues(IfcMetric)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjective_BenchmarkValues()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMetric getBenchmarkValues();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benchmark Values</em>' reference.
	 * @see #isSetBenchmarkValues()
	 * @see #unsetBenchmarkValues()
	 * @see #getBenchmarkValues()
	 * @generated
	 */
	void setBenchmarkValues(IfcMetric value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBenchmarkValues()
	 * @see #getBenchmarkValues()
	 * @see #setBenchmarkValues(IfcMetric)
	 * @generated
	 */
	void unsetBenchmarkValues();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getBenchmarkValues <em>Benchmark Values</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Benchmark Values</em>' reference is set.
	 * @see #unsetBenchmarkValues()
	 * @see #getBenchmarkValues()
	 * @see #setBenchmarkValues(IfcMetric)
	 * @generated
	 */
	boolean isSetBenchmarkValues();

	/**
	 * Returns the value of the '<em><b>Result Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Values</em>' reference.
	 * @see #isSetResultValues()
	 * @see #unsetResultValues()
	 * @see #setResultValues(IfcMetric)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjective_ResultValues()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcMetric getResultValues();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getResultValues <em>Result Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Values</em>' reference.
	 * @see #isSetResultValues()
	 * @see #unsetResultValues()
	 * @see #getResultValues()
	 * @generated
	 */
	void setResultValues(IfcMetric value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getResultValues <em>Result Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResultValues()
	 * @see #getResultValues()
	 * @see #setResultValues(IfcMetric)
	 * @generated
	 */
	void unsetResultValues();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getResultValues <em>Result Values</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result Values</em>' reference is set.
	 * @see #unsetResultValues()
	 * @see #getResultValues()
	 * @see #setResultValues(IfcMetric)
	 * @generated
	 */
	boolean isSetResultValues();

	/**
	 * Returns the value of the '<em><b>Objective Qualifier</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcObjectiveEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Qualifier</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcObjectiveEnum
	 * @see #setObjectiveQualifier(IfcObjectiveEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjective_ObjectiveQualifier()
	 * @model
	 * @generated
	 */
	IfcObjectiveEnum getObjectiveQualifier();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getObjectiveQualifier <em>Objective Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Qualifier</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcObjectiveEnum
	 * @see #getObjectiveQualifier()
	 * @generated
	 */
	void setObjectiveQualifier(IfcObjectiveEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Qualifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Qualifier</em>' attribute.
	 * @see #isSetUserDefinedQualifier()
	 * @see #unsetUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcObjective_UserDefinedQualifier()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedQualifier();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Qualifier</em>' attribute.
	 * @see #isSetUserDefinedQualifier()
	 * @see #unsetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @generated
	 */
	void setUserDefinedQualifier(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @generated
	 */
	void unsetUserDefinedQualifier();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcObjective#getUserDefinedQualifier <em>User Defined Qualifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Qualifier</em>' attribute is set.
	 * @see #unsetUserDefinedQualifier()
	 * @see #getUserDefinedQualifier()
	 * @see #setUserDefinedQualifier(String)
	 * @generated
	 */
	boolean isSetUserDefinedQualifier();

} // IfcObjective
