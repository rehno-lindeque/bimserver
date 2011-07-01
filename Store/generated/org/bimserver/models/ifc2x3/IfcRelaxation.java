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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Relaxation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelaxation#getRelaxationValueAsString <em>Relaxation Value As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelaxation#getInitialStress <em>Initial Stress</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRelaxation#getInitialStressAsString <em>Initial Stress As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelaxation()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcRelaxation extends IdEObject
{
	/**
	 * Returns the value of the '<em><b>Relaxation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxation Value</em>' attribute.
	 * @see #setRelaxationValue(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelaxation_RelaxationValue()
	 * @model
	 * @generated
	 */
	float getRelaxationValue();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaxation Value</em>' attribute.
	 * @see #getRelaxationValue()
	 * @generated
	 */
	void setRelaxationValue(float value);

	/**
	 * Returns the value of the '<em><b>Relaxation Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxation Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxation Value As String</em>' attribute.
	 * @see #setRelaxationValueAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelaxation_RelaxationValueAsString()
	 * @model
	 * @generated
	 */
	String getRelaxationValueAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelaxation#getRelaxationValueAsString <em>Relaxation Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaxation Value As String</em>' attribute.
	 * @see #getRelaxationValueAsString()
	 * @generated
	 */
	void setRelaxationValueAsString(String value);

	/**
	 * Returns the value of the '<em><b>Initial Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Stress</em>' attribute.
	 * @see #setInitialStress(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelaxation_InitialStress()
	 * @model
	 * @generated
	 */
	float getInitialStress();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelaxation#getInitialStress <em>Initial Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Stress</em>' attribute.
	 * @see #getInitialStress()
	 * @generated
	 */
	void setInitialStress(float value);

	/**
	 * Returns the value of the '<em><b>Initial Stress As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Stress As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Stress As String</em>' attribute.
	 * @see #setInitialStressAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRelaxation_InitialStressAsString()
	 * @model
	 * @generated
	 */
	String getInitialStressAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRelaxation#getInitialStressAsString <em>Initial Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Stress As String</em>' attribute.
	 * @see #getInitialStressAsString()
	 * @generated
	 */
	void setInitialStressAsString(String value);

} // IfcRelaxation
