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
import org.bimserver.models.ifc2x3.IfcEnvironmentalImpactCategoryEnum;
import org.bimserver.models.ifc2x3.IfcEnvironmentalImpactValue;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Environmental Impact Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcEnvironmentalImpactValueImpl#getImpactType <em>Impact Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcEnvironmentalImpactValueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcEnvironmentalImpactValueImpl#getUserDefinedCategory <em>User Defined Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEnvironmentalImpactValueImpl extends IfcAppliedValueImpl implements IfcEnvironmentalImpactValue
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEnvironmentalImpactValueImpl()
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
		return Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpactType()
	{
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_ImpactType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpactType(String newImpactType)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_ImpactType(), newImpactType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnvironmentalImpactCategoryEnum getCategory()
	{
		return (IfcEnvironmentalImpactCategoryEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_Category(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(IfcEnvironmentalImpactCategoryEnum newCategory)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_Category(), newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedCategory()
	{
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedCategory(String newUserDefinedCategory)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory(), newUserDefinedCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedCategory()
	{
		eUnset(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedCategory()
	{
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcEnvironmentalImpactValue_UserDefinedCategory());
	}

} //IfcEnvironmentalImpactValueImpl
