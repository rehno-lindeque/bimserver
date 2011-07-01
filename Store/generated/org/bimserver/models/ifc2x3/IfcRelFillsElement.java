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
 * A representation of the model object '<em><b>Ifc Rel Fills Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelFillsElement()
 * @model
 * @generated
 */
public interface IfcRelFillsElement extends IfcRelConnects
{
	/**
	 * Returns the value of the '<em><b>Relating Opening Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcOpeningElement#getHasFillings <em>Has Fillings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Opening Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Opening Element</em>' reference.
	 * @see #setRelatingOpeningElement(IfcOpeningElement)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelFillsElement_RelatingOpeningElement()
	 * @see org.bimserver.models.ifc2x3.IfcOpeningElement#getHasFillings
	 * @model opposite="HasFillings"
	 * @generated
	 */
	IfcOpeningElement getRelatingOpeningElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelFillsElement#getRelatingOpeningElement <em>Relating Opening Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Opening Element</em>' reference.
	 * @see #getRelatingOpeningElement()
	 * @generated
	 */
	void setRelatingOpeningElement(IfcOpeningElement value);

	/**
	 * Returns the value of the '<em><b>Related Building Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcElement#getFillsVoids <em>Fills Voids</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Building Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Building Element</em>' reference.
	 * @see #setRelatedBuildingElement(IfcElement)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelFillsElement_RelatedBuildingElement()
	 * @see org.bimserver.models.ifc2x3.IfcElement#getFillsVoids
	 * @model opposite="FillsVoids"
	 * @generated
	 */
	IfcElement getRelatedBuildingElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelFillsElement#getRelatedBuildingElement <em>Related Building Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Building Element</em>' reference.
	 * @see #getRelatedBuildingElement()
	 * @generated
	 */
	void setRelatedBuildingElement(IfcElement value);

} // IfcRelFillsElement
