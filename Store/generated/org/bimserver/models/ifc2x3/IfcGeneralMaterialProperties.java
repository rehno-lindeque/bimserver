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
 * A representation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeightAsString <em>Molecular Weight As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosityAsString <em>Porosity As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensityAsString <em>Mass Density As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties()
 * @model
 * @generated
 */
public interface IfcGeneralMaterialProperties extends IfcMaterialProperties
{
	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' attribute.
	 * @see #isSetMolecularWeight()
	 * @see #unsetMolecularWeight()
	 * @see #setMolecularWeight(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_MolecularWeight()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' attribute.
	 * @see #isSetMolecularWeight()
	 * @see #unsetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @see #setMolecularWeight(float)
	 * @generated
	 */
	void unsetMolecularWeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Molecular Weight</em>' attribute is set.
	 * @see #unsetMolecularWeight()
	 * @see #getMolecularWeight()
	 * @see #setMolecularWeight(float)
	 * @generated
	 */
	boolean isSetMolecularWeight();

	/**
	 * Returns the value of the '<em><b>Molecular Weight As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight As String</em>' attribute.
	 * @see #isSetMolecularWeightAsString()
	 * @see #unsetMolecularWeightAsString()
	 * @see #setMolecularWeightAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_MolecularWeightAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMolecularWeightAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeightAsString <em>Molecular Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight As String</em>' attribute.
	 * @see #isSetMolecularWeightAsString()
	 * @see #unsetMolecularWeightAsString()
	 * @see #getMolecularWeightAsString()
	 * @generated
	 */
	void setMolecularWeightAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeightAsString <em>Molecular Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMolecularWeightAsString()
	 * @see #getMolecularWeightAsString()
	 * @see #setMolecularWeightAsString(String)
	 * @generated
	 */
	void unsetMolecularWeightAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMolecularWeightAsString <em>Molecular Weight As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Molecular Weight As String</em>' attribute is set.
	 * @see #unsetMolecularWeightAsString()
	 * @see #getMolecularWeightAsString()
	 * @see #setMolecularWeightAsString(String)
	 * @generated
	 */
	boolean isSetMolecularWeightAsString();

	/**
	 * Returns the value of the '<em><b>Porosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porosity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porosity</em>' attribute.
	 * @see #isSetPorosity()
	 * @see #unsetPorosity()
	 * @see #setPorosity(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_Porosity()
	 * @model unsettable="true"
	 * @generated
	 */
	float getPorosity();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porosity</em>' attribute.
	 * @see #isSetPorosity()
	 * @see #unsetPorosity()
	 * @see #getPorosity()
	 * @generated
	 */
	void setPorosity(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPorosity()
	 * @see #getPorosity()
	 * @see #setPorosity(float)
	 * @generated
	 */
	void unsetPorosity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Porosity</em>' attribute is set.
	 * @see #unsetPorosity()
	 * @see #getPorosity()
	 * @see #setPorosity(float)
	 * @generated
	 */
	boolean isSetPorosity();

	/**
	 * Returns the value of the '<em><b>Porosity As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porosity As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porosity As String</em>' attribute.
	 * @see #isSetPorosityAsString()
	 * @see #unsetPorosityAsString()
	 * @see #setPorosityAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_PorosityAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPorosityAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosityAsString <em>Porosity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porosity As String</em>' attribute.
	 * @see #isSetPorosityAsString()
	 * @see #unsetPorosityAsString()
	 * @see #getPorosityAsString()
	 * @generated
	 */
	void setPorosityAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosityAsString <em>Porosity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPorosityAsString()
	 * @see #getPorosityAsString()
	 * @see #setPorosityAsString(String)
	 * @generated
	 */
	void unsetPorosityAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getPorosityAsString <em>Porosity As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Porosity As String</em>' attribute is set.
	 * @see #unsetPorosityAsString()
	 * @see #getPorosityAsString()
	 * @see #setPorosityAsString(String)
	 * @generated
	 */
	boolean isSetPorosityAsString();

	/**
	 * Returns the value of the '<em><b>Mass Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Density</em>' attribute.
	 * @see #isSetMassDensity()
	 * @see #unsetMassDensity()
	 * @see #setMassDensity(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_MassDensity()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMassDensity();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Density</em>' attribute.
	 * @see #isSetMassDensity()
	 * @see #unsetMassDensity()
	 * @see #getMassDensity()
	 * @generated
	 */
	void setMassDensity(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMassDensity()
	 * @see #getMassDensity()
	 * @see #setMassDensity(float)
	 * @generated
	 */
	void unsetMassDensity();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mass Density</em>' attribute is set.
	 * @see #unsetMassDensity()
	 * @see #getMassDensity()
	 * @see #setMassDensity(float)
	 * @generated
	 */
	boolean isSetMassDensity();

	/**
	 * Returns the value of the '<em><b>Mass Density As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Density As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Density As String</em>' attribute.
	 * @see #isSetMassDensityAsString()
	 * @see #unsetMassDensityAsString()
	 * @see #setMassDensityAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcGeneralMaterialProperties_MassDensityAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMassDensityAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensityAsString <em>Mass Density As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Density As String</em>' attribute.
	 * @see #isSetMassDensityAsString()
	 * @see #unsetMassDensityAsString()
	 * @see #getMassDensityAsString()
	 * @generated
	 */
	void setMassDensityAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensityAsString <em>Mass Density As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMassDensityAsString()
	 * @see #getMassDensityAsString()
	 * @see #setMassDensityAsString(String)
	 * @generated
	 */
	void unsetMassDensityAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties#getMassDensityAsString <em>Mass Density As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mass Density As String</em>' attribute is set.
	 * @see #unsetMassDensityAsString()
	 * @see #getMassDensityAsString()
	 * @see #setMassDensityAsString(String)
	 * @generated
	 */
	boolean isSetMassDensityAsString();

} // IfcGeneralMaterialProperties
