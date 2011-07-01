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
 * A representation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteractionAsString <em>Daily Interaction As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRatingAsString <em>Importance Rating As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements()
 * @model
 * @generated
 */
public interface IfcRelInteractionRequirements extends IfcRelConnects
{
	/**
	 * Returns the value of the '<em><b>Daily Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Interaction</em>' attribute.
	 * @see #isSetDailyInteraction()
	 * @see #unsetDailyInteraction()
	 * @see #setDailyInteraction(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_DailyInteraction()
	 * @model unsettable="true"
	 * @generated
	 */
	float getDailyInteraction();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Interaction</em>' attribute.
	 * @see #isSetDailyInteraction()
	 * @see #unsetDailyInteraction()
	 * @see #getDailyInteraction()
	 * @generated
	 */
	void setDailyInteraction(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDailyInteraction()
	 * @see #getDailyInteraction()
	 * @see #setDailyInteraction(float)
	 * @generated
	 */
	void unsetDailyInteraction();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daily Interaction</em>' attribute is set.
	 * @see #unsetDailyInteraction()
	 * @see #getDailyInteraction()
	 * @see #setDailyInteraction(float)
	 * @generated
	 */
	boolean isSetDailyInteraction();

	/**
	 * Returns the value of the '<em><b>Daily Interaction As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Interaction As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Interaction As String</em>' attribute.
	 * @see #isSetDailyInteractionAsString()
	 * @see #unsetDailyInteractionAsString()
	 * @see #setDailyInteractionAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_DailyInteractionAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDailyInteractionAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteractionAsString <em>Daily Interaction As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Interaction As String</em>' attribute.
	 * @see #isSetDailyInteractionAsString()
	 * @see #unsetDailyInteractionAsString()
	 * @see #getDailyInteractionAsString()
	 * @generated
	 */
	void setDailyInteractionAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteractionAsString <em>Daily Interaction As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDailyInteractionAsString()
	 * @see #getDailyInteractionAsString()
	 * @see #setDailyInteractionAsString(String)
	 * @generated
	 */
	void unsetDailyInteractionAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getDailyInteractionAsString <em>Daily Interaction As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Daily Interaction As String</em>' attribute is set.
	 * @see #unsetDailyInteractionAsString()
	 * @see #getDailyInteractionAsString()
	 * @see #setDailyInteractionAsString(String)
	 * @generated
	 */
	boolean isSetDailyInteractionAsString();

	/**
	 * Returns the value of the '<em><b>Importance Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Rating</em>' attribute.
	 * @see #isSetImportanceRating()
	 * @see #unsetImportanceRating()
	 * @see #setImportanceRating(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_ImportanceRating()
	 * @model unsettable="true"
	 * @generated
	 */
	float getImportanceRating();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Rating</em>' attribute.
	 * @see #isSetImportanceRating()
	 * @see #unsetImportanceRating()
	 * @see #getImportanceRating()
	 * @generated
	 */
	void setImportanceRating(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImportanceRating()
	 * @see #getImportanceRating()
	 * @see #setImportanceRating(float)
	 * @generated
	 */
	void unsetImportanceRating();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Importance Rating</em>' attribute is set.
	 * @see #unsetImportanceRating()
	 * @see #getImportanceRating()
	 * @see #setImportanceRating(float)
	 * @generated
	 */
	boolean isSetImportanceRating();

	/**
	 * Returns the value of the '<em><b>Importance Rating As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Rating As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Rating As String</em>' attribute.
	 * @see #isSetImportanceRatingAsString()
	 * @see #unsetImportanceRatingAsString()
	 * @see #setImportanceRatingAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_ImportanceRatingAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getImportanceRatingAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRatingAsString <em>Importance Rating As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Rating As String</em>' attribute.
	 * @see #isSetImportanceRatingAsString()
	 * @see #unsetImportanceRatingAsString()
	 * @see #getImportanceRatingAsString()
	 * @generated
	 */
	void setImportanceRatingAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRatingAsString <em>Importance Rating As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImportanceRatingAsString()
	 * @see #getImportanceRatingAsString()
	 * @see #setImportanceRatingAsString(String)
	 * @generated
	 */
	void unsetImportanceRatingAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getImportanceRatingAsString <em>Importance Rating As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Importance Rating As String</em>' attribute is set.
	 * @see #unsetImportanceRatingAsString()
	 * @see #getImportanceRatingAsString()
	 * @see #setImportanceRatingAsString(String)
	 * @generated
	 */
	boolean isSetImportanceRatingAsString();

	/**
	 * Returns the value of the '<em><b>Location Of Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Of Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Of Interaction</em>' reference.
	 * @see #isSetLocationOfInteraction()
	 * @see #unsetLocationOfInteraction()
	 * @see #setLocationOfInteraction(IfcSpatialStructureElement)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_LocationOfInteraction()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSpatialStructureElement getLocationOfInteraction();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Of Interaction</em>' reference.
	 * @see #isSetLocationOfInteraction()
	 * @see #unsetLocationOfInteraction()
	 * @see #getLocationOfInteraction()
	 * @generated
	 */
	void setLocationOfInteraction(IfcSpatialStructureElement value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocationOfInteraction()
	 * @see #getLocationOfInteraction()
	 * @see #setLocationOfInteraction(IfcSpatialStructureElement)
	 * @generated
	 */
	void unsetLocationOfInteraction();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location Of Interaction</em>' reference is set.
	 * @see #unsetLocationOfInteraction()
	 * @see #getLocationOfInteraction()
	 * @see #setLocationOfInteraction(IfcSpatialStructureElement)
	 * @generated
	 */
	boolean isSetLocationOfInteraction();

	/**
	 * Returns the value of the '<em><b>Related Space Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcSpaceProgram#getHasInteractionReqsFrom <em>Has Interaction Reqs From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space Program</em>' reference.
	 * @see #setRelatedSpaceProgram(IfcSpaceProgram)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_RelatedSpaceProgram()
	 * @see org.bimserver.models.ifc2x3.IfcSpaceProgram#getHasInteractionReqsFrom
	 * @model opposite="HasInteractionReqsFrom"
	 * @generated
	 */
	IfcSpaceProgram getRelatedSpaceProgram();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space Program</em>' reference.
	 * @see #getRelatedSpaceProgram()
	 * @generated
	 */
	void setRelatedSpaceProgram(IfcSpaceProgram value);

	/**
	 * Returns the value of the '<em><b>Relating Space Program</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcSpaceProgram#getHasInteractionReqsTo <em>Has Interaction Reqs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Space Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Space Program</em>' reference.
	 * @see #setRelatingSpaceProgram(IfcSpaceProgram)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelInteractionRequirements_RelatingSpaceProgram()
	 * @see org.bimserver.models.ifc2x3.IfcSpaceProgram#getHasInteractionReqsTo
	 * @model opposite="HasInteractionReqsTo"
	 * @generated
	 */
	IfcSpaceProgram getRelatingSpaceProgram();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Space Program</em>' reference.
	 * @see #getRelatingSpaceProgram()
	 * @generated
	 */
	void setRelatingSpaceProgram(IfcSpaceProgram value);

} // IfcRelInteractionRequirements
