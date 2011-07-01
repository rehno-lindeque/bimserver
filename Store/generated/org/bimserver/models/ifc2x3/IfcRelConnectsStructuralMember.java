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
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLengthAsString <em>Supported Length As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember()
 * @model
 * @generated
 */
public interface IfcRelConnectsStructuralMember extends IfcRelConnects
{
	/**
	 * Returns the value of the '<em><b>Relating Structural Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcStructuralMember#getConnectedBy <em>Connected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Structural Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Structural Member</em>' reference.
	 * @see #setRelatingStructuralMember(IfcStructuralMember)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_RelatingStructuralMember()
	 * @see org.bimserver.models.ifc2x3.IfcStructuralMember#getConnectedBy
	 * @model opposite="ConnectedBy"
	 * @generated
	 */
	IfcStructuralMember getRelatingStructuralMember();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Structural Member</em>' reference.
	 * @see #getRelatingStructuralMember()
	 * @generated
	 */
	void setRelatingStructuralMember(IfcStructuralMember value);

	/**
	 * Returns the value of the '<em><b>Related Structural Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Connection</em>' reference.
	 * @see #setRelatedStructuralConnection(IfcStructuralConnection)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_RelatedStructuralConnection()
	 * @see org.bimserver.models.ifc2x3.IfcStructuralConnection#getConnectsStructuralMembers
	 * @model opposite="ConnectsStructuralMembers"
	 * @generated
	 */
	IfcStructuralConnection getRelatedStructuralConnection();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Connection</em>' reference.
	 * @see #getRelatedStructuralConnection()
	 * @generated
	 */
	void setRelatedStructuralConnection(IfcStructuralConnection value);

	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' reference.
	 * @see #isSetAppliedCondition()
	 * @see #unsetAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_AppliedCondition()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcBoundaryCondition getAppliedCondition();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' reference.
	 * @see #isSetAppliedCondition()
	 * @see #unsetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(IfcBoundaryCondition value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @generated
	 */
	void unsetAppliedCondition();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Applied Condition</em>' reference is set.
	 * @see #unsetAppliedCondition()
	 * @see #getAppliedCondition()
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @generated
	 */
	boolean isSetAppliedCondition();

	/**
	 * Returns the value of the '<em><b>Additional Conditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Conditions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Conditions</em>' reference.
	 * @see #isSetAdditionalConditions()
	 * @see #unsetAdditionalConditions()
	 * @see #setAdditionalConditions(IfcStructuralConnectionCondition)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_AdditionalConditions()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcStructuralConnectionCondition getAdditionalConditions();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Conditions</em>' reference.
	 * @see #isSetAdditionalConditions()
	 * @see #unsetAdditionalConditions()
	 * @see #getAdditionalConditions()
	 * @generated
	 */
	void setAdditionalConditions(IfcStructuralConnectionCondition value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdditionalConditions()
	 * @see #getAdditionalConditions()
	 * @see #setAdditionalConditions(IfcStructuralConnectionCondition)
	 * @generated
	 */
	void unsetAdditionalConditions();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Additional Conditions</em>' reference is set.
	 * @see #unsetAdditionalConditions()
	 * @see #getAdditionalConditions()
	 * @see #setAdditionalConditions(IfcStructuralConnectionCondition)
	 * @generated
	 */
	boolean isSetAdditionalConditions();

	/**
	 * Returns the value of the '<em><b>Supported Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Length</em>' attribute.
	 * @see #isSetSupportedLength()
	 * @see #unsetSupportedLength()
	 * @see #setSupportedLength(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_SupportedLength()
	 * @model unsettable="true"
	 * @generated
	 */
	float getSupportedLength();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Length</em>' attribute.
	 * @see #isSetSupportedLength()
	 * @see #unsetSupportedLength()
	 * @see #getSupportedLength()
	 * @generated
	 */
	void setSupportedLength(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupportedLength()
	 * @see #getSupportedLength()
	 * @see #setSupportedLength(float)
	 * @generated
	 */
	void unsetSupportedLength();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Supported Length</em>' attribute is set.
	 * @see #unsetSupportedLength()
	 * @see #getSupportedLength()
	 * @see #setSupportedLength(float)
	 * @generated
	 */
	boolean isSetSupportedLength();

	/**
	 * Returns the value of the '<em><b>Supported Length As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Length As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Length As String</em>' attribute.
	 * @see #isSetSupportedLengthAsString()
	 * @see #unsetSupportedLengthAsString()
	 * @see #setSupportedLengthAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_SupportedLengthAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getSupportedLengthAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLengthAsString <em>Supported Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Length As String</em>' attribute.
	 * @see #isSetSupportedLengthAsString()
	 * @see #unsetSupportedLengthAsString()
	 * @see #getSupportedLengthAsString()
	 * @generated
	 */
	void setSupportedLengthAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLengthAsString <em>Supported Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupportedLengthAsString()
	 * @see #getSupportedLengthAsString()
	 * @see #setSupportedLengthAsString(String)
	 * @generated
	 */
	void unsetSupportedLengthAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getSupportedLengthAsString <em>Supported Length As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Supported Length As String</em>' attribute is set.
	 * @see #unsetSupportedLengthAsString()
	 * @see #getSupportedLengthAsString()
	 * @see #setSupportedLengthAsString(String)
	 * @generated
	 */
	boolean isSetSupportedLengthAsString();

	/**
	 * Returns the value of the '<em><b>Condition Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Coordinate System</em>' reference.
	 * @see #isSetConditionCoordinateSystem()
	 * @see #unsetConditionCoordinateSystem()
	 * @see #setConditionCoordinateSystem(IfcAxis2Placement3D)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelConnectsStructuralMember_ConditionCoordinateSystem()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAxis2Placement3D getConditionCoordinateSystem();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Coordinate System</em>' reference.
	 * @see #isSetConditionCoordinateSystem()
	 * @see #unsetConditionCoordinateSystem()
	 * @see #getConditionCoordinateSystem()
	 * @generated
	 */
	void setConditionCoordinateSystem(IfcAxis2Placement3D value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionCoordinateSystem()
	 * @see #getConditionCoordinateSystem()
	 * @see #setConditionCoordinateSystem(IfcAxis2Placement3D)
	 * @generated
	 */
	void unsetConditionCoordinateSystem();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Coordinate System</em>' reference is set.
	 * @see #unsetConditionCoordinateSystem()
	 * @see #getConditionCoordinateSystem()
	 * @see #setConditionCoordinateSystem(IfcAxis2Placement3D)
	 * @generated
	 */
	boolean isSetConditionCoordinateSystem();

} // IfcRelConnectsStructuralMember
