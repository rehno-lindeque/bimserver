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
import org.bimserver.models.ifc2x3.IfcDoorStyle;
import org.bimserver.models.ifc2x3.IfcDoorStyleConstructionEnum;
import org.bimserver.models.ifc2x3.IfcDoorStyleOperationEnum;
import org.bimserver.models.ifc2x3.Tristate;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Door Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorStyleImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorStyleImpl#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorStyleImpl#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDoorStyleImpl#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDoorStyleImpl extends IfcTypeProductImpl implements IfcDoorStyle
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDoorStyleImpl()
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
		return Ifc2x3Package.eINSTANCE.getIfcDoorStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleOperationEnum getOperationType()
	{
		return (IfcDoorStyleOperationEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_OperationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcDoorStyleOperationEnum newOperationType)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_OperationType(), newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDoorStyleConstructionEnum getConstructionType()
	{
		return (IfcDoorStyleConstructionEnum)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_ConstructionType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructionType(IfcDoorStyleConstructionEnum newConstructionType)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_ConstructionType(), newConstructionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getParameterTakesPrecedence()
	{
		return (Tristate)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_ParameterTakesPrecedence(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterTakesPrecedence(Tristate newParameterTakesPrecedence)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_ParameterTakesPrecedence(), newParameterTakesPrecedence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSizeable()
	{
		return (Tristate)eGet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_Sizeable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeable(Tristate newSizeable)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcDoorStyle_Sizeable(), newSizeable);
	}

} //IfcDoorStyleImpl
