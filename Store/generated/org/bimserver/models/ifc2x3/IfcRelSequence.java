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
 * A representation of the model object '<em><b>Ifc Rel Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelSequence#getRelatedProcess <em>Related Process</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelSequence#getTimeLag <em>Time Lag</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelSequence#getTimeLagAsString <em>Time Lag As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelSequence#getSequenceType <em>Sequence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelSequence()
 * @model
 * @generated
 */
public interface IfcRelSequence extends IfcRelConnects
{
	/**
	 * Returns the value of the '<em><b>Relating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Process</em>' reference.
	 * @see #setRelatingProcess(IfcProcess)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelSequence_RelatingProcess()
	 * @see org.bimserver.models.ifc2x3.IfcProcess#getIsPredecessorTo
	 * @model opposite="IsPredecessorTo"
	 * @generated
	 */
	IfcProcess getRelatingProcess();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Process</em>' reference.
	 * @see #getRelatingProcess()
	 * @generated
	 */
	void setRelatingProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Related Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Process</em>' reference.
	 * @see #setRelatedProcess(IfcProcess)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelSequence_RelatedProcess()
	 * @see org.bimserver.models.ifc2x3.IfcProcess#getIsSuccessorFrom
	 * @model opposite="IsSuccessorFrom"
	 * @generated
	 */
	IfcProcess getRelatedProcess();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelSequence#getRelatedProcess <em>Related Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Process</em>' reference.
	 * @see #getRelatedProcess()
	 * @generated
	 */
	void setRelatedProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Time Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lag</em>' attribute.
	 * @see #setTimeLag(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelSequence_TimeLag()
	 * @model
	 * @generated
	 */
	float getTimeLag();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelSequence#getTimeLag <em>Time Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Lag</em>' attribute.
	 * @see #getTimeLag()
	 * @generated
	 */
	void setTimeLag(float value);

	/**
	 * Returns the value of the '<em><b>Time Lag As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lag As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lag As String</em>' attribute.
	 * @see #setTimeLagAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelSequence_TimeLagAsString()
	 * @model
	 * @generated
	 */
	String getTimeLagAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelSequence#getTimeLagAsString <em>Time Lag As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Lag As String</em>' attribute.
	 * @see #getTimeLagAsString()
	 * @generated
	 */
	void setTimeLagAsString(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcSequenceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcSequenceEnum
	 * @see #setSequenceType(IfcSequenceEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelSequence_SequenceType()
	 * @model
	 * @generated
	 */
	IfcSequenceEnum getSequenceType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelSequence#getSequenceType <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcSequenceEnum
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(IfcSequenceEnum value);

} // IfcRelSequence
