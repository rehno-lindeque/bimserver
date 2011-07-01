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
 * A representation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMappedItem#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMappedItem()
 * @model
 * @generated
 */
public interface IfcMappedItem extends IfcRepresentationItem
{
	/**
	 * Returns the value of the '<em><b>Mapping Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Source</em>' reference.
	 * @see #setMappingSource(IfcRepresentationMap)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMappedItem_MappingSource()
	 * @see org.bimserver.models.ifc2x3.IfcRepresentationMap#getMapUsage
	 * @model opposite="MapUsage"
	 * @generated
	 */
	IfcRepresentationMap getMappingSource();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMappedItem#getMappingSource <em>Mapping Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Source</em>' reference.
	 * @see #getMappingSource()
	 * @generated
	 */
	void setMappingSource(IfcRepresentationMap value);

	/**
	 * Returns the value of the '<em><b>Mapping Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Target</em>' reference.
	 * @see #setMappingTarget(IfcCartesianTransformationOperator)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMappedItem_MappingTarget()
	 * @model
	 * @generated
	 */
	IfcCartesianTransformationOperator getMappingTarget();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Target</em>' reference.
	 * @see #getMappingTarget()
	 * @generated
	 */
	void setMappingTarget(IfcCartesianTransformationOperator value);

} // IfcMappedItem
