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
 * A representation of the model object '<em><b>Ifc Surface Curve Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getDirectrix <em>Directrix</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getStartParamAsString <em>Start Param As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getEndParamAsString <em>End Param As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getReferenceSurface <em>Reference Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid()
 * @model
 * @generated
 */
public interface IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid
{
	/**
	 * Returns the value of the '<em><b>Directrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directrix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directrix</em>' reference.
	 * @see #setDirectrix(IfcCurve)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid_Directrix()
	 * @model
	 * @generated
	 */
	IfcCurve getDirectrix();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getDirectrix <em>Directrix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directrix</em>' reference.
	 * @see #getDirectrix()
	 * @generated
	 */
	void setDirectrix(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Start Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Param</em>' attribute.
	 * @see #setStartParam(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid_StartParam()
	 * @model
	 * @generated
	 */
	float getStartParam();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getStartParam <em>Start Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Param</em>' attribute.
	 * @see #getStartParam()
	 * @generated
	 */
	void setStartParam(float value);

	/**
	 * Returns the value of the '<em><b>Start Param As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Param As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Param As String</em>' attribute.
	 * @see #setStartParamAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid_StartParamAsString()
	 * @model
	 * @generated
	 */
	String getStartParamAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getStartParamAsString <em>Start Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Param As String</em>' attribute.
	 * @see #getStartParamAsString()
	 * @generated
	 */
	void setStartParamAsString(String value);

	/**
	 * Returns the value of the '<em><b>End Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Param</em>' attribute.
	 * @see #setEndParam(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid_EndParam()
	 * @model
	 * @generated
	 */
	float getEndParam();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getEndParam <em>End Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param</em>' attribute.
	 * @see #getEndParam()
	 * @generated
	 */
	void setEndParam(float value);

	/**
	 * Returns the value of the '<em><b>End Param As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Param As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Param As String</em>' attribute.
	 * @see #setEndParamAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid_EndParamAsString()
	 * @model
	 * @generated
	 */
	String getEndParamAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getEndParamAsString <em>End Param As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Param As String</em>' attribute.
	 * @see #getEndParamAsString()
	 * @generated
	 */
	void setEndParamAsString(String value);

	/**
	 * Returns the value of the '<em><b>Reference Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Surface</em>' reference.
	 * @see #setReferenceSurface(IfcSurface)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcSurfaceCurveSweptAreaSolid_ReferenceSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getReferenceSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid#getReferenceSurface <em>Reference Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Surface</em>' reference.
	 * @see #getReferenceSurface()
	 * @generated
	 */
	void setReferenceSurface(IfcSurface value);

} // IfcSurfaceCurveSweptAreaSolid
