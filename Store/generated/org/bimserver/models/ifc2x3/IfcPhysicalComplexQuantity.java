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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Physical Complex Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getHasQuantities <em>Has Quantities</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getDiscrimination <em>Discrimination</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPhysicalComplexQuantity()
 * @model
 * @generated
 */
public interface IfcPhysicalComplexQuantity extends IfcPhysicalQuantity
{
	/**
	 * Returns the value of the '<em><b>Has Quantities</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcPhysicalQuantity}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcPhysicalQuantity#getPartOfComplex <em>Part Of Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Quantities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Quantities</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPhysicalComplexQuantity_HasQuantities()
	 * @see org.bimserver.models.ifc2x3.IfcPhysicalQuantity#getPartOfComplex
	 * @model opposite="PartOfComplex"
	 * @generated
	 */
	EList<IfcPhysicalQuantity> getHasQuantities();

	/**
	 * Returns the value of the '<em><b>Discrimination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discrimination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discrimination</em>' attribute.
	 * @see #setDiscrimination(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPhysicalComplexQuantity_Discrimination()
	 * @model
	 * @generated
	 */
	String getDiscrimination();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getDiscrimination <em>Discrimination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discrimination</em>' attribute.
	 * @see #getDiscrimination()
	 * @generated
	 */
	void setDiscrimination(String value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #setQuality(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPhysicalComplexQuantity_Quality()
	 * @model unsettable="true"
	 * @generated
	 */
	String getQuality();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuality()
	 * @see #getQuality()
	 * @see #setQuality(String)
	 * @generated
	 */
	void unsetQuality();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getQuality <em>Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quality</em>' attribute is set.
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @see #setQuality(String)
	 * @generated
	 */
	boolean isSetQuality();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcPhysicalComplexQuantity_Usage()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUsage();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(String)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(String)
	 * @generated
	 */
	boolean isSetUsage();

} // IfcPhysicalComplexQuantity
