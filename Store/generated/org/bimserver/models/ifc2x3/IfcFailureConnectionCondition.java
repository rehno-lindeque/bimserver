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
 * A representation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureXAsString <em>Tension Failure XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureYAsString <em>Tension Failure YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZAsString <em>Tension Failure ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureXAsString <em>Compression Failure XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureYAsString <em>Compression Failure YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZAsString <em>Compression Failure ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition()
 * @model
 * @generated
 */
public interface IfcFailureConnectionCondition extends IfcStructuralConnectionCondition
{
	/**
	 * Returns the value of the '<em><b>Tension Failure X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure X</em>' attribute.
	 * @see #isSetTensionFailureX()
	 * @see #unsetTensionFailureX()
	 * @see #setTensionFailureX(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureX()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTensionFailureX();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure X</em>' attribute.
	 * @see #isSetTensionFailureX()
	 * @see #unsetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @generated
	 */
	void setTensionFailureX(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @see #setTensionFailureX(float)
	 * @generated
	 */
	void unsetTensionFailureX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureX <em>Tension Failure X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure X</em>' attribute is set.
	 * @see #unsetTensionFailureX()
	 * @see #getTensionFailureX()
	 * @see #setTensionFailureX(float)
	 * @generated
	 */
	boolean isSetTensionFailureX();

	/**
	 * Returns the value of the '<em><b>Tension Failure XAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure XAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure XAs String</em>' attribute.
	 * @see #isSetTensionFailureXAsString()
	 * @see #unsetTensionFailureXAsString()
	 * @see #setTensionFailureXAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureXAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTensionFailureXAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureXAsString <em>Tension Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure XAs String</em>' attribute.
	 * @see #isSetTensionFailureXAsString()
	 * @see #unsetTensionFailureXAsString()
	 * @see #getTensionFailureXAsString()
	 * @generated
	 */
	void setTensionFailureXAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureXAsString <em>Tension Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureXAsString()
	 * @see #getTensionFailureXAsString()
	 * @see #setTensionFailureXAsString(String)
	 * @generated
	 */
	void unsetTensionFailureXAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureXAsString <em>Tension Failure XAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure XAs String</em>' attribute is set.
	 * @see #unsetTensionFailureXAsString()
	 * @see #getTensionFailureXAsString()
	 * @see #setTensionFailureXAsString(String)
	 * @generated
	 */
	boolean isSetTensionFailureXAsString();

	/**
	 * Returns the value of the '<em><b>Tension Failure Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure Y</em>' attribute.
	 * @see #isSetTensionFailureY()
	 * @see #unsetTensionFailureY()
	 * @see #setTensionFailureY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTensionFailureY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure Y</em>' attribute.
	 * @see #isSetTensionFailureY()
	 * @see #unsetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @generated
	 */
	void setTensionFailureY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @see #setTensionFailureY(float)
	 * @generated
	 */
	void unsetTensionFailureY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureY <em>Tension Failure Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure Y</em>' attribute is set.
	 * @see #unsetTensionFailureY()
	 * @see #getTensionFailureY()
	 * @see #setTensionFailureY(float)
	 * @generated
	 */
	boolean isSetTensionFailureY();

	/**
	 * Returns the value of the '<em><b>Tension Failure YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure YAs String</em>' attribute.
	 * @see #isSetTensionFailureYAsString()
	 * @see #unsetTensionFailureYAsString()
	 * @see #setTensionFailureYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTensionFailureYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureYAsString <em>Tension Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure YAs String</em>' attribute.
	 * @see #isSetTensionFailureYAsString()
	 * @see #unsetTensionFailureYAsString()
	 * @see #getTensionFailureYAsString()
	 * @generated
	 */
	void setTensionFailureYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureYAsString <em>Tension Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureYAsString()
	 * @see #getTensionFailureYAsString()
	 * @see #setTensionFailureYAsString(String)
	 * @generated
	 */
	void unsetTensionFailureYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureYAsString <em>Tension Failure YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure YAs String</em>' attribute is set.
	 * @see #unsetTensionFailureYAsString()
	 * @see #getTensionFailureYAsString()
	 * @see #setTensionFailureYAsString(String)
	 * @generated
	 */
	boolean isSetTensionFailureYAsString();

	/**
	 * Returns the value of the '<em><b>Tension Failure Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure Z</em>' attribute.
	 * @see #isSetTensionFailureZ()
	 * @see #unsetTensionFailureZ()
	 * @see #setTensionFailureZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTensionFailureZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure Z</em>' attribute.
	 * @see #isSetTensionFailureZ()
	 * @see #unsetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @generated
	 */
	void setTensionFailureZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @see #setTensionFailureZ(float)
	 * @generated
	 */
	void unsetTensionFailureZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZ <em>Tension Failure Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure Z</em>' attribute is set.
	 * @see #unsetTensionFailureZ()
	 * @see #getTensionFailureZ()
	 * @see #setTensionFailureZ(float)
	 * @generated
	 */
	boolean isSetTensionFailureZ();

	/**
	 * Returns the value of the '<em><b>Tension Failure ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension Failure ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension Failure ZAs String</em>' attribute.
	 * @see #isSetTensionFailureZAsString()
	 * @see #unsetTensionFailureZAsString()
	 * @see #setTensionFailureZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_TensionFailureZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTensionFailureZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZAsString <em>Tension Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension Failure ZAs String</em>' attribute.
	 * @see #isSetTensionFailureZAsString()
	 * @see #unsetTensionFailureZAsString()
	 * @see #getTensionFailureZAsString()
	 * @generated
	 */
	void setTensionFailureZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZAsString <em>Tension Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTensionFailureZAsString()
	 * @see #getTensionFailureZAsString()
	 * @see #setTensionFailureZAsString(String)
	 * @generated
	 */
	void unsetTensionFailureZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getTensionFailureZAsString <em>Tension Failure ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tension Failure ZAs String</em>' attribute is set.
	 * @see #unsetTensionFailureZAsString()
	 * @see #getTensionFailureZAsString()
	 * @see #setTensionFailureZAsString(String)
	 * @generated
	 */
	boolean isSetTensionFailureZAsString();

	/**
	 * Returns the value of the '<em><b>Compression Failure X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure X</em>' attribute.
	 * @see #isSetCompressionFailureX()
	 * @see #unsetCompressionFailureX()
	 * @see #setCompressionFailureX(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureX()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCompressionFailureX();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure X</em>' attribute.
	 * @see #isSetCompressionFailureX()
	 * @see #unsetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @generated
	 */
	void setCompressionFailureX(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @see #setCompressionFailureX(float)
	 * @generated
	 */
	void unsetCompressionFailureX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureX <em>Compression Failure X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure X</em>' attribute is set.
	 * @see #unsetCompressionFailureX()
	 * @see #getCompressionFailureX()
	 * @see #setCompressionFailureX(float)
	 * @generated
	 */
	boolean isSetCompressionFailureX();

	/**
	 * Returns the value of the '<em><b>Compression Failure XAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure XAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure XAs String</em>' attribute.
	 * @see #isSetCompressionFailureXAsString()
	 * @see #unsetCompressionFailureXAsString()
	 * @see #setCompressionFailureXAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureXAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCompressionFailureXAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureXAsString <em>Compression Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure XAs String</em>' attribute.
	 * @see #isSetCompressionFailureXAsString()
	 * @see #unsetCompressionFailureXAsString()
	 * @see #getCompressionFailureXAsString()
	 * @generated
	 */
	void setCompressionFailureXAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureXAsString <em>Compression Failure XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureXAsString()
	 * @see #getCompressionFailureXAsString()
	 * @see #setCompressionFailureXAsString(String)
	 * @generated
	 */
	void unsetCompressionFailureXAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureXAsString <em>Compression Failure XAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure XAs String</em>' attribute is set.
	 * @see #unsetCompressionFailureXAsString()
	 * @see #getCompressionFailureXAsString()
	 * @see #setCompressionFailureXAsString(String)
	 * @generated
	 */
	boolean isSetCompressionFailureXAsString();

	/**
	 * Returns the value of the '<em><b>Compression Failure Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure Y</em>' attribute.
	 * @see #isSetCompressionFailureY()
	 * @see #unsetCompressionFailureY()
	 * @see #setCompressionFailureY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCompressionFailureY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure Y</em>' attribute.
	 * @see #isSetCompressionFailureY()
	 * @see #unsetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @generated
	 */
	void setCompressionFailureY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @see #setCompressionFailureY(float)
	 * @generated
	 */
	void unsetCompressionFailureY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureY <em>Compression Failure Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure Y</em>' attribute is set.
	 * @see #unsetCompressionFailureY()
	 * @see #getCompressionFailureY()
	 * @see #setCompressionFailureY(float)
	 * @generated
	 */
	boolean isSetCompressionFailureY();

	/**
	 * Returns the value of the '<em><b>Compression Failure YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure YAs String</em>' attribute.
	 * @see #isSetCompressionFailureYAsString()
	 * @see #unsetCompressionFailureYAsString()
	 * @see #setCompressionFailureYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCompressionFailureYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureYAsString <em>Compression Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure YAs String</em>' attribute.
	 * @see #isSetCompressionFailureYAsString()
	 * @see #unsetCompressionFailureYAsString()
	 * @see #getCompressionFailureYAsString()
	 * @generated
	 */
	void setCompressionFailureYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureYAsString <em>Compression Failure YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureYAsString()
	 * @see #getCompressionFailureYAsString()
	 * @see #setCompressionFailureYAsString(String)
	 * @generated
	 */
	void unsetCompressionFailureYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureYAsString <em>Compression Failure YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure YAs String</em>' attribute is set.
	 * @see #unsetCompressionFailureYAsString()
	 * @see #getCompressionFailureYAsString()
	 * @see #setCompressionFailureYAsString(String)
	 * @generated
	 */
	boolean isSetCompressionFailureYAsString();

	/**
	 * Returns the value of the '<em><b>Compression Failure Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure Z</em>' attribute.
	 * @see #isSetCompressionFailureZ()
	 * @see #unsetCompressionFailureZ()
	 * @see #setCompressionFailureZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCompressionFailureZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure Z</em>' attribute.
	 * @see #isSetCompressionFailureZ()
	 * @see #unsetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @generated
	 */
	void setCompressionFailureZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @see #setCompressionFailureZ(float)
	 * @generated
	 */
	void unsetCompressionFailureZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZ <em>Compression Failure Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure Z</em>' attribute is set.
	 * @see #unsetCompressionFailureZ()
	 * @see #getCompressionFailureZ()
	 * @see #setCompressionFailureZ(float)
	 * @generated
	 */
	boolean isSetCompressionFailureZ();

	/**
	 * Returns the value of the '<em><b>Compression Failure ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression Failure ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression Failure ZAs String</em>' attribute.
	 * @see #isSetCompressionFailureZAsString()
	 * @see #unsetCompressionFailureZAsString()
	 * @see #setCompressionFailureZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcFailureConnectionCondition_CompressionFailureZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCompressionFailureZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZAsString <em>Compression Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression Failure ZAs String</em>' attribute.
	 * @see #isSetCompressionFailureZAsString()
	 * @see #unsetCompressionFailureZAsString()
	 * @see #getCompressionFailureZAsString()
	 * @generated
	 */
	void setCompressionFailureZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZAsString <em>Compression Failure ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompressionFailureZAsString()
	 * @see #getCompressionFailureZAsString()
	 * @see #setCompressionFailureZAsString(String)
	 * @generated
	 */
	void unsetCompressionFailureZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition#getCompressionFailureZAsString <em>Compression Failure ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compression Failure ZAs String</em>' attribute is set.
	 * @see #unsetCompressionFailureZAsString()
	 * @see #getCompressionFailureZAsString()
	 * @see #setCompressionFailureZAsString(String)
	 * @generated
	 */
	boolean isSetCompressionFailureZAsString();

} // IfcFailureConnectionCondition
