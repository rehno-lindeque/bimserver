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
 * A representation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTransportElement#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumberAsString <em>Capacity By Number As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTransportElement()
 * @model
 * @generated
 */
public interface IfcTransportElement extends IfcElement
{
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.IfcTransportElementTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcTransportElementTypeEnum
	 * @see #setOperationType(IfcTransportElementTypeEnum)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTransportElement_OperationType()
	 * @model
	 * @generated
	 */
	IfcTransportElementTypeEnum getOperationType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.IfcTransportElementTypeEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcTransportElementTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Capacity By Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Weight</em>' attribute.
	 * @see #isSetCapacityByWeight()
	 * @see #unsetCapacityByWeight()
	 * @see #setCapacityByWeight(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTransportElement_CapacityByWeight()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCapacityByWeight();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Weight</em>' attribute.
	 * @see #isSetCapacityByWeight()
	 * @see #unsetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @generated
	 */
	void setCapacityByWeight(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @see #setCapacityByWeight(float)
	 * @generated
	 */
	void unsetCapacityByWeight();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Weight</em>' attribute is set.
	 * @see #unsetCapacityByWeight()
	 * @see #getCapacityByWeight()
	 * @see #setCapacityByWeight(float)
	 * @generated
	 */
	boolean isSetCapacityByWeight();

	/**
	 * Returns the value of the '<em><b>Capacity By Weight As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Weight As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Weight As String</em>' attribute.
	 * @see #isSetCapacityByWeightAsString()
	 * @see #unsetCapacityByWeightAsString()
	 * @see #setCapacityByWeightAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTransportElement_CapacityByWeightAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCapacityByWeightAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Weight As String</em>' attribute.
	 * @see #isSetCapacityByWeightAsString()
	 * @see #unsetCapacityByWeightAsString()
	 * @see #getCapacityByWeightAsString()
	 * @generated
	 */
	void setCapacityByWeightAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByWeightAsString()
	 * @see #getCapacityByWeightAsString()
	 * @see #setCapacityByWeightAsString(String)
	 * @generated
	 */
	void unsetCapacityByWeightAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByWeightAsString <em>Capacity By Weight As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Weight As String</em>' attribute is set.
	 * @see #unsetCapacityByWeightAsString()
	 * @see #getCapacityByWeightAsString()
	 * @see #setCapacityByWeightAsString(String)
	 * @generated
	 */
	boolean isSetCapacityByWeightAsString();

	/**
	 * Returns the value of the '<em><b>Capacity By Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Number</em>' attribute.
	 * @see #isSetCapacityByNumber()
	 * @see #unsetCapacityByNumber()
	 * @see #setCapacityByNumber(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTransportElement_CapacityByNumber()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCapacityByNumber();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Number</em>' attribute.
	 * @see #isSetCapacityByNumber()
	 * @see #unsetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @generated
	 */
	void setCapacityByNumber(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @see #setCapacityByNumber(float)
	 * @generated
	 */
	void unsetCapacityByNumber();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Number</em>' attribute is set.
	 * @see #unsetCapacityByNumber()
	 * @see #getCapacityByNumber()
	 * @see #setCapacityByNumber(float)
	 * @generated
	 */
	boolean isSetCapacityByNumber();

	/**
	 * Returns the value of the '<em><b>Capacity By Number As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Number As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Number As String</em>' attribute.
	 * @see #isSetCapacityByNumberAsString()
	 * @see #unsetCapacityByNumberAsString()
	 * @see #setCapacityByNumberAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcTransportElement_CapacityByNumberAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCapacityByNumberAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumberAsString <em>Capacity By Number As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Number As String</em>' attribute.
	 * @see #isSetCapacityByNumberAsString()
	 * @see #unsetCapacityByNumberAsString()
	 * @see #getCapacityByNumberAsString()
	 * @generated
	 */
	void setCapacityByNumberAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumberAsString <em>Capacity By Number As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapacityByNumberAsString()
	 * @see #getCapacityByNumberAsString()
	 * @see #setCapacityByNumberAsString(String)
	 * @generated
	 */
	void unsetCapacityByNumberAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcTransportElement#getCapacityByNumberAsString <em>Capacity By Number As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacity By Number As String</em>' attribute is set.
	 * @see #unsetCapacityByNumberAsString()
	 * @see #getCapacityByNumberAsString()
	 * @see #setCapacityByNumberAsString(String)
	 * @generated
	 */
	boolean isSetCapacityByNumberAsString();

} // IfcTransportElement
