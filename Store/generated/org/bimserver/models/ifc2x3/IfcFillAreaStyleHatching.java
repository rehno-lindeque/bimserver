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
 * A representation of the model object '<em><b>Ifc Fill Area Style Hatching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getHatchLineAppearance <em>Hatch Line Appearance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getHatchLineAngleAsString <em>Hatch Line Angle As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching()
 * @model
 * @generated
 */
public interface IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem, IfcFillStyleSelect
{
	/**
	 * Returns the value of the '<em><b>Hatch Line Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Appearance</em>' reference.
	 * @see #setHatchLineAppearance(IfcCurveStyle)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching_HatchLineAppearance()
	 * @model
	 * @generated
	 */
	IfcCurveStyle getHatchLineAppearance();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getHatchLineAppearance <em>Hatch Line Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Appearance</em>' reference.
	 * @see #getHatchLineAppearance()
	 * @generated
	 */
	void setHatchLineAppearance(IfcCurveStyle value);

	/**
	 * Returns the value of the '<em><b>Start Of Next Hatch Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Of Next Hatch Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Next Hatch Line</em>' reference.
	 * @see #setStartOfNextHatchLine(IfcHatchLineDistanceSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching_StartOfNextHatchLine()
	 * @model
	 * @generated
	 */
	IfcHatchLineDistanceSelect getStartOfNextHatchLine();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Next Hatch Line</em>' reference.
	 * @see #getStartOfNextHatchLine()
	 * @generated
	 */
	void setStartOfNextHatchLine(IfcHatchLineDistanceSelect value);

	/**
	 * Returns the value of the '<em><b>Point Of Reference Hatch Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Reference Hatch Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Reference Hatch Line</em>' reference.
	 * @see #isSetPointOfReferenceHatchLine()
	 * @see #unsetPointOfReferenceHatchLine()
	 * @see #setPointOfReferenceHatchLine(IfcCartesianPoint)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching_PointOfReferenceHatchLine()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCartesianPoint getPointOfReferenceHatchLine();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Reference Hatch Line</em>' reference.
	 * @see #isSetPointOfReferenceHatchLine()
	 * @see #unsetPointOfReferenceHatchLine()
	 * @see #getPointOfReferenceHatchLine()
	 * @generated
	 */
	void setPointOfReferenceHatchLine(IfcCartesianPoint value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPointOfReferenceHatchLine()
	 * @see #getPointOfReferenceHatchLine()
	 * @see #setPointOfReferenceHatchLine(IfcCartesianPoint)
	 * @generated
	 */
	void unsetPointOfReferenceHatchLine();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Point Of Reference Hatch Line</em>' reference is set.
	 * @see #unsetPointOfReferenceHatchLine()
	 * @see #getPointOfReferenceHatchLine()
	 * @see #setPointOfReferenceHatchLine(IfcCartesianPoint)
	 * @generated
	 */
	boolean isSetPointOfReferenceHatchLine();

	/**
	 * Returns the value of the '<em><b>Pattern Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Start</em>' reference.
	 * @see #isSetPatternStart()
	 * @see #unsetPatternStart()
	 * @see #setPatternStart(IfcCartesianPoint)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching_PatternStart()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCartesianPoint getPatternStart();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Start</em>' reference.
	 * @see #isSetPatternStart()
	 * @see #unsetPatternStart()
	 * @see #getPatternStart()
	 * @generated
	 */
	void setPatternStart(IfcCartesianPoint value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPatternStart()
	 * @see #getPatternStart()
	 * @see #setPatternStart(IfcCartesianPoint)
	 * @generated
	 */
	void unsetPatternStart();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pattern Start</em>' reference is set.
	 * @see #unsetPatternStart()
	 * @see #getPatternStart()
	 * @see #setPatternStart(IfcCartesianPoint)
	 * @generated
	 */
	boolean isSetPatternStart();

	/**
	 * Returns the value of the '<em><b>Hatch Line Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Angle</em>' attribute.
	 * @see #setHatchLineAngle(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching_HatchLineAngle()
	 * @model
	 * @generated
	 */
	float getHatchLineAngle();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Angle</em>' attribute.
	 * @see #getHatchLineAngle()
	 * @generated
	 */
	void setHatchLineAngle(float value);

	/**
	 * Returns the value of the '<em><b>Hatch Line Angle As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Angle As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Angle As String</em>' attribute.
	 * @see #setHatchLineAngleAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFillAreaStyleHatching_HatchLineAngleAsString()
	 * @model
	 * @generated
	 */
	String getHatchLineAngleAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching#getHatchLineAngleAsString <em>Hatch Line Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Angle As String</em>' attribute.
	 * @see #getHatchLineAngleAsString()
	 * @generated
	 */
	void setHatchLineAngleAsString(String value);

} // IfcFillAreaStyleHatching
