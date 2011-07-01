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
 * A representation of the model object '<em><b>Ifc Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextFontStyle <em>Text Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyle()
 * @model
 * @generated
 */
public interface IfcTextStyle extends IfcPresentationStyle, IfcPresentationStyleSelect
{
	/**
	 * Returns the value of the '<em><b>Text Character Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Character Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Character Appearance</em>' reference.
	 * @see #isSetTextCharacterAppearance()
	 * @see #unsetTextCharacterAppearance()
	 * @see #setTextCharacterAppearance(IfcCharacterStyleSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyle_TextCharacterAppearance()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCharacterStyleSelect getTextCharacterAppearance();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Character Appearance</em>' reference.
	 * @see #isSetTextCharacterAppearance()
	 * @see #unsetTextCharacterAppearance()
	 * @see #getTextCharacterAppearance()
	 * @generated
	 */
	void setTextCharacterAppearance(IfcCharacterStyleSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextCharacterAppearance()
	 * @see #getTextCharacterAppearance()
	 * @see #setTextCharacterAppearance(IfcCharacterStyleSelect)
	 * @generated
	 */
	void unsetTextCharacterAppearance();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Character Appearance</em>' reference is set.
	 * @see #unsetTextCharacterAppearance()
	 * @see #getTextCharacterAppearance()
	 * @see #setTextCharacterAppearance(IfcCharacterStyleSelect)
	 * @generated
	 */
	boolean isSetTextCharacterAppearance();

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' reference.
	 * @see #isSetTextStyle()
	 * @see #unsetTextStyle()
	 * @see #setTextStyle(IfcTextStyleSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyle_TextStyle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcTextStyleSelect getTextStyle();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextStyle <em>Text Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style</em>' reference.
	 * @see #isSetTextStyle()
	 * @see #unsetTextStyle()
	 * @see #getTextStyle()
	 * @generated
	 */
	void setTextStyle(IfcTextStyleSelect value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextStyle <em>Text Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextStyle()
	 * @see #getTextStyle()
	 * @see #setTextStyle(IfcTextStyleSelect)
	 * @generated
	 */
	void unsetTextStyle();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextStyle <em>Text Style</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Style</em>' reference is set.
	 * @see #unsetTextStyle()
	 * @see #getTextStyle()
	 * @see #setTextStyle(IfcTextStyleSelect)
	 * @generated
	 */
	boolean isSetTextStyle();

	/**
	 * Returns the value of the '<em><b>Text Font Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Font Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Font Style</em>' reference.
	 * @see #setTextFontStyle(IfcTextFontSelect)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTextStyle_TextFontStyle()
	 * @model
	 * @generated
	 */
	IfcTextFontSelect getTextFontStyle();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTextStyle#getTextFontStyle <em>Text Font Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Font Style</em>' reference.
	 * @see #getTextFontStyle()
	 * @generated
	 */
	void setTextFontStyle(IfcTextFontSelect value);

} // IfcTextStyle
