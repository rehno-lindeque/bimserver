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
 * A representation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantXAsString <em>Torsional Constant XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZAsString <em>Moment Of Inertia YZ As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYAsString <em>Moment Of Inertia YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZAsString <em>Moment Of Inertia ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstantAsString <em>Warping Constant As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZAsString <em>Shear Centre ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreYAsString <em>Shear Centre YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZAsString <em>Shear Deformation Area ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaYAsString <em>Shear Deformation Area YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusYAsString <em>Maximum Section Modulus YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusYAsString <em>Minimum Section Modulus YAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZAsString <em>Maximum Section Modulus ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZAsString <em>Minimum Section Modulus ZAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulusAsString <em>Torsional Section Modulus As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties()
 * @model
 * @generated
 */
public interface IfcStructuralProfileProperties extends IfcGeneralProfileProperties
{
	/**
	 * Returns the value of the '<em><b>Torsional Constant X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Constant X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Constant X</em>' attribute.
	 * @see #isSetTorsionalConstantX()
	 * @see #unsetTorsionalConstantX()
	 * @see #setTorsionalConstantX(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_TorsionalConstantX()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTorsionalConstantX();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Constant X</em>' attribute.
	 * @see #isSetTorsionalConstantX()
	 * @see #unsetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @generated
	 */
	void setTorsionalConstantX(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @see #setTorsionalConstantX(float)
	 * @generated
	 */
	void unsetTorsionalConstantX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantX <em>Torsional Constant X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Constant X</em>' attribute is set.
	 * @see #unsetTorsionalConstantX()
	 * @see #getTorsionalConstantX()
	 * @see #setTorsionalConstantX(float)
	 * @generated
	 */
	boolean isSetTorsionalConstantX();

	/**
	 * Returns the value of the '<em><b>Torsional Constant XAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Constant XAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Constant XAs String</em>' attribute.
	 * @see #isSetTorsionalConstantXAsString()
	 * @see #unsetTorsionalConstantXAsString()
	 * @see #setTorsionalConstantXAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_TorsionalConstantXAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTorsionalConstantXAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantXAsString <em>Torsional Constant XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Constant XAs String</em>' attribute.
	 * @see #isSetTorsionalConstantXAsString()
	 * @see #unsetTorsionalConstantXAsString()
	 * @see #getTorsionalConstantXAsString()
	 * @generated
	 */
	void setTorsionalConstantXAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantXAsString <em>Torsional Constant XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalConstantXAsString()
	 * @see #getTorsionalConstantXAsString()
	 * @see #setTorsionalConstantXAsString(String)
	 * @generated
	 */
	void unsetTorsionalConstantXAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalConstantXAsString <em>Torsional Constant XAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Constant XAs String</em>' attribute is set.
	 * @see #unsetTorsionalConstantXAsString()
	 * @see #getTorsionalConstantXAsString()
	 * @see #setTorsionalConstantXAsString(String)
	 * @generated
	 */
	boolean isSetTorsionalConstantXAsString();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia YZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia YZ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia YZ</em>' attribute.
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaYZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMomentOfInertiaYZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia YZ</em>' attribute.
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 */
	void setMomentOfInertiaYZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(float)
	 * @generated
	 */
	void unsetMomentOfInertiaYZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia YZ</em>' attribute is set.
	 * @see #unsetMomentOfInertiaYZ()
	 * @see #getMomentOfInertiaYZ()
	 * @see #setMomentOfInertiaYZ(float)
	 * @generated
	 */
	boolean isSetMomentOfInertiaYZ();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia YZ As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia YZ As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia YZ As String</em>' attribute.
	 * @see #isSetMomentOfInertiaYZAsString()
	 * @see #unsetMomentOfInertiaYZAsString()
	 * @see #setMomentOfInertiaYZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaYZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMomentOfInertiaYZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZAsString <em>Moment Of Inertia YZ As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia YZ As String</em>' attribute.
	 * @see #isSetMomentOfInertiaYZAsString()
	 * @see #unsetMomentOfInertiaYZAsString()
	 * @see #getMomentOfInertiaYZAsString()
	 * @generated
	 */
	void setMomentOfInertiaYZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZAsString <em>Moment Of Inertia YZ As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaYZAsString()
	 * @see #getMomentOfInertiaYZAsString()
	 * @see #setMomentOfInertiaYZAsString(String)
	 * @generated
	 */
	void unsetMomentOfInertiaYZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYZAsString <em>Moment Of Inertia YZ As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia YZ As String</em>' attribute is set.
	 * @see #unsetMomentOfInertiaYZAsString()
	 * @see #getMomentOfInertiaYZAsString()
	 * @see #setMomentOfInertiaYZAsString(String)
	 * @generated
	 */
	boolean isSetMomentOfInertiaYZAsString();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Y</em>' attribute.
	 * @see #isSetMomentOfInertiaY()
	 * @see #unsetMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMomentOfInertiaY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Y</em>' attribute.
	 * @see #isSetMomentOfInertiaY()
	 * @see #unsetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @generated
	 */
	void setMomentOfInertiaY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(float)
	 * @generated
	 */
	void unsetMomentOfInertiaY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia Y</em>' attribute is set.
	 * @see #unsetMomentOfInertiaY()
	 * @see #getMomentOfInertiaY()
	 * @see #setMomentOfInertiaY(float)
	 * @generated
	 */
	boolean isSetMomentOfInertiaY();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia YAs String</em>' attribute.
	 * @see #isSetMomentOfInertiaYAsString()
	 * @see #unsetMomentOfInertiaYAsString()
	 * @see #setMomentOfInertiaYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMomentOfInertiaYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYAsString <em>Moment Of Inertia YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia YAs String</em>' attribute.
	 * @see #isSetMomentOfInertiaYAsString()
	 * @see #unsetMomentOfInertiaYAsString()
	 * @see #getMomentOfInertiaYAsString()
	 * @generated
	 */
	void setMomentOfInertiaYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYAsString <em>Moment Of Inertia YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaYAsString()
	 * @see #getMomentOfInertiaYAsString()
	 * @see #setMomentOfInertiaYAsString(String)
	 * @generated
	 */
	void unsetMomentOfInertiaYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaYAsString <em>Moment Of Inertia YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia YAs String</em>' attribute is set.
	 * @see #unsetMomentOfInertiaYAsString()
	 * @see #getMomentOfInertiaYAsString()
	 * @see #setMomentOfInertiaYAsString(String)
	 * @generated
	 */
	boolean isSetMomentOfInertiaYAsString();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia Z</em>' attribute.
	 * @see #isSetMomentOfInertiaZ()
	 * @see #unsetMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMomentOfInertiaZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia Z</em>' attribute.
	 * @see #isSetMomentOfInertiaZ()
	 * @see #unsetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 */
	void setMomentOfInertiaZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(float)
	 * @generated
	 */
	void unsetMomentOfInertiaZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia Z</em>' attribute is set.
	 * @see #unsetMomentOfInertiaZ()
	 * @see #getMomentOfInertiaZ()
	 * @see #setMomentOfInertiaZ(float)
	 * @generated
	 */
	boolean isSetMomentOfInertiaZ();

	/**
	 * Returns the value of the '<em><b>Moment Of Inertia ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moment Of Inertia ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moment Of Inertia ZAs String</em>' attribute.
	 * @see #isSetMomentOfInertiaZAsString()
	 * @see #unsetMomentOfInertiaZAsString()
	 * @see #setMomentOfInertiaZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MomentOfInertiaZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMomentOfInertiaZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZAsString <em>Moment Of Inertia ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moment Of Inertia ZAs String</em>' attribute.
	 * @see #isSetMomentOfInertiaZAsString()
	 * @see #unsetMomentOfInertiaZAsString()
	 * @see #getMomentOfInertiaZAsString()
	 * @generated
	 */
	void setMomentOfInertiaZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZAsString <em>Moment Of Inertia ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMomentOfInertiaZAsString()
	 * @see #getMomentOfInertiaZAsString()
	 * @see #setMomentOfInertiaZAsString(String)
	 * @generated
	 */
	void unsetMomentOfInertiaZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMomentOfInertiaZAsString <em>Moment Of Inertia ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moment Of Inertia ZAs String</em>' attribute is set.
	 * @see #unsetMomentOfInertiaZAsString()
	 * @see #getMomentOfInertiaZAsString()
	 * @see #setMomentOfInertiaZAsString(String)
	 * @generated
	 */
	boolean isSetMomentOfInertiaZAsString();

	/**
	 * Returns the value of the '<em><b>Warping Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Constant</em>' attribute.
	 * @see #isSetWarpingConstant()
	 * @see #unsetWarpingConstant()
	 * @see #setWarpingConstant(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_WarpingConstant()
	 * @model unsettable="true"
	 * @generated
	 */
	float getWarpingConstant();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Constant</em>' attribute.
	 * @see #isSetWarpingConstant()
	 * @see #unsetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @generated
	 */
	void setWarpingConstant(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @see #setWarpingConstant(float)
	 * @generated
	 */
	void unsetWarpingConstant();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstant <em>Warping Constant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warping Constant</em>' attribute is set.
	 * @see #unsetWarpingConstant()
	 * @see #getWarpingConstant()
	 * @see #setWarpingConstant(float)
	 * @generated
	 */
	boolean isSetWarpingConstant();

	/**
	 * Returns the value of the '<em><b>Warping Constant As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping Constant As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping Constant As String</em>' attribute.
	 * @see #isSetWarpingConstantAsString()
	 * @see #unsetWarpingConstantAsString()
	 * @see #setWarpingConstantAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_WarpingConstantAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWarpingConstantAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstantAsString <em>Warping Constant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping Constant As String</em>' attribute.
	 * @see #isSetWarpingConstantAsString()
	 * @see #unsetWarpingConstantAsString()
	 * @see #getWarpingConstantAsString()
	 * @generated
	 */
	void setWarpingConstantAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstantAsString <em>Warping Constant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarpingConstantAsString()
	 * @see #getWarpingConstantAsString()
	 * @see #setWarpingConstantAsString(String)
	 * @generated
	 */
	void unsetWarpingConstantAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getWarpingConstantAsString <em>Warping Constant As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warping Constant As String</em>' attribute is set.
	 * @see #unsetWarpingConstantAsString()
	 * @see #getWarpingConstantAsString()
	 * @see #setWarpingConstantAsString(String)
	 * @generated
	 */
	boolean isSetWarpingConstantAsString();

	/**
	 * Returns the value of the '<em><b>Shear Centre Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Z</em>' attribute.
	 * @see #isSetShearCentreZ()
	 * @see #unsetShearCentreZ()
	 * @see #setShearCentreZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearCentreZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getShearCentreZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Z</em>' attribute.
	 * @see #isSetShearCentreZ()
	 * @see #unsetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @generated
	 */
	void setShearCentreZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @see #setShearCentreZ(float)
	 * @generated
	 */
	void unsetShearCentreZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZ <em>Shear Centre Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre Z</em>' attribute is set.
	 * @see #unsetShearCentreZ()
	 * @see #getShearCentreZ()
	 * @see #setShearCentreZ(float)
	 * @generated
	 */
	boolean isSetShearCentreZ();

	/**
	 * Returns the value of the '<em><b>Shear Centre ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre ZAs String</em>' attribute.
	 * @see #isSetShearCentreZAsString()
	 * @see #unsetShearCentreZAsString()
	 * @see #setShearCentreZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearCentreZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getShearCentreZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZAsString <em>Shear Centre ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre ZAs String</em>' attribute.
	 * @see #isSetShearCentreZAsString()
	 * @see #unsetShearCentreZAsString()
	 * @see #getShearCentreZAsString()
	 * @generated
	 */
	void setShearCentreZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZAsString <em>Shear Centre ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreZAsString()
	 * @see #getShearCentreZAsString()
	 * @see #setShearCentreZAsString(String)
	 * @generated
	 */
	void unsetShearCentreZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreZAsString <em>Shear Centre ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre ZAs String</em>' attribute is set.
	 * @see #unsetShearCentreZAsString()
	 * @see #getShearCentreZAsString()
	 * @see #setShearCentreZAsString(String)
	 * @generated
	 */
	boolean isSetShearCentreZAsString();

	/**
	 * Returns the value of the '<em><b>Shear Centre Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre Y</em>' attribute.
	 * @see #isSetShearCentreY()
	 * @see #unsetShearCentreY()
	 * @see #setShearCentreY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearCentreY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getShearCentreY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre Y</em>' attribute.
	 * @see #isSetShearCentreY()
	 * @see #unsetShearCentreY()
	 * @see #getShearCentreY()
	 * @generated
	 */
	void setShearCentreY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreY()
	 * @see #getShearCentreY()
	 * @see #setShearCentreY(float)
	 * @generated
	 */
	void unsetShearCentreY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreY <em>Shear Centre Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre Y</em>' attribute is set.
	 * @see #unsetShearCentreY()
	 * @see #getShearCentreY()
	 * @see #setShearCentreY(float)
	 * @generated
	 */
	boolean isSetShearCentreY();

	/**
	 * Returns the value of the '<em><b>Shear Centre YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Centre YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Centre YAs String</em>' attribute.
	 * @see #isSetShearCentreYAsString()
	 * @see #unsetShearCentreYAsString()
	 * @see #setShearCentreYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearCentreYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getShearCentreYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreYAsString <em>Shear Centre YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Centre YAs String</em>' attribute.
	 * @see #isSetShearCentreYAsString()
	 * @see #unsetShearCentreYAsString()
	 * @see #getShearCentreYAsString()
	 * @generated
	 */
	void setShearCentreYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreYAsString <em>Shear Centre YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearCentreYAsString()
	 * @see #getShearCentreYAsString()
	 * @see #setShearCentreYAsString(String)
	 * @generated
	 */
	void unsetShearCentreYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearCentreYAsString <em>Shear Centre YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Centre YAs String</em>' attribute is set.
	 * @see #unsetShearCentreYAsString()
	 * @see #getShearCentreYAsString()
	 * @see #setShearCentreYAsString(String)
	 * @generated
	 */
	boolean isSetShearCentreYAsString();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Z</em>' attribute.
	 * @see #isSetShearDeformationAreaZ()
	 * @see #unsetShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearDeformationAreaZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getShearDeformationAreaZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Z</em>' attribute.
	 * @see #isSetShearDeformationAreaZ()
	 * @see #unsetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 */
	void setShearDeformationAreaZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(float)
	 * @generated
	 */
	void unsetShearDeformationAreaZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area Z</em>' attribute is set.
	 * @see #unsetShearDeformationAreaZ()
	 * @see #getShearDeformationAreaZ()
	 * @see #setShearDeformationAreaZ(float)
	 * @generated
	 */
	boolean isSetShearDeformationAreaZ();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area ZAs String</em>' attribute.
	 * @see #isSetShearDeformationAreaZAsString()
	 * @see #unsetShearDeformationAreaZAsString()
	 * @see #setShearDeformationAreaZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearDeformationAreaZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getShearDeformationAreaZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZAsString <em>Shear Deformation Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area ZAs String</em>' attribute.
	 * @see #isSetShearDeformationAreaZAsString()
	 * @see #unsetShearDeformationAreaZAsString()
	 * @see #getShearDeformationAreaZAsString()
	 * @generated
	 */
	void setShearDeformationAreaZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZAsString <em>Shear Deformation Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaZAsString()
	 * @see #getShearDeformationAreaZAsString()
	 * @see #setShearDeformationAreaZAsString(String)
	 * @generated
	 */
	void unsetShearDeformationAreaZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaZAsString <em>Shear Deformation Area ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area ZAs String</em>' attribute is set.
	 * @see #unsetShearDeformationAreaZAsString()
	 * @see #getShearDeformationAreaZAsString()
	 * @see #setShearDeformationAreaZAsString(String)
	 * @generated
	 */
	boolean isSetShearDeformationAreaZAsString();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area Y</em>' attribute.
	 * @see #isSetShearDeformationAreaY()
	 * @see #unsetShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearDeformationAreaY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getShearDeformationAreaY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area Y</em>' attribute.
	 * @see #isSetShearDeformationAreaY()
	 * @see #unsetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @generated
	 */
	void setShearDeformationAreaY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(float)
	 * @generated
	 */
	void unsetShearDeformationAreaY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area Y</em>' attribute is set.
	 * @see #unsetShearDeformationAreaY()
	 * @see #getShearDeformationAreaY()
	 * @see #setShearDeformationAreaY(float)
	 * @generated
	 */
	boolean isSetShearDeformationAreaY();

	/**
	 * Returns the value of the '<em><b>Shear Deformation Area YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Deformation Area YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Deformation Area YAs String</em>' attribute.
	 * @see #isSetShearDeformationAreaYAsString()
	 * @see #unsetShearDeformationAreaYAsString()
	 * @see #setShearDeformationAreaYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_ShearDeformationAreaYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getShearDeformationAreaYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaYAsString <em>Shear Deformation Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Deformation Area YAs String</em>' attribute.
	 * @see #isSetShearDeformationAreaYAsString()
	 * @see #unsetShearDeformationAreaYAsString()
	 * @see #getShearDeformationAreaYAsString()
	 * @generated
	 */
	void setShearDeformationAreaYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaYAsString <em>Shear Deformation Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShearDeformationAreaYAsString()
	 * @see #getShearDeformationAreaYAsString()
	 * @see #setShearDeformationAreaYAsString(String)
	 * @generated
	 */
	void unsetShearDeformationAreaYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getShearDeformationAreaYAsString <em>Shear Deformation Area YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shear Deformation Area YAs String</em>' attribute is set.
	 * @see #unsetShearDeformationAreaYAsString()
	 * @see #getShearDeformationAreaYAsString()
	 * @see #setShearDeformationAreaYAsString(String)
	 * @generated
	 */
	boolean isSetShearDeformationAreaYAsString();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Y</em>' attribute.
	 * @see #isSetMaximumSectionModulusY()
	 * @see #unsetMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MaximumSectionModulusY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMaximumSectionModulusY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Y</em>' attribute.
	 * @see #isSetMaximumSectionModulusY()
	 * @see #unsetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 */
	void setMaximumSectionModulusY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(float)
	 * @generated
	 */
	void unsetMaximumSectionModulusY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus Y</em>' attribute is set.
	 * @see #unsetMaximumSectionModulusY()
	 * @see #getMaximumSectionModulusY()
	 * @see #setMaximumSectionModulusY(float)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusY();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus YAs String</em>' attribute.
	 * @see #isSetMaximumSectionModulusYAsString()
	 * @see #unsetMaximumSectionModulusYAsString()
	 * @see #setMaximumSectionModulusYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MaximumSectionModulusYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMaximumSectionModulusYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusYAsString <em>Maximum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus YAs String</em>' attribute.
	 * @see #isSetMaximumSectionModulusYAsString()
	 * @see #unsetMaximumSectionModulusYAsString()
	 * @see #getMaximumSectionModulusYAsString()
	 * @generated
	 */
	void setMaximumSectionModulusYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusYAsString <em>Maximum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusYAsString()
	 * @see #getMaximumSectionModulusYAsString()
	 * @see #setMaximumSectionModulusYAsString(String)
	 * @generated
	 */
	void unsetMaximumSectionModulusYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusYAsString <em>Maximum Section Modulus YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus YAs String</em>' attribute is set.
	 * @see #unsetMaximumSectionModulusYAsString()
	 * @see #getMaximumSectionModulusYAsString()
	 * @see #setMaximumSectionModulusYAsString(String)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusYAsString();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Y</em>' attribute.
	 * @see #isSetMinimumSectionModulusY()
	 * @see #unsetMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MinimumSectionModulusY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMinimumSectionModulusY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Y</em>' attribute.
	 * @see #isSetMinimumSectionModulusY()
	 * @see #unsetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 */
	void setMinimumSectionModulusY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(float)
	 * @generated
	 */
	void unsetMinimumSectionModulusY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus Y</em>' attribute is set.
	 * @see #unsetMinimumSectionModulusY()
	 * @see #getMinimumSectionModulusY()
	 * @see #setMinimumSectionModulusY(float)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusY();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus YAs String</em>' attribute.
	 * @see #isSetMinimumSectionModulusYAsString()
	 * @see #unsetMinimumSectionModulusYAsString()
	 * @see #setMinimumSectionModulusYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MinimumSectionModulusYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMinimumSectionModulusYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusYAsString <em>Minimum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus YAs String</em>' attribute.
	 * @see #isSetMinimumSectionModulusYAsString()
	 * @see #unsetMinimumSectionModulusYAsString()
	 * @see #getMinimumSectionModulusYAsString()
	 * @generated
	 */
	void setMinimumSectionModulusYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusYAsString <em>Minimum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusYAsString()
	 * @see #getMinimumSectionModulusYAsString()
	 * @see #setMinimumSectionModulusYAsString(String)
	 * @generated
	 */
	void unsetMinimumSectionModulusYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusYAsString <em>Minimum Section Modulus YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus YAs String</em>' attribute is set.
	 * @see #unsetMinimumSectionModulusYAsString()
	 * @see #getMinimumSectionModulusYAsString()
	 * @see #setMinimumSectionModulusYAsString(String)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusYAsString();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus Z</em>' attribute.
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MaximumSectionModulusZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMaximumSectionModulusZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus Z</em>' attribute.
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 */
	void setMaximumSectionModulusZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(float)
	 * @generated
	 */
	void unsetMaximumSectionModulusZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus Z</em>' attribute is set.
	 * @see #unsetMaximumSectionModulusZ()
	 * @see #getMaximumSectionModulusZ()
	 * @see #setMaximumSectionModulusZ(float)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusZ();

	/**
	 * Returns the value of the '<em><b>Maximum Section Modulus ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Section Modulus ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Section Modulus ZAs String</em>' attribute.
	 * @see #isSetMaximumSectionModulusZAsString()
	 * @see #unsetMaximumSectionModulusZAsString()
	 * @see #setMaximumSectionModulusZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MaximumSectionModulusZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMaximumSectionModulusZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZAsString <em>Maximum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Section Modulus ZAs String</em>' attribute.
	 * @see #isSetMaximumSectionModulusZAsString()
	 * @see #unsetMaximumSectionModulusZAsString()
	 * @see #getMaximumSectionModulusZAsString()
	 * @generated
	 */
	void setMaximumSectionModulusZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZAsString <em>Maximum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumSectionModulusZAsString()
	 * @see #getMaximumSectionModulusZAsString()
	 * @see #setMaximumSectionModulusZAsString(String)
	 * @generated
	 */
	void unsetMaximumSectionModulusZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMaximumSectionModulusZAsString <em>Maximum Section Modulus ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Section Modulus ZAs String</em>' attribute is set.
	 * @see #unsetMaximumSectionModulusZAsString()
	 * @see #getMaximumSectionModulusZAsString()
	 * @see #setMaximumSectionModulusZAsString(String)
	 * @generated
	 */
	boolean isSetMaximumSectionModulusZAsString();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus Z</em>' attribute.
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MinimumSectionModulusZ()
	 * @model unsettable="true"
	 * @generated
	 */
	float getMinimumSectionModulusZ();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus Z</em>' attribute.
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 */
	void setMinimumSectionModulusZ(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(float)
	 * @generated
	 */
	void unsetMinimumSectionModulusZ();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus Z</em>' attribute is set.
	 * @see #unsetMinimumSectionModulusZ()
	 * @see #getMinimumSectionModulusZ()
	 * @see #setMinimumSectionModulusZ(float)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusZ();

	/**
	 * Returns the value of the '<em><b>Minimum Section Modulus ZAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Section Modulus ZAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Section Modulus ZAs String</em>' attribute.
	 * @see #isSetMinimumSectionModulusZAsString()
	 * @see #unsetMinimumSectionModulusZAsString()
	 * @see #setMinimumSectionModulusZAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_MinimumSectionModulusZAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMinimumSectionModulusZAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZAsString <em>Minimum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Section Modulus ZAs String</em>' attribute.
	 * @see #isSetMinimumSectionModulusZAsString()
	 * @see #unsetMinimumSectionModulusZAsString()
	 * @see #getMinimumSectionModulusZAsString()
	 * @generated
	 */
	void setMinimumSectionModulusZAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZAsString <em>Minimum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimumSectionModulusZAsString()
	 * @see #getMinimumSectionModulusZAsString()
	 * @see #setMinimumSectionModulusZAsString(String)
	 * @generated
	 */
	void unsetMinimumSectionModulusZAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getMinimumSectionModulusZAsString <em>Minimum Section Modulus ZAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimum Section Modulus ZAs String</em>' attribute is set.
	 * @see #unsetMinimumSectionModulusZAsString()
	 * @see #getMinimumSectionModulusZAsString()
	 * @see #setMinimumSectionModulusZAsString(String)
	 * @generated
	 */
	boolean isSetMinimumSectionModulusZAsString();

	/**
	 * Returns the value of the '<em><b>Torsional Section Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Section Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Section Modulus</em>' attribute.
	 * @see #isSetTorsionalSectionModulus()
	 * @see #unsetTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_TorsionalSectionModulus()
	 * @model unsettable="true"
	 * @generated
	 */
	float getTorsionalSectionModulus();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Section Modulus</em>' attribute.
	 * @see #isSetTorsionalSectionModulus()
	 * @see #unsetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 */
	void setTorsionalSectionModulus(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(float)
	 * @generated
	 */
	void unsetTorsionalSectionModulus();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Section Modulus</em>' attribute is set.
	 * @see #unsetTorsionalSectionModulus()
	 * @see #getTorsionalSectionModulus()
	 * @see #setTorsionalSectionModulus(float)
	 * @generated
	 */
	boolean isSetTorsionalSectionModulus();

	/**
	 * Returns the value of the '<em><b>Torsional Section Modulus As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Torsional Section Modulus As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Torsional Section Modulus As String</em>' attribute.
	 * @see #isSetTorsionalSectionModulusAsString()
	 * @see #unsetTorsionalSectionModulusAsString()
	 * @see #setTorsionalSectionModulusAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_TorsionalSectionModulusAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTorsionalSectionModulusAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulusAsString <em>Torsional Section Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Torsional Section Modulus As String</em>' attribute.
	 * @see #isSetTorsionalSectionModulusAsString()
	 * @see #unsetTorsionalSectionModulusAsString()
	 * @see #getTorsionalSectionModulusAsString()
	 * @generated
	 */
	void setTorsionalSectionModulusAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulusAsString <em>Torsional Section Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTorsionalSectionModulusAsString()
	 * @see #getTorsionalSectionModulusAsString()
	 * @see #setTorsionalSectionModulusAsString(String)
	 * @generated
	 */
	void unsetTorsionalSectionModulusAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getTorsionalSectionModulusAsString <em>Torsional Section Modulus As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Torsional Section Modulus As String</em>' attribute is set.
	 * @see #unsetTorsionalSectionModulusAsString()
	 * @see #getTorsionalSectionModulusAsString()
	 * @see #setTorsionalSectionModulusAsString(String)
	 * @generated
	 */
	boolean isSetTorsionalSectionModulusAsString();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_CentreOfGravityInX()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCentreOfGravityInX();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In X</em>' attribute.
	 * @see #isSetCentreOfGravityInX()
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @generated
	 */
	void setCentreOfGravityInX(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(float)
	 * @generated
	 */
	void unsetCentreOfGravityInX();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In X</em>' attribute is set.
	 * @see #unsetCentreOfGravityInX()
	 * @see #getCentreOfGravityInX()
	 * @see #setCentreOfGravityInX(float)
	 * @generated
	 */
	boolean isSetCentreOfGravityInX();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In XAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In XAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In XAs String</em>' attribute.
	 * @see #isSetCentreOfGravityInXAsString()
	 * @see #unsetCentreOfGravityInXAsString()
	 * @see #setCentreOfGravityInXAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_CentreOfGravityInXAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCentreOfGravityInXAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In XAs String</em>' attribute.
	 * @see #isSetCentreOfGravityInXAsString()
	 * @see #unsetCentreOfGravityInXAsString()
	 * @see #getCentreOfGravityInXAsString()
	 * @generated
	 */
	void setCentreOfGravityInXAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInXAsString()
	 * @see #getCentreOfGravityInXAsString()
	 * @see #setCentreOfGravityInXAsString(String)
	 * @generated
	 */
	void unsetCentreOfGravityInXAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In XAs String</em>' attribute is set.
	 * @see #unsetCentreOfGravityInXAsString()
	 * @see #getCentreOfGravityInXAsString()
	 * @see #setCentreOfGravityInXAsString(String)
	 * @generated
	 */
	boolean isSetCentreOfGravityInXAsString();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_CentreOfGravityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	float getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(float value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(float)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' attribute is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(float)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In YAs String</em>' attribute.
	 * @see #isSetCentreOfGravityInYAsString()
	 * @see #unsetCentreOfGravityInYAsString()
	 * @see #setCentreOfGravityInYAsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcStructuralProfileProperties_CentreOfGravityInYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCentreOfGravityInYAsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In YAs String</em>' attribute.
	 * @see #isSetCentreOfGravityInYAsString()
	 * @see #unsetCentreOfGravityInYAsString()
	 * @see #getCentreOfGravityInYAsString()
	 * @generated
	 */
	void setCentreOfGravityInYAsString(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInYAsString()
	 * @see #getCentreOfGravityInYAsString()
	 * @see #setCentreOfGravityInYAsString(String)
	 * @generated
	 */
	void unsetCentreOfGravityInYAsString();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In YAs String</em>' attribute is set.
	 * @see #unsetCentreOfGravityInYAsString()
	 * @see #getCentreOfGravityInYAsString()
	 * @see #setCentreOfGravityInYAsString(String)
	 * @generated
	 */
	boolean isSetCentreOfGravityInYAsString();

} // IfcStructuralProfileProperties
