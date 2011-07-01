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
 * A representation of the model object '<em><b>Ifc Polygonal Bounded Half Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPolygonalBoundedHalfSpace#getPosition <em>Position</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPolygonalBoundedHalfSpace#getPolygonalBoundary <em>Polygonal Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPolygonalBoundedHalfSpace()
 * @model
 * @generated
 */
public interface IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid
{
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPolygonalBoundedHalfSpace_Position()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPolygonalBoundedHalfSpace#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Polygonal Boundary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygonal Boundary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygonal Boundary</em>' reference.
	 * @see #setPolygonalBoundary(IfcBoundedCurve)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPolygonalBoundedHalfSpace_PolygonalBoundary()
	 * @model
	 * @generated
	 */
	IfcBoundedCurve getPolygonalBoundary();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPolygonalBoundedHalfSpace#getPolygonalBoundary <em>Polygonal Boundary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygonal Boundary</em>' reference.
	 * @see #getPolygonalBoundary()
	 * @generated
	 */
	void setPolygonalBoundary(IfcBoundedCurve value);

} // IfcPolygonalBoundedHalfSpace
