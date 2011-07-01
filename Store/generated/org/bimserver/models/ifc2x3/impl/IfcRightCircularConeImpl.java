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
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcRightCircularCone;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Right Circular Cone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRightCircularConeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRightCircularConeImpl#getHeightAsString <em>Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRightCircularConeImpl#getBottomRadius <em>Bottom Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRightCircularConeImpl#getBottomRadiusAsString <em>Bottom Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRightCircularConeImpl extends IfcCsgPrimitive3DImpl implements IfcRightCircularCone
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRightCircularConeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Ifc2x3Package.eINSTANCE.getIfcRightCircularCone();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight()
	{
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_Height(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_Height(), newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeightAsString()
	{
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_HeightAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightAsString(String newHeightAsString)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_HeightAsString(), newHeightAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBottomRadius()
	{
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_BottomRadius(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRadius(float newBottomRadius)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_BottomRadius(), newBottomRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBottomRadiusAsString()
	{
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_BottomRadiusAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRadiusAsString(String newBottomRadiusAsString)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcRightCircularCone_BottomRadiusAsString(), newBottomRadiusAsString);
	}

} //IfcRightCircularConeImpl
