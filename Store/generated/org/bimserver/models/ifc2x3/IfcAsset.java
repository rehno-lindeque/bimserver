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
 * A representation of the model object '<em><b>Ifc Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getTotalReplacementCost <em>Total Replacement Cost</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getUser <em>User</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getIncorporationDate <em>Incorporation Date</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcAsset#getDepreciatedValue <em>Depreciated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset()
 * @model
 * @generated
 */
public interface IfcAsset extends IfcGroup
{
	/**
	 * Returns the value of the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset ID</em>' attribute.
	 * @see #setAssetID(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_AssetID()
	 * @model
	 * @generated
	 */
	String getAssetID();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getAssetID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset ID</em>' attribute.
	 * @see #getAssetID()
	 * @generated
	 */
	void setAssetID(String value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' reference.
	 * @see #setOriginalValue(IfcCostValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_OriginalValue()
	 * @model
	 * @generated
	 */
	IfcCostValue getOriginalValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(IfcCostValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_CurrentValue()
	 * @model
	 * @generated
	 */
	IfcCostValue getCurrentValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Total Replacement Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Replacement Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Replacement Cost</em>' reference.
	 * @see #setTotalReplacementCost(IfcCostValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_TotalReplacementCost()
	 * @model
	 * @generated
	 */
	IfcCostValue getTotalReplacementCost();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getTotalReplacementCost <em>Total Replacement Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Replacement Cost</em>' reference.
	 * @see #getTotalReplacementCost()
	 * @generated
	 */
	void setTotalReplacementCost(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(IfcActorSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_Owner()
	 * @model
	 * @generated
	 */
	IfcActorSelect getOwner();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(IfcActorSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_User()
	 * @model
	 * @generated
	 */
	IfcActorSelect getUser();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' reference.
	 * @see #setResponsiblePerson(IfcPerson)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_ResponsiblePerson()
	 * @model
	 * @generated
	 */
	IfcPerson getResponsiblePerson();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getResponsiblePerson <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' reference.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(IfcPerson value);

	/**
	 * Returns the value of the '<em><b>Incorporation Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporation Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporation Date</em>' reference.
	 * @see #setIncorporationDate(IfcCalendarDate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_IncorporationDate()
	 * @model
	 * @generated
	 */
	IfcCalendarDate getIncorporationDate();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getIncorporationDate <em>Incorporation Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incorporation Date</em>' reference.
	 * @see #getIncorporationDate()
	 * @generated
	 */
	void setIncorporationDate(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Depreciated Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depreciated Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depreciated Value</em>' reference.
	 * @see #setDepreciatedValue(IfcCostValue)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcAsset_DepreciatedValue()
	 * @model
	 * @generated
	 */
	IfcCostValue getDepreciatedValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcAsset#getDepreciatedValue <em>Depreciated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depreciated Value</em>' reference.
	 * @see #getDepreciatedValue()
	 * @generated
	 */
	void setDepreciatedValue(IfcCostValue value);

} // IfcAsset
