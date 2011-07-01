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
 * A representation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrengthAsString <em>Compressive Strength As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSizeAsString <em>Max Aggregate Size As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatioAsString <em>Protective Pore Ratio As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties()
 * @model
 * @generated
 */
public interface IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties
{
	/**
	 * Returns the value of the '<em><b>Compressive Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressive Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressive Strength</em>' attribute.
	 * @see #isSetCompressiveStrength()
	 * @see #unsetCompressiveStrength()
	 * @see #setCompressiveStrength(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_CompressiveStrength()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCompressiveStrength();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressive Strength</em>' attribute.
	 * @see #isSetCompressiveStrength()
	 * @see #unsetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @generated
	 */
	void setCompressiveStrength(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @see #setCompressiveStrength(float)
	 * @generated
	 */
	void unsetCompressiveStrength();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compressive Strength</em>' attribute is set.
	 * @see #unsetCompressiveStrength()
	 * @see #getCompressiveStrength()
	 * @see #setCompressiveStrength(float)
	 * @generated
	 */
	boolean isSetCompressiveStrength();

	/**
	 * Returns the value of the '<em><b>Compressive Strength As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressive Strength As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressive Strength As String</em>' attribute.
	 * @see #isSetCompressiveStrengthAsString()
	 * @see #unsetCompressiveStrengthAsString()
	 * @see #setCompressiveStrengthAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_CompressiveStrengthAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCompressiveStrengthAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrengthAsString <em>Compressive Strength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressive Strength As String</em>' attribute.
	 * @see #isSetCompressiveStrengthAsString()
	 * @see #unsetCompressiveStrengthAsString()
	 * @see #getCompressiveStrengthAsString()
	 * @generated
	 */
	void setCompressiveStrengthAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrengthAsString <em>Compressive Strength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressiveStrengthAsString()
	 * @see #getCompressiveStrengthAsString()
	 * @see #setCompressiveStrengthAsString(String)
	 * @generated
	 */
	void unsetCompressiveStrengthAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getCompressiveStrengthAsString <em>Compressive Strength As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compressive Strength As String</em>' attribute is set.
	 * @see #unsetCompressiveStrengthAsString()
	 * @see #getCompressiveStrengthAsString()
	 * @see #setCompressiveStrengthAsString(String)
	 * @generated
	 */
	boolean isSetCompressiveStrengthAsString();

	/**
	 * Returns the value of the '<em><b>Max Aggregate Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Aggregate Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Aggregate Size</em>' attribute.
	 * @see #isSetMaxAggregateSize()
	 * @see #unsetMaxAggregateSize()
	 * @see #setMaxAggregateSize(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMaxAggregateSize();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aggregate Size</em>' attribute.
	 * @see #isSetMaxAggregateSize()
	 * @see #unsetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @generated
	 */
	void setMaxAggregateSize(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @see #setMaxAggregateSize(float)
	 * @generated
	 */
	void unsetMaxAggregateSize();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Aggregate Size</em>' attribute is set.
	 * @see #unsetMaxAggregateSize()
	 * @see #getMaxAggregateSize()
	 * @see #setMaxAggregateSize(float)
	 * @generated
	 */
	boolean isSetMaxAggregateSize();

	/**
	 * Returns the value of the '<em><b>Max Aggregate Size As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Aggregate Size As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Aggregate Size As String</em>' attribute.
	 * @see #isSetMaxAggregateSizeAsString()
	 * @see #unsetMaxAggregateSizeAsString()
	 * @see #setMaxAggregateSizeAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_MaxAggregateSizeAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMaxAggregateSizeAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSizeAsString <em>Max Aggregate Size As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aggregate Size As String</em>' attribute.
	 * @see #isSetMaxAggregateSizeAsString()
	 * @see #unsetMaxAggregateSizeAsString()
	 * @see #getMaxAggregateSizeAsString()
	 * @generated
	 */
	void setMaxAggregateSizeAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSizeAsString <em>Max Aggregate Size As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAggregateSizeAsString()
	 * @see #getMaxAggregateSizeAsString()
	 * @see #setMaxAggregateSizeAsString(String)
	 * @generated
	 */
	void unsetMaxAggregateSizeAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSizeAsString <em>Max Aggregate Size As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Aggregate Size As String</em>' attribute is set.
	 * @see #unsetMaxAggregateSizeAsString()
	 * @see #getMaxAggregateSizeAsString()
	 * @see #setMaxAggregateSizeAsString(String)
	 * @generated
	 */
	boolean isSetMaxAggregateSizeAsString();

	/**
	 * Returns the value of the '<em><b>Admixtures Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admixtures Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admixtures Description</em>' attribute.
	 * @see #isSetAdmixturesDescription()
	 * @see #unsetAdmixturesDescription()
	 * @see #setAdmixturesDescription(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription()
	 * @model unsettable="true"
	 * @generated
	 */
	String getAdmixturesDescription();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admixtures Description</em>' attribute.
	 * @see #isSetAdmixturesDescription()
	 * @see #unsetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @generated
	 */
	void setAdmixturesDescription(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @see #setAdmixturesDescription(String)
	 * @generated
	 */
	void unsetAdmixturesDescription();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Admixtures Description</em>' attribute is set.
	 * @see #unsetAdmixturesDescription()
	 * @see #getAdmixturesDescription()
	 * @see #setAdmixturesDescription(String)
	 * @generated
	 */
	boolean isSetAdmixturesDescription();

	/**
	 * Returns the value of the '<em><b>Workability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workability</em>' attribute.
	 * @see #isSetWorkability()
	 * @see #unsetWorkability()
	 * @see #setWorkability(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_Workability()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWorkability();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workability</em>' attribute.
	 * @see #isSetWorkability()
	 * @see #unsetWorkability()
	 * @see #getWorkability()
	 * @generated
	 */
	void setWorkability(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkability()
	 * @see #getWorkability()
	 * @see #setWorkability(String)
	 * @generated
	 */
	void unsetWorkability();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Workability</em>' attribute is set.
	 * @see #unsetWorkability()
	 * @see #getWorkability()
	 * @see #setWorkability(String)
	 * @generated
	 */
	boolean isSetWorkability();

	/**
	 * Returns the value of the '<em><b>Protective Pore Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protective Pore Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protective Pore Ratio</em>' attribute.
	 * @see #isSetProtectivePoreRatio()
	 * @see #unsetProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio()
	 * @model unsettable="true"
	 * @generated
	 */
	float getProtectivePoreRatio();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protective Pore Ratio</em>' attribute.
	 * @see #isSetProtectivePoreRatio()
	 * @see #unsetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @generated
	 */
	void setProtectivePoreRatio(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(float)
	 * @generated
	 */
	void unsetProtectivePoreRatio();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protective Pore Ratio</em>' attribute is set.
	 * @see #unsetProtectivePoreRatio()
	 * @see #getProtectivePoreRatio()
	 * @see #setProtectivePoreRatio(float)
	 * @generated
	 */
	boolean isSetProtectivePoreRatio();

	/**
	 * Returns the value of the '<em><b>Protective Pore Ratio As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protective Pore Ratio As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protective Pore Ratio As String</em>' attribute.
	 * @see #isSetProtectivePoreRatioAsString()
	 * @see #unsetProtectivePoreRatioAsString()
	 * @see #setProtectivePoreRatioAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatioAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getProtectivePoreRatioAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatioAsString <em>Protective Pore Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protective Pore Ratio As String</em>' attribute.
	 * @see #isSetProtectivePoreRatioAsString()
	 * @see #unsetProtectivePoreRatioAsString()
	 * @see #getProtectivePoreRatioAsString()
	 * @generated
	 */
	void setProtectivePoreRatioAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatioAsString <em>Protective Pore Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProtectivePoreRatioAsString()
	 * @see #getProtectivePoreRatioAsString()
	 * @see #setProtectivePoreRatioAsString(String)
	 * @generated
	 */
	void unsetProtectivePoreRatioAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatioAsString <em>Protective Pore Ratio As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Protective Pore Ratio As String</em>' attribute is set.
	 * @see #unsetProtectivePoreRatioAsString()
	 * @see #getProtectivePoreRatioAsString()
	 * @see #setProtectivePoreRatioAsString(String)
	 * @generated
	 */
	boolean isSetProtectivePoreRatioAsString();

	/**
	 * Returns the value of the '<em><b>Water Impermeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Impermeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Impermeability</em>' attribute.
	 * @see #isSetWaterImpermeability()
	 * @see #unsetWaterImpermeability()
	 * @see #setWaterImpermeability(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcMechanicalConcreteMaterialProperties_WaterImpermeability()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWaterImpermeability();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Impermeability</em>' attribute.
	 * @see #isSetWaterImpermeability()
	 * @see #unsetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @generated
	 */
	void setWaterImpermeability(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @see #setWaterImpermeability(String)
	 * @generated
	 */
	void unsetWaterImpermeability();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Water Impermeability</em>' attribute is set.
	 * @see #unsetWaterImpermeability()
	 * @see #getWaterImpermeability()
	 * @see #setWaterImpermeability(String)
	 * @generated
	 */
	boolean isSetWaterImpermeability();

} // IfcMechanicalConcreteMaterialProperties
