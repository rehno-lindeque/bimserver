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
 * A representation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardnessAsString <em>Hardness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentrationAsString <em>Alkalinity Concentration As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentrationAsString <em>Acidity Concentration As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContentAsString <em>Impurities Content As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevelAsString <em>PH Level As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContentAsString <em>Dissolved Solids Content As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties()
 * @model
 * @generated
 */
public interface IfcWaterProperties extends IfcMaterialProperties
{
	/**
	 * Returns the value of the '<em><b>Is Potable</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Potable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Potable</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #setIsPotable(Tristate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_IsPotable()
	 * @model
	 * @generated
	 */
	Tristate getIsPotable();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getIsPotable <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Potable</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #getIsPotable()
	 * @generated
	 */
	void setIsPotable(Tristate value);

	/**
	 * Returns the value of the '<em><b>Hardness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardness</em>' attribute.
	 * @see #isSetHardness()
	 * @see #unsetHardness()
	 * @see #setHardness(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_Hardness()
	 * @model unsettable="true"
	 * @generated
	 */
	float getHardness();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardness</em>' attribute.
	 * @see #isSetHardness()
	 * @see #unsetHardness()
	 * @see #getHardness()
	 * @generated
	 */
	void setHardness(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardness()
	 * @see #getHardness()
	 * @see #setHardness(float)
	 * @generated
	 */
	void unsetHardness();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardness</em>' attribute is set.
	 * @see #unsetHardness()
	 * @see #getHardness()
	 * @see #setHardness(float)
	 * @generated
	 */
	boolean isSetHardness();

	/**
	 * Returns the value of the '<em><b>Hardness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardness As String</em>' attribute.
	 * @see #isSetHardnessAsString()
	 * @see #unsetHardnessAsString()
	 * @see #setHardnessAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_HardnessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getHardnessAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardnessAsString <em>Hardness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardness As String</em>' attribute.
	 * @see #isSetHardnessAsString()
	 * @see #unsetHardnessAsString()
	 * @see #getHardnessAsString()
	 * @generated
	 */
	void setHardnessAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardnessAsString <em>Hardness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHardnessAsString()
	 * @see #getHardnessAsString()
	 * @see #setHardnessAsString(String)
	 * @generated
	 */
	void unsetHardnessAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getHardnessAsString <em>Hardness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hardness As String</em>' attribute is set.
	 * @see #unsetHardnessAsString()
	 * @see #getHardnessAsString()
	 * @see #setHardnessAsString(String)
	 * @generated
	 */
	boolean isSetHardnessAsString();

	/**
	 * Returns the value of the '<em><b>Alkalinity Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alkalinity Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alkalinity Concentration</em>' attribute.
	 * @see #isSetAlkalinityConcentration()
	 * @see #unsetAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_AlkalinityConcentration()
	 * @model unsettable="true"
	 * @generated
	 */
	float getAlkalinityConcentration();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alkalinity Concentration</em>' attribute.
	 * @see #isSetAlkalinityConcentration()
	 * @see #unsetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @generated
	 */
	void setAlkalinityConcentration(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(float)
	 * @generated
	 */
	void unsetAlkalinityConcentration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alkalinity Concentration</em>' attribute is set.
	 * @see #unsetAlkalinityConcentration()
	 * @see #getAlkalinityConcentration()
	 * @see #setAlkalinityConcentration(float)
	 * @generated
	 */
	boolean isSetAlkalinityConcentration();

	/**
	 * Returns the value of the '<em><b>Alkalinity Concentration As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alkalinity Concentration As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alkalinity Concentration As String</em>' attribute.
	 * @see #isSetAlkalinityConcentrationAsString()
	 * @see #unsetAlkalinityConcentrationAsString()
	 * @see #setAlkalinityConcentrationAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_AlkalinityConcentrationAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getAlkalinityConcentrationAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentrationAsString <em>Alkalinity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alkalinity Concentration As String</em>' attribute.
	 * @see #isSetAlkalinityConcentrationAsString()
	 * @see #unsetAlkalinityConcentrationAsString()
	 * @see #getAlkalinityConcentrationAsString()
	 * @generated
	 */
	void setAlkalinityConcentrationAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentrationAsString <em>Alkalinity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlkalinityConcentrationAsString()
	 * @see #getAlkalinityConcentrationAsString()
	 * @see #setAlkalinityConcentrationAsString(String)
	 * @generated
	 */
	void unsetAlkalinityConcentrationAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAlkalinityConcentrationAsString <em>Alkalinity Concentration As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alkalinity Concentration As String</em>' attribute is set.
	 * @see #unsetAlkalinityConcentrationAsString()
	 * @see #getAlkalinityConcentrationAsString()
	 * @see #setAlkalinityConcentrationAsString(String)
	 * @generated
	 */
	boolean isSetAlkalinityConcentrationAsString();

	/**
	 * Returns the value of the '<em><b>Acidity Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acidity Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acidity Concentration</em>' attribute.
	 * @see #isSetAcidityConcentration()
	 * @see #unsetAcidityConcentration()
	 * @see #setAcidityConcentration(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_AcidityConcentration()
	 * @model unsettable="true"
	 * @generated
	 */
	float getAcidityConcentration();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acidity Concentration</em>' attribute.
	 * @see #isSetAcidityConcentration()
	 * @see #unsetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @generated
	 */
	void setAcidityConcentration(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @see #setAcidityConcentration(float)
	 * @generated
	 */
	void unsetAcidityConcentration();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acidity Concentration</em>' attribute is set.
	 * @see #unsetAcidityConcentration()
	 * @see #getAcidityConcentration()
	 * @see #setAcidityConcentration(float)
	 * @generated
	 */
	boolean isSetAcidityConcentration();

	/**
	 * Returns the value of the '<em><b>Acidity Concentration As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acidity Concentration As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acidity Concentration As String</em>' attribute.
	 * @see #isSetAcidityConcentrationAsString()
	 * @see #unsetAcidityConcentrationAsString()
	 * @see #setAcidityConcentrationAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_AcidityConcentrationAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getAcidityConcentrationAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentrationAsString <em>Acidity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acidity Concentration As String</em>' attribute.
	 * @see #isSetAcidityConcentrationAsString()
	 * @see #unsetAcidityConcentrationAsString()
	 * @see #getAcidityConcentrationAsString()
	 * @generated
	 */
	void setAcidityConcentrationAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentrationAsString <em>Acidity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAcidityConcentrationAsString()
	 * @see #getAcidityConcentrationAsString()
	 * @see #setAcidityConcentrationAsString(String)
	 * @generated
	 */
	void unsetAcidityConcentrationAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getAcidityConcentrationAsString <em>Acidity Concentration As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Acidity Concentration As String</em>' attribute is set.
	 * @see #unsetAcidityConcentrationAsString()
	 * @see #getAcidityConcentrationAsString()
	 * @see #setAcidityConcentrationAsString(String)
	 * @generated
	 */
	boolean isSetAcidityConcentrationAsString();

	/**
	 * Returns the value of the '<em><b>Impurities Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impurities Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impurities Content</em>' attribute.
	 * @see #isSetImpuritiesContent()
	 * @see #unsetImpuritiesContent()
	 * @see #setImpuritiesContent(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_ImpuritiesContent()
	 * @model unsettable="true"
	 * @generated
	 */
	float getImpuritiesContent();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impurities Content</em>' attribute.
	 * @see #isSetImpuritiesContent()
	 * @see #unsetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @generated
	 */
	void setImpuritiesContent(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @see #setImpuritiesContent(float)
	 * @generated
	 */
	void unsetImpuritiesContent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impurities Content</em>' attribute is set.
	 * @see #unsetImpuritiesContent()
	 * @see #getImpuritiesContent()
	 * @see #setImpuritiesContent(float)
	 * @generated
	 */
	boolean isSetImpuritiesContent();

	/**
	 * Returns the value of the '<em><b>Impurities Content As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impurities Content As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impurities Content As String</em>' attribute.
	 * @see #isSetImpuritiesContentAsString()
	 * @see #unsetImpuritiesContentAsString()
	 * @see #setImpuritiesContentAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_ImpuritiesContentAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getImpuritiesContentAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContentAsString <em>Impurities Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impurities Content As String</em>' attribute.
	 * @see #isSetImpuritiesContentAsString()
	 * @see #unsetImpuritiesContentAsString()
	 * @see #getImpuritiesContentAsString()
	 * @generated
	 */
	void setImpuritiesContentAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContentAsString <em>Impurities Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpuritiesContentAsString()
	 * @see #getImpuritiesContentAsString()
	 * @see #setImpuritiesContentAsString(String)
	 * @generated
	 */
	void unsetImpuritiesContentAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getImpuritiesContentAsString <em>Impurities Content As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impurities Content As String</em>' attribute is set.
	 * @see #unsetImpuritiesContentAsString()
	 * @see #getImpuritiesContentAsString()
	 * @see #setImpuritiesContentAsString(String)
	 * @generated
	 */
	boolean isSetImpuritiesContentAsString();

	/**
	 * Returns the value of the '<em><b>PH Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PH Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PH Level</em>' attribute.
	 * @see #isSetPHLevel()
	 * @see #unsetPHLevel()
	 * @see #setPHLevel(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_PHLevel()
	 * @model unsettable="true"
	 * @generated
	 */
	float getPHLevel();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PH Level</em>' attribute.
	 * @see #isSetPHLevel()
	 * @see #unsetPHLevel()
	 * @see #getPHLevel()
	 * @generated
	 */
	void setPHLevel(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPHLevel()
	 * @see #getPHLevel()
	 * @see #setPHLevel(float)
	 * @generated
	 */
	void unsetPHLevel();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PH Level</em>' attribute is set.
	 * @see #unsetPHLevel()
	 * @see #getPHLevel()
	 * @see #setPHLevel(float)
	 * @generated
	 */
	boolean isSetPHLevel();

	/**
	 * Returns the value of the '<em><b>PH Level As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PH Level As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PH Level As String</em>' attribute.
	 * @see #isSetPHLevelAsString()
	 * @see #unsetPHLevelAsString()
	 * @see #setPHLevelAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_PHLevelAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPHLevelAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevelAsString <em>PH Level As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PH Level As String</em>' attribute.
	 * @see #isSetPHLevelAsString()
	 * @see #unsetPHLevelAsString()
	 * @see #getPHLevelAsString()
	 * @generated
	 */
	void setPHLevelAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevelAsString <em>PH Level As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPHLevelAsString()
	 * @see #getPHLevelAsString()
	 * @see #setPHLevelAsString(String)
	 * @generated
	 */
	void unsetPHLevelAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getPHLevelAsString <em>PH Level As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>PH Level As String</em>' attribute is set.
	 * @see #unsetPHLevelAsString()
	 * @see #getPHLevelAsString()
	 * @see #setPHLevelAsString(String)
	 * @generated
	 */
	boolean isSetPHLevelAsString();

	/**
	 * Returns the value of the '<em><b>Dissolved Solids Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissolved Solids Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissolved Solids Content</em>' attribute.
	 * @see #isSetDissolvedSolidsContent()
	 * @see #unsetDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_DissolvedSolidsContent()
	 * @model unsettable="true"
	 * @generated
	 */
	float getDissolvedSolidsContent();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissolved Solids Content</em>' attribute.
	 * @see #isSetDissolvedSolidsContent()
	 * @see #unsetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 */
	void setDissolvedSolidsContent(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(float)
	 * @generated
	 */
	void unsetDissolvedSolidsContent();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dissolved Solids Content</em>' attribute is set.
	 * @see #unsetDissolvedSolidsContent()
	 * @see #getDissolvedSolidsContent()
	 * @see #setDissolvedSolidsContent(float)
	 * @generated
	 */
	boolean isSetDissolvedSolidsContent();

	/**
	 * Returns the value of the '<em><b>Dissolved Solids Content As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissolved Solids Content As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissolved Solids Content As String</em>' attribute.
	 * @see #isSetDissolvedSolidsContentAsString()
	 * @see #unsetDissolvedSolidsContentAsString()
	 * @see #setDissolvedSolidsContentAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcWaterProperties_DissolvedSolidsContentAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDissolvedSolidsContentAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContentAsString <em>Dissolved Solids Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissolved Solids Content As String</em>' attribute.
	 * @see #isSetDissolvedSolidsContentAsString()
	 * @see #unsetDissolvedSolidsContentAsString()
	 * @see #getDissolvedSolidsContentAsString()
	 * @generated
	 */
	void setDissolvedSolidsContentAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContentAsString <em>Dissolved Solids Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDissolvedSolidsContentAsString()
	 * @see #getDissolvedSolidsContentAsString()
	 * @see #setDissolvedSolidsContentAsString(String)
	 * @generated
	 */
	void unsetDissolvedSolidsContentAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcWaterProperties#getDissolvedSolidsContentAsString <em>Dissolved Solids Content As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dissolved Solids Content As String</em>' attribute is set.
	 * @see #unsetDissolvedSolidsContentAsString()
	 * @see #getDissolvedSolidsContentAsString()
	 * @see #setDissolvedSolidsContentAsString(String)
	 * @generated
	 */
	boolean isSetDissolvedSolidsContentAsString();

} // IfcWaterProperties
