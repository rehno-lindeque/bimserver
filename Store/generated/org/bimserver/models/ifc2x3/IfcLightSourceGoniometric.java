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
 * A representation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getPosition <em>Position</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourTemperatureAsString <em>Colour Temperature As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLuminousFluxAsString <em>Luminous Flux As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric()
 * @model
 * @generated
 */
public interface IfcLightSourceGoniometric extends IfcLightSource
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
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_Position()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Colour Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Appearance</em>' reference.
	 * @see #isSetColourAppearance()
	 * @see #unsetColourAppearance()
	 * @see #setColourAppearance(IfcColourRgb)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_ColourAppearance()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcColourRgb getColourAppearance();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Appearance</em>' reference.
	 * @see #isSetColourAppearance()
	 * @see #unsetColourAppearance()
	 * @see #getColourAppearance()
	 * @generated
	 */
	void setColourAppearance(IfcColourRgb value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColourAppearance()
	 * @see #getColourAppearance()
	 * @see #setColourAppearance(IfcColourRgb)
	 * @generated
	 */
	void unsetColourAppearance();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colour Appearance</em>' reference is set.
	 * @see #unsetColourAppearance()
	 * @see #getColourAppearance()
	 * @see #setColourAppearance(IfcColourRgb)
	 * @generated
	 */
	boolean isSetColourAppearance();

	/**
	 * Returns the value of the '<em><b>Colour Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Temperature</em>' attribute.
	 * @see #setColourTemperature(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_ColourTemperature()
	 * @model
	 * @generated
	 */
	float getColourTemperature();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature</em>' attribute.
	 * @see #getColourTemperature()
	 * @generated
	 */
	void setColourTemperature(float value);

	/**
	 * Returns the value of the '<em><b>Colour Temperature As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Temperature As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Temperature As String</em>' attribute.
	 * @see #setColourTemperatureAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_ColourTemperatureAsString()
	 * @model
	 * @generated
	 */
	String getColourTemperatureAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getColourTemperatureAsString <em>Colour Temperature As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature As String</em>' attribute.
	 * @see #getColourTemperatureAsString()
	 * @generated
	 */
	void setColourTemperatureAsString(String value);

	/**
	 * Returns the value of the '<em><b>Luminous Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Flux</em>' attribute.
	 * @see #setLuminousFlux(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_LuminousFlux()
	 * @model
	 * @generated
	 */
	float getLuminousFlux();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Flux</em>' attribute.
	 * @see #getLuminousFlux()
	 * @generated
	 */
	void setLuminousFlux(float value);

	/**
	 * Returns the value of the '<em><b>Luminous Flux As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Flux As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Flux As String</em>' attribute.
	 * @see #setLuminousFluxAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_LuminousFluxAsString()
	 * @model
	 * @generated
	 */
	String getLuminousFluxAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLuminousFluxAsString <em>Luminous Flux As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Flux As String</em>' attribute.
	 * @see #getLuminousFluxAsString()
	 * @generated
	 */
	void setLuminousFluxAsString(String value);

	/**
	 * Returns the value of the '<em><b>Light Emission Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcLightEmissionSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Emission Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Emission Source</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcLightEmissionSourceEnum
	 * @see #setLightEmissionSource(IfcLightEmissionSourceEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_LightEmissionSource()
	 * @model
	 * @generated
	 */
	IfcLightEmissionSourceEnum getLightEmissionSource();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Emission Source</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcLightEmissionSourceEnum
	 * @see #getLightEmissionSource()
	 * @generated
	 */
	void setLightEmissionSource(IfcLightEmissionSourceEnum value);

	/**
	 * Returns the value of the '<em><b>Light Distribution Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Distribution Data Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Distribution Data Source</em>' reference.
	 * @see #setLightDistributionDataSource(IfcLightDistributionDataSourceSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcLightSourceGoniometric_LightDistributionDataSource()
	 * @model
	 * @generated
	 */
	IfcLightDistributionDataSourceSelect getLightDistributionDataSource();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Distribution Data Source</em>' reference.
	 * @see #getLightDistributionDataSource()
	 * @generated
	 */
	void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect value);

} // IfcLightSourceGoniometric
