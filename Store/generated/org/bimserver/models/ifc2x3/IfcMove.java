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
 * A representation of the model object '<em><b>Ifc Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMove#getMoveFrom <em>Move From</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMove#getMoveTo <em>Move To</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMove#getPunchList <em>Punch List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMove()
 * @model
 * @generated
 */
public interface IfcMove extends IfcTask
{
	/**
	 * Returns the value of the '<em><b>Move From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move From</em>' reference.
	 * @see #setMoveFrom(IfcSpatialStructureElement)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMove_MoveFrom()
	 * @model
	 * @generated
	 */
	IfcSpatialStructureElement getMoveFrom();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMove#getMoveFrom <em>Move From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move From</em>' reference.
	 * @see #getMoveFrom()
	 * @generated
	 */
	void setMoveFrom(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Move To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move To</em>' reference.
	 * @see #setMoveTo(IfcSpatialStructureElement)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMove_MoveTo()
	 * @model
	 * @generated
	 */
	IfcSpatialStructureElement getMoveTo();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMove#getMoveTo <em>Move To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move To</em>' reference.
	 * @see #getMoveTo()
	 * @generated
	 */
	void setMoveTo(IfcSpatialStructureElement value);

	/**
	 * Returns the value of the '<em><b>Punch List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Punch List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punch List</em>' attribute list.
	 * @see #isSetPunchList()
	 * @see #unsetPunchList()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMove_PunchList()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getPunchList();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMove#getPunchList <em>Punch List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPunchList()
	 * @see #getPunchList()
	 * @generated
	 */
	void unsetPunchList();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMove#getPunchList <em>Punch List</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Punch List</em>' attribute list is set.
	 * @see #unsetPunchList()
	 * @see #getPunchList()
	 * @generated
	 */
	boolean isSetPunchList();

} // IfcMove
