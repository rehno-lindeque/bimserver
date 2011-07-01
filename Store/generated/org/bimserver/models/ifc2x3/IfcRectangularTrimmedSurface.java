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
 * A representation of the model object '<em><b>Ifc Rectangular Trimmed Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU1AsString <em>U1 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV1AsString <em>V1 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU2AsString <em>U2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV2AsString <em>V2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface()
 * @model
 * @generated
 */
public interface IfcRectangularTrimmedSurface extends IfcBoundedSurface
{
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' reference.
	 * @see #setBasisSurface(IfcSurface)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_BasisSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getBasisSurface();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getBasisSurface <em>Basis Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>U1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U1</em>' attribute.
	 * @see #setU1(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_U1()
	 * @model
	 * @generated
	 */
	float getU1();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU1 <em>U1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U1</em>' attribute.
	 * @see #getU1()
	 * @generated
	 */
	void setU1(float value);

	/**
	 * Returns the value of the '<em><b>U1 As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U1 As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U1 As String</em>' attribute.
	 * @see #setU1AsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_U1AsString()
	 * @model
	 * @generated
	 */
	String getU1AsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU1AsString <em>U1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U1 As String</em>' attribute.
	 * @see #getU1AsString()
	 * @generated
	 */
	void setU1AsString(String value);

	/**
	 * Returns the value of the '<em><b>V1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1</em>' attribute.
	 * @see #setV1(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_V1()
	 * @model
	 * @generated
	 */
	float getV1();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV1 <em>V1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1</em>' attribute.
	 * @see #getV1()
	 * @generated
	 */
	void setV1(float value);

	/**
	 * Returns the value of the '<em><b>V1 As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V1 As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V1 As String</em>' attribute.
	 * @see #setV1AsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_V1AsString()
	 * @model
	 * @generated
	 */
	String getV1AsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV1AsString <em>V1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1 As String</em>' attribute.
	 * @see #getV1AsString()
	 * @generated
	 */
	void setV1AsString(String value);

	/**
	 * Returns the value of the '<em><b>U2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U2</em>' attribute.
	 * @see #setU2(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_U2()
	 * @model
	 * @generated
	 */
	float getU2();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU2 <em>U2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U2</em>' attribute.
	 * @see #getU2()
	 * @generated
	 */
	void setU2(float value);

	/**
	 * Returns the value of the '<em><b>U2 As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U2 As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U2 As String</em>' attribute.
	 * @see #setU2AsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_U2AsString()
	 * @model
	 * @generated
	 */
	String getU2AsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getU2AsString <em>U2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U2 As String</em>' attribute.
	 * @see #getU2AsString()
	 * @generated
	 */
	void setU2AsString(String value);

	/**
	 * Returns the value of the '<em><b>V2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2</em>' attribute.
	 * @see #setV2(float)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_V2()
	 * @model
	 * @generated
	 */
	float getV2();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV2 <em>V2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2</em>' attribute.
	 * @see #getV2()
	 * @generated
	 */
	void setV2(float value);

	/**
	 * Returns the value of the '<em><b>V2 As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V2 As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V2 As String</em>' attribute.
	 * @see #setV2AsString(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_V2AsString()
	 * @model
	 * @generated
	 */
	String getV2AsString();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getV2AsString <em>V2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2 As String</em>' attribute.
	 * @see #getV2AsString()
	 * @generated
	 */
	void setV2AsString(String value);

	/**
	 * Returns the value of the '<em><b>Usense</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usense</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #setUsense(Tristate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_Usense()
	 * @model
	 * @generated
	 */
	Tristate getUsense();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getUsense <em>Usense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usense</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #getUsense()
	 * @generated
	 */
	void setUsense(Tristate value);

	/**
	 * Returns the value of the '<em><b>Vsense</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.models.ifc2x3.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsense</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #setVsense(Tristate)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_Vsense()
	 * @model
	 * @generated
	 */
	Tristate getVsense();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getVsense <em>Vsense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsense</em>' attribute.
	 * @see org.bimserver.models.ifc2x3.Tristate
	 * @see #getVsense()
	 * @generated
	 */
	void setVsense(Tristate value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #setDim(int)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcRectangularTrimmedSurface_Dim()
	 * @model derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

} // IfcRectangularTrimmedSurface
