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
 * A representation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactorAsString <em>Upper Vapor Resistance Factor As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactorAsString <em>Lower Vapor Resistance Factor As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacityAsString <em>Isothermal Moisture Capacity As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeabilityAsString <em>Vapor Permeability As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivityAsString <em>Moisture Diffusivity As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties()
 * @model
 * @generated
 */
public interface IfcHygroscopicMaterialProperties extends IfcMaterialProperties
{
	/**
	 * Returns the value of the '<em><b>Upper Vapor Resistance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Vapor Resistance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Vapor Resistance Factor</em>' attribute.
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor()
	 * @model unsettable="true"
	 * @generated
	 */
	float getUpperVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Vapor Resistance Factor</em>' attribute.
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 */
	void setUpperVaporResistanceFactor(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(float)
	 * @generated
	 */
	void unsetUpperVaporResistanceFactor();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Vapor Resistance Factor</em>' attribute is set.
	 * @see #unsetUpperVaporResistanceFactor()
	 * @see #getUpperVaporResistanceFactor()
	 * @see #setUpperVaporResistanceFactor(float)
	 * @generated
	 */
	boolean isSetUpperVaporResistanceFactor();

	/**
	 * Returns the value of the '<em><b>Upper Vapor Resistance Factor As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Vapor Resistance Factor As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Vapor Resistance Factor As String</em>' attribute.
	 * @see #isSetUpperVaporResistanceFactorAsString()
	 * @see #unsetUpperVaporResistanceFactorAsString()
	 * @see #setUpperVaporResistanceFactorAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactorAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUpperVaporResistanceFactorAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactorAsString <em>Upper Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Vapor Resistance Factor As String</em>' attribute.
	 * @see #isSetUpperVaporResistanceFactorAsString()
	 * @see #unsetUpperVaporResistanceFactorAsString()
	 * @see #getUpperVaporResistanceFactorAsString()
	 * @generated
	 */
	void setUpperVaporResistanceFactorAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactorAsString <em>Upper Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpperVaporResistanceFactorAsString()
	 * @see #getUpperVaporResistanceFactorAsString()
	 * @see #setUpperVaporResistanceFactorAsString(String)
	 * @generated
	 */
	void unsetUpperVaporResistanceFactorAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactorAsString <em>Upper Vapor Resistance Factor As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Upper Vapor Resistance Factor As String</em>' attribute is set.
	 * @see #unsetUpperVaporResistanceFactorAsString()
	 * @see #getUpperVaporResistanceFactorAsString()
	 * @see #setUpperVaporResistanceFactorAsString(String)
	 * @generated
	 */
	boolean isSetUpperVaporResistanceFactorAsString();

	/**
	 * Returns the value of the '<em><b>Lower Vapor Resistance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Vapor Resistance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Vapor Resistance Factor</em>' attribute.
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor()
	 * @model unsettable="true"
	 * @generated
	 */
	float getLowerVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Vapor Resistance Factor</em>' attribute.
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 */
	void setLowerVaporResistanceFactor(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(float)
	 * @generated
	 */
	void unsetLowerVaporResistanceFactor();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Vapor Resistance Factor</em>' attribute is set.
	 * @see #unsetLowerVaporResistanceFactor()
	 * @see #getLowerVaporResistanceFactor()
	 * @see #setLowerVaporResistanceFactor(float)
	 * @generated
	 */
	boolean isSetLowerVaporResistanceFactor();

	/**
	 * Returns the value of the '<em><b>Lower Vapor Resistance Factor As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Vapor Resistance Factor As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Vapor Resistance Factor As String</em>' attribute.
	 * @see #isSetLowerVaporResistanceFactorAsString()
	 * @see #unsetLowerVaporResistanceFactorAsString()
	 * @see #setLowerVaporResistanceFactorAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactorAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getLowerVaporResistanceFactorAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactorAsString <em>Lower Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Vapor Resistance Factor As String</em>' attribute.
	 * @see #isSetLowerVaporResistanceFactorAsString()
	 * @see #unsetLowerVaporResistanceFactorAsString()
	 * @see #getLowerVaporResistanceFactorAsString()
	 * @generated
	 */
	void setLowerVaporResistanceFactorAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactorAsString <em>Lower Vapor Resistance Factor As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLowerVaporResistanceFactorAsString()
	 * @see #getLowerVaporResistanceFactorAsString()
	 * @see #setLowerVaporResistanceFactorAsString(String)
	 * @generated
	 */
	void unsetLowerVaporResistanceFactorAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactorAsString <em>Lower Vapor Resistance Factor As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lower Vapor Resistance Factor As String</em>' attribute is set.
	 * @see #unsetLowerVaporResistanceFactorAsString()
	 * @see #getLowerVaporResistanceFactorAsString()
	 * @see #setLowerVaporResistanceFactorAsString(String)
	 * @generated
	 */
	boolean isSetLowerVaporResistanceFactorAsString();

	/**
	 * Returns the value of the '<em><b>Isothermal Moisture Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isothermal Moisture Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isothermal Moisture Capacity</em>' attribute.
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity()
	 * @model unsettable="true"
	 * @generated
	 */
	float getIsothermalMoistureCapacity();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isothermal Moisture Capacity</em>' attribute.
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 */
	void setIsothermalMoistureCapacity(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(float)
	 * @generated
	 */
	void unsetIsothermalMoistureCapacity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isothermal Moisture Capacity</em>' attribute is set.
	 * @see #unsetIsothermalMoistureCapacity()
	 * @see #getIsothermalMoistureCapacity()
	 * @see #setIsothermalMoistureCapacity(float)
	 * @generated
	 */
	boolean isSetIsothermalMoistureCapacity();

	/**
	 * Returns the value of the '<em><b>Isothermal Moisture Capacity As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isothermal Moisture Capacity As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isothermal Moisture Capacity As String</em>' attribute.
	 * @see #isSetIsothermalMoistureCapacityAsString()
	 * @see #unsetIsothermalMoistureCapacityAsString()
	 * @see #setIsothermalMoistureCapacityAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacityAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getIsothermalMoistureCapacityAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacityAsString <em>Isothermal Moisture Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isothermal Moisture Capacity As String</em>' attribute.
	 * @see #isSetIsothermalMoistureCapacityAsString()
	 * @see #unsetIsothermalMoistureCapacityAsString()
	 * @see #getIsothermalMoistureCapacityAsString()
	 * @generated
	 */
	void setIsothermalMoistureCapacityAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacityAsString <em>Isothermal Moisture Capacity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsothermalMoistureCapacityAsString()
	 * @see #getIsothermalMoistureCapacityAsString()
	 * @see #setIsothermalMoistureCapacityAsString(String)
	 * @generated
	 */
	void unsetIsothermalMoistureCapacityAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacityAsString <em>Isothermal Moisture Capacity As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Isothermal Moisture Capacity As String</em>' attribute is set.
	 * @see #unsetIsothermalMoistureCapacityAsString()
	 * @see #getIsothermalMoistureCapacityAsString()
	 * @see #setIsothermalMoistureCapacityAsString(String)
	 * @generated
	 */
	boolean isSetIsothermalMoistureCapacityAsString();

	/**
	 * Returns the value of the '<em><b>Vapor Permeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vapor Permeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapor Permeability</em>' attribute.
	 * @see #isSetVaporPermeability()
	 * @see #unsetVaporPermeability()
	 * @see #setVaporPermeability(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_VaporPermeability()
	 * @model unsettable="true"
	 * @generated
	 */
	float getVaporPermeability();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapor Permeability</em>' attribute.
	 * @see #isSetVaporPermeability()
	 * @see #unsetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @generated
	 */
	void setVaporPermeability(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @see #setVaporPermeability(float)
	 * @generated
	 */
	void unsetVaporPermeability();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vapor Permeability</em>' attribute is set.
	 * @see #unsetVaporPermeability()
	 * @see #getVaporPermeability()
	 * @see #setVaporPermeability(float)
	 * @generated
	 */
	boolean isSetVaporPermeability();

	/**
	 * Returns the value of the '<em><b>Vapor Permeability As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vapor Permeability As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapor Permeability As String</em>' attribute.
	 * @see #isSetVaporPermeabilityAsString()
	 * @see #unsetVaporPermeabilityAsString()
	 * @see #setVaporPermeabilityAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_VaporPermeabilityAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getVaporPermeabilityAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeabilityAsString <em>Vapor Permeability As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapor Permeability As String</em>' attribute.
	 * @see #isSetVaporPermeabilityAsString()
	 * @see #unsetVaporPermeabilityAsString()
	 * @see #getVaporPermeabilityAsString()
	 * @generated
	 */
	void setVaporPermeabilityAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeabilityAsString <em>Vapor Permeability As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaporPermeabilityAsString()
	 * @see #getVaporPermeabilityAsString()
	 * @see #setVaporPermeabilityAsString(String)
	 * @generated
	 */
	void unsetVaporPermeabilityAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getVaporPermeabilityAsString <em>Vapor Permeability As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vapor Permeability As String</em>' attribute is set.
	 * @see #unsetVaporPermeabilityAsString()
	 * @see #getVaporPermeabilityAsString()
	 * @see #setVaporPermeabilityAsString(String)
	 * @generated
	 */
	boolean isSetVaporPermeabilityAsString();

	/**
	 * Returns the value of the '<em><b>Moisture Diffusivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moisture Diffusivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture Diffusivity</em>' attribute.
	 * @see #isSetMoistureDiffusivity()
	 * @see #unsetMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_MoistureDiffusivity()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMoistureDiffusivity();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moisture Diffusivity</em>' attribute.
	 * @see #isSetMoistureDiffusivity()
	 * @see #unsetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @generated
	 */
	void setMoistureDiffusivity(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(float)
	 * @generated
	 */
	void unsetMoistureDiffusivity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moisture Diffusivity</em>' attribute is set.
	 * @see #unsetMoistureDiffusivity()
	 * @see #getMoistureDiffusivity()
	 * @see #setMoistureDiffusivity(float)
	 * @generated
	 */
	boolean isSetMoistureDiffusivity();

	/**
	 * Returns the value of the '<em><b>Moisture Diffusivity As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moisture Diffusivity As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture Diffusivity As String</em>' attribute.
	 * @see #isSetMoistureDiffusivityAsString()
	 * @see #unsetMoistureDiffusivityAsString()
	 * @see #setMoistureDiffusivityAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcHygroscopicMaterialProperties_MoistureDiffusivityAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMoistureDiffusivityAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivityAsString <em>Moisture Diffusivity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moisture Diffusivity As String</em>' attribute.
	 * @see #isSetMoistureDiffusivityAsString()
	 * @see #unsetMoistureDiffusivityAsString()
	 * @see #getMoistureDiffusivityAsString()
	 * @generated
	 */
	void setMoistureDiffusivityAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivityAsString <em>Moisture Diffusivity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoistureDiffusivityAsString()
	 * @see #getMoistureDiffusivityAsString()
	 * @see #setMoistureDiffusivityAsString(String)
	 * @generated
	 */
	void unsetMoistureDiffusivityAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties#getMoistureDiffusivityAsString <em>Moisture Diffusivity As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moisture Diffusivity As String</em>' attribute is set.
	 * @see #unsetMoistureDiffusivityAsString()
	 * @see #getMoistureDiffusivityAsString()
	 * @see #setMoistureDiffusivityAsString(String)
	 * @generated
	 */
	boolean isSetMoistureDiffusivityAsString();

} // IfcHygroscopicMaterialProperties
