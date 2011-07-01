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

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcAheadOrBehind;
import org.bimserver.models.ifc2x3.IfcCoordinatedUniversalTimeOffset;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Coordinated Universal Time Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCoordinatedUniversalTimeOffsetImpl#getHourOffset <em>Hour Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCoordinatedUniversalTimeOffsetImpl#getMinuteOffset <em>Minute Offset</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcCoordinatedUniversalTimeOffsetImpl#getSense <em>Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCoordinatedUniversalTimeOffsetImpl extends IdEObjectImpl implements IfcCoordinatedUniversalTimeOffset
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCoordinatedUniversalTimeOffsetImpl()
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
		return Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHourOffset()
	{
		return (Integer)eGet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_HourOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHourOffset(int newHourOffset)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_HourOffset(), newHourOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinuteOffset()
	{
		return (Integer)eGet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinuteOffset(int newMinuteOffset)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset(), newMinuteOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinuteOffset()
	{
		eUnset(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinuteOffset()
	{
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_MinuteOffset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAheadOrBehind getSense()
	{
		return (IfcAheadOrBehind)eGet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_Sense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSense(IfcAheadOrBehind newSense)
	{
		eSet(Ifc2x3Package.eINSTANCE.getIfcCoordinatedUniversalTimeOffset_Sense(), newSense);
	}

} //IfcCoordinatedUniversalTimeOffsetImpl
