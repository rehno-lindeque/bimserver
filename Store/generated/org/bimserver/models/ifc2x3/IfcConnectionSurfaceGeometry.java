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
 * A representation of the model object '<em><b>Ifc Connection Surface Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConnectionSurfaceGeometry()
 * @model
 * @generated
 */
public interface IfcConnectionSurfaceGeometry extends IfcConnectionGeometry
{
	/**
	 * Returns the value of the '<em><b>Surface On Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface On Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface On Relating Element</em>' reference.
	 * @see #setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConnectionSurfaceGeometry_SurfaceOnRelatingElement()
	 * @model
	 * @generated
	 */
	IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface On Relating Element</em>' reference.
	 * @see #getSurfaceOnRelatingElement()
	 * @generated
	 */
	void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface value);

	/**
	 * Returns the value of the '<em><b>Surface On Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface On Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface On Related Element</em>' reference.
	 * @see #isSetSurfaceOnRelatedElement()
	 * @see #unsetSurfaceOnRelatedElement()
	 * @see #setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcConnectionSurfaceGeometry_SurfaceOnRelatedElement()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface On Related Element</em>' reference.
	 * @see #isSetSurfaceOnRelatedElement()
	 * @see #unsetSurfaceOnRelatedElement()
	 * @see #getSurfaceOnRelatedElement()
	 * @generated
	 */
	void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSurfaceOnRelatedElement()
	 * @see #getSurfaceOnRelatedElement()
	 * @see #setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface)
	 * @generated
	 */
	void unsetSurfaceOnRelatedElement();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Surface On Related Element</em>' reference is set.
	 * @see #unsetSurfaceOnRelatedElement()
	 * @see #getSurfaceOnRelatedElement()
	 * @see #setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface)
	 * @generated
	 */
	boolean isSetSurfaceOnRelatedElement();

} // IfcConnectionSurfaceGeometry
