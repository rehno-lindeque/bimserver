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
 * A representation of the model object '<em><b>Ifc Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcProject#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcProject#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcProject#getRepresentationContexts <em>Representation Contexts</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcProject#getUnitsInContext <em>Units In Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcProject()
 * @model
 * @generated
 */
public interface IfcProject extends IfcObject
{
	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #setLongName(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcProject_LongName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	void unsetLongName();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getLongName <em>Long Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Long Name</em>' attribute is set.
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	boolean isSetLongName();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcProject_Phase()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPhase();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(String)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(String)
	 * @generated
	 */
	boolean isSetPhase();

	/**
	 * Returns the value of the '<em><b>Representation Contexts</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcRepresentationContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Contexts</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcProject_RepresentationContexts()
	 * @model
	 * @generated
	 */
	EList<IfcRepresentationContext> getRepresentationContexts();

	/**
	 * Returns the value of the '<em><b>Units In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units In Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units In Context</em>' reference.
	 * @see #setUnitsInContext(IfcUnitAssignment)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcProject_UnitsInContext()
	 * @model
	 * @generated
	 */
	IfcUnitAssignment getUnitsInContext();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcProject#getUnitsInContext <em>Units In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units In Context</em>' reference.
	 * @see #getUnitsInContext()
	 * @generated
	 */
	void setUnitsInContext(IfcUnitAssignment value);

} // IfcProject
