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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Result Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getIsLinear <em>Is Linear</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getResultGroupFor <em>Result Group For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralResultGroup()
 * @model
 * @generated
 */
public interface IfcStructuralResultGroup extends IfcGroup
{
	/**
	 * Returns the value of the '<em><b>Theory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcAnalysisTheoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theory Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcAnalysisTheoryTypeEnum
	 * @see #setTheoryType(IfcAnalysisTheoryTypeEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralResultGroup_TheoryType()
	 * @model
	 * @generated
	 */
	IfcAnalysisTheoryTypeEnum getTheoryType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theory Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcAnalysisTheoryTypeEnum
	 * @see #getTheoryType()
	 * @generated
	 */
	void setTheoryType(IfcAnalysisTheoryTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Result For Load Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadGroup#getSourceOfResultGroup <em>Source Of Result Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result For Load Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result For Load Group</em>' reference.
	 * @see #isSetResultForLoadGroup()
	 * @see #unsetResultForLoadGroup()
	 * @see #setResultForLoadGroup(IfcStructuralLoadGroup)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralResultGroup_ResultForLoadGroup()
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadGroup#getSourceOfResultGroup
	 * @model opposite="SourceOfResultGroup" unsettable="true"
	 * @generated
	 */
	IfcStructuralLoadGroup getResultForLoadGroup();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result For Load Group</em>' reference.
	 * @see #isSetResultForLoadGroup()
	 * @see #unsetResultForLoadGroup()
	 * @see #getResultForLoadGroup()
	 * @generated
	 */
	void setResultForLoadGroup(IfcStructuralLoadGroup value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResultForLoadGroup()
	 * @see #getResultForLoadGroup()
	 * @see #setResultForLoadGroup(IfcStructuralLoadGroup)
	 * @generated
	 */
	void unsetResultForLoadGroup();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Result For Load Group</em>' reference is set.
	 * @see #unsetResultForLoadGroup()
	 * @see #getResultForLoadGroup()
	 * @see #setResultForLoadGroup(IfcStructuralLoadGroup)
	 * @generated
	 */
	boolean isSetResultForLoadGroup();

	/**
	 * Returns the value of the '<em><b>Is Linear</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Linear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Linear</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #setIsLinear(Tristate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralResultGroup_IsLinear()
	 * @model
	 * @generated
	 */
	Tristate getIsLinear();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup#getIsLinear <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Linear</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #getIsLinear()
	 * @generated
	 */
	void setIsLinear(Tristate value);

	/**
	 * Returns the value of the '<em><b>Result Group For</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcStructuralAnalysisModel}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcStructuralAnalysisModel#getHasResults <em>Has Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Group For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Group For</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralResultGroup_ResultGroupFor()
	 * @see org.bimserver.models.ifc2x3.IfcStructuralAnalysisModel#getHasResults
	 * @model opposite="HasResults" upper="2"
	 * @generated
	 */
	EList<IfcStructuralAnalysisModel> getResultGroupFor();

} // IfcStructuralResultGroup
