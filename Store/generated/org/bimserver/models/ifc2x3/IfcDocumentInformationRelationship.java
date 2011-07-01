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

import org.bimserver.emf.IdEObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcDocumentInformationRelationship extends IdEObject
{
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointer <em>Is Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' reference.
	 * @see #setRelatingDocument(IfcDocumentInformation)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship_RelatingDocument()
	 * @see org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointer
	 * @model opposite="IsPointer"
	 * @generated
	 */
	IfcDocumentInformation getRelatingDocument();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' reference.
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(IfcDocumentInformation value);

	/**
	 * Returns the value of the '<em><b>Related Documents</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcDocumentInformation}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointedTo <em>Is Pointed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Documents</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship_RelatedDocuments()
	 * @see org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointedTo
	 * @model opposite="IsPointedTo"
	 * @generated
	 */
	EList<IfcDocumentInformation> getRelatedDocuments();

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship_RelationshipType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	boolean isSetRelationshipType();

} // IfcDocumentInformationRelationship
