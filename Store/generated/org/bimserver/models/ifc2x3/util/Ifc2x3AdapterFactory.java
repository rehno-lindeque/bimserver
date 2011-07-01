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
package org.bimserver.models.ifc2x3.util;

import org.bimserver.models.ifc2x3.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package
 * @generated
 */
public class Ifc2x3AdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ifc2x3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ifc2x3AdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = Ifc2x3Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ifc2x3Switch<Adapter> modelSwitch =
		new Ifc2x3Switch<Adapter>() {
			@Override
			public Adapter caseWrappedValue(WrappedValue object) {
				return createWrappedValueAdapter();
			}
			@Override
			public Adapter caseIfcAbsorbedDoseMeasure(IfcAbsorbedDoseMeasure object) {
				return createIfcAbsorbedDoseMeasureAdapter();
			}
			@Override
			public Adapter caseIfcAccelerationMeasure(IfcAccelerationMeasure object) {
				return createIfcAccelerationMeasureAdapter();
			}
			@Override
			public Adapter caseIfcAmountOfSubstanceMeasure(IfcAmountOfSubstanceMeasure object) {
				return createIfcAmountOfSubstanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcAngularVelocityMeasure(IfcAngularVelocityMeasure object) {
				return createIfcAngularVelocityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcAreaMeasure(IfcAreaMeasure object) {
				return createIfcAreaMeasureAdapter();
			}
			@Override
			public Adapter caseIfcBoolean(IfcBoolean object) {
				return createIfcBooleanAdapter();
			}
			@Override
			public Adapter caseIfcContextDependentMeasure(IfcContextDependentMeasure object) {
				return createIfcContextDependentMeasureAdapter();
			}
			@Override
			public Adapter caseIfcCountMeasure(IfcCountMeasure object) {
				return createIfcCountMeasureAdapter();
			}
			@Override
			public Adapter caseIfcCurvatureMeasure(IfcCurvatureMeasure object) {
				return createIfcCurvatureMeasureAdapter();
			}
			@Override
			public Adapter caseIfcDescriptiveMeasure(IfcDescriptiveMeasure object) {
				return createIfcDescriptiveMeasureAdapter();
			}
			@Override
			public Adapter caseIfcDoseEquivalentMeasure(IfcDoseEquivalentMeasure object) {
				return createIfcDoseEquivalentMeasureAdapter();
			}
			@Override
			public Adapter caseIfcDynamicViscosityMeasure(IfcDynamicViscosityMeasure object) {
				return createIfcDynamicViscosityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcElectricCapacitanceMeasure(IfcElectricCapacitanceMeasure object) {
				return createIfcElectricCapacitanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcElectricChargeMeasure(IfcElectricChargeMeasure object) {
				return createIfcElectricChargeMeasureAdapter();
			}
			@Override
			public Adapter caseIfcElectricConductanceMeasure(IfcElectricConductanceMeasure object) {
				return createIfcElectricConductanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcElectricCurrentMeasure(IfcElectricCurrentMeasure object) {
				return createIfcElectricCurrentMeasureAdapter();
			}
			@Override
			public Adapter caseIfcElectricResistanceMeasure(IfcElectricResistanceMeasure object) {
				return createIfcElectricResistanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcElectricVoltageMeasure(IfcElectricVoltageMeasure object) {
				return createIfcElectricVoltageMeasureAdapter();
			}
			@Override
			public Adapter caseIfcEnergyMeasure(IfcEnergyMeasure object) {
				return createIfcEnergyMeasureAdapter();
			}
			@Override
			public Adapter caseIfcForceMeasure(IfcForceMeasure object) {
				return createIfcForceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcFrequencyMeasure(IfcFrequencyMeasure object) {
				return createIfcFrequencyMeasureAdapter();
			}
			@Override
			public Adapter caseIfcGloballyUniqueId(IfcGloballyUniqueId object) {
				return createIfcGloballyUniqueIdAdapter();
			}
			@Override
			public Adapter caseIfcHeatFluxDensityMeasure(IfcHeatFluxDensityMeasure object) {
				return createIfcHeatFluxDensityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcHeatingValueMeasure(IfcHeatingValueMeasure object) {
				return createIfcHeatingValueMeasureAdapter();
			}
			@Override
			public Adapter caseIfcIdentifier(IfcIdentifier object) {
				return createIfcIdentifierAdapter();
			}
			@Override
			public Adapter caseIfcIlluminanceMeasure(IfcIlluminanceMeasure object) {
				return createIfcIlluminanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcInductanceMeasure(IfcInductanceMeasure object) {
				return createIfcInductanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcInteger(IfcInteger object) {
				return createIfcIntegerAdapter();
			}
			@Override
			public Adapter caseIfcIntegerCountRateMeasure(IfcIntegerCountRateMeasure object) {
				return createIfcIntegerCountRateMeasureAdapter();
			}
			@Override
			public Adapter caseIfcIonConcentrationMeasure(IfcIonConcentrationMeasure object) {
				return createIfcIonConcentrationMeasureAdapter();
			}
			@Override
			public Adapter caseIfcIsothermalMoistureCapacityMeasure(IfcIsothermalMoistureCapacityMeasure object) {
				return createIfcIsothermalMoistureCapacityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcKinematicViscosityMeasure(IfcKinematicViscosityMeasure object) {
				return createIfcKinematicViscosityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLabel(IfcLabel object) {
				return createIfcLabelAdapter();
			}
			@Override
			public Adapter caseIfcLengthMeasure(IfcLengthMeasure object) {
				return createIfcLengthMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLinearForceMeasure(IfcLinearForceMeasure object) {
				return createIfcLinearForceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLinearMomentMeasure(IfcLinearMomentMeasure object) {
				return createIfcLinearMomentMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLinearStiffnessMeasure(IfcLinearStiffnessMeasure object) {
				return createIfcLinearStiffnessMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLinearVelocityMeasure(IfcLinearVelocityMeasure object) {
				return createIfcLinearVelocityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLogical(IfcLogical object) {
				return createIfcLogicalAdapter();
			}
			@Override
			public Adapter caseIfcLuminousFluxMeasure(IfcLuminousFluxMeasure object) {
				return createIfcLuminousFluxMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLuminousIntensityDistributionMeasure(IfcLuminousIntensityDistributionMeasure object) {
				return createIfcLuminousIntensityDistributionMeasureAdapter();
			}
			@Override
			public Adapter caseIfcLuminousIntensityMeasure(IfcLuminousIntensityMeasure object) {
				return createIfcLuminousIntensityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMagneticFluxDensityMeasure(IfcMagneticFluxDensityMeasure object) {
				return createIfcMagneticFluxDensityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMagneticFluxMeasure(IfcMagneticFluxMeasure object) {
				return createIfcMagneticFluxMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMassDensityMeasure(IfcMassDensityMeasure object) {
				return createIfcMassDensityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMassFlowRateMeasure(IfcMassFlowRateMeasure object) {
				return createIfcMassFlowRateMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMassMeasure(IfcMassMeasure object) {
				return createIfcMassMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMassPerLengthMeasure(IfcMassPerLengthMeasure object) {
				return createIfcMassPerLengthMeasureAdapter();
			}
			@Override
			public Adapter caseIfcModulusOfElasticityMeasure(IfcModulusOfElasticityMeasure object) {
				return createIfcModulusOfElasticityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcModulusOfLinearSubgradeReactionMeasure(IfcModulusOfLinearSubgradeReactionMeasure object) {
				return createIfcModulusOfLinearSubgradeReactionMeasureAdapter();
			}
			@Override
			public Adapter caseIfcModulusOfRotationalSubgradeReactionMeasure(IfcModulusOfRotationalSubgradeReactionMeasure object) {
				return createIfcModulusOfRotationalSubgradeReactionMeasureAdapter();
			}
			@Override
			public Adapter caseIfcModulusOfSubgradeReactionMeasure(IfcModulusOfSubgradeReactionMeasure object) {
				return createIfcModulusOfSubgradeReactionMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMoistureDiffusivityMeasure(IfcMoistureDiffusivityMeasure object) {
				return createIfcMoistureDiffusivityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMolecularWeightMeasure(IfcMolecularWeightMeasure object) {
				return createIfcMolecularWeightMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMomentOfInertiaMeasure(IfcMomentOfInertiaMeasure object) {
				return createIfcMomentOfInertiaMeasureAdapter();
			}
			@Override
			public Adapter caseIfcMonetaryMeasure(IfcMonetaryMeasure object) {
				return createIfcMonetaryMeasureAdapter();
			}
			@Override
			public Adapter caseIfcNumericMeasure(IfcNumericMeasure object) {
				return createIfcNumericMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPHMeasure(IfcPHMeasure object) {
				return createIfcPHMeasureAdapter();
			}
			@Override
			public Adapter caseIfcParameterValue(IfcParameterValue object) {
				return createIfcParameterValueAdapter();
			}
			@Override
			public Adapter caseIfcPlanarForceMeasure(IfcPlanarForceMeasure object) {
				return createIfcPlanarForceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPlaneAngleMeasure(IfcPlaneAngleMeasure object) {
				return createIfcPlaneAngleMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPowerMeasure(IfcPowerMeasure object) {
				return createIfcPowerMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPressureMeasure(IfcPressureMeasure object) {
				return createIfcPressureMeasureAdapter();
			}
			@Override
			public Adapter caseIfcRadioActivityMeasure(IfcRadioActivityMeasure object) {
				return createIfcRadioActivityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcRatioMeasure(IfcRatioMeasure object) {
				return createIfcRatioMeasureAdapter();
			}
			@Override
			public Adapter caseIfcReal(IfcReal object) {
				return createIfcRealAdapter();
			}
			@Override
			public Adapter caseIfcRotationalFrequencyMeasure(IfcRotationalFrequencyMeasure object) {
				return createIfcRotationalFrequencyMeasureAdapter();
			}
			@Override
			public Adapter caseIfcRotationalMassMeasure(IfcRotationalMassMeasure object) {
				return createIfcRotationalMassMeasureAdapter();
			}
			@Override
			public Adapter caseIfcRotationalStiffnessMeasure(IfcRotationalStiffnessMeasure object) {
				return createIfcRotationalStiffnessMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSectionModulusMeasure(IfcSectionModulusMeasure object) {
				return createIfcSectionModulusMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSectionalAreaIntegralMeasure(IfcSectionalAreaIntegralMeasure object) {
				return createIfcSectionalAreaIntegralMeasureAdapter();
			}
			@Override
			public Adapter caseIfcShearModulusMeasure(IfcShearModulusMeasure object) {
				return createIfcShearModulusMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSolidAngleMeasure(IfcSolidAngleMeasure object) {
				return createIfcSolidAngleMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSoundPowerMeasure(IfcSoundPowerMeasure object) {
				return createIfcSoundPowerMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSoundPressureMeasure(IfcSoundPressureMeasure object) {
				return createIfcSoundPressureMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSpecificHeatCapacityMeasure(IfcSpecificHeatCapacityMeasure object) {
				return createIfcSpecificHeatCapacityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcSpecularExponent(IfcSpecularExponent object) {
				return createIfcSpecularExponentAdapter();
			}
			@Override
			public Adapter caseIfcSpecularRoughness(IfcSpecularRoughness object) {
				return createIfcSpecularRoughnessAdapter();
			}
			@Override
			public Adapter caseIfcTemperatureGradientMeasure(IfcTemperatureGradientMeasure object) {
				return createIfcTemperatureGradientMeasureAdapter();
			}
			@Override
			public Adapter caseIfcText(IfcText object) {
				return createIfcTextAdapter();
			}
			@Override
			public Adapter caseIfcThermalAdmittanceMeasure(IfcThermalAdmittanceMeasure object) {
				return createIfcThermalAdmittanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcThermalConductivityMeasure(IfcThermalConductivityMeasure object) {
				return createIfcThermalConductivityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcThermalExpansionCoefficientMeasure(IfcThermalExpansionCoefficientMeasure object) {
				return createIfcThermalExpansionCoefficientMeasureAdapter();
			}
			@Override
			public Adapter caseIfcThermalResistanceMeasure(IfcThermalResistanceMeasure object) {
				return createIfcThermalResistanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcThermalTransmittanceMeasure(IfcThermalTransmittanceMeasure object) {
				return createIfcThermalTransmittanceMeasureAdapter();
			}
			@Override
			public Adapter caseIfcThermodynamicTemperatureMeasure(IfcThermodynamicTemperatureMeasure object) {
				return createIfcThermodynamicTemperatureMeasureAdapter();
			}
			@Override
			public Adapter caseIfcTimeMeasure(IfcTimeMeasure object) {
				return createIfcTimeMeasureAdapter();
			}
			@Override
			public Adapter caseIfcTimeStamp(IfcTimeStamp object) {
				return createIfcTimeStampAdapter();
			}
			@Override
			public Adapter caseIfcTorqueMeasure(IfcTorqueMeasure object) {
				return createIfcTorqueMeasureAdapter();
			}
			@Override
			public Adapter caseIfcVaporPermeabilityMeasure(IfcVaporPermeabilityMeasure object) {
				return createIfcVaporPermeabilityMeasureAdapter();
			}
			@Override
			public Adapter caseIfcVolumeMeasure(IfcVolumeMeasure object) {
				return createIfcVolumeMeasureAdapter();
			}
			@Override
			public Adapter caseIfcVolumetricFlowRateMeasure(IfcVolumetricFlowRateMeasure object) {
				return createIfcVolumetricFlowRateMeasureAdapter();
			}
			@Override
			public Adapter caseIfcWarpingConstantMeasure(IfcWarpingConstantMeasure object) {
				return createIfcWarpingConstantMeasureAdapter();
			}
			@Override
			public Adapter caseIfcWarpingMomentMeasure(IfcWarpingMomentMeasure object) {
				return createIfcWarpingMomentMeasureAdapter();
			}
			@Override
			public Adapter caseIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasure object) {
				return createIfcNormalisedRatioMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPositiveLengthMeasure(IfcPositiveLengthMeasure object) {
				return createIfcPositiveLengthMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPositivePlaneAngleMeasure(IfcPositivePlaneAngleMeasure object) {
				return createIfcPositivePlaneAngleMeasureAdapter();
			}
			@Override
			public Adapter caseIfcPositiveRatioMeasure(IfcPositiveRatioMeasure object) {
				return createIfcPositiveRatioMeasureAdapter();
			}
			@Override
			public Adapter caseIfc2DCompositeCurve(Ifc2DCompositeCurve object) {
				return createIfc2DCompositeCurveAdapter();
			}
			@Override
			public Adapter caseIfcActionRequest(IfcActionRequest object) {
				return createIfcActionRequestAdapter();
			}
			@Override
			public Adapter caseIfcActor(IfcActor object) {
				return createIfcActorAdapter();
			}
			@Override
			public Adapter caseIfcActorRole(IfcActorRole object) {
				return createIfcActorRoleAdapter();
			}
			@Override
			public Adapter caseIfcActuatorType(IfcActuatorType object) {
				return createIfcActuatorTypeAdapter();
			}
			@Override
			public Adapter caseIfcAddress(IfcAddress object) {
				return createIfcAddressAdapter();
			}
			@Override
			public Adapter caseIfcAirTerminalBoxType(IfcAirTerminalBoxType object) {
				return createIfcAirTerminalBoxTypeAdapter();
			}
			@Override
			public Adapter caseIfcAirTerminalType(IfcAirTerminalType object) {
				return createIfcAirTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcAirToAirHeatRecoveryType(IfcAirToAirHeatRecoveryType object) {
				return createIfcAirToAirHeatRecoveryTypeAdapter();
			}
			@Override
			public Adapter caseIfcAlarmType(IfcAlarmType object) {
				return createIfcAlarmTypeAdapter();
			}
			@Override
			public Adapter caseIfcAngularDimension(IfcAngularDimension object) {
				return createIfcAngularDimensionAdapter();
			}
			@Override
			public Adapter caseIfcAnnotation(IfcAnnotation object) {
				return createIfcAnnotationAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationCurveOccurrence(IfcAnnotationCurveOccurrence object) {
				return createIfcAnnotationCurveOccurrenceAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationFillArea(IfcAnnotationFillArea object) {
				return createIfcAnnotationFillAreaAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationFillAreaOccurrence(IfcAnnotationFillAreaOccurrence object) {
				return createIfcAnnotationFillAreaOccurrenceAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationOccurrence(IfcAnnotationOccurrence object) {
				return createIfcAnnotationOccurrenceAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationSurface(IfcAnnotationSurface object) {
				return createIfcAnnotationSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationSurfaceOccurrence(IfcAnnotationSurfaceOccurrence object) {
				return createIfcAnnotationSurfaceOccurrenceAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationSymbolOccurrence(IfcAnnotationSymbolOccurrence object) {
				return createIfcAnnotationSymbolOccurrenceAdapter();
			}
			@Override
			public Adapter caseIfcAnnotationTextOccurrence(IfcAnnotationTextOccurrence object) {
				return createIfcAnnotationTextOccurrenceAdapter();
			}
			@Override
			public Adapter caseIfcApplication(IfcApplication object) {
				return createIfcApplicationAdapter();
			}
			@Override
			public Adapter caseIfcAppliedValue(IfcAppliedValue object) {
				return createIfcAppliedValueAdapter();
			}
			@Override
			public Adapter caseIfcAppliedValueRelationship(IfcAppliedValueRelationship object) {
				return createIfcAppliedValueRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcApproval(IfcApproval object) {
				return createIfcApprovalAdapter();
			}
			@Override
			public Adapter caseIfcApprovalActorRelationship(IfcApprovalActorRelationship object) {
				return createIfcApprovalActorRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcApprovalPropertyRelationship(IfcApprovalPropertyRelationship object) {
				return createIfcApprovalPropertyRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcApprovalRelationship(IfcApprovalRelationship object) {
				return createIfcApprovalRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcArbitraryClosedProfileDef(IfcArbitraryClosedProfileDef object) {
				return createIfcArbitraryClosedProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcArbitraryOpenProfileDef(IfcArbitraryOpenProfileDef object) {
				return createIfcArbitraryOpenProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcArbitraryProfileDefWithVoids(IfcArbitraryProfileDefWithVoids object) {
				return createIfcArbitraryProfileDefWithVoidsAdapter();
			}
			@Override
			public Adapter caseIfcAsset(IfcAsset object) {
				return createIfcAssetAdapter();
			}
			@Override
			public Adapter caseIfcAsymmetricIShapeProfileDef(IfcAsymmetricIShapeProfileDef object) {
				return createIfcAsymmetricIShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcAxis1Placement(IfcAxis1Placement object) {
				return createIfcAxis1PlacementAdapter();
			}
			@Override
			public Adapter caseIfcAxis2Placement2D(IfcAxis2Placement2D object) {
				return createIfcAxis2Placement2DAdapter();
			}
			@Override
			public Adapter caseIfcAxis2Placement3D(IfcAxis2Placement3D object) {
				return createIfcAxis2Placement3DAdapter();
			}
			@Override
			public Adapter caseIfcBSplineCurve(IfcBSplineCurve object) {
				return createIfcBSplineCurveAdapter();
			}
			@Override
			public Adapter caseIfcBeam(IfcBeam object) {
				return createIfcBeamAdapter();
			}
			@Override
			public Adapter caseIfcBeamType(IfcBeamType object) {
				return createIfcBeamTypeAdapter();
			}
			@Override
			public Adapter caseIfcBezierCurve(IfcBezierCurve object) {
				return createIfcBezierCurveAdapter();
			}
			@Override
			public Adapter caseIfcBlobTexture(IfcBlobTexture object) {
				return createIfcBlobTextureAdapter();
			}
			@Override
			public Adapter caseIfcBlock(IfcBlock object) {
				return createIfcBlockAdapter();
			}
			@Override
			public Adapter caseIfcBoilerType(IfcBoilerType object) {
				return createIfcBoilerTypeAdapter();
			}
			@Override
			public Adapter caseIfcBooleanClippingResult(IfcBooleanClippingResult object) {
				return createIfcBooleanClippingResultAdapter();
			}
			@Override
			public Adapter caseIfcBooleanResult(IfcBooleanResult object) {
				return createIfcBooleanResultAdapter();
			}
			@Override
			public Adapter caseIfcBoundaryCondition(IfcBoundaryCondition object) {
				return createIfcBoundaryConditionAdapter();
			}
			@Override
			public Adapter caseIfcBoundaryEdgeCondition(IfcBoundaryEdgeCondition object) {
				return createIfcBoundaryEdgeConditionAdapter();
			}
			@Override
			public Adapter caseIfcBoundaryFaceCondition(IfcBoundaryFaceCondition object) {
				return createIfcBoundaryFaceConditionAdapter();
			}
			@Override
			public Adapter caseIfcBoundaryNodeCondition(IfcBoundaryNodeCondition object) {
				return createIfcBoundaryNodeConditionAdapter();
			}
			@Override
			public Adapter caseIfcBoundaryNodeConditionWarping(IfcBoundaryNodeConditionWarping object) {
				return createIfcBoundaryNodeConditionWarpingAdapter();
			}
			@Override
			public Adapter caseIfcBoundedCurve(IfcBoundedCurve object) {
				return createIfcBoundedCurveAdapter();
			}
			@Override
			public Adapter caseIfcBoundedSurface(IfcBoundedSurface object) {
				return createIfcBoundedSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcBoundingBox(IfcBoundingBox object) {
				return createIfcBoundingBoxAdapter();
			}
			@Override
			public Adapter caseIfcBoxedHalfSpace(IfcBoxedHalfSpace object) {
				return createIfcBoxedHalfSpaceAdapter();
			}
			@Override
			public Adapter caseIfcBuilding(IfcBuilding object) {
				return createIfcBuildingAdapter();
			}
			@Override
			public Adapter caseIfcBuildingElement(IfcBuildingElement object) {
				return createIfcBuildingElementAdapter();
			}
			@Override
			public Adapter caseIfcBuildingElementComponent(IfcBuildingElementComponent object) {
				return createIfcBuildingElementComponentAdapter();
			}
			@Override
			public Adapter caseIfcBuildingElementPart(IfcBuildingElementPart object) {
				return createIfcBuildingElementPartAdapter();
			}
			@Override
			public Adapter caseIfcBuildingElementProxy(IfcBuildingElementProxy object) {
				return createIfcBuildingElementProxyAdapter();
			}
			@Override
			public Adapter caseIfcBuildingElementProxyType(IfcBuildingElementProxyType object) {
				return createIfcBuildingElementProxyTypeAdapter();
			}
			@Override
			public Adapter caseIfcBuildingElementType(IfcBuildingElementType object) {
				return createIfcBuildingElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcBuildingStorey(IfcBuildingStorey object) {
				return createIfcBuildingStoreyAdapter();
			}
			@Override
			public Adapter caseIfcCShapeProfileDef(IfcCShapeProfileDef object) {
				return createIfcCShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcCableCarrierFittingType(IfcCableCarrierFittingType object) {
				return createIfcCableCarrierFittingTypeAdapter();
			}
			@Override
			public Adapter caseIfcCableCarrierSegmentType(IfcCableCarrierSegmentType object) {
				return createIfcCableCarrierSegmentTypeAdapter();
			}
			@Override
			public Adapter caseIfcCableSegmentType(IfcCableSegmentType object) {
				return createIfcCableSegmentTypeAdapter();
			}
			@Override
			public Adapter caseIfcCalendarDate(IfcCalendarDate object) {
				return createIfcCalendarDateAdapter();
			}
			@Override
			public Adapter caseIfcCartesianPoint(IfcCartesianPoint object) {
				return createIfcCartesianPointAdapter();
			}
			@Override
			public Adapter caseIfcCartesianTransformationOperator(IfcCartesianTransformationOperator object) {
				return createIfcCartesianTransformationOperatorAdapter();
			}
			@Override
			public Adapter caseIfcCartesianTransformationOperator2D(IfcCartesianTransformationOperator2D object) {
				return createIfcCartesianTransformationOperator2DAdapter();
			}
			@Override
			public Adapter caseIfcCartesianTransformationOperator2DnonUniform(IfcCartesianTransformationOperator2DnonUniform object) {
				return createIfcCartesianTransformationOperator2DnonUniformAdapter();
			}
			@Override
			public Adapter caseIfcCartesianTransformationOperator3D(IfcCartesianTransformationOperator3D object) {
				return createIfcCartesianTransformationOperator3DAdapter();
			}
			@Override
			public Adapter caseIfcCartesianTransformationOperator3DnonUniform(IfcCartesianTransformationOperator3DnonUniform object) {
				return createIfcCartesianTransformationOperator3DnonUniformAdapter();
			}
			@Override
			public Adapter caseIfcCenterLineProfileDef(IfcCenterLineProfileDef object) {
				return createIfcCenterLineProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcChamferEdgeFeature(IfcChamferEdgeFeature object) {
				return createIfcChamferEdgeFeatureAdapter();
			}
			@Override
			public Adapter caseIfcChillerType(IfcChillerType object) {
				return createIfcChillerTypeAdapter();
			}
			@Override
			public Adapter caseIfcCircle(IfcCircle object) {
				return createIfcCircleAdapter();
			}
			@Override
			public Adapter caseIfcCircleHollowProfileDef(IfcCircleHollowProfileDef object) {
				return createIfcCircleHollowProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcCircleProfileDef(IfcCircleProfileDef object) {
				return createIfcCircleProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcClassification(IfcClassification object) {
				return createIfcClassificationAdapter();
			}
			@Override
			public Adapter caseIfcClassificationItem(IfcClassificationItem object) {
				return createIfcClassificationItemAdapter();
			}
			@Override
			public Adapter caseIfcClassificationItemRelationship(IfcClassificationItemRelationship object) {
				return createIfcClassificationItemRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcClassificationNotation(IfcClassificationNotation object) {
				return createIfcClassificationNotationAdapter();
			}
			@Override
			public Adapter caseIfcClassificationNotationFacet(IfcClassificationNotationFacet object) {
				return createIfcClassificationNotationFacetAdapter();
			}
			@Override
			public Adapter caseIfcClassificationReference(IfcClassificationReference object) {
				return createIfcClassificationReferenceAdapter();
			}
			@Override
			public Adapter caseIfcClosedShell(IfcClosedShell object) {
				return createIfcClosedShellAdapter();
			}
			@Override
			public Adapter caseIfcCoilType(IfcCoilType object) {
				return createIfcCoilTypeAdapter();
			}
			@Override
			public Adapter caseIfcColourRgb(IfcColourRgb object) {
				return createIfcColourRgbAdapter();
			}
			@Override
			public Adapter caseIfcColourSpecification(IfcColourSpecification object) {
				return createIfcColourSpecificationAdapter();
			}
			@Override
			public Adapter caseIfcColumn(IfcColumn object) {
				return createIfcColumnAdapter();
			}
			@Override
			public Adapter caseIfcColumnType(IfcColumnType object) {
				return createIfcColumnTypeAdapter();
			}
			@Override
			public Adapter caseIfcComplexProperty(IfcComplexProperty object) {
				return createIfcComplexPropertyAdapter();
			}
			@Override
			public Adapter caseIfcCompositeCurve(IfcCompositeCurve object) {
				return createIfcCompositeCurveAdapter();
			}
			@Override
			public Adapter caseIfcCompositeCurveSegment(IfcCompositeCurveSegment object) {
				return createIfcCompositeCurveSegmentAdapter();
			}
			@Override
			public Adapter caseIfcCompositeProfileDef(IfcCompositeProfileDef object) {
				return createIfcCompositeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcCompressorType(IfcCompressorType object) {
				return createIfcCompressorTypeAdapter();
			}
			@Override
			public Adapter caseIfcCondenserType(IfcCondenserType object) {
				return createIfcCondenserTypeAdapter();
			}
			@Override
			public Adapter caseIfcCondition(IfcCondition object) {
				return createIfcConditionAdapter();
			}
			@Override
			public Adapter caseIfcConditionCriterion(IfcConditionCriterion object) {
				return createIfcConditionCriterionAdapter();
			}
			@Override
			public Adapter caseIfcConic(IfcConic object) {
				return createIfcConicAdapter();
			}
			@Override
			public Adapter caseIfcConnectedFaceSet(IfcConnectedFaceSet object) {
				return createIfcConnectedFaceSetAdapter();
			}
			@Override
			public Adapter caseIfcConnectionCurveGeometry(IfcConnectionCurveGeometry object) {
				return createIfcConnectionCurveGeometryAdapter();
			}
			@Override
			public Adapter caseIfcConnectionGeometry(IfcConnectionGeometry object) {
				return createIfcConnectionGeometryAdapter();
			}
			@Override
			public Adapter caseIfcConnectionPointEccentricity(IfcConnectionPointEccentricity object) {
				return createIfcConnectionPointEccentricityAdapter();
			}
			@Override
			public Adapter caseIfcConnectionPointGeometry(IfcConnectionPointGeometry object) {
				return createIfcConnectionPointGeometryAdapter();
			}
			@Override
			public Adapter caseIfcConnectionPortGeometry(IfcConnectionPortGeometry object) {
				return createIfcConnectionPortGeometryAdapter();
			}
			@Override
			public Adapter caseIfcConnectionSurfaceGeometry(IfcConnectionSurfaceGeometry object) {
				return createIfcConnectionSurfaceGeometryAdapter();
			}
			@Override
			public Adapter caseIfcConstraint(IfcConstraint object) {
				return createIfcConstraintAdapter();
			}
			@Override
			public Adapter caseIfcConstraintAggregationRelationship(IfcConstraintAggregationRelationship object) {
				return createIfcConstraintAggregationRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcConstraintClassificationRelationship(IfcConstraintClassificationRelationship object) {
				return createIfcConstraintClassificationRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcConstraintRelationship(IfcConstraintRelationship object) {
				return createIfcConstraintRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcConstructionEquipmentResource(IfcConstructionEquipmentResource object) {
				return createIfcConstructionEquipmentResourceAdapter();
			}
			@Override
			public Adapter caseIfcConstructionMaterialResource(IfcConstructionMaterialResource object) {
				return createIfcConstructionMaterialResourceAdapter();
			}
			@Override
			public Adapter caseIfcConstructionProductResource(IfcConstructionProductResource object) {
				return createIfcConstructionProductResourceAdapter();
			}
			@Override
			public Adapter caseIfcConstructionResource(IfcConstructionResource object) {
				return createIfcConstructionResourceAdapter();
			}
			@Override
			public Adapter caseIfcContextDependentUnit(IfcContextDependentUnit object) {
				return createIfcContextDependentUnitAdapter();
			}
			@Override
			public Adapter caseIfcControl(IfcControl object) {
				return createIfcControlAdapter();
			}
			@Override
			public Adapter caseIfcControllerType(IfcControllerType object) {
				return createIfcControllerTypeAdapter();
			}
			@Override
			public Adapter caseIfcConversionBasedUnit(IfcConversionBasedUnit object) {
				return createIfcConversionBasedUnitAdapter();
			}
			@Override
			public Adapter caseIfcCooledBeamType(IfcCooledBeamType object) {
				return createIfcCooledBeamTypeAdapter();
			}
			@Override
			public Adapter caseIfcCoolingTowerType(IfcCoolingTowerType object) {
				return createIfcCoolingTowerTypeAdapter();
			}
			@Override
			public Adapter caseIfcCoordinatedUniversalTimeOffset(IfcCoordinatedUniversalTimeOffset object) {
				return createIfcCoordinatedUniversalTimeOffsetAdapter();
			}
			@Override
			public Adapter caseIfcCostItem(IfcCostItem object) {
				return createIfcCostItemAdapter();
			}
			@Override
			public Adapter caseIfcCostSchedule(IfcCostSchedule object) {
				return createIfcCostScheduleAdapter();
			}
			@Override
			public Adapter caseIfcCostValue(IfcCostValue object) {
				return createIfcCostValueAdapter();
			}
			@Override
			public Adapter caseIfcCovering(IfcCovering object) {
				return createIfcCoveringAdapter();
			}
			@Override
			public Adapter caseIfcCoveringType(IfcCoveringType object) {
				return createIfcCoveringTypeAdapter();
			}
			@Override
			public Adapter caseIfcCraneRailAShapeProfileDef(IfcCraneRailAShapeProfileDef object) {
				return createIfcCraneRailAShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcCraneRailFShapeProfileDef(IfcCraneRailFShapeProfileDef object) {
				return createIfcCraneRailFShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcCrewResource(IfcCrewResource object) {
				return createIfcCrewResourceAdapter();
			}
			@Override
			public Adapter caseIfcCsgPrimitive3D(IfcCsgPrimitive3D object) {
				return createIfcCsgPrimitive3DAdapter();
			}
			@Override
			public Adapter caseIfcCsgSolid(IfcCsgSolid object) {
				return createIfcCsgSolidAdapter();
			}
			@Override
			public Adapter caseIfcCurrencyRelationship(IfcCurrencyRelationship object) {
				return createIfcCurrencyRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcCurtainWall(IfcCurtainWall object) {
				return createIfcCurtainWallAdapter();
			}
			@Override
			public Adapter caseIfcCurtainWallType(IfcCurtainWallType object) {
				return createIfcCurtainWallTypeAdapter();
			}
			@Override
			public Adapter caseIfcCurve(IfcCurve object) {
				return createIfcCurveAdapter();
			}
			@Override
			public Adapter caseIfcCurveBoundedPlane(IfcCurveBoundedPlane object) {
				return createIfcCurveBoundedPlaneAdapter();
			}
			@Override
			public Adapter caseIfcCurveStyle(IfcCurveStyle object) {
				return createIfcCurveStyleAdapter();
			}
			@Override
			public Adapter caseIfcCurveStyleFont(IfcCurveStyleFont object) {
				return createIfcCurveStyleFontAdapter();
			}
			@Override
			public Adapter caseIfcCurveStyleFontAndScaling(IfcCurveStyleFontAndScaling object) {
				return createIfcCurveStyleFontAndScalingAdapter();
			}
			@Override
			public Adapter caseIfcCurveStyleFontPattern(IfcCurveStyleFontPattern object) {
				return createIfcCurveStyleFontPatternAdapter();
			}
			@Override
			public Adapter caseIfcDamperType(IfcDamperType object) {
				return createIfcDamperTypeAdapter();
			}
			@Override
			public Adapter caseIfcDateAndTime(IfcDateAndTime object) {
				return createIfcDateAndTimeAdapter();
			}
			@Override
			public Adapter caseIfcDefinedSymbol(IfcDefinedSymbol object) {
				return createIfcDefinedSymbolAdapter();
			}
			@Override
			public Adapter caseIfcDerivedProfileDef(IfcDerivedProfileDef object) {
				return createIfcDerivedProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcDerivedUnit(IfcDerivedUnit object) {
				return createIfcDerivedUnitAdapter();
			}
			@Override
			public Adapter caseIfcDerivedUnitElement(IfcDerivedUnitElement object) {
				return createIfcDerivedUnitElementAdapter();
			}
			@Override
			public Adapter caseIfcDiameterDimension(IfcDiameterDimension object) {
				return createIfcDiameterDimensionAdapter();
			}
			@Override
			public Adapter caseIfcDimensionCalloutRelationship(IfcDimensionCalloutRelationship object) {
				return createIfcDimensionCalloutRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcDimensionCurve(IfcDimensionCurve object) {
				return createIfcDimensionCurveAdapter();
			}
			@Override
			public Adapter caseIfcDimensionCurveDirectedCallout(IfcDimensionCurveDirectedCallout object) {
				return createIfcDimensionCurveDirectedCalloutAdapter();
			}
			@Override
			public Adapter caseIfcDimensionCurveTerminator(IfcDimensionCurveTerminator object) {
				return createIfcDimensionCurveTerminatorAdapter();
			}
			@Override
			public Adapter caseIfcDimensionPair(IfcDimensionPair object) {
				return createIfcDimensionPairAdapter();
			}
			@Override
			public Adapter caseIfcDimensionalExponents(IfcDimensionalExponents object) {
				return createIfcDimensionalExponentsAdapter();
			}
			@Override
			public Adapter caseIfcDirection(IfcDirection object) {
				return createIfcDirectionAdapter();
			}
			@Override
			public Adapter caseIfcDiscreteAccessory(IfcDiscreteAccessory object) {
				return createIfcDiscreteAccessoryAdapter();
			}
			@Override
			public Adapter caseIfcDiscreteAccessoryType(IfcDiscreteAccessoryType object) {
				return createIfcDiscreteAccessoryTypeAdapter();
			}
			@Override
			public Adapter caseIfcDistributionChamberElement(IfcDistributionChamberElement object) {
				return createIfcDistributionChamberElementAdapter();
			}
			@Override
			public Adapter caseIfcDistributionChamberElementType(IfcDistributionChamberElementType object) {
				return createIfcDistributionChamberElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcDistributionControlElement(IfcDistributionControlElement object) {
				return createIfcDistributionControlElementAdapter();
			}
			@Override
			public Adapter caseIfcDistributionControlElementType(IfcDistributionControlElementType object) {
				return createIfcDistributionControlElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcDistributionElement(IfcDistributionElement object) {
				return createIfcDistributionElementAdapter();
			}
			@Override
			public Adapter caseIfcDistributionElementType(IfcDistributionElementType object) {
				return createIfcDistributionElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcDistributionFlowElement(IfcDistributionFlowElement object) {
				return createIfcDistributionFlowElementAdapter();
			}
			@Override
			public Adapter caseIfcDistributionFlowElementType(IfcDistributionFlowElementType object) {
				return createIfcDistributionFlowElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcDistributionPort(IfcDistributionPort object) {
				return createIfcDistributionPortAdapter();
			}
			@Override
			public Adapter caseIfcDocumentElectronicFormat(IfcDocumentElectronicFormat object) {
				return createIfcDocumentElectronicFormatAdapter();
			}
			@Override
			public Adapter caseIfcDocumentInformation(IfcDocumentInformation object) {
				return createIfcDocumentInformationAdapter();
			}
			@Override
			public Adapter caseIfcDocumentInformationRelationship(IfcDocumentInformationRelationship object) {
				return createIfcDocumentInformationRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcDocumentReference(IfcDocumentReference object) {
				return createIfcDocumentReferenceAdapter();
			}
			@Override
			public Adapter caseIfcDoor(IfcDoor object) {
				return createIfcDoorAdapter();
			}
			@Override
			public Adapter caseIfcDoorLiningProperties(IfcDoorLiningProperties object) {
				return createIfcDoorLiningPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcDoorPanelProperties(IfcDoorPanelProperties object) {
				return createIfcDoorPanelPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcDoorStyle(IfcDoorStyle object) {
				return createIfcDoorStyleAdapter();
			}
			@Override
			public Adapter caseIfcDraughtingCallout(IfcDraughtingCallout object) {
				return createIfcDraughtingCalloutAdapter();
			}
			@Override
			public Adapter caseIfcDraughtingCalloutRelationship(IfcDraughtingCalloutRelationship object) {
				return createIfcDraughtingCalloutRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcDraughtingPreDefinedColour(IfcDraughtingPreDefinedColour object) {
				return createIfcDraughtingPreDefinedColourAdapter();
			}
			@Override
			public Adapter caseIfcDraughtingPreDefinedCurveFont(IfcDraughtingPreDefinedCurveFont object) {
				return createIfcDraughtingPreDefinedCurveFontAdapter();
			}
			@Override
			public Adapter caseIfcDraughtingPreDefinedTextFont(IfcDraughtingPreDefinedTextFont object) {
				return createIfcDraughtingPreDefinedTextFontAdapter();
			}
			@Override
			public Adapter caseIfcDuctFittingType(IfcDuctFittingType object) {
				return createIfcDuctFittingTypeAdapter();
			}
			@Override
			public Adapter caseIfcDuctSegmentType(IfcDuctSegmentType object) {
				return createIfcDuctSegmentTypeAdapter();
			}
			@Override
			public Adapter caseIfcDuctSilencerType(IfcDuctSilencerType object) {
				return createIfcDuctSilencerTypeAdapter();
			}
			@Override
			public Adapter caseIfcEdge(IfcEdge object) {
				return createIfcEdgeAdapter();
			}
			@Override
			public Adapter caseIfcEdgeCurve(IfcEdgeCurve object) {
				return createIfcEdgeCurveAdapter();
			}
			@Override
			public Adapter caseIfcEdgeFeature(IfcEdgeFeature object) {
				return createIfcEdgeFeatureAdapter();
			}
			@Override
			public Adapter caseIfcEdgeLoop(IfcEdgeLoop object) {
				return createIfcEdgeLoopAdapter();
			}
			@Override
			public Adapter caseIfcElectricApplianceType(IfcElectricApplianceType object) {
				return createIfcElectricApplianceTypeAdapter();
			}
			@Override
			public Adapter caseIfcElectricDistributionPoint(IfcElectricDistributionPoint object) {
				return createIfcElectricDistributionPointAdapter();
			}
			@Override
			public Adapter caseIfcElectricFlowStorageDeviceType(IfcElectricFlowStorageDeviceType object) {
				return createIfcElectricFlowStorageDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcElectricGeneratorType(IfcElectricGeneratorType object) {
				return createIfcElectricGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseIfcElectricHeaterType(IfcElectricHeaterType object) {
				return createIfcElectricHeaterTypeAdapter();
			}
			@Override
			public Adapter caseIfcElectricMotorType(IfcElectricMotorType object) {
				return createIfcElectricMotorTypeAdapter();
			}
			@Override
			public Adapter caseIfcElectricTimeControlType(IfcElectricTimeControlType object) {
				return createIfcElectricTimeControlTypeAdapter();
			}
			@Override
			public Adapter caseIfcElectricalBaseProperties(IfcElectricalBaseProperties object) {
				return createIfcElectricalBasePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcElectricalCircuit(IfcElectricalCircuit object) {
				return createIfcElectricalCircuitAdapter();
			}
			@Override
			public Adapter caseIfcElectricalElement(IfcElectricalElement object) {
				return createIfcElectricalElementAdapter();
			}
			@Override
			public Adapter caseIfcElement(IfcElement object) {
				return createIfcElementAdapter();
			}
			@Override
			public Adapter caseIfcElementAssembly(IfcElementAssembly object) {
				return createIfcElementAssemblyAdapter();
			}
			@Override
			public Adapter caseIfcElementComponent(IfcElementComponent object) {
				return createIfcElementComponentAdapter();
			}
			@Override
			public Adapter caseIfcElementComponentType(IfcElementComponentType object) {
				return createIfcElementComponentTypeAdapter();
			}
			@Override
			public Adapter caseIfcElementQuantity(IfcElementQuantity object) {
				return createIfcElementQuantityAdapter();
			}
			@Override
			public Adapter caseIfcElementType(IfcElementType object) {
				return createIfcElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcElementarySurface(IfcElementarySurface object) {
				return createIfcElementarySurfaceAdapter();
			}
			@Override
			public Adapter caseIfcEllipse(IfcEllipse object) {
				return createIfcEllipseAdapter();
			}
			@Override
			public Adapter caseIfcEllipseProfileDef(IfcEllipseProfileDef object) {
				return createIfcEllipseProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcEnergyConversionDevice(IfcEnergyConversionDevice object) {
				return createIfcEnergyConversionDeviceAdapter();
			}
			@Override
			public Adapter caseIfcEnergyConversionDeviceType(IfcEnergyConversionDeviceType object) {
				return createIfcEnergyConversionDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcEnergyProperties(IfcEnergyProperties object) {
				return createIfcEnergyPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcEnvironmentalImpactValue(IfcEnvironmentalImpactValue object) {
				return createIfcEnvironmentalImpactValueAdapter();
			}
			@Override
			public Adapter caseIfcEquipmentElement(IfcEquipmentElement object) {
				return createIfcEquipmentElementAdapter();
			}
			@Override
			public Adapter caseIfcEquipmentStandard(IfcEquipmentStandard object) {
				return createIfcEquipmentStandardAdapter();
			}
			@Override
			public Adapter caseIfcEvaporativeCoolerType(IfcEvaporativeCoolerType object) {
				return createIfcEvaporativeCoolerTypeAdapter();
			}
			@Override
			public Adapter caseIfcEvaporatorType(IfcEvaporatorType object) {
				return createIfcEvaporatorTypeAdapter();
			}
			@Override
			public Adapter caseIfcExtendedMaterialProperties(IfcExtendedMaterialProperties object) {
				return createIfcExtendedMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcExternalReference(IfcExternalReference object) {
				return createIfcExternalReferenceAdapter();
			}
			@Override
			public Adapter caseIfcExternallyDefinedHatchStyle(IfcExternallyDefinedHatchStyle object) {
				return createIfcExternallyDefinedHatchStyleAdapter();
			}
			@Override
			public Adapter caseIfcExternallyDefinedSurfaceStyle(IfcExternallyDefinedSurfaceStyle object) {
				return createIfcExternallyDefinedSurfaceStyleAdapter();
			}
			@Override
			public Adapter caseIfcExternallyDefinedSymbol(IfcExternallyDefinedSymbol object) {
				return createIfcExternallyDefinedSymbolAdapter();
			}
			@Override
			public Adapter caseIfcExternallyDefinedTextFont(IfcExternallyDefinedTextFont object) {
				return createIfcExternallyDefinedTextFontAdapter();
			}
			@Override
			public Adapter caseIfcExtrudedAreaSolid(IfcExtrudedAreaSolid object) {
				return createIfcExtrudedAreaSolidAdapter();
			}
			@Override
			public Adapter caseIfcFace(IfcFace object) {
				return createIfcFaceAdapter();
			}
			@Override
			public Adapter caseIfcFaceBasedSurfaceModel(IfcFaceBasedSurfaceModel object) {
				return createIfcFaceBasedSurfaceModelAdapter();
			}
			@Override
			public Adapter caseIfcFaceBound(IfcFaceBound object) {
				return createIfcFaceBoundAdapter();
			}
			@Override
			public Adapter caseIfcFaceOuterBound(IfcFaceOuterBound object) {
				return createIfcFaceOuterBoundAdapter();
			}
			@Override
			public Adapter caseIfcFaceSurface(IfcFaceSurface object) {
				return createIfcFaceSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcFacetedBrep(IfcFacetedBrep object) {
				return createIfcFacetedBrepAdapter();
			}
			@Override
			public Adapter caseIfcFacetedBrepWithVoids(IfcFacetedBrepWithVoids object) {
				return createIfcFacetedBrepWithVoidsAdapter();
			}
			@Override
			public Adapter caseIfcFailureConnectionCondition(IfcFailureConnectionCondition object) {
				return createIfcFailureConnectionConditionAdapter();
			}
			@Override
			public Adapter caseIfcFanType(IfcFanType object) {
				return createIfcFanTypeAdapter();
			}
			@Override
			public Adapter caseIfcFastener(IfcFastener object) {
				return createIfcFastenerAdapter();
			}
			@Override
			public Adapter caseIfcFastenerType(IfcFastenerType object) {
				return createIfcFastenerTypeAdapter();
			}
			@Override
			public Adapter caseIfcFeatureElement(IfcFeatureElement object) {
				return createIfcFeatureElementAdapter();
			}
			@Override
			public Adapter caseIfcFeatureElementAddition(IfcFeatureElementAddition object) {
				return createIfcFeatureElementAdditionAdapter();
			}
			@Override
			public Adapter caseIfcFeatureElementSubtraction(IfcFeatureElementSubtraction object) {
				return createIfcFeatureElementSubtractionAdapter();
			}
			@Override
			public Adapter caseIfcFillAreaStyle(IfcFillAreaStyle object) {
				return createIfcFillAreaStyleAdapter();
			}
			@Override
			public Adapter caseIfcFillAreaStyleHatching(IfcFillAreaStyleHatching object) {
				return createIfcFillAreaStyleHatchingAdapter();
			}
			@Override
			public Adapter caseIfcFillAreaStyleTileSymbolWithStyle(IfcFillAreaStyleTileSymbolWithStyle object) {
				return createIfcFillAreaStyleTileSymbolWithStyleAdapter();
			}
			@Override
			public Adapter caseIfcFillAreaStyleTiles(IfcFillAreaStyleTiles object) {
				return createIfcFillAreaStyleTilesAdapter();
			}
			@Override
			public Adapter caseIfcFilterType(IfcFilterType object) {
				return createIfcFilterTypeAdapter();
			}
			@Override
			public Adapter caseIfcFireSuppressionTerminalType(IfcFireSuppressionTerminalType object) {
				return createIfcFireSuppressionTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowController(IfcFlowController object) {
				return createIfcFlowControllerAdapter();
			}
			@Override
			public Adapter caseIfcFlowControllerType(IfcFlowControllerType object) {
				return createIfcFlowControllerTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowFitting(IfcFlowFitting object) {
				return createIfcFlowFittingAdapter();
			}
			@Override
			public Adapter caseIfcFlowFittingType(IfcFlowFittingType object) {
				return createIfcFlowFittingTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowInstrumentType(IfcFlowInstrumentType object) {
				return createIfcFlowInstrumentTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowMeterType(IfcFlowMeterType object) {
				return createIfcFlowMeterTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowMovingDevice(IfcFlowMovingDevice object) {
				return createIfcFlowMovingDeviceAdapter();
			}
			@Override
			public Adapter caseIfcFlowMovingDeviceType(IfcFlowMovingDeviceType object) {
				return createIfcFlowMovingDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowSegment(IfcFlowSegment object) {
				return createIfcFlowSegmentAdapter();
			}
			@Override
			public Adapter caseIfcFlowSegmentType(IfcFlowSegmentType object) {
				return createIfcFlowSegmentTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowStorageDevice(IfcFlowStorageDevice object) {
				return createIfcFlowStorageDeviceAdapter();
			}
			@Override
			public Adapter caseIfcFlowStorageDeviceType(IfcFlowStorageDeviceType object) {
				return createIfcFlowStorageDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowTerminal(IfcFlowTerminal object) {
				return createIfcFlowTerminalAdapter();
			}
			@Override
			public Adapter caseIfcFlowTerminalType(IfcFlowTerminalType object) {
				return createIfcFlowTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcFlowTreatmentDevice(IfcFlowTreatmentDevice object) {
				return createIfcFlowTreatmentDeviceAdapter();
			}
			@Override
			public Adapter caseIfcFlowTreatmentDeviceType(IfcFlowTreatmentDeviceType object) {
				return createIfcFlowTreatmentDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcFluidFlowProperties(IfcFluidFlowProperties object) {
				return createIfcFluidFlowPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcFooting(IfcFooting object) {
				return createIfcFootingAdapter();
			}
			@Override
			public Adapter caseIfcFuelProperties(IfcFuelProperties object) {
				return createIfcFuelPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcFurnishingElement(IfcFurnishingElement object) {
				return createIfcFurnishingElementAdapter();
			}
			@Override
			public Adapter caseIfcFurnishingElementType(IfcFurnishingElementType object) {
				return createIfcFurnishingElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcFurnitureStandard(IfcFurnitureStandard object) {
				return createIfcFurnitureStandardAdapter();
			}
			@Override
			public Adapter caseIfcFurnitureType(IfcFurnitureType object) {
				return createIfcFurnitureTypeAdapter();
			}
			@Override
			public Adapter caseIfcGasTerminalType(IfcGasTerminalType object) {
				return createIfcGasTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcGeneralMaterialProperties(IfcGeneralMaterialProperties object) {
				return createIfcGeneralMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcGeneralProfileProperties(IfcGeneralProfileProperties object) {
				return createIfcGeneralProfilePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcGeometricCurveSet(IfcGeometricCurveSet object) {
				return createIfcGeometricCurveSetAdapter();
			}
			@Override
			public Adapter caseIfcGeometricRepresentationContext(IfcGeometricRepresentationContext object) {
				return createIfcGeometricRepresentationContextAdapter();
			}
			@Override
			public Adapter caseIfcGeometricRepresentationItem(IfcGeometricRepresentationItem object) {
				return createIfcGeometricRepresentationItemAdapter();
			}
			@Override
			public Adapter caseIfcGeometricRepresentationSubContext(IfcGeometricRepresentationSubContext object) {
				return createIfcGeometricRepresentationSubContextAdapter();
			}
			@Override
			public Adapter caseIfcGeometricSet(IfcGeometricSet object) {
				return createIfcGeometricSetAdapter();
			}
			@Override
			public Adapter caseIfcGrid(IfcGrid object) {
				return createIfcGridAdapter();
			}
			@Override
			public Adapter caseIfcGridAxis(IfcGridAxis object) {
				return createIfcGridAxisAdapter();
			}
			@Override
			public Adapter caseIfcGridPlacement(IfcGridPlacement object) {
				return createIfcGridPlacementAdapter();
			}
			@Override
			public Adapter caseIfcGroup(IfcGroup object) {
				return createIfcGroupAdapter();
			}
			@Override
			public Adapter caseIfcHalfSpaceSolid(IfcHalfSpaceSolid object) {
				return createIfcHalfSpaceSolidAdapter();
			}
			@Override
			public Adapter caseIfcHeatExchangerType(IfcHeatExchangerType object) {
				return createIfcHeatExchangerTypeAdapter();
			}
			@Override
			public Adapter caseIfcHumidifierType(IfcHumidifierType object) {
				return createIfcHumidifierTypeAdapter();
			}
			@Override
			public Adapter caseIfcHygroscopicMaterialProperties(IfcHygroscopicMaterialProperties object) {
				return createIfcHygroscopicMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcIShapeProfileDef(IfcIShapeProfileDef object) {
				return createIfcIShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcImageTexture(IfcImageTexture object) {
				return createIfcImageTextureAdapter();
			}
			@Override
			public Adapter caseIfcInventory(IfcInventory object) {
				return createIfcInventoryAdapter();
			}
			@Override
			public Adapter caseIfcIrregularTimeSeries(IfcIrregularTimeSeries object) {
				return createIfcIrregularTimeSeriesAdapter();
			}
			@Override
			public Adapter caseIfcIrregularTimeSeriesValue(IfcIrregularTimeSeriesValue object) {
				return createIfcIrregularTimeSeriesValueAdapter();
			}
			@Override
			public Adapter caseIfcJunctionBoxType(IfcJunctionBoxType object) {
				return createIfcJunctionBoxTypeAdapter();
			}
			@Override
			public Adapter caseIfcLShapeProfileDef(IfcLShapeProfileDef object) {
				return createIfcLShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcLaborResource(IfcLaborResource object) {
				return createIfcLaborResourceAdapter();
			}
			@Override
			public Adapter caseIfcLampType(IfcLampType object) {
				return createIfcLampTypeAdapter();
			}
			@Override
			public Adapter caseIfcLibraryInformation(IfcLibraryInformation object) {
				return createIfcLibraryInformationAdapter();
			}
			@Override
			public Adapter caseIfcLibraryReference(IfcLibraryReference object) {
				return createIfcLibraryReferenceAdapter();
			}
			@Override
			public Adapter caseIfcLightDistributionData(IfcLightDistributionData object) {
				return createIfcLightDistributionDataAdapter();
			}
			@Override
			public Adapter caseIfcLightFixtureType(IfcLightFixtureType object) {
				return createIfcLightFixtureTypeAdapter();
			}
			@Override
			public Adapter caseIfcLightIntensityDistribution(IfcLightIntensityDistribution object) {
				return createIfcLightIntensityDistributionAdapter();
			}
			@Override
			public Adapter caseIfcLightSource(IfcLightSource object) {
				return createIfcLightSourceAdapter();
			}
			@Override
			public Adapter caseIfcLightSourceAmbient(IfcLightSourceAmbient object) {
				return createIfcLightSourceAmbientAdapter();
			}
			@Override
			public Adapter caseIfcLightSourceDirectional(IfcLightSourceDirectional object) {
				return createIfcLightSourceDirectionalAdapter();
			}
			@Override
			public Adapter caseIfcLightSourceGoniometric(IfcLightSourceGoniometric object) {
				return createIfcLightSourceGoniometricAdapter();
			}
			@Override
			public Adapter caseIfcLightSourcePositional(IfcLightSourcePositional object) {
				return createIfcLightSourcePositionalAdapter();
			}
			@Override
			public Adapter caseIfcLightSourceSpot(IfcLightSourceSpot object) {
				return createIfcLightSourceSpotAdapter();
			}
			@Override
			public Adapter caseIfcLine(IfcLine object) {
				return createIfcLineAdapter();
			}
			@Override
			public Adapter caseIfcLinearDimension(IfcLinearDimension object) {
				return createIfcLinearDimensionAdapter();
			}
			@Override
			public Adapter caseIfcLocalPlacement(IfcLocalPlacement object) {
				return createIfcLocalPlacementAdapter();
			}
			@Override
			public Adapter caseIfcLocalTime(IfcLocalTime object) {
				return createIfcLocalTimeAdapter();
			}
			@Override
			public Adapter caseIfcLoop(IfcLoop object) {
				return createIfcLoopAdapter();
			}
			@Override
			public Adapter caseIfcManifoldSolidBrep(IfcManifoldSolidBrep object) {
				return createIfcManifoldSolidBrepAdapter();
			}
			@Override
			public Adapter caseIfcMappedItem(IfcMappedItem object) {
				return createIfcMappedItemAdapter();
			}
			@Override
			public Adapter caseIfcMaterial(IfcMaterial object) {
				return createIfcMaterialAdapter();
			}
			@Override
			public Adapter caseIfcMaterialClassificationRelationship(IfcMaterialClassificationRelationship object) {
				return createIfcMaterialClassificationRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcMaterialDefinitionRepresentation(IfcMaterialDefinitionRepresentation object) {
				return createIfcMaterialDefinitionRepresentationAdapter();
			}
			@Override
			public Adapter caseIfcMaterialLayer(IfcMaterialLayer object) {
				return createIfcMaterialLayerAdapter();
			}
			@Override
			public Adapter caseIfcMaterialLayerSet(IfcMaterialLayerSet object) {
				return createIfcMaterialLayerSetAdapter();
			}
			@Override
			public Adapter caseIfcMaterialLayerSetUsage(IfcMaterialLayerSetUsage object) {
				return createIfcMaterialLayerSetUsageAdapter();
			}
			@Override
			public Adapter caseIfcMaterialList(IfcMaterialList object) {
				return createIfcMaterialListAdapter();
			}
			@Override
			public Adapter caseIfcMaterialProperties(IfcMaterialProperties object) {
				return createIfcMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcMeasureWithUnit(IfcMeasureWithUnit object) {
				return createIfcMeasureWithUnitAdapter();
			}
			@Override
			public Adapter caseIfcMechanicalConcreteMaterialProperties(IfcMechanicalConcreteMaterialProperties object) {
				return createIfcMechanicalConcreteMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcMechanicalFastener(IfcMechanicalFastener object) {
				return createIfcMechanicalFastenerAdapter();
			}
			@Override
			public Adapter caseIfcMechanicalFastenerType(IfcMechanicalFastenerType object) {
				return createIfcMechanicalFastenerTypeAdapter();
			}
			@Override
			public Adapter caseIfcMechanicalMaterialProperties(IfcMechanicalMaterialProperties object) {
				return createIfcMechanicalMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcMechanicalSteelMaterialProperties(IfcMechanicalSteelMaterialProperties object) {
				return createIfcMechanicalSteelMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcMember(IfcMember object) {
				return createIfcMemberAdapter();
			}
			@Override
			public Adapter caseIfcMemberType(IfcMemberType object) {
				return createIfcMemberTypeAdapter();
			}
			@Override
			public Adapter caseIfcMetric(IfcMetric object) {
				return createIfcMetricAdapter();
			}
			@Override
			public Adapter caseIfcMonetaryUnit(IfcMonetaryUnit object) {
				return createIfcMonetaryUnitAdapter();
			}
			@Override
			public Adapter caseIfcMotorConnectionType(IfcMotorConnectionType object) {
				return createIfcMotorConnectionTypeAdapter();
			}
			@Override
			public Adapter caseIfcMove(IfcMove object) {
				return createIfcMoveAdapter();
			}
			@Override
			public Adapter caseIfcNamedUnit(IfcNamedUnit object) {
				return createIfcNamedUnitAdapter();
			}
			@Override
			public Adapter caseIfcObject(IfcObject object) {
				return createIfcObjectAdapter();
			}
			@Override
			public Adapter caseIfcObjectDefinition(IfcObjectDefinition object) {
				return createIfcObjectDefinitionAdapter();
			}
			@Override
			public Adapter caseIfcObjectPlacement(IfcObjectPlacement object) {
				return createIfcObjectPlacementAdapter();
			}
			@Override
			public Adapter caseIfcObjective(IfcObjective object) {
				return createIfcObjectiveAdapter();
			}
			@Override
			public Adapter caseIfcOccupant(IfcOccupant object) {
				return createIfcOccupantAdapter();
			}
			@Override
			public Adapter caseIfcOffsetCurve2D(IfcOffsetCurve2D object) {
				return createIfcOffsetCurve2DAdapter();
			}
			@Override
			public Adapter caseIfcOffsetCurve3D(IfcOffsetCurve3D object) {
				return createIfcOffsetCurve3DAdapter();
			}
			@Override
			public Adapter caseIfcOneDirectionRepeatFactor(IfcOneDirectionRepeatFactor object) {
				return createIfcOneDirectionRepeatFactorAdapter();
			}
			@Override
			public Adapter caseIfcOpenShell(IfcOpenShell object) {
				return createIfcOpenShellAdapter();
			}
			@Override
			public Adapter caseIfcOpeningElement(IfcOpeningElement object) {
				return createIfcOpeningElementAdapter();
			}
			@Override
			public Adapter caseIfcOpticalMaterialProperties(IfcOpticalMaterialProperties object) {
				return createIfcOpticalMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcOrderAction(IfcOrderAction object) {
				return createIfcOrderActionAdapter();
			}
			@Override
			public Adapter caseIfcOrganization(IfcOrganization object) {
				return createIfcOrganizationAdapter();
			}
			@Override
			public Adapter caseIfcOrganizationRelationship(IfcOrganizationRelationship object) {
				return createIfcOrganizationRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcOrientedEdge(IfcOrientedEdge object) {
				return createIfcOrientedEdgeAdapter();
			}
			@Override
			public Adapter caseIfcOutletType(IfcOutletType object) {
				return createIfcOutletTypeAdapter();
			}
			@Override
			public Adapter caseIfcOwnerHistory(IfcOwnerHistory object) {
				return createIfcOwnerHistoryAdapter();
			}
			@Override
			public Adapter caseIfcParameterizedProfileDef(IfcParameterizedProfileDef object) {
				return createIfcParameterizedProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcPath(IfcPath object) {
				return createIfcPathAdapter();
			}
			@Override
			public Adapter caseIfcPerformanceHistory(IfcPerformanceHistory object) {
				return createIfcPerformanceHistoryAdapter();
			}
			@Override
			public Adapter caseIfcPermeableCoveringProperties(IfcPermeableCoveringProperties object) {
				return createIfcPermeableCoveringPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcPermit(IfcPermit object) {
				return createIfcPermitAdapter();
			}
			@Override
			public Adapter caseIfcPerson(IfcPerson object) {
				return createIfcPersonAdapter();
			}
			@Override
			public Adapter caseIfcPersonAndOrganization(IfcPersonAndOrganization object) {
				return createIfcPersonAndOrganizationAdapter();
			}
			@Override
			public Adapter caseIfcPhysicalComplexQuantity(IfcPhysicalComplexQuantity object) {
				return createIfcPhysicalComplexQuantityAdapter();
			}
			@Override
			public Adapter caseIfcPhysicalQuantity(IfcPhysicalQuantity object) {
				return createIfcPhysicalQuantityAdapter();
			}
			@Override
			public Adapter caseIfcPhysicalSimpleQuantity(IfcPhysicalSimpleQuantity object) {
				return createIfcPhysicalSimpleQuantityAdapter();
			}
			@Override
			public Adapter caseIfcPile(IfcPile object) {
				return createIfcPileAdapter();
			}
			@Override
			public Adapter caseIfcPipeFittingType(IfcPipeFittingType object) {
				return createIfcPipeFittingTypeAdapter();
			}
			@Override
			public Adapter caseIfcPipeSegmentType(IfcPipeSegmentType object) {
				return createIfcPipeSegmentTypeAdapter();
			}
			@Override
			public Adapter caseIfcPixelTexture(IfcPixelTexture object) {
				return createIfcPixelTextureAdapter();
			}
			@Override
			public Adapter caseIfcPlacement(IfcPlacement object) {
				return createIfcPlacementAdapter();
			}
			@Override
			public Adapter caseIfcPlanarBox(IfcPlanarBox object) {
				return createIfcPlanarBoxAdapter();
			}
			@Override
			public Adapter caseIfcPlanarExtent(IfcPlanarExtent object) {
				return createIfcPlanarExtentAdapter();
			}
			@Override
			public Adapter caseIfcPlane(IfcPlane object) {
				return createIfcPlaneAdapter();
			}
			@Override
			public Adapter caseIfcPlate(IfcPlate object) {
				return createIfcPlateAdapter();
			}
			@Override
			public Adapter caseIfcPlateType(IfcPlateType object) {
				return createIfcPlateTypeAdapter();
			}
			@Override
			public Adapter caseIfcPoint(IfcPoint object) {
				return createIfcPointAdapter();
			}
			@Override
			public Adapter caseIfcPointOnCurve(IfcPointOnCurve object) {
				return createIfcPointOnCurveAdapter();
			}
			@Override
			public Adapter caseIfcPointOnSurface(IfcPointOnSurface object) {
				return createIfcPointOnSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcPolyLoop(IfcPolyLoop object) {
				return createIfcPolyLoopAdapter();
			}
			@Override
			public Adapter caseIfcPolygonalBoundedHalfSpace(IfcPolygonalBoundedHalfSpace object) {
				return createIfcPolygonalBoundedHalfSpaceAdapter();
			}
			@Override
			public Adapter caseIfcPolyline(IfcPolyline object) {
				return createIfcPolylineAdapter();
			}
			@Override
			public Adapter caseIfcPort(IfcPort object) {
				return createIfcPortAdapter();
			}
			@Override
			public Adapter caseIfcPostalAddress(IfcPostalAddress object) {
				return createIfcPostalAddressAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedColour(IfcPreDefinedColour object) {
				return createIfcPreDefinedColourAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedCurveFont(IfcPreDefinedCurveFont object) {
				return createIfcPreDefinedCurveFontAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedDimensionSymbol(IfcPreDefinedDimensionSymbol object) {
				return createIfcPreDefinedDimensionSymbolAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedItem(IfcPreDefinedItem object) {
				return createIfcPreDefinedItemAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedPointMarkerSymbol(IfcPreDefinedPointMarkerSymbol object) {
				return createIfcPreDefinedPointMarkerSymbolAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedSymbol(IfcPreDefinedSymbol object) {
				return createIfcPreDefinedSymbolAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedTerminatorSymbol(IfcPreDefinedTerminatorSymbol object) {
				return createIfcPreDefinedTerminatorSymbolAdapter();
			}
			@Override
			public Adapter caseIfcPreDefinedTextFont(IfcPreDefinedTextFont object) {
				return createIfcPreDefinedTextFontAdapter();
			}
			@Override
			public Adapter caseIfcPresentationLayerAssignment(IfcPresentationLayerAssignment object) {
				return createIfcPresentationLayerAssignmentAdapter();
			}
			@Override
			public Adapter caseIfcPresentationLayerWithStyle(IfcPresentationLayerWithStyle object) {
				return createIfcPresentationLayerWithStyleAdapter();
			}
			@Override
			public Adapter caseIfcPresentationStyle(IfcPresentationStyle object) {
				return createIfcPresentationStyleAdapter();
			}
			@Override
			public Adapter caseIfcPresentationStyleAssignment(IfcPresentationStyleAssignment object) {
				return createIfcPresentationStyleAssignmentAdapter();
			}
			@Override
			public Adapter caseIfcProcedure(IfcProcedure object) {
				return createIfcProcedureAdapter();
			}
			@Override
			public Adapter caseIfcProcess(IfcProcess object) {
				return createIfcProcessAdapter();
			}
			@Override
			public Adapter caseIfcProduct(IfcProduct object) {
				return createIfcProductAdapter();
			}
			@Override
			public Adapter caseIfcProductDefinitionShape(IfcProductDefinitionShape object) {
				return createIfcProductDefinitionShapeAdapter();
			}
			@Override
			public Adapter caseIfcProductRepresentation(IfcProductRepresentation object) {
				return createIfcProductRepresentationAdapter();
			}
			@Override
			public Adapter caseIfcProductsOfCombustionProperties(IfcProductsOfCombustionProperties object) {
				return createIfcProductsOfCombustionPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcProfileDef(IfcProfileDef object) {
				return createIfcProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcProfileProperties(IfcProfileProperties object) {
				return createIfcProfilePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcProject(IfcProject object) {
				return createIfcProjectAdapter();
			}
			@Override
			public Adapter caseIfcProjectOrder(IfcProjectOrder object) {
				return createIfcProjectOrderAdapter();
			}
			@Override
			public Adapter caseIfcProjectOrderRecord(IfcProjectOrderRecord object) {
				return createIfcProjectOrderRecordAdapter();
			}
			@Override
			public Adapter caseIfcProjectionCurve(IfcProjectionCurve object) {
				return createIfcProjectionCurveAdapter();
			}
			@Override
			public Adapter caseIfcProjectionElement(IfcProjectionElement object) {
				return createIfcProjectionElementAdapter();
			}
			@Override
			public Adapter caseIfcProperty(IfcProperty object) {
				return createIfcPropertyAdapter();
			}
			@Override
			public Adapter caseIfcPropertyBoundedValue(IfcPropertyBoundedValue object) {
				return createIfcPropertyBoundedValueAdapter();
			}
			@Override
			public Adapter caseIfcPropertyConstraintRelationship(IfcPropertyConstraintRelationship object) {
				return createIfcPropertyConstraintRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcPropertyDefinition(IfcPropertyDefinition object) {
				return createIfcPropertyDefinitionAdapter();
			}
			@Override
			public Adapter caseIfcPropertyDependencyRelationship(IfcPropertyDependencyRelationship object) {
				return createIfcPropertyDependencyRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcPropertyEnumeratedValue(IfcPropertyEnumeratedValue object) {
				return createIfcPropertyEnumeratedValueAdapter();
			}
			@Override
			public Adapter caseIfcPropertyEnumeration(IfcPropertyEnumeration object) {
				return createIfcPropertyEnumerationAdapter();
			}
			@Override
			public Adapter caseIfcPropertyListValue(IfcPropertyListValue object) {
				return createIfcPropertyListValueAdapter();
			}
			@Override
			public Adapter caseIfcPropertyReferenceValue(IfcPropertyReferenceValue object) {
				return createIfcPropertyReferenceValueAdapter();
			}
			@Override
			public Adapter caseIfcPropertySet(IfcPropertySet object) {
				return createIfcPropertySetAdapter();
			}
			@Override
			public Adapter caseIfcPropertySetDefinition(IfcPropertySetDefinition object) {
				return createIfcPropertySetDefinitionAdapter();
			}
			@Override
			public Adapter caseIfcPropertySingleValue(IfcPropertySingleValue object) {
				return createIfcPropertySingleValueAdapter();
			}
			@Override
			public Adapter caseIfcPropertyTableValue(IfcPropertyTableValue object) {
				return createIfcPropertyTableValueAdapter();
			}
			@Override
			public Adapter caseIfcProtectiveDeviceType(IfcProtectiveDeviceType object) {
				return createIfcProtectiveDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcProxy(IfcProxy object) {
				return createIfcProxyAdapter();
			}
			@Override
			public Adapter caseIfcPumpType(IfcPumpType object) {
				return createIfcPumpTypeAdapter();
			}
			@Override
			public Adapter caseIfcQuantityArea(IfcQuantityArea object) {
				return createIfcQuantityAreaAdapter();
			}
			@Override
			public Adapter caseIfcQuantityCount(IfcQuantityCount object) {
				return createIfcQuantityCountAdapter();
			}
			@Override
			public Adapter caseIfcQuantityLength(IfcQuantityLength object) {
				return createIfcQuantityLengthAdapter();
			}
			@Override
			public Adapter caseIfcQuantityTime(IfcQuantityTime object) {
				return createIfcQuantityTimeAdapter();
			}
			@Override
			public Adapter caseIfcQuantityVolume(IfcQuantityVolume object) {
				return createIfcQuantityVolumeAdapter();
			}
			@Override
			public Adapter caseIfcQuantityWeight(IfcQuantityWeight object) {
				return createIfcQuantityWeightAdapter();
			}
			@Override
			public Adapter caseIfcRadiusDimension(IfcRadiusDimension object) {
				return createIfcRadiusDimensionAdapter();
			}
			@Override
			public Adapter caseIfcRailing(IfcRailing object) {
				return createIfcRailingAdapter();
			}
			@Override
			public Adapter caseIfcRailingType(IfcRailingType object) {
				return createIfcRailingTypeAdapter();
			}
			@Override
			public Adapter caseIfcRamp(IfcRamp object) {
				return createIfcRampAdapter();
			}
			@Override
			public Adapter caseIfcRampFlight(IfcRampFlight object) {
				return createIfcRampFlightAdapter();
			}
			@Override
			public Adapter caseIfcRampFlightType(IfcRampFlightType object) {
				return createIfcRampFlightTypeAdapter();
			}
			@Override
			public Adapter caseIfcRationalBezierCurve(IfcRationalBezierCurve object) {
				return createIfcRationalBezierCurveAdapter();
			}
			@Override
			public Adapter caseIfcRectangleHollowProfileDef(IfcRectangleHollowProfileDef object) {
				return createIfcRectangleHollowProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcRectangleProfileDef(IfcRectangleProfileDef object) {
				return createIfcRectangleProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcRectangularPyramid(IfcRectangularPyramid object) {
				return createIfcRectangularPyramidAdapter();
			}
			@Override
			public Adapter caseIfcRectangularTrimmedSurface(IfcRectangularTrimmedSurface object) {
				return createIfcRectangularTrimmedSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcReferencesValueDocument(IfcReferencesValueDocument object) {
				return createIfcReferencesValueDocumentAdapter();
			}
			@Override
			public Adapter caseIfcRegularTimeSeries(IfcRegularTimeSeries object) {
				return createIfcRegularTimeSeriesAdapter();
			}
			@Override
			public Adapter caseIfcReinforcementBarProperties(IfcReinforcementBarProperties object) {
				return createIfcReinforcementBarPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcReinforcementDefinitionProperties(IfcReinforcementDefinitionProperties object) {
				return createIfcReinforcementDefinitionPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcReinforcingBar(IfcReinforcingBar object) {
				return createIfcReinforcingBarAdapter();
			}
			@Override
			public Adapter caseIfcReinforcingElement(IfcReinforcingElement object) {
				return createIfcReinforcingElementAdapter();
			}
			@Override
			public Adapter caseIfcReinforcingMesh(IfcReinforcingMesh object) {
				return createIfcReinforcingMeshAdapter();
			}
			@Override
			public Adapter caseIfcRelAggregates(IfcRelAggregates object) {
				return createIfcRelAggregatesAdapter();
			}
			@Override
			public Adapter caseIfcRelAssigns(IfcRelAssigns object) {
				return createIfcRelAssignsAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsTasks(IfcRelAssignsTasks object) {
				return createIfcRelAssignsTasksAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToActor(IfcRelAssignsToActor object) {
				return createIfcRelAssignsToActorAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToControl(IfcRelAssignsToControl object) {
				return createIfcRelAssignsToControlAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToGroup(IfcRelAssignsToGroup object) {
				return createIfcRelAssignsToGroupAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToProcess(IfcRelAssignsToProcess object) {
				return createIfcRelAssignsToProcessAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToProduct(IfcRelAssignsToProduct object) {
				return createIfcRelAssignsToProductAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToProjectOrder(IfcRelAssignsToProjectOrder object) {
				return createIfcRelAssignsToProjectOrderAdapter();
			}
			@Override
			public Adapter caseIfcRelAssignsToResource(IfcRelAssignsToResource object) {
				return createIfcRelAssignsToResourceAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociates(IfcRelAssociates object) {
				return createIfcRelAssociatesAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesAppliedValue(IfcRelAssociatesAppliedValue object) {
				return createIfcRelAssociatesAppliedValueAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesApproval(IfcRelAssociatesApproval object) {
				return createIfcRelAssociatesApprovalAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesClassification(IfcRelAssociatesClassification object) {
				return createIfcRelAssociatesClassificationAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesConstraint(IfcRelAssociatesConstraint object) {
				return createIfcRelAssociatesConstraintAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesDocument(IfcRelAssociatesDocument object) {
				return createIfcRelAssociatesDocumentAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesLibrary(IfcRelAssociatesLibrary object) {
				return createIfcRelAssociatesLibraryAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesMaterial(IfcRelAssociatesMaterial object) {
				return createIfcRelAssociatesMaterialAdapter();
			}
			@Override
			public Adapter caseIfcRelAssociatesProfileProperties(IfcRelAssociatesProfileProperties object) {
				return createIfcRelAssociatesProfilePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcRelConnects(IfcRelConnects object) {
				return createIfcRelConnectsAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsElements(IfcRelConnectsElements object) {
				return createIfcRelConnectsElementsAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsPathElements(IfcRelConnectsPathElements object) {
				return createIfcRelConnectsPathElementsAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsPortToElement(IfcRelConnectsPortToElement object) {
				return createIfcRelConnectsPortToElementAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsPorts(IfcRelConnectsPorts object) {
				return createIfcRelConnectsPortsAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsStructuralActivity(IfcRelConnectsStructuralActivity object) {
				return createIfcRelConnectsStructuralActivityAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsStructuralElement(IfcRelConnectsStructuralElement object) {
				return createIfcRelConnectsStructuralElementAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsStructuralMember(IfcRelConnectsStructuralMember object) {
				return createIfcRelConnectsStructuralMemberAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsWithEccentricity(IfcRelConnectsWithEccentricity object) {
				return createIfcRelConnectsWithEccentricityAdapter();
			}
			@Override
			public Adapter caseIfcRelConnectsWithRealizingElements(IfcRelConnectsWithRealizingElements object) {
				return createIfcRelConnectsWithRealizingElementsAdapter();
			}
			@Override
			public Adapter caseIfcRelContainedInSpatialStructure(IfcRelContainedInSpatialStructure object) {
				return createIfcRelContainedInSpatialStructureAdapter();
			}
			@Override
			public Adapter caseIfcRelCoversBldgElements(IfcRelCoversBldgElements object) {
				return createIfcRelCoversBldgElementsAdapter();
			}
			@Override
			public Adapter caseIfcRelCoversSpaces(IfcRelCoversSpaces object) {
				return createIfcRelCoversSpacesAdapter();
			}
			@Override
			public Adapter caseIfcRelDecomposes(IfcRelDecomposes object) {
				return createIfcRelDecomposesAdapter();
			}
			@Override
			public Adapter caseIfcRelDefines(IfcRelDefines object) {
				return createIfcRelDefinesAdapter();
			}
			@Override
			public Adapter caseIfcRelDefinesByProperties(IfcRelDefinesByProperties object) {
				return createIfcRelDefinesByPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcRelDefinesByType(IfcRelDefinesByType object) {
				return createIfcRelDefinesByTypeAdapter();
			}
			@Override
			public Adapter caseIfcRelFillsElement(IfcRelFillsElement object) {
				return createIfcRelFillsElementAdapter();
			}
			@Override
			public Adapter caseIfcRelFlowControlElements(IfcRelFlowControlElements object) {
				return createIfcRelFlowControlElementsAdapter();
			}
			@Override
			public Adapter caseIfcRelInteractionRequirements(IfcRelInteractionRequirements object) {
				return createIfcRelInteractionRequirementsAdapter();
			}
			@Override
			public Adapter caseIfcRelNests(IfcRelNests object) {
				return createIfcRelNestsAdapter();
			}
			@Override
			public Adapter caseIfcRelOccupiesSpaces(IfcRelOccupiesSpaces object) {
				return createIfcRelOccupiesSpacesAdapter();
			}
			@Override
			public Adapter caseIfcRelOverridesProperties(IfcRelOverridesProperties object) {
				return createIfcRelOverridesPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcRelProjectsElement(IfcRelProjectsElement object) {
				return createIfcRelProjectsElementAdapter();
			}
			@Override
			public Adapter caseIfcRelReferencedInSpatialStructure(IfcRelReferencedInSpatialStructure object) {
				return createIfcRelReferencedInSpatialStructureAdapter();
			}
			@Override
			public Adapter caseIfcRelSchedulesCostItems(IfcRelSchedulesCostItems object) {
				return createIfcRelSchedulesCostItemsAdapter();
			}
			@Override
			public Adapter caseIfcRelSequence(IfcRelSequence object) {
				return createIfcRelSequenceAdapter();
			}
			@Override
			public Adapter caseIfcRelServicesBuildings(IfcRelServicesBuildings object) {
				return createIfcRelServicesBuildingsAdapter();
			}
			@Override
			public Adapter caseIfcRelSpaceBoundary(IfcRelSpaceBoundary object) {
				return createIfcRelSpaceBoundaryAdapter();
			}
			@Override
			public Adapter caseIfcRelVoidsElement(IfcRelVoidsElement object) {
				return createIfcRelVoidsElementAdapter();
			}
			@Override
			public Adapter caseIfcRelationship(IfcRelationship object) {
				return createIfcRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcRelaxation(IfcRelaxation object) {
				return createIfcRelaxationAdapter();
			}
			@Override
			public Adapter caseIfcRepresentation(IfcRepresentation object) {
				return createIfcRepresentationAdapter();
			}
			@Override
			public Adapter caseIfcRepresentationContext(IfcRepresentationContext object) {
				return createIfcRepresentationContextAdapter();
			}
			@Override
			public Adapter caseIfcRepresentationItem(IfcRepresentationItem object) {
				return createIfcRepresentationItemAdapter();
			}
			@Override
			public Adapter caseIfcRepresentationMap(IfcRepresentationMap object) {
				return createIfcRepresentationMapAdapter();
			}
			@Override
			public Adapter caseIfcResource(IfcResource object) {
				return createIfcResourceAdapter();
			}
			@Override
			public Adapter caseIfcRevolvedAreaSolid(IfcRevolvedAreaSolid object) {
				return createIfcRevolvedAreaSolidAdapter();
			}
			@Override
			public Adapter caseIfcRibPlateProfileProperties(IfcRibPlateProfileProperties object) {
				return createIfcRibPlateProfilePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcRightCircularCone(IfcRightCircularCone object) {
				return createIfcRightCircularConeAdapter();
			}
			@Override
			public Adapter caseIfcRightCircularCylinder(IfcRightCircularCylinder object) {
				return createIfcRightCircularCylinderAdapter();
			}
			@Override
			public Adapter caseIfcRoof(IfcRoof object) {
				return createIfcRoofAdapter();
			}
			@Override
			public Adapter caseIfcRoot(IfcRoot object) {
				return createIfcRootAdapter();
			}
			@Override
			public Adapter caseIfcRoundedEdgeFeature(IfcRoundedEdgeFeature object) {
				return createIfcRoundedEdgeFeatureAdapter();
			}
			@Override
			public Adapter caseIfcRoundedRectangleProfileDef(IfcRoundedRectangleProfileDef object) {
				return createIfcRoundedRectangleProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcSIUnit(IfcSIUnit object) {
				return createIfcSIUnitAdapter();
			}
			@Override
			public Adapter caseIfcSanitaryTerminalType(IfcSanitaryTerminalType object) {
				return createIfcSanitaryTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcScheduleTimeControl(IfcScheduleTimeControl object) {
				return createIfcScheduleTimeControlAdapter();
			}
			@Override
			public Adapter caseIfcSectionProperties(IfcSectionProperties object) {
				return createIfcSectionPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcSectionReinforcementProperties(IfcSectionReinforcementProperties object) {
				return createIfcSectionReinforcementPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcSectionedSpine(IfcSectionedSpine object) {
				return createIfcSectionedSpineAdapter();
			}
			@Override
			public Adapter caseIfcSensorType(IfcSensorType object) {
				return createIfcSensorTypeAdapter();
			}
			@Override
			public Adapter caseIfcServiceLife(IfcServiceLife object) {
				return createIfcServiceLifeAdapter();
			}
			@Override
			public Adapter caseIfcServiceLifeFactor(IfcServiceLifeFactor object) {
				return createIfcServiceLifeFactorAdapter();
			}
			@Override
			public Adapter caseIfcShapeAspect(IfcShapeAspect object) {
				return createIfcShapeAspectAdapter();
			}
			@Override
			public Adapter caseIfcShapeModel(IfcShapeModel object) {
				return createIfcShapeModelAdapter();
			}
			@Override
			public Adapter caseIfcShapeRepresentation(IfcShapeRepresentation object) {
				return createIfcShapeRepresentationAdapter();
			}
			@Override
			public Adapter caseIfcShellBasedSurfaceModel(IfcShellBasedSurfaceModel object) {
				return createIfcShellBasedSurfaceModelAdapter();
			}
			@Override
			public Adapter caseIfcSimpleProperty(IfcSimpleProperty object) {
				return createIfcSimplePropertyAdapter();
			}
			@Override
			public Adapter caseIfcSite(IfcSite object) {
				return createIfcSiteAdapter();
			}
			@Override
			public Adapter caseIfcSlab(IfcSlab object) {
				return createIfcSlabAdapter();
			}
			@Override
			public Adapter caseIfcSlabType(IfcSlabType object) {
				return createIfcSlabTypeAdapter();
			}
			@Override
			public Adapter caseIfcSlippageConnectionCondition(IfcSlippageConnectionCondition object) {
				return createIfcSlippageConnectionConditionAdapter();
			}
			@Override
			public Adapter caseIfcSolidModel(IfcSolidModel object) {
				return createIfcSolidModelAdapter();
			}
			@Override
			public Adapter caseIfcSoundProperties(IfcSoundProperties object) {
				return createIfcSoundPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcSoundValue(IfcSoundValue object) {
				return createIfcSoundValueAdapter();
			}
			@Override
			public Adapter caseIfcSpace(IfcSpace object) {
				return createIfcSpaceAdapter();
			}
			@Override
			public Adapter caseIfcSpaceHeaterType(IfcSpaceHeaterType object) {
				return createIfcSpaceHeaterTypeAdapter();
			}
			@Override
			public Adapter caseIfcSpaceProgram(IfcSpaceProgram object) {
				return createIfcSpaceProgramAdapter();
			}
			@Override
			public Adapter caseIfcSpaceThermalLoadProperties(IfcSpaceThermalLoadProperties object) {
				return createIfcSpaceThermalLoadPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcSpaceType(IfcSpaceType object) {
				return createIfcSpaceTypeAdapter();
			}
			@Override
			public Adapter caseIfcSpatialStructureElement(IfcSpatialStructureElement object) {
				return createIfcSpatialStructureElementAdapter();
			}
			@Override
			public Adapter caseIfcSpatialStructureElementType(IfcSpatialStructureElementType object) {
				return createIfcSpatialStructureElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcSphere(IfcSphere object) {
				return createIfcSphereAdapter();
			}
			@Override
			public Adapter caseIfcStackTerminalType(IfcStackTerminalType object) {
				return createIfcStackTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcStair(IfcStair object) {
				return createIfcStairAdapter();
			}
			@Override
			public Adapter caseIfcStairFlight(IfcStairFlight object) {
				return createIfcStairFlightAdapter();
			}
			@Override
			public Adapter caseIfcStairFlightType(IfcStairFlightType object) {
				return createIfcStairFlightTypeAdapter();
			}
			@Override
			public Adapter caseIfcStructuralAction(IfcStructuralAction object) {
				return createIfcStructuralActionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralActivity(IfcStructuralActivity object) {
				return createIfcStructuralActivityAdapter();
			}
			@Override
			public Adapter caseIfcStructuralAnalysisModel(IfcStructuralAnalysisModel object) {
				return createIfcStructuralAnalysisModelAdapter();
			}
			@Override
			public Adapter caseIfcStructuralConnection(IfcStructuralConnection object) {
				return createIfcStructuralConnectionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralConnectionCondition(IfcStructuralConnectionCondition object) {
				return createIfcStructuralConnectionConditionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralCurveConnection(IfcStructuralCurveConnection object) {
				return createIfcStructuralCurveConnectionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralCurveMember(IfcStructuralCurveMember object) {
				return createIfcStructuralCurveMemberAdapter();
			}
			@Override
			public Adapter caseIfcStructuralCurveMemberVarying(IfcStructuralCurveMemberVarying object) {
				return createIfcStructuralCurveMemberVaryingAdapter();
			}
			@Override
			public Adapter caseIfcStructuralItem(IfcStructuralItem object) {
				return createIfcStructuralItemAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLinearAction(IfcStructuralLinearAction object) {
				return createIfcStructuralLinearActionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLinearActionVarying(IfcStructuralLinearActionVarying object) {
				return createIfcStructuralLinearActionVaryingAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoad(IfcStructuralLoad object) {
				return createIfcStructuralLoadAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadGroup(IfcStructuralLoadGroup object) {
				return createIfcStructuralLoadGroupAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadLinearForce(IfcStructuralLoadLinearForce object) {
				return createIfcStructuralLoadLinearForceAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadPlanarForce(IfcStructuralLoadPlanarForce object) {
				return createIfcStructuralLoadPlanarForceAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadSingleDisplacement(IfcStructuralLoadSingleDisplacement object) {
				return createIfcStructuralLoadSingleDisplacementAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadSingleDisplacementDistortion(IfcStructuralLoadSingleDisplacementDistortion object) {
				return createIfcStructuralLoadSingleDisplacementDistortionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadSingleForce(IfcStructuralLoadSingleForce object) {
				return createIfcStructuralLoadSingleForceAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadSingleForceWarping(IfcStructuralLoadSingleForceWarping object) {
				return createIfcStructuralLoadSingleForceWarpingAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadStatic(IfcStructuralLoadStatic object) {
				return createIfcStructuralLoadStaticAdapter();
			}
			@Override
			public Adapter caseIfcStructuralLoadTemperature(IfcStructuralLoadTemperature object) {
				return createIfcStructuralLoadTemperatureAdapter();
			}
			@Override
			public Adapter caseIfcStructuralMember(IfcStructuralMember object) {
				return createIfcStructuralMemberAdapter();
			}
			@Override
			public Adapter caseIfcStructuralPlanarAction(IfcStructuralPlanarAction object) {
				return createIfcStructuralPlanarActionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralPlanarActionVarying(IfcStructuralPlanarActionVarying object) {
				return createIfcStructuralPlanarActionVaryingAdapter();
			}
			@Override
			public Adapter caseIfcStructuralPointAction(IfcStructuralPointAction object) {
				return createIfcStructuralPointActionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralPointConnection(IfcStructuralPointConnection object) {
				return createIfcStructuralPointConnectionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralPointReaction(IfcStructuralPointReaction object) {
				return createIfcStructuralPointReactionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralProfileProperties(IfcStructuralProfileProperties object) {
				return createIfcStructuralProfilePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcStructuralReaction(IfcStructuralReaction object) {
				return createIfcStructuralReactionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralResultGroup(IfcStructuralResultGroup object) {
				return createIfcStructuralResultGroupAdapter();
			}
			@Override
			public Adapter caseIfcStructuralSteelProfileProperties(IfcStructuralSteelProfileProperties object) {
				return createIfcStructuralSteelProfilePropertiesAdapter();
			}
			@Override
			public Adapter caseIfcStructuralSurfaceConnection(IfcStructuralSurfaceConnection object) {
				return createIfcStructuralSurfaceConnectionAdapter();
			}
			@Override
			public Adapter caseIfcStructuralSurfaceMember(IfcStructuralSurfaceMember object) {
				return createIfcStructuralSurfaceMemberAdapter();
			}
			@Override
			public Adapter caseIfcStructuralSurfaceMemberVarying(IfcStructuralSurfaceMemberVarying object) {
				return createIfcStructuralSurfaceMemberVaryingAdapter();
			}
			@Override
			public Adapter caseIfcStructuredDimensionCallout(IfcStructuredDimensionCallout object) {
				return createIfcStructuredDimensionCalloutAdapter();
			}
			@Override
			public Adapter caseIfcStyleModel(IfcStyleModel object) {
				return createIfcStyleModelAdapter();
			}
			@Override
			public Adapter caseIfcStyledItem(IfcStyledItem object) {
				return createIfcStyledItemAdapter();
			}
			@Override
			public Adapter caseIfcStyledRepresentation(IfcStyledRepresentation object) {
				return createIfcStyledRepresentationAdapter();
			}
			@Override
			public Adapter caseIfcSubContractResource(IfcSubContractResource object) {
				return createIfcSubContractResourceAdapter();
			}
			@Override
			public Adapter caseIfcSubedge(IfcSubedge object) {
				return createIfcSubedgeAdapter();
			}
			@Override
			public Adapter caseIfcSurface(IfcSurface object) {
				return createIfcSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceCurveSweptAreaSolid(IfcSurfaceCurveSweptAreaSolid object) {
				return createIfcSurfaceCurveSweptAreaSolidAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceOfLinearExtrusion(IfcSurfaceOfLinearExtrusion object) {
				return createIfcSurfaceOfLinearExtrusionAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceOfRevolution(IfcSurfaceOfRevolution object) {
				return createIfcSurfaceOfRevolutionAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyle(IfcSurfaceStyle object) {
				return createIfcSurfaceStyleAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyleLighting(IfcSurfaceStyleLighting object) {
				return createIfcSurfaceStyleLightingAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyleRefraction(IfcSurfaceStyleRefraction object) {
				return createIfcSurfaceStyleRefractionAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyleRendering(IfcSurfaceStyleRendering object) {
				return createIfcSurfaceStyleRenderingAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyleShading(IfcSurfaceStyleShading object) {
				return createIfcSurfaceStyleShadingAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyleWithTextures(IfcSurfaceStyleWithTextures object) {
				return createIfcSurfaceStyleWithTexturesAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceTexture(IfcSurfaceTexture object) {
				return createIfcSurfaceTextureAdapter();
			}
			@Override
			public Adapter caseIfcSweptAreaSolid(IfcSweptAreaSolid object) {
				return createIfcSweptAreaSolidAdapter();
			}
			@Override
			public Adapter caseIfcSweptDiskSolid(IfcSweptDiskSolid object) {
				return createIfcSweptDiskSolidAdapter();
			}
			@Override
			public Adapter caseIfcSweptSurface(IfcSweptSurface object) {
				return createIfcSweptSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcSwitchingDeviceType(IfcSwitchingDeviceType object) {
				return createIfcSwitchingDeviceTypeAdapter();
			}
			@Override
			public Adapter caseIfcSymbolStyle(IfcSymbolStyle object) {
				return createIfcSymbolStyleAdapter();
			}
			@Override
			public Adapter caseIfcSystem(IfcSystem object) {
				return createIfcSystemAdapter();
			}
			@Override
			public Adapter caseIfcSystemFurnitureElementType(IfcSystemFurnitureElementType object) {
				return createIfcSystemFurnitureElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcTShapeProfileDef(IfcTShapeProfileDef object) {
				return createIfcTShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcTable(IfcTable object) {
				return createIfcTableAdapter();
			}
			@Override
			public Adapter caseIfcTableRow(IfcTableRow object) {
				return createIfcTableRowAdapter();
			}
			@Override
			public Adapter caseIfcTankType(IfcTankType object) {
				return createIfcTankTypeAdapter();
			}
			@Override
			public Adapter caseIfcTask(IfcTask object) {
				return createIfcTaskAdapter();
			}
			@Override
			public Adapter caseIfcTelecomAddress(IfcTelecomAddress object) {
				return createIfcTelecomAddressAdapter();
			}
			@Override
			public Adapter caseIfcTendon(IfcTendon object) {
				return createIfcTendonAdapter();
			}
			@Override
			public Adapter caseIfcTendonAnchor(IfcTendonAnchor object) {
				return createIfcTendonAnchorAdapter();
			}
			@Override
			public Adapter caseIfcTerminatorSymbol(IfcTerminatorSymbol object) {
				return createIfcTerminatorSymbolAdapter();
			}
			@Override
			public Adapter caseIfcTextLiteral(IfcTextLiteral object) {
				return createIfcTextLiteralAdapter();
			}
			@Override
			public Adapter caseIfcTextLiteralWithExtent(IfcTextLiteralWithExtent object) {
				return createIfcTextLiteralWithExtentAdapter();
			}
			@Override
			public Adapter caseIfcTextStyle(IfcTextStyle object) {
				return createIfcTextStyleAdapter();
			}
			@Override
			public Adapter caseIfcTextStyleFontModel(IfcTextStyleFontModel object) {
				return createIfcTextStyleFontModelAdapter();
			}
			@Override
			public Adapter caseIfcTextStyleForDefinedFont(IfcTextStyleForDefinedFont object) {
				return createIfcTextStyleForDefinedFontAdapter();
			}
			@Override
			public Adapter caseIfcTextStyleTextModel(IfcTextStyleTextModel object) {
				return createIfcTextStyleTextModelAdapter();
			}
			@Override
			public Adapter caseIfcTextStyleWithBoxCharacteristics(IfcTextStyleWithBoxCharacteristics object) {
				return createIfcTextStyleWithBoxCharacteristicsAdapter();
			}
			@Override
			public Adapter caseIfcTextureCoordinate(IfcTextureCoordinate object) {
				return createIfcTextureCoordinateAdapter();
			}
			@Override
			public Adapter caseIfcTextureCoordinateGenerator(IfcTextureCoordinateGenerator object) {
				return createIfcTextureCoordinateGeneratorAdapter();
			}
			@Override
			public Adapter caseIfcTextureMap(IfcTextureMap object) {
				return createIfcTextureMapAdapter();
			}
			@Override
			public Adapter caseIfcTextureVertex(IfcTextureVertex object) {
				return createIfcTextureVertexAdapter();
			}
			@Override
			public Adapter caseIfcThermalMaterialProperties(IfcThermalMaterialProperties object) {
				return createIfcThermalMaterialPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcTimeSeries(IfcTimeSeries object) {
				return createIfcTimeSeriesAdapter();
			}
			@Override
			public Adapter caseIfcTimeSeriesReferenceRelationship(IfcTimeSeriesReferenceRelationship object) {
				return createIfcTimeSeriesReferenceRelationshipAdapter();
			}
			@Override
			public Adapter caseIfcTimeSeriesSchedule(IfcTimeSeriesSchedule object) {
				return createIfcTimeSeriesScheduleAdapter();
			}
			@Override
			public Adapter caseIfcTimeSeriesValue(IfcTimeSeriesValue object) {
				return createIfcTimeSeriesValueAdapter();
			}
			@Override
			public Adapter caseIfcTopologicalRepresentationItem(IfcTopologicalRepresentationItem object) {
				return createIfcTopologicalRepresentationItemAdapter();
			}
			@Override
			public Adapter caseIfcTopologyRepresentation(IfcTopologyRepresentation object) {
				return createIfcTopologyRepresentationAdapter();
			}
			@Override
			public Adapter caseIfcTransformerType(IfcTransformerType object) {
				return createIfcTransformerTypeAdapter();
			}
			@Override
			public Adapter caseIfcTransportElement(IfcTransportElement object) {
				return createIfcTransportElementAdapter();
			}
			@Override
			public Adapter caseIfcTransportElementType(IfcTransportElementType object) {
				return createIfcTransportElementTypeAdapter();
			}
			@Override
			public Adapter caseIfcTrapeziumProfileDef(IfcTrapeziumProfileDef object) {
				return createIfcTrapeziumProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcTrimmedCurve(IfcTrimmedCurve object) {
				return createIfcTrimmedCurveAdapter();
			}
			@Override
			public Adapter caseIfcTubeBundleType(IfcTubeBundleType object) {
				return createIfcTubeBundleTypeAdapter();
			}
			@Override
			public Adapter caseIfcTwoDirectionRepeatFactor(IfcTwoDirectionRepeatFactor object) {
				return createIfcTwoDirectionRepeatFactorAdapter();
			}
			@Override
			public Adapter caseIfcTypeObject(IfcTypeObject object) {
				return createIfcTypeObjectAdapter();
			}
			@Override
			public Adapter caseIfcTypeProduct(IfcTypeProduct object) {
				return createIfcTypeProductAdapter();
			}
			@Override
			public Adapter caseIfcUShapeProfileDef(IfcUShapeProfileDef object) {
				return createIfcUShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcUnitAssignment(IfcUnitAssignment object) {
				return createIfcUnitAssignmentAdapter();
			}
			@Override
			public Adapter caseIfcUnitaryEquipmentType(IfcUnitaryEquipmentType object) {
				return createIfcUnitaryEquipmentTypeAdapter();
			}
			@Override
			public Adapter caseIfcValveType(IfcValveType object) {
				return createIfcValveTypeAdapter();
			}
			@Override
			public Adapter caseIfcVector(IfcVector object) {
				return createIfcVectorAdapter();
			}
			@Override
			public Adapter caseIfcVertex(IfcVertex object) {
				return createIfcVertexAdapter();
			}
			@Override
			public Adapter caseIfcVertexBasedTextureMap(IfcVertexBasedTextureMap object) {
				return createIfcVertexBasedTextureMapAdapter();
			}
			@Override
			public Adapter caseIfcVertexLoop(IfcVertexLoop object) {
				return createIfcVertexLoopAdapter();
			}
			@Override
			public Adapter caseIfcVertexPoint(IfcVertexPoint object) {
				return createIfcVertexPointAdapter();
			}
			@Override
			public Adapter caseIfcVibrationIsolatorType(IfcVibrationIsolatorType object) {
				return createIfcVibrationIsolatorTypeAdapter();
			}
			@Override
			public Adapter caseIfcVirtualElement(IfcVirtualElement object) {
				return createIfcVirtualElementAdapter();
			}
			@Override
			public Adapter caseIfcVirtualGridIntersection(IfcVirtualGridIntersection object) {
				return createIfcVirtualGridIntersectionAdapter();
			}
			@Override
			public Adapter caseIfcWall(IfcWall object) {
				return createIfcWallAdapter();
			}
			@Override
			public Adapter caseIfcWallStandardCase(IfcWallStandardCase object) {
				return createIfcWallStandardCaseAdapter();
			}
			@Override
			public Adapter caseIfcWallType(IfcWallType object) {
				return createIfcWallTypeAdapter();
			}
			@Override
			public Adapter caseIfcWasteTerminalType(IfcWasteTerminalType object) {
				return createIfcWasteTerminalTypeAdapter();
			}
			@Override
			public Adapter caseIfcWaterProperties(IfcWaterProperties object) {
				return createIfcWaterPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcWindow(IfcWindow object) {
				return createIfcWindowAdapter();
			}
			@Override
			public Adapter caseIfcWindowLiningProperties(IfcWindowLiningProperties object) {
				return createIfcWindowLiningPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcWindowPanelProperties(IfcWindowPanelProperties object) {
				return createIfcWindowPanelPropertiesAdapter();
			}
			@Override
			public Adapter caseIfcWindowStyle(IfcWindowStyle object) {
				return createIfcWindowStyleAdapter();
			}
			@Override
			public Adapter caseIfcWorkControl(IfcWorkControl object) {
				return createIfcWorkControlAdapter();
			}
			@Override
			public Adapter caseIfcWorkPlan(IfcWorkPlan object) {
				return createIfcWorkPlanAdapter();
			}
			@Override
			public Adapter caseIfcWorkSchedule(IfcWorkSchedule object) {
				return createIfcWorkScheduleAdapter();
			}
			@Override
			public Adapter caseIfcZShapeProfileDef(IfcZShapeProfileDef object) {
				return createIfcZShapeProfileDefAdapter();
			}
			@Override
			public Adapter caseIfcZone(IfcZone object) {
				return createIfcZoneAdapter();
			}
			@Override
			public Adapter caseIfcActorSelect(IfcActorSelect object) {
				return createIfcActorSelectAdapter();
			}
			@Override
			public Adapter caseIfcAppliedValueSelect(IfcAppliedValueSelect object) {
				return createIfcAppliedValueSelectAdapter();
			}
			@Override
			public Adapter caseIfcAxis2Placement(IfcAxis2Placement object) {
				return createIfcAxis2PlacementAdapter();
			}
			@Override
			public Adapter caseIfcBooleanOperand(IfcBooleanOperand object) {
				return createIfcBooleanOperandAdapter();
			}
			@Override
			public Adapter caseIfcCharacterStyleSelect(IfcCharacterStyleSelect object) {
				return createIfcCharacterStyleSelectAdapter();
			}
			@Override
			public Adapter caseIfcClassificationNotationSelect(IfcClassificationNotationSelect object) {
				return createIfcClassificationNotationSelectAdapter();
			}
			@Override
			public Adapter caseIfcColour(IfcColour object) {
				return createIfcColourAdapter();
			}
			@Override
			public Adapter caseIfcColourOrFactor(IfcColourOrFactor object) {
				return createIfcColourOrFactorAdapter();
			}
			@Override
			public Adapter caseIfcConditionCriterionSelect(IfcConditionCriterionSelect object) {
				return createIfcConditionCriterionSelectAdapter();
			}
			@Override
			public Adapter caseIfcCsgSelect(IfcCsgSelect object) {
				return createIfcCsgSelectAdapter();
			}
			@Override
			public Adapter caseIfcCurveFontOrScaledCurveFontSelect(IfcCurveFontOrScaledCurveFontSelect object) {
				return createIfcCurveFontOrScaledCurveFontSelectAdapter();
			}
			@Override
			public Adapter caseIfcCurveOrEdgeCurve(IfcCurveOrEdgeCurve object) {
				return createIfcCurveOrEdgeCurveAdapter();
			}
			@Override
			public Adapter caseIfcCurveStyleFontSelect(IfcCurveStyleFontSelect object) {
				return createIfcCurveStyleFontSelectAdapter();
			}
			@Override
			public Adapter caseIfcDateTimeSelect(IfcDateTimeSelect object) {
				return createIfcDateTimeSelectAdapter();
			}
			@Override
			public Adapter caseIfcDefinedSymbolSelect(IfcDefinedSymbolSelect object) {
				return createIfcDefinedSymbolSelectAdapter();
			}
			@Override
			public Adapter caseIfcDerivedMeasureValue(IfcDerivedMeasureValue object) {
				return createIfcDerivedMeasureValueAdapter();
			}
			@Override
			public Adapter caseIfcDocumentSelect(IfcDocumentSelect object) {
				return createIfcDocumentSelectAdapter();
			}
			@Override
			public Adapter caseIfcDraughtingCalloutElement(IfcDraughtingCalloutElement object) {
				return createIfcDraughtingCalloutElementAdapter();
			}
			@Override
			public Adapter caseIfcFillAreaStyleTileShapeSelect(IfcFillAreaStyleTileShapeSelect object) {
				return createIfcFillAreaStyleTileShapeSelectAdapter();
			}
			@Override
			public Adapter caseIfcFillStyleSelect(IfcFillStyleSelect object) {
				return createIfcFillStyleSelectAdapter();
			}
			@Override
			public Adapter caseIfcGeometricSetSelect(IfcGeometricSetSelect object) {
				return createIfcGeometricSetSelectAdapter();
			}
			@Override
			public Adapter caseIfcHatchLineDistanceSelect(IfcHatchLineDistanceSelect object) {
				return createIfcHatchLineDistanceSelectAdapter();
			}
			@Override
			public Adapter caseIfcLayeredItem(IfcLayeredItem object) {
				return createIfcLayeredItemAdapter();
			}
			@Override
			public Adapter caseIfcLibrarySelect(IfcLibrarySelect object) {
				return createIfcLibrarySelectAdapter();
			}
			@Override
			public Adapter caseIfcLightDistributionDataSourceSelect(IfcLightDistributionDataSourceSelect object) {
				return createIfcLightDistributionDataSourceSelectAdapter();
			}
			@Override
			public Adapter caseIfcMaterialSelect(IfcMaterialSelect object) {
				return createIfcMaterialSelectAdapter();
			}
			@Override
			public Adapter caseIfcMeasureValue(IfcMeasureValue object) {
				return createIfcMeasureValueAdapter();
			}
			@Override
			public Adapter caseIfcMetricValueSelect(IfcMetricValueSelect object) {
				return createIfcMetricValueSelectAdapter();
			}
			@Override
			public Adapter caseIfcObjectReferenceSelect(IfcObjectReferenceSelect object) {
				return createIfcObjectReferenceSelectAdapter();
			}
			@Override
			public Adapter caseIfcOrientationSelect(IfcOrientationSelect object) {
				return createIfcOrientationSelectAdapter();
			}
			@Override
			public Adapter caseIfcPointOrVertexPoint(IfcPointOrVertexPoint object) {
				return createIfcPointOrVertexPointAdapter();
			}
			@Override
			public Adapter caseIfcPresentationStyleSelect(IfcPresentationStyleSelect object) {
				return createIfcPresentationStyleSelectAdapter();
			}
			@Override
			public Adapter caseIfcShell(IfcShell object) {
				return createIfcShellAdapter();
			}
			@Override
			public Adapter caseIfcSimpleValue(IfcSimpleValue object) {
				return createIfcSimpleValueAdapter();
			}
			@Override
			public Adapter caseIfcSizeSelect(IfcSizeSelect object) {
				return createIfcSizeSelectAdapter();
			}
			@Override
			public Adapter caseIfcSpecularHighlightSelect(IfcSpecularHighlightSelect object) {
				return createIfcSpecularHighlightSelectAdapter();
			}
			@Override
			public Adapter caseIfcStructuralActivityAssignmentSelect(IfcStructuralActivityAssignmentSelect object) {
				return createIfcStructuralActivityAssignmentSelectAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceOrFaceSurface(IfcSurfaceOrFaceSurface object) {
				return createIfcSurfaceOrFaceSurfaceAdapter();
			}
			@Override
			public Adapter caseIfcSurfaceStyleElementSelect(IfcSurfaceStyleElementSelect object) {
				return createIfcSurfaceStyleElementSelectAdapter();
			}
			@Override
			public Adapter caseIfcSymbolStyleSelect(IfcSymbolStyleSelect object) {
				return createIfcSymbolStyleSelectAdapter();
			}
			@Override
			public Adapter caseIfcTextFontSelect(IfcTextFontSelect object) {
				return createIfcTextFontSelectAdapter();
			}
			@Override
			public Adapter caseIfcTextStyleSelect(IfcTextStyleSelect object) {
				return createIfcTextStyleSelectAdapter();
			}
			@Override
			public Adapter caseIfcTrimmingSelect(IfcTrimmingSelect object) {
				return createIfcTrimmingSelectAdapter();
			}
			@Override
			public Adapter caseIfcUnit(IfcUnit object) {
				return createIfcUnitAdapter();
			}
			@Override
			public Adapter caseIfcValue(IfcValue object) {
				return createIfcValueAdapter();
			}
			@Override
			public Adapter caseIfcVectorOrDirection(IfcVectorOrDirection object) {
				return createIfcVectorOrDirectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.WrappedValue <em>Wrapped Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.WrappedValue
	 * @generated
	 */
	public Adapter createWrappedValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAbsorbedDoseMeasure <em>Ifc Absorbed Dose Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAbsorbedDoseMeasure
	 * @generated
	 */
	public Adapter createIfcAbsorbedDoseMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAccelerationMeasure <em>Ifc Acceleration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAccelerationMeasure
	 * @generated
	 */
	public Adapter createIfcAccelerationMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAmountOfSubstanceMeasure <em>Ifc Amount Of Substance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAmountOfSubstanceMeasure
	 * @generated
	 */
	public Adapter createIfcAmountOfSubstanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAngularVelocityMeasure <em>Ifc Angular Velocity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAngularVelocityMeasure
	 * @generated
	 */
	public Adapter createIfcAngularVelocityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAreaMeasure <em>Ifc Area Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAreaMeasure
	 * @generated
	 */
	public Adapter createIfcAreaMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoolean <em>Ifc Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoolean
	 * @generated
	 */
	public Adapter createIfcBooleanAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcContextDependentMeasure <em>Ifc Context Dependent Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcContextDependentMeasure
	 * @generated
	 */
	public Adapter createIfcContextDependentMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCountMeasure <em>Ifc Count Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCountMeasure
	 * @generated
	 */
	public Adapter createIfcCountMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurvatureMeasure <em>Ifc Curvature Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurvatureMeasure
	 * @generated
	 */
	public Adapter createIfcCurvatureMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDescriptiveMeasure <em>Ifc Descriptive Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDescriptiveMeasure
	 * @generated
	 */
	public Adapter createIfcDescriptiveMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDoseEquivalentMeasure <em>Ifc Dose Equivalent Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDoseEquivalentMeasure
	 * @generated
	 */
	public Adapter createIfcDoseEquivalentMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDynamicViscosityMeasure <em>Ifc Dynamic Viscosity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDynamicViscosityMeasure
	 * @generated
	 */
	public Adapter createIfcDynamicViscosityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricCapacitanceMeasure <em>Ifc Electric Capacitance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricCapacitanceMeasure
	 * @generated
	 */
	public Adapter createIfcElectricCapacitanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricChargeMeasure <em>Ifc Electric Charge Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricChargeMeasure
	 * @generated
	 */
	public Adapter createIfcElectricChargeMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricConductanceMeasure <em>Ifc Electric Conductance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricConductanceMeasure
	 * @generated
	 */
	public Adapter createIfcElectricConductanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricCurrentMeasure <em>Ifc Electric Current Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricCurrentMeasure
	 * @generated
	 */
	public Adapter createIfcElectricCurrentMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricResistanceMeasure <em>Ifc Electric Resistance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricResistanceMeasure
	 * @generated
	 */
	public Adapter createIfcElectricResistanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricVoltageMeasure <em>Ifc Electric Voltage Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricVoltageMeasure
	 * @generated
	 */
	public Adapter createIfcElectricVoltageMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEnergyMeasure <em>Ifc Energy Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEnergyMeasure
	 * @generated
	 */
	public Adapter createIfcEnergyMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcForceMeasure <em>Ifc Force Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcForceMeasure
	 * @generated
	 */
	public Adapter createIfcForceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFrequencyMeasure <em>Ifc Frequency Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFrequencyMeasure
	 * @generated
	 */
	public Adapter createIfcFrequencyMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGloballyUniqueId <em>Ifc Globally Unique Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGloballyUniqueId
	 * @generated
	 */
	public Adapter createIfcGloballyUniqueIdAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHeatFluxDensityMeasure <em>Ifc Heat Flux Density Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHeatFluxDensityMeasure
	 * @generated
	 */
	public Adapter createIfcHeatFluxDensityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHeatingValueMeasure <em>Ifc Heating Value Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHeatingValueMeasure
	 * @generated
	 */
	public Adapter createIfcHeatingValueMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIdentifier <em>Ifc Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIdentifier
	 * @generated
	 */
	public Adapter createIfcIdentifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIlluminanceMeasure <em>Ifc Illuminance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIlluminanceMeasure
	 * @generated
	 */
	public Adapter createIfcIlluminanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcInductanceMeasure <em>Ifc Inductance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcInductanceMeasure
	 * @generated
	 */
	public Adapter createIfcInductanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcInteger <em>Ifc Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcInteger
	 * @generated
	 */
	public Adapter createIfcIntegerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIntegerCountRateMeasure <em>Ifc Integer Count Rate Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIntegerCountRateMeasure
	 * @generated
	 */
	public Adapter createIfcIntegerCountRateMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIonConcentrationMeasure <em>Ifc Ion Concentration Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIonConcentrationMeasure
	 * @generated
	 */
	public Adapter createIfcIonConcentrationMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIsothermalMoistureCapacityMeasure <em>Ifc Isothermal Moisture Capacity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIsothermalMoistureCapacityMeasure
	 * @generated
	 */
	public Adapter createIfcIsothermalMoistureCapacityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcKinematicViscosityMeasure <em>Ifc Kinematic Viscosity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcKinematicViscosityMeasure
	 * @generated
	 */
	public Adapter createIfcKinematicViscosityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLabel <em>Ifc Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLabel
	 * @generated
	 */
	public Adapter createIfcLabelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLengthMeasure <em>Ifc Length Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLengthMeasure
	 * @generated
	 */
	public Adapter createIfcLengthMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLinearForceMeasure <em>Ifc Linear Force Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLinearForceMeasure
	 * @generated
	 */
	public Adapter createIfcLinearForceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLinearMomentMeasure <em>Ifc Linear Moment Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLinearMomentMeasure
	 * @generated
	 */
	public Adapter createIfcLinearMomentMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLinearStiffnessMeasure <em>Ifc Linear Stiffness Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLinearStiffnessMeasure
	 * @generated
	 */
	public Adapter createIfcLinearStiffnessMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLinearVelocityMeasure <em>Ifc Linear Velocity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLinearVelocityMeasure
	 * @generated
	 */
	public Adapter createIfcLinearVelocityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLogical <em>Ifc Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLogical
	 * @generated
	 */
	public Adapter createIfcLogicalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLuminousFluxMeasure <em>Ifc Luminous Flux Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLuminousFluxMeasure
	 * @generated
	 */
	public Adapter createIfcLuminousFluxMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLuminousIntensityDistributionMeasure <em>Ifc Luminous Intensity Distribution Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLuminousIntensityDistributionMeasure
	 * @generated
	 */
	public Adapter createIfcLuminousIntensityDistributionMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLuminousIntensityMeasure <em>Ifc Luminous Intensity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLuminousIntensityMeasure
	 * @generated
	 */
	public Adapter createIfcLuminousIntensityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMagneticFluxDensityMeasure <em>Ifc Magnetic Flux Density Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMagneticFluxDensityMeasure
	 * @generated
	 */
	public Adapter createIfcMagneticFluxDensityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMagneticFluxMeasure <em>Ifc Magnetic Flux Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMagneticFluxMeasure
	 * @generated
	 */
	public Adapter createIfcMagneticFluxMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMassDensityMeasure <em>Ifc Mass Density Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMassDensityMeasure
	 * @generated
	 */
	public Adapter createIfcMassDensityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMassFlowRateMeasure <em>Ifc Mass Flow Rate Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMassFlowRateMeasure
	 * @generated
	 */
	public Adapter createIfcMassFlowRateMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMassMeasure <em>Ifc Mass Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMassMeasure
	 * @generated
	 */
	public Adapter createIfcMassMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMassPerLengthMeasure <em>Ifc Mass Per Length Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMassPerLengthMeasure
	 * @generated
	 */
	public Adapter createIfcMassPerLengthMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcModulusOfElasticityMeasure <em>Ifc Modulus Of Elasticity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcModulusOfElasticityMeasure
	 * @generated
	 */
	public Adapter createIfcModulusOfElasticityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcModulusOfLinearSubgradeReactionMeasure <em>Ifc Modulus Of Linear Subgrade Reaction Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcModulusOfLinearSubgradeReactionMeasure
	 * @generated
	 */
	public Adapter createIfcModulusOfLinearSubgradeReactionMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure <em>Ifc Modulus Of Rotational Subgrade Reaction Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcModulusOfRotationalSubgradeReactionMeasure
	 * @generated
	 */
	public Adapter createIfcModulusOfRotationalSubgradeReactionMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcModulusOfSubgradeReactionMeasure <em>Ifc Modulus Of Subgrade Reaction Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcModulusOfSubgradeReactionMeasure
	 * @generated
	 */
	public Adapter createIfcModulusOfSubgradeReactionMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMoistureDiffusivityMeasure <em>Ifc Moisture Diffusivity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMoistureDiffusivityMeasure
	 * @generated
	 */
	public Adapter createIfcMoistureDiffusivityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMolecularWeightMeasure <em>Ifc Molecular Weight Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMolecularWeightMeasure
	 * @generated
	 */
	public Adapter createIfcMolecularWeightMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMomentOfInertiaMeasure <em>Ifc Moment Of Inertia Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMomentOfInertiaMeasure
	 * @generated
	 */
	public Adapter createIfcMomentOfInertiaMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMonetaryMeasure <em>Ifc Monetary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMonetaryMeasure
	 * @generated
	 */
	public Adapter createIfcMonetaryMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcNumericMeasure <em>Ifc Numeric Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcNumericMeasure
	 * @generated
	 */
	public Adapter createIfcNumericMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPHMeasure <em>Ifc PH Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPHMeasure
	 * @generated
	 */
	public Adapter createIfcPHMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcParameterValue <em>Ifc Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcParameterValue
	 * @generated
	 */
	public Adapter createIfcParameterValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlanarForceMeasure <em>Ifc Planar Force Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlanarForceMeasure
	 * @generated
	 */
	public Adapter createIfcPlanarForceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlaneAngleMeasure <em>Ifc Plane Angle Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlaneAngleMeasure
	 * @generated
	 */
	public Adapter createIfcPlaneAngleMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPowerMeasure <em>Ifc Power Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPowerMeasure
	 * @generated
	 */
	public Adapter createIfcPowerMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPressureMeasure <em>Ifc Pressure Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPressureMeasure
	 * @generated
	 */
	public Adapter createIfcPressureMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRadioActivityMeasure <em>Ifc Radio Activity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRadioActivityMeasure
	 * @generated
	 */
	public Adapter createIfcRadioActivityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRatioMeasure <em>Ifc Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRatioMeasure
	 * @generated
	 */
	public Adapter createIfcRatioMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReal <em>Ifc Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReal
	 * @generated
	 */
	public Adapter createIfcRealAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRotationalFrequencyMeasure <em>Ifc Rotational Frequency Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRotationalFrequencyMeasure
	 * @generated
	 */
	public Adapter createIfcRotationalFrequencyMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRotationalMassMeasure <em>Ifc Rotational Mass Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRotationalMassMeasure
	 * @generated
	 */
	public Adapter createIfcRotationalMassMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRotationalStiffnessMeasure <em>Ifc Rotational Stiffness Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRotationalStiffnessMeasure
	 * @generated
	 */
	public Adapter createIfcRotationalStiffnessMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSectionModulusMeasure <em>Ifc Section Modulus Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSectionModulusMeasure
	 * @generated
	 */
	public Adapter createIfcSectionModulusMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSectionalAreaIntegralMeasure <em>Ifc Sectional Area Integral Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSectionalAreaIntegralMeasure
	 * @generated
	 */
	public Adapter createIfcSectionalAreaIntegralMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcShearModulusMeasure <em>Ifc Shear Modulus Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcShearModulusMeasure
	 * @generated
	 */
	public Adapter createIfcShearModulusMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSolidAngleMeasure <em>Ifc Solid Angle Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSolidAngleMeasure
	 * @generated
	 */
	public Adapter createIfcSolidAngleMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSoundPowerMeasure <em>Ifc Sound Power Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSoundPowerMeasure
	 * @generated
	 */
	public Adapter createIfcSoundPowerMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSoundPressureMeasure <em>Ifc Sound Pressure Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSoundPressureMeasure
	 * @generated
	 */
	public Adapter createIfcSoundPressureMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpecificHeatCapacityMeasure <em>Ifc Specific Heat Capacity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpecificHeatCapacityMeasure
	 * @generated
	 */
	public Adapter createIfcSpecificHeatCapacityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpecularExponent <em>Ifc Specular Exponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpecularExponent
	 * @generated
	 */
	public Adapter createIfcSpecularExponentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpecularRoughness <em>Ifc Specular Roughness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpecularRoughness
	 * @generated
	 */
	public Adapter createIfcSpecularRoughnessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTemperatureGradientMeasure <em>Ifc Temperature Gradient Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTemperatureGradientMeasure
	 * @generated
	 */
	public Adapter createIfcTemperatureGradientMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcText <em>Ifc Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcText
	 * @generated
	 */
	public Adapter createIfcTextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermalAdmittanceMeasure <em>Ifc Thermal Admittance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermalAdmittanceMeasure
	 * @generated
	 */
	public Adapter createIfcThermalAdmittanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermalConductivityMeasure <em>Ifc Thermal Conductivity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermalConductivityMeasure
	 * @generated
	 */
	public Adapter createIfcThermalConductivityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermalExpansionCoefficientMeasure <em>Ifc Thermal Expansion Coefficient Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermalExpansionCoefficientMeasure
	 * @generated
	 */
	public Adapter createIfcThermalExpansionCoefficientMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermalResistanceMeasure <em>Ifc Thermal Resistance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermalResistanceMeasure
	 * @generated
	 */
	public Adapter createIfcThermalResistanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermalTransmittanceMeasure <em>Ifc Thermal Transmittance Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermalTransmittanceMeasure
	 * @generated
	 */
	public Adapter createIfcThermalTransmittanceMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermodynamicTemperatureMeasure <em>Ifc Thermodynamic Temperature Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermodynamicTemperatureMeasure
	 * @generated
	 */
	public Adapter createIfcThermodynamicTemperatureMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTimeMeasure <em>Ifc Time Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTimeMeasure
	 * @generated
	 */
	public Adapter createIfcTimeMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTimeStamp <em>Ifc Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTimeStamp
	 * @generated
	 */
	public Adapter createIfcTimeStampAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTorqueMeasure <em>Ifc Torque Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTorqueMeasure
	 * @generated
	 */
	public Adapter createIfcTorqueMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVaporPermeabilityMeasure <em>Ifc Vapor Permeability Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVaporPermeabilityMeasure
	 * @generated
	 */
	public Adapter createIfcVaporPermeabilityMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVolumeMeasure <em>Ifc Volume Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVolumeMeasure
	 * @generated
	 */
	public Adapter createIfcVolumeMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVolumetricFlowRateMeasure <em>Ifc Volumetric Flow Rate Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVolumetricFlowRateMeasure
	 * @generated
	 */
	public Adapter createIfcVolumetricFlowRateMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWarpingConstantMeasure <em>Ifc Warping Constant Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWarpingConstantMeasure
	 * @generated
	 */
	public Adapter createIfcWarpingConstantMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWarpingMomentMeasure <em>Ifc Warping Moment Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWarpingMomentMeasure
	 * @generated
	 */
	public Adapter createIfcWarpingMomentMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcNormalisedRatioMeasure
	 * @generated
	 */
	public Adapter createIfcNormalisedRatioMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPositiveLengthMeasure
	 * @generated
	 */
	public Adapter createIfcPositiveLengthMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPositivePlaneAngleMeasure <em>Ifc Positive Plane Angle Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPositivePlaneAngleMeasure
	 * @generated
	 */
	public Adapter createIfcPositivePlaneAngleMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPositiveRatioMeasure <em>Ifc Positive Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPositiveRatioMeasure
	 * @generated
	 */
	public Adapter createIfcPositiveRatioMeasureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.Ifc2DCompositeCurve <em>Ifc2 DComposite Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.Ifc2DCompositeCurve
	 * @generated
	 */
	public Adapter createIfc2DCompositeCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcActionRequest <em>Ifc Action Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcActionRequest
	 * @generated
	 */
	public Adapter createIfcActionRequestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcActor <em>Ifc Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcActor
	 * @generated
	 */
	public Adapter createIfcActorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcActorRole <em>Ifc Actor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcActorRole
	 * @generated
	 */
	public Adapter createIfcActorRoleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcActuatorType <em>Ifc Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcActuatorType
	 * @generated
	 */
	public Adapter createIfcActuatorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAddress <em>Ifc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAddress
	 * @generated
	 */
	public Adapter createIfcAddressAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAirTerminalBoxType <em>Ifc Air Terminal Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAirTerminalBoxType
	 * @generated
	 */
	public Adapter createIfcAirTerminalBoxTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAirTerminalType <em>Ifc Air Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAirTerminalType
	 * @generated
	 */
	public Adapter createIfcAirTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAirToAirHeatRecoveryType <em>Ifc Air To Air Heat Recovery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAirToAirHeatRecoveryType
	 * @generated
	 */
	public Adapter createIfcAirToAirHeatRecoveryTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAlarmType <em>Ifc Alarm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAlarmType
	 * @generated
	 */
	public Adapter createIfcAlarmTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAngularDimension <em>Ifc Angular Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAngularDimension
	 * @generated
	 */
	public Adapter createIfcAngularDimensionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotation <em>Ifc Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotation
	 * @generated
	 */
	public Adapter createIfcAnnotationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationCurveOccurrence <em>Ifc Annotation Curve Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationCurveOccurrence
	 * @generated
	 */
	public Adapter createIfcAnnotationCurveOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationFillArea <em>Ifc Annotation Fill Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationFillArea
	 * @generated
	 */
	public Adapter createIfcAnnotationFillAreaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationFillAreaOccurrence <em>Ifc Annotation Fill Area Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationFillAreaOccurrence
	 * @generated
	 */
	public Adapter createIfcAnnotationFillAreaOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationOccurrence <em>Ifc Annotation Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationOccurrence
	 * @generated
	 */
	public Adapter createIfcAnnotationOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationSurface <em>Ifc Annotation Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationSurface
	 * @generated
	 */
	public Adapter createIfcAnnotationSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationSurfaceOccurrence <em>Ifc Annotation Surface Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationSurfaceOccurrence
	 * @generated
	 */
	public Adapter createIfcAnnotationSurfaceOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationSymbolOccurrence <em>Ifc Annotation Symbol Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationSymbolOccurrence
	 * @generated
	 */
	public Adapter createIfcAnnotationSymbolOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAnnotationTextOccurrence <em>Ifc Annotation Text Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAnnotationTextOccurrence
	 * @generated
	 */
	public Adapter createIfcAnnotationTextOccurrenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcApplication <em>Ifc Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcApplication
	 * @generated
	 */
	public Adapter createIfcApplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAppliedValue <em>Ifc Applied Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAppliedValue
	 * @generated
	 */
	public Adapter createIfcAppliedValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAppliedValueRelationship <em>Ifc Applied Value Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAppliedValueRelationship
	 * @generated
	 */
	public Adapter createIfcAppliedValueRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcApproval <em>Ifc Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcApproval
	 * @generated
	 */
	public Adapter createIfcApprovalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcApprovalActorRelationship <em>Ifc Approval Actor Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcApprovalActorRelationship
	 * @generated
	 */
	public Adapter createIfcApprovalActorRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcApprovalPropertyRelationship <em>Ifc Approval Property Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcApprovalPropertyRelationship
	 * @generated
	 */
	public Adapter createIfcApprovalPropertyRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcApprovalRelationship <em>Ifc Approval Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcApprovalRelationship
	 * @generated
	 */
	public Adapter createIfcApprovalRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcArbitraryClosedProfileDef <em>Ifc Arbitrary Closed Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcArbitraryClosedProfileDef
	 * @generated
	 */
	public Adapter createIfcArbitraryClosedProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcArbitraryOpenProfileDef <em>Ifc Arbitrary Open Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcArbitraryOpenProfileDef
	 * @generated
	 */
	public Adapter createIfcArbitraryOpenProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcArbitraryProfileDefWithVoids <em>Ifc Arbitrary Profile Def With Voids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcArbitraryProfileDefWithVoids
	 * @generated
	 */
	public Adapter createIfcArbitraryProfileDefWithVoidsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAsset <em>Ifc Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAsset
	 * @generated
	 */
	public Adapter createIfcAssetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAsymmetricIShapeProfileDef <em>Ifc Asymmetric IShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAsymmetricIShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcAsymmetricIShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAxis1Placement <em>Ifc Axis1 Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAxis1Placement
	 * @generated
	 */
	public Adapter createIfcAxis1PlacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAxis2Placement2D <em>Ifc Axis2 Placement2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAxis2Placement2D
	 * @generated
	 */
	public Adapter createIfcAxis2Placement2DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAxis2Placement3D <em>Ifc Axis2 Placement3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAxis2Placement3D
	 * @generated
	 */
	public Adapter createIfcAxis2Placement3DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBSplineCurve <em>Ifc BSpline Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBSplineCurve
	 * @generated
	 */
	public Adapter createIfcBSplineCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBeam <em>Ifc Beam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBeam
	 * @generated
	 */
	public Adapter createIfcBeamAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBeamType <em>Ifc Beam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBeamType
	 * @generated
	 */
	public Adapter createIfcBeamTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBezierCurve <em>Ifc Bezier Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBezierCurve
	 * @generated
	 */
	public Adapter createIfcBezierCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBlobTexture <em>Ifc Blob Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBlobTexture
	 * @generated
	 */
	public Adapter createIfcBlobTextureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBlock <em>Ifc Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBlock
	 * @generated
	 */
	public Adapter createIfcBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoilerType <em>Ifc Boiler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoilerType
	 * @generated
	 */
	public Adapter createIfcBoilerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBooleanClippingResult <em>Ifc Boolean Clipping Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBooleanClippingResult
	 * @generated
	 */
	public Adapter createIfcBooleanClippingResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBooleanResult <em>Ifc Boolean Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBooleanResult
	 * @generated
	 */
	public Adapter createIfcBooleanResultAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundaryCondition <em>Ifc Boundary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundaryCondition
	 * @generated
	 */
	public Adapter createIfcBoundaryConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundaryEdgeCondition <em>Ifc Boundary Edge Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundaryEdgeCondition
	 * @generated
	 */
	public Adapter createIfcBoundaryEdgeConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundaryFaceCondition <em>Ifc Boundary Face Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundaryFaceCondition
	 * @generated
	 */
	public Adapter createIfcBoundaryFaceConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundaryNodeCondition <em>Ifc Boundary Node Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundaryNodeCondition
	 * @generated
	 */
	public Adapter createIfcBoundaryNodeConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundaryNodeConditionWarping <em>Ifc Boundary Node Condition Warping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundaryNodeConditionWarping
	 * @generated
	 */
	public Adapter createIfcBoundaryNodeConditionWarpingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundedCurve <em>Ifc Bounded Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundedCurve
	 * @generated
	 */
	public Adapter createIfcBoundedCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundedSurface <em>Ifc Bounded Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundedSurface
	 * @generated
	 */
	public Adapter createIfcBoundedSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoundingBox <em>Ifc Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoundingBox
	 * @generated
	 */
	public Adapter createIfcBoundingBoxAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBoxedHalfSpace <em>Ifc Boxed Half Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBoxedHalfSpace
	 * @generated
	 */
	public Adapter createIfcBoxedHalfSpaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuilding <em>Ifc Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuilding
	 * @generated
	 */
	public Adapter createIfcBuildingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingElement <em>Ifc Building Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingElement
	 * @generated
	 */
	public Adapter createIfcBuildingElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingElementComponent <em>Ifc Building Element Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingElementComponent
	 * @generated
	 */
	public Adapter createIfcBuildingElementComponentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingElementPart <em>Ifc Building Element Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingElementPart
	 * @generated
	 */
	public Adapter createIfcBuildingElementPartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingElementProxy <em>Ifc Building Element Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingElementProxy
	 * @generated
	 */
	public Adapter createIfcBuildingElementProxyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingElementProxyType <em>Ifc Building Element Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingElementProxyType
	 * @generated
	 */
	public Adapter createIfcBuildingElementProxyTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingElementType <em>Ifc Building Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingElementType
	 * @generated
	 */
	public Adapter createIfcBuildingElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBuildingStorey <em>Ifc Building Storey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBuildingStorey
	 * @generated
	 */
	public Adapter createIfcBuildingStoreyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCShapeProfileDef <em>Ifc CShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcCShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCableCarrierFittingType <em>Ifc Cable Carrier Fitting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCableCarrierFittingType
	 * @generated
	 */
	public Adapter createIfcCableCarrierFittingTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCableCarrierSegmentType <em>Ifc Cable Carrier Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCableCarrierSegmentType
	 * @generated
	 */
	public Adapter createIfcCableCarrierSegmentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCableSegmentType <em>Ifc Cable Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCableSegmentType
	 * @generated
	 */
	public Adapter createIfcCableSegmentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCalendarDate <em>Ifc Calendar Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCalendarDate
	 * @generated
	 */
	public Adapter createIfcCalendarDateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCartesianPoint <em>Ifc Cartesian Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCartesianPoint
	 * @generated
	 */
	public Adapter createIfcCartesianPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator <em>Ifc Cartesian Transformation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator
	 * @generated
	 */
	public Adapter createIfcCartesianTransformationOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator2D <em>Ifc Cartesian Transformation Operator2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator2D
	 * @generated
	 */
	public Adapter createIfcCartesianTransformationOperator2DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator2DnonUniform <em>Ifc Cartesian Transformation Operator2 Dnon Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator2DnonUniform
	 * @generated
	 */
	public Adapter createIfcCartesianTransformationOperator2DnonUniformAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3D <em>Ifc Cartesian Transformation Operator3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3D
	 * @generated
	 */
	public Adapter createIfcCartesianTransformationOperator3DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3DnonUniform <em>Ifc Cartesian Transformation Operator3 Dnon Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator3DnonUniform
	 * @generated
	 */
	public Adapter createIfcCartesianTransformationOperator3DnonUniformAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCenterLineProfileDef <em>Ifc Center Line Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCenterLineProfileDef
	 * @generated
	 */
	public Adapter createIfcCenterLineProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcChamferEdgeFeature <em>Ifc Chamfer Edge Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcChamferEdgeFeature
	 * @generated
	 */
	public Adapter createIfcChamferEdgeFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcChillerType <em>Ifc Chiller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcChillerType
	 * @generated
	 */
	public Adapter createIfcChillerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCircle <em>Ifc Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCircle
	 * @generated
	 */
	public Adapter createIfcCircleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCircleHollowProfileDef <em>Ifc Circle Hollow Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCircleHollowProfileDef
	 * @generated
	 */
	public Adapter createIfcCircleHollowProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCircleProfileDef <em>Ifc Circle Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCircleProfileDef
	 * @generated
	 */
	public Adapter createIfcCircleProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassification <em>Ifc Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassification
	 * @generated
	 */
	public Adapter createIfcClassificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassificationItem <em>Ifc Classification Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassificationItem
	 * @generated
	 */
	public Adapter createIfcClassificationItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassificationItemRelationship <em>Ifc Classification Item Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassificationItemRelationship
	 * @generated
	 */
	public Adapter createIfcClassificationItemRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassificationNotation <em>Ifc Classification Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassificationNotation
	 * @generated
	 */
	public Adapter createIfcClassificationNotationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassificationNotationFacet <em>Ifc Classification Notation Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassificationNotationFacet
	 * @generated
	 */
	public Adapter createIfcClassificationNotationFacetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassificationReference <em>Ifc Classification Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassificationReference
	 * @generated
	 */
	public Adapter createIfcClassificationReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClosedShell <em>Ifc Closed Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClosedShell
	 * @generated
	 */
	public Adapter createIfcClosedShellAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCoilType <em>Ifc Coil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCoilType
	 * @generated
	 */
	public Adapter createIfcCoilTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcColourRgb <em>Ifc Colour Rgb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcColourRgb
	 * @generated
	 */
	public Adapter createIfcColourRgbAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcColourSpecification <em>Ifc Colour Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcColourSpecification
	 * @generated
	 */
	public Adapter createIfcColourSpecificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcColumn <em>Ifc Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcColumn
	 * @generated
	 */
	public Adapter createIfcColumnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcColumnType <em>Ifc Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcColumnType
	 * @generated
	 */
	public Adapter createIfcColumnTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcComplexProperty <em>Ifc Complex Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcComplexProperty
	 * @generated
	 */
	public Adapter createIfcComplexPropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCompositeCurve <em>Ifc Composite Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCompositeCurve
	 * @generated
	 */
	public Adapter createIfcCompositeCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCompositeCurveSegment <em>Ifc Composite Curve Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCompositeCurveSegment
	 * @generated
	 */
	public Adapter createIfcCompositeCurveSegmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCompositeProfileDef <em>Ifc Composite Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCompositeProfileDef
	 * @generated
	 */
	public Adapter createIfcCompositeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCompressorType <em>Ifc Compressor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCompressorType
	 * @generated
	 */
	public Adapter createIfcCompressorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCondenserType <em>Ifc Condenser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCondenserType
	 * @generated
	 */
	public Adapter createIfcCondenserTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCondition <em>Ifc Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCondition
	 * @generated
	 */
	public Adapter createIfcConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConditionCriterion <em>Ifc Condition Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConditionCriterion
	 * @generated
	 */
	public Adapter createIfcConditionCriterionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConic <em>Ifc Conic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConic
	 * @generated
	 */
	public Adapter createIfcConicAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectedFaceSet <em>Ifc Connected Face Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectedFaceSet
	 * @generated
	 */
	public Adapter createIfcConnectedFaceSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectionCurveGeometry <em>Ifc Connection Curve Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectionCurveGeometry
	 * @generated
	 */
	public Adapter createIfcConnectionCurveGeometryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectionGeometry <em>Ifc Connection Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectionGeometry
	 * @generated
	 */
	public Adapter createIfcConnectionGeometryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectionPointEccentricity <em>Ifc Connection Point Eccentricity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectionPointEccentricity
	 * @generated
	 */
	public Adapter createIfcConnectionPointEccentricityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectionPointGeometry <em>Ifc Connection Point Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectionPointGeometry
	 * @generated
	 */
	public Adapter createIfcConnectionPointGeometryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectionPortGeometry <em>Ifc Connection Port Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectionPortGeometry
	 * @generated
	 */
	public Adapter createIfcConnectionPortGeometryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry <em>Ifc Connection Surface Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConnectionSurfaceGeometry
	 * @generated
	 */
	public Adapter createIfcConnectionSurfaceGeometryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstraint <em>Ifc Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstraint
	 * @generated
	 */
	public Adapter createIfcConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship <em>Ifc Constraint Aggregation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstraintAggregationRelationship
	 * @generated
	 */
	public Adapter createIfcConstraintAggregationRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstraintClassificationRelationship <em>Ifc Constraint Classification Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstraintClassificationRelationship
	 * @generated
	 */
	public Adapter createIfcConstraintClassificationRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstraintRelationship <em>Ifc Constraint Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstraintRelationship
	 * @generated
	 */
	public Adapter createIfcConstraintRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstructionEquipmentResource <em>Ifc Construction Equipment Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstructionEquipmentResource
	 * @generated
	 */
	public Adapter createIfcConstructionEquipmentResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstructionMaterialResource <em>Ifc Construction Material Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstructionMaterialResource
	 * @generated
	 */
	public Adapter createIfcConstructionMaterialResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstructionProductResource <em>Ifc Construction Product Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstructionProductResource
	 * @generated
	 */
	public Adapter createIfcConstructionProductResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConstructionResource <em>Ifc Construction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConstructionResource
	 * @generated
	 */
	public Adapter createIfcConstructionResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcContextDependentUnit <em>Ifc Context Dependent Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcContextDependentUnit
	 * @generated
	 */
	public Adapter createIfcContextDependentUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcControl <em>Ifc Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcControl
	 * @generated
	 */
	public Adapter createIfcControlAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcControllerType <em>Ifc Controller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcControllerType
	 * @generated
	 */
	public Adapter createIfcControllerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConversionBasedUnit <em>Ifc Conversion Based Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConversionBasedUnit
	 * @generated
	 */
	public Adapter createIfcConversionBasedUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCooledBeamType <em>Ifc Cooled Beam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCooledBeamType
	 * @generated
	 */
	public Adapter createIfcCooledBeamTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCoolingTowerType <em>Ifc Cooling Tower Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCoolingTowerType
	 * @generated
	 */
	public Adapter createIfcCoolingTowerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCoordinatedUniversalTimeOffset <em>Ifc Coordinated Universal Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCoordinatedUniversalTimeOffset
	 * @generated
	 */
	public Adapter createIfcCoordinatedUniversalTimeOffsetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCostItem <em>Ifc Cost Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCostItem
	 * @generated
	 */
	public Adapter createIfcCostItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCostSchedule <em>Ifc Cost Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCostSchedule
	 * @generated
	 */
	public Adapter createIfcCostScheduleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCostValue <em>Ifc Cost Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCostValue
	 * @generated
	 */
	public Adapter createIfcCostValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCovering <em>Ifc Covering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCovering
	 * @generated
	 */
	public Adapter createIfcCoveringAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCoveringType <em>Ifc Covering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCoveringType
	 * @generated
	 */
	public Adapter createIfcCoveringTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCraneRailAShapeProfileDef <em>Ifc Crane Rail AShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCraneRailAShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcCraneRailAShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCraneRailFShapeProfileDef <em>Ifc Crane Rail FShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCraneRailFShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcCraneRailFShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCrewResource <em>Ifc Crew Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCrewResource
	 * @generated
	 */
	public Adapter createIfcCrewResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCsgPrimitive3D <em>Ifc Csg Primitive3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCsgPrimitive3D
	 * @generated
	 */
	public Adapter createIfcCsgPrimitive3DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCsgSolid <em>Ifc Csg Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCsgSolid
	 * @generated
	 */
	public Adapter createIfcCsgSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurrencyRelationship <em>Ifc Currency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurrencyRelationship
	 * @generated
	 */
	public Adapter createIfcCurrencyRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurtainWall <em>Ifc Curtain Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurtainWall
	 * @generated
	 */
	public Adapter createIfcCurtainWallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurtainWallType <em>Ifc Curtain Wall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurtainWallType
	 * @generated
	 */
	public Adapter createIfcCurtainWallTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurve <em>Ifc Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurve
	 * @generated
	 */
	public Adapter createIfcCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveBoundedPlane <em>Ifc Curve Bounded Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveBoundedPlane
	 * @generated
	 */
	public Adapter createIfcCurveBoundedPlaneAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveStyle <em>Ifc Curve Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveStyle
	 * @generated
	 */
	public Adapter createIfcCurveStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveStyleFont <em>Ifc Curve Style Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveStyleFont
	 * @generated
	 */
	public Adapter createIfcCurveStyleFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveStyleFontAndScaling <em>Ifc Curve Style Font And Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveStyleFontAndScaling
	 * @generated
	 */
	public Adapter createIfcCurveStyleFontAndScalingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveStyleFontPattern <em>Ifc Curve Style Font Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveStyleFontPattern
	 * @generated
	 */
	public Adapter createIfcCurveStyleFontPatternAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDamperType <em>Ifc Damper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDamperType
	 * @generated
	 */
	public Adapter createIfcDamperTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDateAndTime <em>Ifc Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDateAndTime
	 * @generated
	 */
	public Adapter createIfcDateAndTimeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDefinedSymbol <em>Ifc Defined Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDefinedSymbol
	 * @generated
	 */
	public Adapter createIfcDefinedSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDerivedProfileDef <em>Ifc Derived Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDerivedProfileDef
	 * @generated
	 */
	public Adapter createIfcDerivedProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDerivedUnit <em>Ifc Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDerivedUnit
	 * @generated
	 */
	public Adapter createIfcDerivedUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDerivedUnitElement <em>Ifc Derived Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDerivedUnitElement
	 * @generated
	 */
	public Adapter createIfcDerivedUnitElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDiameterDimension <em>Ifc Diameter Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDiameterDimension
	 * @generated
	 */
	public Adapter createIfcDiameterDimensionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDimensionCalloutRelationship <em>Ifc Dimension Callout Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDimensionCalloutRelationship
	 * @generated
	 */
	public Adapter createIfcDimensionCalloutRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDimensionCurve <em>Ifc Dimension Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDimensionCurve
	 * @generated
	 */
	public Adapter createIfcDimensionCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDimensionCurveDirectedCallout <em>Ifc Dimension Curve Directed Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDimensionCurveDirectedCallout
	 * @generated
	 */
	public Adapter createIfcDimensionCurveDirectedCalloutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDimensionCurveTerminator <em>Ifc Dimension Curve Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDimensionCurveTerminator
	 * @generated
	 */
	public Adapter createIfcDimensionCurveTerminatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDimensionPair <em>Ifc Dimension Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDimensionPair
	 * @generated
	 */
	public Adapter createIfcDimensionPairAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDimensionalExponents <em>Ifc Dimensional Exponents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDimensionalExponents
	 * @generated
	 */
	public Adapter createIfcDimensionalExponentsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDirection <em>Ifc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDirection
	 * @generated
	 */
	public Adapter createIfcDirectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDiscreteAccessory <em>Ifc Discrete Accessory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDiscreteAccessory
	 * @generated
	 */
	public Adapter createIfcDiscreteAccessoryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDiscreteAccessoryType <em>Ifc Discrete Accessory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDiscreteAccessoryType
	 * @generated
	 */
	public Adapter createIfcDiscreteAccessoryTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionChamberElement <em>Ifc Distribution Chamber Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionChamberElement
	 * @generated
	 */
	public Adapter createIfcDistributionChamberElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionChamberElementType <em>Ifc Distribution Chamber Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionChamberElementType
	 * @generated
	 */
	public Adapter createIfcDistributionChamberElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionControlElement <em>Ifc Distribution Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionControlElement
	 * @generated
	 */
	public Adapter createIfcDistributionControlElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionControlElementType <em>Ifc Distribution Control Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionControlElementType
	 * @generated
	 */
	public Adapter createIfcDistributionControlElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionElement <em>Ifc Distribution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionElement
	 * @generated
	 */
	public Adapter createIfcDistributionElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionElementType <em>Ifc Distribution Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionElementType
	 * @generated
	 */
	public Adapter createIfcDistributionElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionFlowElement <em>Ifc Distribution Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionFlowElement
	 * @generated
	 */
	public Adapter createIfcDistributionFlowElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionFlowElementType <em>Ifc Distribution Flow Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionFlowElementType
	 * @generated
	 */
	public Adapter createIfcDistributionFlowElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDistributionPort <em>Ifc Distribution Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDistributionPort
	 * @generated
	 */
	public Adapter createIfcDistributionPortAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDocumentElectronicFormat <em>Ifc Document Electronic Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDocumentElectronicFormat
	 * @generated
	 */
	public Adapter createIfcDocumentElectronicFormatAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDocumentInformation <em>Ifc Document Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDocumentInformation
	 * @generated
	 */
	public Adapter createIfcDocumentInformationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship <em>Ifc Document Information Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship
	 * @generated
	 */
	public Adapter createIfcDocumentInformationRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDocumentReference <em>Ifc Document Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDocumentReference
	 * @generated
	 */
	public Adapter createIfcDocumentReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDoor <em>Ifc Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDoor
	 * @generated
	 */
	public Adapter createIfcDoorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDoorLiningProperties <em>Ifc Door Lining Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDoorLiningProperties
	 * @generated
	 */
	public Adapter createIfcDoorLiningPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDoorPanelProperties <em>Ifc Door Panel Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDoorPanelProperties
	 * @generated
	 */
	public Adapter createIfcDoorPanelPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDoorStyle <em>Ifc Door Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDoorStyle
	 * @generated
	 */
	public Adapter createIfcDoorStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDraughtingCallout <em>Ifc Draughting Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingCallout
	 * @generated
	 */
	public Adapter createIfcDraughtingCalloutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship <em>Ifc Draughting Callout Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingCalloutRelationship
	 * @generated
	 */
	public Adapter createIfcDraughtingCalloutRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDraughtingPreDefinedColour <em>Ifc Draughting Pre Defined Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingPreDefinedColour
	 * @generated
	 */
	public Adapter createIfcDraughtingPreDefinedColourAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDraughtingPreDefinedCurveFont <em>Ifc Draughting Pre Defined Curve Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingPreDefinedCurveFont
	 * @generated
	 */
	public Adapter createIfcDraughtingPreDefinedCurveFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDraughtingPreDefinedTextFont <em>Ifc Draughting Pre Defined Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingPreDefinedTextFont
	 * @generated
	 */
	public Adapter createIfcDraughtingPreDefinedTextFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDuctFittingType <em>Ifc Duct Fitting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDuctFittingType
	 * @generated
	 */
	public Adapter createIfcDuctFittingTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDuctSegmentType <em>Ifc Duct Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDuctSegmentType
	 * @generated
	 */
	public Adapter createIfcDuctSegmentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDuctSilencerType <em>Ifc Duct Silencer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDuctSilencerType
	 * @generated
	 */
	public Adapter createIfcDuctSilencerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEdge <em>Ifc Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEdge
	 * @generated
	 */
	public Adapter createIfcEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEdgeCurve <em>Ifc Edge Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEdgeCurve
	 * @generated
	 */
	public Adapter createIfcEdgeCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEdgeFeature <em>Ifc Edge Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEdgeFeature
	 * @generated
	 */
	public Adapter createIfcEdgeFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEdgeLoop <em>Ifc Edge Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEdgeLoop
	 * @generated
	 */
	public Adapter createIfcEdgeLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricApplianceType <em>Ifc Electric Appliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricApplianceType
	 * @generated
	 */
	public Adapter createIfcElectricApplianceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricDistributionPoint <em>Ifc Electric Distribution Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricDistributionPoint
	 * @generated
	 */
	public Adapter createIfcElectricDistributionPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricFlowStorageDeviceType <em>Ifc Electric Flow Storage Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricFlowStorageDeviceType
	 * @generated
	 */
	public Adapter createIfcElectricFlowStorageDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricGeneratorType <em>Ifc Electric Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricGeneratorType
	 * @generated
	 */
	public Adapter createIfcElectricGeneratorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricHeaterType <em>Ifc Electric Heater Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricHeaterType
	 * @generated
	 */
	public Adapter createIfcElectricHeaterTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricMotorType <em>Ifc Electric Motor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricMotorType
	 * @generated
	 */
	public Adapter createIfcElectricMotorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricTimeControlType <em>Ifc Electric Time Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricTimeControlType
	 * @generated
	 */
	public Adapter createIfcElectricTimeControlTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricalBaseProperties <em>Ifc Electrical Base Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricalBaseProperties
	 * @generated
	 */
	public Adapter createIfcElectricalBasePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricalCircuit <em>Ifc Electrical Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricalCircuit
	 * @generated
	 */
	public Adapter createIfcElectricalCircuitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElectricalElement <em>Ifc Electrical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElectricalElement
	 * @generated
	 */
	public Adapter createIfcElectricalElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElement <em>Ifc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElement
	 * @generated
	 */
	public Adapter createIfcElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElementAssembly <em>Ifc Element Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElementAssembly
	 * @generated
	 */
	public Adapter createIfcElementAssemblyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElementComponent <em>Ifc Element Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElementComponent
	 * @generated
	 */
	public Adapter createIfcElementComponentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElementComponentType <em>Ifc Element Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElementComponentType
	 * @generated
	 */
	public Adapter createIfcElementComponentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElementQuantity <em>Ifc Element Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElementQuantity
	 * @generated
	 */
	public Adapter createIfcElementQuantityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElementType <em>Ifc Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElementType
	 * @generated
	 */
	public Adapter createIfcElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcElementarySurface <em>Ifc Elementary Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcElementarySurface
	 * @generated
	 */
	public Adapter createIfcElementarySurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEllipse <em>Ifc Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEllipse
	 * @generated
	 */
	public Adapter createIfcEllipseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEllipseProfileDef <em>Ifc Ellipse Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEllipseProfileDef
	 * @generated
	 */
	public Adapter createIfcEllipseProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEnergyConversionDevice <em>Ifc Energy Conversion Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEnergyConversionDevice
	 * @generated
	 */
	public Adapter createIfcEnergyConversionDeviceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEnergyConversionDeviceType <em>Ifc Energy Conversion Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEnergyConversionDeviceType
	 * @generated
	 */
	public Adapter createIfcEnergyConversionDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEnergyProperties <em>Ifc Energy Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEnergyProperties
	 * @generated
	 */
	public Adapter createIfcEnergyPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEnvironmentalImpactValue <em>Ifc Environmental Impact Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEnvironmentalImpactValue
	 * @generated
	 */
	public Adapter createIfcEnvironmentalImpactValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEquipmentElement <em>Ifc Equipment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEquipmentElement
	 * @generated
	 */
	public Adapter createIfcEquipmentElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEquipmentStandard <em>Ifc Equipment Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEquipmentStandard
	 * @generated
	 */
	public Adapter createIfcEquipmentStandardAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEvaporativeCoolerType <em>Ifc Evaporative Cooler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEvaporativeCoolerType
	 * @generated
	 */
	public Adapter createIfcEvaporativeCoolerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcEvaporatorType <em>Ifc Evaporator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcEvaporatorType
	 * @generated
	 */
	public Adapter createIfcEvaporatorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExtendedMaterialProperties <em>Ifc Extended Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExtendedMaterialProperties
	 * @generated
	 */
	public Adapter createIfcExtendedMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExternalReference <em>Ifc External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExternalReference
	 * @generated
	 */
	public Adapter createIfcExternalReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExternallyDefinedHatchStyle <em>Ifc Externally Defined Hatch Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExternallyDefinedHatchStyle
	 * @generated
	 */
	public Adapter createIfcExternallyDefinedHatchStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExternallyDefinedSurfaceStyle <em>Ifc Externally Defined Surface Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExternallyDefinedSurfaceStyle
	 * @generated
	 */
	public Adapter createIfcExternallyDefinedSurfaceStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExternallyDefinedSymbol <em>Ifc Externally Defined Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExternallyDefinedSymbol
	 * @generated
	 */
	public Adapter createIfcExternallyDefinedSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExternallyDefinedTextFont <em>Ifc Externally Defined Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExternallyDefinedTextFont
	 * @generated
	 */
	public Adapter createIfcExternallyDefinedTextFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcExtrudedAreaSolid <em>Ifc Extruded Area Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcExtrudedAreaSolid
	 * @generated
	 */
	public Adapter createIfcExtrudedAreaSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFace <em>Ifc Face</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFace
	 * @generated
	 */
	public Adapter createIfcFaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFaceBasedSurfaceModel <em>Ifc Face Based Surface Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFaceBasedSurfaceModel
	 * @generated
	 */
	public Adapter createIfcFaceBasedSurfaceModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFaceBound <em>Ifc Face Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFaceBound
	 * @generated
	 */
	public Adapter createIfcFaceBoundAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFaceOuterBound <em>Ifc Face Outer Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFaceOuterBound
	 * @generated
	 */
	public Adapter createIfcFaceOuterBoundAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFaceSurface <em>Ifc Face Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFaceSurface
	 * @generated
	 */
	public Adapter createIfcFaceSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFacetedBrep <em>Ifc Faceted Brep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFacetedBrep
	 * @generated
	 */
	public Adapter createIfcFacetedBrepAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFacetedBrepWithVoids <em>Ifc Faceted Brep With Voids</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFacetedBrepWithVoids
	 * @generated
	 */
	public Adapter createIfcFacetedBrepWithVoidsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFailureConnectionCondition <em>Ifc Failure Connection Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFailureConnectionCondition
	 * @generated
	 */
	public Adapter createIfcFailureConnectionConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFanType <em>Ifc Fan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFanType
	 * @generated
	 */
	public Adapter createIfcFanTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFastener <em>Ifc Fastener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFastener
	 * @generated
	 */
	public Adapter createIfcFastenerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFastenerType <em>Ifc Fastener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFastenerType
	 * @generated
	 */
	public Adapter createIfcFastenerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFeatureElement <em>Ifc Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFeatureElement
	 * @generated
	 */
	public Adapter createIfcFeatureElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFeatureElementAddition <em>Ifc Feature Element Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFeatureElementAddition
	 * @generated
	 */
	public Adapter createIfcFeatureElementAdditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFeatureElementSubtraction <em>Ifc Feature Element Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFeatureElementSubtraction
	 * @generated
	 */
	public Adapter createIfcFeatureElementSubtractionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyle <em>Ifc Fill Area Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFillAreaStyle
	 * @generated
	 */
	public Adapter createIfcFillAreaStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching <em>Ifc Fill Area Style Hatching</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFillAreaStyleHatching
	 * @generated
	 */
	public Adapter createIfcFillAreaStyleHatchingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleTileSymbolWithStyle <em>Ifc Fill Area Style Tile Symbol With Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFillAreaStyleTileSymbolWithStyle
	 * @generated
	 */
	public Adapter createIfcFillAreaStyleTileSymbolWithStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleTiles <em>Ifc Fill Area Style Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFillAreaStyleTiles
	 * @generated
	 */
	public Adapter createIfcFillAreaStyleTilesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFilterType <em>Ifc Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFilterType
	 * @generated
	 */
	public Adapter createIfcFilterTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFireSuppressionTerminalType <em>Ifc Fire Suppression Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFireSuppressionTerminalType
	 * @generated
	 */
	public Adapter createIfcFireSuppressionTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowController <em>Ifc Flow Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowController
	 * @generated
	 */
	public Adapter createIfcFlowControllerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowControllerType <em>Ifc Flow Controller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowControllerType
	 * @generated
	 */
	public Adapter createIfcFlowControllerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowFitting <em>Ifc Flow Fitting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowFitting
	 * @generated
	 */
	public Adapter createIfcFlowFittingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowFittingType <em>Ifc Flow Fitting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowFittingType
	 * @generated
	 */
	public Adapter createIfcFlowFittingTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowInstrumentType <em>Ifc Flow Instrument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowInstrumentType
	 * @generated
	 */
	public Adapter createIfcFlowInstrumentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowMeterType <em>Ifc Flow Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowMeterType
	 * @generated
	 */
	public Adapter createIfcFlowMeterTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowMovingDevice <em>Ifc Flow Moving Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowMovingDevice
	 * @generated
	 */
	public Adapter createIfcFlowMovingDeviceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowMovingDeviceType <em>Ifc Flow Moving Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowMovingDeviceType
	 * @generated
	 */
	public Adapter createIfcFlowMovingDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowSegment <em>Ifc Flow Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowSegment
	 * @generated
	 */
	public Adapter createIfcFlowSegmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowSegmentType <em>Ifc Flow Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowSegmentType
	 * @generated
	 */
	public Adapter createIfcFlowSegmentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowStorageDevice <em>Ifc Flow Storage Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowStorageDevice
	 * @generated
	 */
	public Adapter createIfcFlowStorageDeviceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowStorageDeviceType <em>Ifc Flow Storage Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowStorageDeviceType
	 * @generated
	 */
	public Adapter createIfcFlowStorageDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowTerminal <em>Ifc Flow Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowTerminal
	 * @generated
	 */
	public Adapter createIfcFlowTerminalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowTerminalType <em>Ifc Flow Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowTerminalType
	 * @generated
	 */
	public Adapter createIfcFlowTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowTreatmentDevice <em>Ifc Flow Treatment Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowTreatmentDevice
	 * @generated
	 */
	public Adapter createIfcFlowTreatmentDeviceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFlowTreatmentDeviceType <em>Ifc Flow Treatment Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFlowTreatmentDeviceType
	 * @generated
	 */
	public Adapter createIfcFlowTreatmentDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFluidFlowProperties <em>Ifc Fluid Flow Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFluidFlowProperties
	 * @generated
	 */
	public Adapter createIfcFluidFlowPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFooting <em>Ifc Footing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFooting
	 * @generated
	 */
	public Adapter createIfcFootingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFuelProperties <em>Ifc Fuel Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFuelProperties
	 * @generated
	 */
	public Adapter createIfcFuelPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFurnishingElement <em>Ifc Furnishing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFurnishingElement
	 * @generated
	 */
	public Adapter createIfcFurnishingElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFurnishingElementType <em>Ifc Furnishing Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFurnishingElementType
	 * @generated
	 */
	public Adapter createIfcFurnishingElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFurnitureStandard <em>Ifc Furniture Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFurnitureStandard
	 * @generated
	 */
	public Adapter createIfcFurnitureStandardAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFurnitureType <em>Ifc Furniture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFurnitureType
	 * @generated
	 */
	public Adapter createIfcFurnitureTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGasTerminalType <em>Ifc Gas Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGasTerminalType
	 * @generated
	 */
	public Adapter createIfcGasTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties <em>Ifc General Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeneralMaterialProperties
	 * @generated
	 */
	public Adapter createIfcGeneralMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeneralProfileProperties <em>Ifc General Profile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeneralProfileProperties
	 * @generated
	 */
	public Adapter createIfcGeneralProfilePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeometricCurveSet <em>Ifc Geometric Curve Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeometricCurveSet
	 * @generated
	 */
	public Adapter createIfcGeometricCurveSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeometricRepresentationContext <em>Ifc Geometric Representation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeometricRepresentationContext
	 * @generated
	 */
	public Adapter createIfcGeometricRepresentationContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeometricRepresentationItem <em>Ifc Geometric Representation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeometricRepresentationItem
	 * @generated
	 */
	public Adapter createIfcGeometricRepresentationItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeometricRepresentationSubContext <em>Ifc Geometric Representation Sub Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeometricRepresentationSubContext
	 * @generated
	 */
	public Adapter createIfcGeometricRepresentationSubContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeometricSet <em>Ifc Geometric Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeometricSet
	 * @generated
	 */
	public Adapter createIfcGeometricSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGrid <em>Ifc Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGrid
	 * @generated
	 */
	public Adapter createIfcGridAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGridAxis <em>Ifc Grid Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGridAxis
	 * @generated
	 */
	public Adapter createIfcGridAxisAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGridPlacement <em>Ifc Grid Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGridPlacement
	 * @generated
	 */
	public Adapter createIfcGridPlacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGroup <em>Ifc Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGroup
	 * @generated
	 */
	public Adapter createIfcGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHalfSpaceSolid <em>Ifc Half Space Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHalfSpaceSolid
	 * @generated
	 */
	public Adapter createIfcHalfSpaceSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHeatExchangerType <em>Ifc Heat Exchanger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHeatExchangerType
	 * @generated
	 */
	public Adapter createIfcHeatExchangerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHumidifierType <em>Ifc Humidifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHumidifierType
	 * @generated
	 */
	public Adapter createIfcHumidifierTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties <em>Ifc Hygroscopic Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHygroscopicMaterialProperties
	 * @generated
	 */
	public Adapter createIfcHygroscopicMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIShapeProfileDef <em>Ifc IShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcIShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcImageTexture <em>Ifc Image Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcImageTexture
	 * @generated
	 */
	public Adapter createIfcImageTextureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcInventory <em>Ifc Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcInventory
	 * @generated
	 */
	public Adapter createIfcInventoryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIrregularTimeSeries <em>Ifc Irregular Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIrregularTimeSeries
	 * @generated
	 */
	public Adapter createIfcIrregularTimeSeriesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcIrregularTimeSeriesValue <em>Ifc Irregular Time Series Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcIrregularTimeSeriesValue
	 * @generated
	 */
	public Adapter createIfcIrregularTimeSeriesValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcJunctionBoxType <em>Ifc Junction Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcJunctionBoxType
	 * @generated
	 */
	public Adapter createIfcJunctionBoxTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLShapeProfileDef <em>Ifc LShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcLShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLaborResource <em>Ifc Labor Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLaborResource
	 * @generated
	 */
	public Adapter createIfcLaborResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLampType <em>Ifc Lamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLampType
	 * @generated
	 */
	public Adapter createIfcLampTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLibraryInformation <em>Ifc Library Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLibraryInformation
	 * @generated
	 */
	public Adapter createIfcLibraryInformationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLibraryReference <em>Ifc Library Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLibraryReference
	 * @generated
	 */
	public Adapter createIfcLibraryReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightDistributionData <em>Ifc Light Distribution Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightDistributionData
	 * @generated
	 */
	public Adapter createIfcLightDistributionDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightFixtureType <em>Ifc Light Fixture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightFixtureType
	 * @generated
	 */
	public Adapter createIfcLightFixtureTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightIntensityDistribution <em>Ifc Light Intensity Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightIntensityDistribution
	 * @generated
	 */
	public Adapter createIfcLightIntensityDistributionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightSource <em>Ifc Light Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightSource
	 * @generated
	 */
	public Adapter createIfcLightSourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightSourceAmbient <em>Ifc Light Source Ambient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightSourceAmbient
	 * @generated
	 */
	public Adapter createIfcLightSourceAmbientAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightSourceDirectional <em>Ifc Light Source Directional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightSourceDirectional
	 * @generated
	 */
	public Adapter createIfcLightSourceDirectionalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightSourceGoniometric <em>Ifc Light Source Goniometric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightSourceGoniometric
	 * @generated
	 */
	public Adapter createIfcLightSourceGoniometricAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightSourcePositional <em>Ifc Light Source Positional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightSourcePositional
	 * @generated
	 */
	public Adapter createIfcLightSourcePositionalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightSourceSpot <em>Ifc Light Source Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightSourceSpot
	 * @generated
	 */
	public Adapter createIfcLightSourceSpotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLine <em>Ifc Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLine
	 * @generated
	 */
	public Adapter createIfcLineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLinearDimension <em>Ifc Linear Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLinearDimension
	 * @generated
	 */
	public Adapter createIfcLinearDimensionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLocalPlacement <em>Ifc Local Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLocalPlacement
	 * @generated
	 */
	public Adapter createIfcLocalPlacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLocalTime <em>Ifc Local Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLocalTime
	 * @generated
	 */
	public Adapter createIfcLocalTimeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLoop <em>Ifc Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLoop
	 * @generated
	 */
	public Adapter createIfcLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcManifoldSolidBrep <em>Ifc Manifold Solid Brep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcManifoldSolidBrep
	 * @generated
	 */
	public Adapter createIfcManifoldSolidBrepAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMappedItem <em>Ifc Mapped Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMappedItem
	 * @generated
	 */
	public Adapter createIfcMappedItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterial <em>Ifc Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterial
	 * @generated
	 */
	public Adapter createIfcMaterialAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialClassificationRelationship <em>Ifc Material Classification Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialClassificationRelationship
	 * @generated
	 */
	public Adapter createIfcMaterialClassificationRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialDefinitionRepresentation <em>Ifc Material Definition Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialDefinitionRepresentation
	 * @generated
	 */
	public Adapter createIfcMaterialDefinitionRepresentationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialLayer <em>Ifc Material Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialLayer
	 * @generated
	 */
	public Adapter createIfcMaterialLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialLayerSet <em>Ifc Material Layer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialLayerSet
	 * @generated
	 */
	public Adapter createIfcMaterialLayerSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialLayerSetUsage <em>Ifc Material Layer Set Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialLayerSetUsage
	 * @generated
	 */
	public Adapter createIfcMaterialLayerSetUsageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialList <em>Ifc Material List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialList
	 * @generated
	 */
	public Adapter createIfcMaterialListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialProperties <em>Ifc Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialProperties
	 * @generated
	 */
	public Adapter createIfcMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMeasureWithUnit <em>Ifc Measure With Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMeasureWithUnit
	 * @generated
	 */
	public Adapter createIfcMeasureWithUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties <em>Ifc Mechanical Concrete Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMechanicalConcreteMaterialProperties
	 * @generated
	 */
	public Adapter createIfcMechanicalConcreteMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastener <em>Ifc Mechanical Fastener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMechanicalFastener
	 * @generated
	 */
	public Adapter createIfcMechanicalFastenerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMechanicalFastenerType <em>Ifc Mechanical Fastener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMechanicalFastenerType
	 * @generated
	 */
	public Adapter createIfcMechanicalFastenerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMechanicalMaterialProperties <em>Ifc Mechanical Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMechanicalMaterialProperties
	 * @generated
	 */
	public Adapter createIfcMechanicalMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMechanicalSteelMaterialProperties <em>Ifc Mechanical Steel Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMechanicalSteelMaterialProperties
	 * @generated
	 */
	public Adapter createIfcMechanicalSteelMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMember <em>Ifc Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMember
	 * @generated
	 */
	public Adapter createIfcMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMemberType <em>Ifc Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMemberType
	 * @generated
	 */
	public Adapter createIfcMemberTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMetric <em>Ifc Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMetric
	 * @generated
	 */
	public Adapter createIfcMetricAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMonetaryUnit <em>Ifc Monetary Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMonetaryUnit
	 * @generated
	 */
	public Adapter createIfcMonetaryUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMotorConnectionType <em>Ifc Motor Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMotorConnectionType
	 * @generated
	 */
	public Adapter createIfcMotorConnectionTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMove <em>Ifc Move</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMove
	 * @generated
	 */
	public Adapter createIfcMoveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcNamedUnit <em>Ifc Named Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcNamedUnit
	 * @generated
	 */
	public Adapter createIfcNamedUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcObject <em>Ifc Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcObject
	 * @generated
	 */
	public Adapter createIfcObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcObjectDefinition <em>Ifc Object Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcObjectDefinition
	 * @generated
	 */
	public Adapter createIfcObjectDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcObjectPlacement <em>Ifc Object Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcObjectPlacement
	 * @generated
	 */
	public Adapter createIfcObjectPlacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcObjective <em>Ifc Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcObjective
	 * @generated
	 */
	public Adapter createIfcObjectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOccupant <em>Ifc Occupant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOccupant
	 * @generated
	 */
	public Adapter createIfcOccupantAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOffsetCurve2D <em>Ifc Offset Curve2 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOffsetCurve2D
	 * @generated
	 */
	public Adapter createIfcOffsetCurve2DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOffsetCurve3D <em>Ifc Offset Curve3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOffsetCurve3D
	 * @generated
	 */
	public Adapter createIfcOffsetCurve3DAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOneDirectionRepeatFactor <em>Ifc One Direction Repeat Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOneDirectionRepeatFactor
	 * @generated
	 */
	public Adapter createIfcOneDirectionRepeatFactorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOpenShell <em>Ifc Open Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOpenShell
	 * @generated
	 */
	public Adapter createIfcOpenShellAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOpeningElement <em>Ifc Opening Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOpeningElement
	 * @generated
	 */
	public Adapter createIfcOpeningElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOpticalMaterialProperties <em>Ifc Optical Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOpticalMaterialProperties
	 * @generated
	 */
	public Adapter createIfcOpticalMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOrderAction <em>Ifc Order Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOrderAction
	 * @generated
	 */
	public Adapter createIfcOrderActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOrganization <em>Ifc Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOrganization
	 * @generated
	 */
	public Adapter createIfcOrganizationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOrganizationRelationship <em>Ifc Organization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOrganizationRelationship
	 * @generated
	 */
	public Adapter createIfcOrganizationRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOrientedEdge <em>Ifc Oriented Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOrientedEdge
	 * @generated
	 */
	public Adapter createIfcOrientedEdgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOutletType <em>Ifc Outlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOutletType
	 * @generated
	 */
	public Adapter createIfcOutletTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOwnerHistory <em>Ifc Owner History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOwnerHistory
	 * @generated
	 */
	public Adapter createIfcOwnerHistoryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcParameterizedProfileDef <em>Ifc Parameterized Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcParameterizedProfileDef
	 * @generated
	 */
	public Adapter createIfcParameterizedProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPath <em>Ifc Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPath
	 * @generated
	 */
	public Adapter createIfcPathAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPerformanceHistory <em>Ifc Performance History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPerformanceHistory
	 * @generated
	 */
	public Adapter createIfcPerformanceHistoryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPermeableCoveringProperties <em>Ifc Permeable Covering Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPermeableCoveringProperties
	 * @generated
	 */
	public Adapter createIfcPermeableCoveringPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPermit <em>Ifc Permit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPermit
	 * @generated
	 */
	public Adapter createIfcPermitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPerson <em>Ifc Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPerson
	 * @generated
	 */
	public Adapter createIfcPersonAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPersonAndOrganization <em>Ifc Person And Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPersonAndOrganization
	 * @generated
	 */
	public Adapter createIfcPersonAndOrganizationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity <em>Ifc Physical Complex Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPhysicalComplexQuantity
	 * @generated
	 */
	public Adapter createIfcPhysicalComplexQuantityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPhysicalQuantity <em>Ifc Physical Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPhysicalQuantity
	 * @generated
	 */
	public Adapter createIfcPhysicalQuantityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPhysicalSimpleQuantity <em>Ifc Physical Simple Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPhysicalSimpleQuantity
	 * @generated
	 */
	public Adapter createIfcPhysicalSimpleQuantityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPile <em>Ifc Pile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPile
	 * @generated
	 */
	public Adapter createIfcPileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPipeFittingType <em>Ifc Pipe Fitting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPipeFittingType
	 * @generated
	 */
	public Adapter createIfcPipeFittingTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPipeSegmentType <em>Ifc Pipe Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPipeSegmentType
	 * @generated
	 */
	public Adapter createIfcPipeSegmentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPixelTexture <em>Ifc Pixel Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPixelTexture
	 * @generated
	 */
	public Adapter createIfcPixelTextureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlacement <em>Ifc Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlacement
	 * @generated
	 */
	public Adapter createIfcPlacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlanarBox <em>Ifc Planar Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlanarBox
	 * @generated
	 */
	public Adapter createIfcPlanarBoxAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlanarExtent <em>Ifc Planar Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlanarExtent
	 * @generated
	 */
	public Adapter createIfcPlanarExtentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlane <em>Ifc Plane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlane
	 * @generated
	 */
	public Adapter createIfcPlaneAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlate <em>Ifc Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlate
	 * @generated
	 */
	public Adapter createIfcPlateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPlateType <em>Ifc Plate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPlateType
	 * @generated
	 */
	public Adapter createIfcPlateTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPoint <em>Ifc Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPoint
	 * @generated
	 */
	public Adapter createIfcPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPointOnCurve <em>Ifc Point On Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPointOnCurve
	 * @generated
	 */
	public Adapter createIfcPointOnCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPointOnSurface <em>Ifc Point On Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPointOnSurface
	 * @generated
	 */
	public Adapter createIfcPointOnSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPolyLoop <em>Ifc Poly Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPolyLoop
	 * @generated
	 */
	public Adapter createIfcPolyLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPolygonalBoundedHalfSpace <em>Ifc Polygonal Bounded Half Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPolygonalBoundedHalfSpace
	 * @generated
	 */
	public Adapter createIfcPolygonalBoundedHalfSpaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPolyline <em>Ifc Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPolyline
	 * @generated
	 */
	public Adapter createIfcPolylineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPort <em>Ifc Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPort
	 * @generated
	 */
	public Adapter createIfcPortAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPostalAddress <em>Ifc Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPostalAddress
	 * @generated
	 */
	public Adapter createIfcPostalAddressAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedColour
	 * @generated
	 */
	public Adapter createIfcPreDefinedColourAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedCurveFont <em>Ifc Pre Defined Curve Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedCurveFont
	 * @generated
	 */
	public Adapter createIfcPreDefinedCurveFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedDimensionSymbol <em>Ifc Pre Defined Dimension Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedDimensionSymbol
	 * @generated
	 */
	public Adapter createIfcPreDefinedDimensionSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedItem <em>Ifc Pre Defined Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedItem
	 * @generated
	 */
	public Adapter createIfcPreDefinedItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedPointMarkerSymbol <em>Ifc Pre Defined Point Marker Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedPointMarkerSymbol
	 * @generated
	 */
	public Adapter createIfcPreDefinedPointMarkerSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedSymbol <em>Ifc Pre Defined Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedSymbol
	 * @generated
	 */
	public Adapter createIfcPreDefinedSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedTerminatorSymbol <em>Ifc Pre Defined Terminator Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedTerminatorSymbol
	 * @generated
	 */
	public Adapter createIfcPreDefinedTerminatorSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPreDefinedTextFont <em>Ifc Pre Defined Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPreDefinedTextFont
	 * @generated
	 */
	public Adapter createIfcPreDefinedTextFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPresentationLayerAssignment <em>Ifc Presentation Layer Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPresentationLayerAssignment
	 * @generated
	 */
	public Adapter createIfcPresentationLayerAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPresentationLayerWithStyle <em>Ifc Presentation Layer With Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPresentationLayerWithStyle
	 * @generated
	 */
	public Adapter createIfcPresentationLayerWithStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPresentationStyle <em>Ifc Presentation Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPresentationStyle
	 * @generated
	 */
	public Adapter createIfcPresentationStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPresentationStyleAssignment <em>Ifc Presentation Style Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPresentationStyleAssignment
	 * @generated
	 */
	public Adapter createIfcPresentationStyleAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProcedure <em>Ifc Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProcedure
	 * @generated
	 */
	public Adapter createIfcProcedureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProcess <em>Ifc Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProcess
	 * @generated
	 */
	public Adapter createIfcProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProduct <em>Ifc Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProduct
	 * @generated
	 */
	public Adapter createIfcProductAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProductDefinitionShape <em>Ifc Product Definition Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProductDefinitionShape
	 * @generated
	 */
	public Adapter createIfcProductDefinitionShapeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProductRepresentation <em>Ifc Product Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProductRepresentation
	 * @generated
	 */
	public Adapter createIfcProductRepresentationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProductsOfCombustionProperties <em>Ifc Products Of Combustion Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProductsOfCombustionProperties
	 * @generated
	 */
	public Adapter createIfcProductsOfCombustionPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProfileDef <em>Ifc Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProfileDef
	 * @generated
	 */
	public Adapter createIfcProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProfileProperties <em>Ifc Profile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProfileProperties
	 * @generated
	 */
	public Adapter createIfcProfilePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProject <em>Ifc Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProject
	 * @generated
	 */
	public Adapter createIfcProjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProjectOrder <em>Ifc Project Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProjectOrder
	 * @generated
	 */
	public Adapter createIfcProjectOrderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProjectOrderRecord <em>Ifc Project Order Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProjectOrderRecord
	 * @generated
	 */
	public Adapter createIfcProjectOrderRecordAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProjectionCurve <em>Ifc Projection Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProjectionCurve
	 * @generated
	 */
	public Adapter createIfcProjectionCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProjectionElement <em>Ifc Projection Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProjectionElement
	 * @generated
	 */
	public Adapter createIfcProjectionElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProperty <em>Ifc Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProperty
	 * @generated
	 */
	public Adapter createIfcPropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyBoundedValue <em>Ifc Property Bounded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyBoundedValue
	 * @generated
	 */
	public Adapter createIfcPropertyBoundedValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyConstraintRelationship <em>Ifc Property Constraint Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyConstraintRelationship
	 * @generated
	 */
	public Adapter createIfcPropertyConstraintRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyDefinition <em>Ifc Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyDefinition
	 * @generated
	 */
	public Adapter createIfcPropertyDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyDependencyRelationship <em>Ifc Property Dependency Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyDependencyRelationship
	 * @generated
	 */
	public Adapter createIfcPropertyDependencyRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyEnumeratedValue <em>Ifc Property Enumerated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyEnumeratedValue
	 * @generated
	 */
	public Adapter createIfcPropertyEnumeratedValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyEnumeration <em>Ifc Property Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyEnumeration
	 * @generated
	 */
	public Adapter createIfcPropertyEnumerationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyListValue <em>Ifc Property List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyListValue
	 * @generated
	 */
	public Adapter createIfcPropertyListValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyReferenceValue <em>Ifc Property Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyReferenceValue
	 * @generated
	 */
	public Adapter createIfcPropertyReferenceValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertySet <em>Ifc Property Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertySet
	 * @generated
	 */
	public Adapter createIfcPropertySetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertySetDefinition <em>Ifc Property Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertySetDefinition
	 * @generated
	 */
	public Adapter createIfcPropertySetDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertySingleValue <em>Ifc Property Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertySingleValue
	 * @generated
	 */
	public Adapter createIfcPropertySingleValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPropertyTableValue <em>Ifc Property Table Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPropertyTableValue
	 * @generated
	 */
	public Adapter createIfcPropertyTableValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProtectiveDeviceType <em>Ifc Protective Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProtectiveDeviceType
	 * @generated
	 */
	public Adapter createIfcProtectiveDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcProxy <em>Ifc Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcProxy
	 * @generated
	 */
	public Adapter createIfcProxyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPumpType <em>Ifc Pump Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPumpType
	 * @generated
	 */
	public Adapter createIfcPumpTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcQuantityArea <em>Ifc Quantity Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcQuantityArea
	 * @generated
	 */
	public Adapter createIfcQuantityAreaAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcQuantityCount <em>Ifc Quantity Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcQuantityCount
	 * @generated
	 */
	public Adapter createIfcQuantityCountAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcQuantityLength <em>Ifc Quantity Length</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcQuantityLength
	 * @generated
	 */
	public Adapter createIfcQuantityLengthAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcQuantityTime <em>Ifc Quantity Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcQuantityTime
	 * @generated
	 */
	public Adapter createIfcQuantityTimeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcQuantityVolume <em>Ifc Quantity Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcQuantityVolume
	 * @generated
	 */
	public Adapter createIfcQuantityVolumeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcQuantityWeight <em>Ifc Quantity Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcQuantityWeight
	 * @generated
	 */
	public Adapter createIfcQuantityWeightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRadiusDimension <em>Ifc Radius Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRadiusDimension
	 * @generated
	 */
	public Adapter createIfcRadiusDimensionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRailing <em>Ifc Railing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRailing
	 * @generated
	 */
	public Adapter createIfcRailingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRailingType <em>Ifc Railing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRailingType
	 * @generated
	 */
	public Adapter createIfcRailingTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRamp <em>Ifc Ramp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRamp
	 * @generated
	 */
	public Adapter createIfcRampAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRampFlight <em>Ifc Ramp Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRampFlight
	 * @generated
	 */
	public Adapter createIfcRampFlightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRampFlightType <em>Ifc Ramp Flight Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRampFlightType
	 * @generated
	 */
	public Adapter createIfcRampFlightTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRationalBezierCurve <em>Ifc Rational Bezier Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRationalBezierCurve
	 * @generated
	 */
	public Adapter createIfcRationalBezierCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRectangleHollowProfileDef <em>Ifc Rectangle Hollow Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRectangleHollowProfileDef
	 * @generated
	 */
	public Adapter createIfcRectangleHollowProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRectangleProfileDef <em>Ifc Rectangle Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRectangleProfileDef
	 * @generated
	 */
	public Adapter createIfcRectangleProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRectangularPyramid <em>Ifc Rectangular Pyramid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRectangularPyramid
	 * @generated
	 */
	public Adapter createIfcRectangularPyramidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface <em>Ifc Rectangular Trimmed Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRectangularTrimmedSurface
	 * @generated
	 */
	public Adapter createIfcRectangularTrimmedSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReferencesValueDocument <em>Ifc References Value Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReferencesValueDocument
	 * @generated
	 */
	public Adapter createIfcReferencesValueDocumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRegularTimeSeries <em>Ifc Regular Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRegularTimeSeries
	 * @generated
	 */
	public Adapter createIfcRegularTimeSeriesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReinforcementBarProperties <em>Ifc Reinforcement Bar Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReinforcementBarProperties
	 * @generated
	 */
	public Adapter createIfcReinforcementBarPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReinforcementDefinitionProperties <em>Ifc Reinforcement Definition Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReinforcementDefinitionProperties
	 * @generated
	 */
	public Adapter createIfcReinforcementDefinitionPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReinforcingBar <em>Ifc Reinforcing Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReinforcingBar
	 * @generated
	 */
	public Adapter createIfcReinforcingBarAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReinforcingElement <em>Ifc Reinforcing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReinforcingElement
	 * @generated
	 */
	public Adapter createIfcReinforcingElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcReinforcingMesh <em>Ifc Reinforcing Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcReinforcingMesh
	 * @generated
	 */
	public Adapter createIfcReinforcingMeshAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAggregates <em>Ifc Rel Aggregates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAggregates
	 * @generated
	 */
	public Adapter createIfcRelAggregatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssigns <em>Ifc Rel Assigns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssigns
	 * @generated
	 */
	public Adapter createIfcRelAssignsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsTasks <em>Ifc Rel Assigns Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsTasks
	 * @generated
	 */
	public Adapter createIfcRelAssignsTasksAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToActor <em>Ifc Rel Assigns To Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToActor
	 * @generated
	 */
	public Adapter createIfcRelAssignsToActorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToControl <em>Ifc Rel Assigns To Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToControl
	 * @generated
	 */
	public Adapter createIfcRelAssignsToControlAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToGroup <em>Ifc Rel Assigns To Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToGroup
	 * @generated
	 */
	public Adapter createIfcRelAssignsToGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToProcess <em>Ifc Rel Assigns To Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToProcess
	 * @generated
	 */
	public Adapter createIfcRelAssignsToProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToProduct <em>Ifc Rel Assigns To Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToProduct
	 * @generated
	 */
	public Adapter createIfcRelAssignsToProductAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToProjectOrder <em>Ifc Rel Assigns To Project Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToProjectOrder
	 * @generated
	 */
	public Adapter createIfcRelAssignsToProjectOrderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssignsToResource <em>Ifc Rel Assigns To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssignsToResource
	 * @generated
	 */
	public Adapter createIfcRelAssignsToResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociates <em>Ifc Rel Associates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociates
	 * @generated
	 */
	public Adapter createIfcRelAssociatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesAppliedValue <em>Ifc Rel Associates Applied Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesAppliedValue
	 * @generated
	 */
	public Adapter createIfcRelAssociatesAppliedValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesApproval <em>Ifc Rel Associates Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesApproval
	 * @generated
	 */
	public Adapter createIfcRelAssociatesApprovalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesClassification <em>Ifc Rel Associates Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesClassification
	 * @generated
	 */
	public Adapter createIfcRelAssociatesClassificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesConstraint <em>Ifc Rel Associates Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesConstraint
	 * @generated
	 */
	public Adapter createIfcRelAssociatesConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesDocument <em>Ifc Rel Associates Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesDocument
	 * @generated
	 */
	public Adapter createIfcRelAssociatesDocumentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesLibrary <em>Ifc Rel Associates Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesLibrary
	 * @generated
	 */
	public Adapter createIfcRelAssociatesLibraryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesMaterial <em>Ifc Rel Associates Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesMaterial
	 * @generated
	 */
	public Adapter createIfcRelAssociatesMaterialAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelAssociatesProfileProperties <em>Ifc Rel Associates Profile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelAssociatesProfileProperties
	 * @generated
	 */
	public Adapter createIfcRelAssociatesProfilePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnects <em>Ifc Rel Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnects
	 * @generated
	 */
	public Adapter createIfcRelConnectsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsElements <em>Ifc Rel Connects Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsElements
	 * @generated
	 */
	public Adapter createIfcRelConnectsElementsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsPathElements <em>Ifc Rel Connects Path Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsPathElements
	 * @generated
	 */
	public Adapter createIfcRelConnectsPathElementsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsPortToElement <em>Ifc Rel Connects Port To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsPortToElement
	 * @generated
	 */
	public Adapter createIfcRelConnectsPortToElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsPorts <em>Ifc Rel Connects Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsPorts
	 * @generated
	 */
	public Adapter createIfcRelConnectsPortsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralActivity <em>Ifc Rel Connects Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsStructuralActivity
	 * @generated
	 */
	public Adapter createIfcRelConnectsStructuralActivityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralElement <em>Ifc Rel Connects Structural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsStructuralElement
	 * @generated
	 */
	public Adapter createIfcRelConnectsStructuralElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember <em>Ifc Rel Connects Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsStructuralMember
	 * @generated
	 */
	public Adapter createIfcRelConnectsStructuralMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithEccentricity <em>Ifc Rel Connects With Eccentricity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsWithEccentricity
	 * @generated
	 */
	public Adapter createIfcRelConnectsWithEccentricityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements <em>Ifc Rel Connects With Realizing Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelConnectsWithRealizingElements
	 * @generated
	 */
	public Adapter createIfcRelConnectsWithRealizingElementsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelContainedInSpatialStructure <em>Ifc Rel Contained In Spatial Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelContainedInSpatialStructure
	 * @generated
	 */
	public Adapter createIfcRelContainedInSpatialStructureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelCoversBldgElements <em>Ifc Rel Covers Bldg Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelCoversBldgElements
	 * @generated
	 */
	public Adapter createIfcRelCoversBldgElementsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelCoversSpaces <em>Ifc Rel Covers Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelCoversSpaces
	 * @generated
	 */
	public Adapter createIfcRelCoversSpacesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelDecomposes <em>Ifc Rel Decomposes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelDecomposes
	 * @generated
	 */
	public Adapter createIfcRelDecomposesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelDefines <em>Ifc Rel Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelDefines
	 * @generated
	 */
	public Adapter createIfcRelDefinesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelDefinesByProperties <em>Ifc Rel Defines By Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelDefinesByProperties
	 * @generated
	 */
	public Adapter createIfcRelDefinesByPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelDefinesByType <em>Ifc Rel Defines By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelDefinesByType
	 * @generated
	 */
	public Adapter createIfcRelDefinesByTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelFillsElement <em>Ifc Rel Fills Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelFillsElement
	 * @generated
	 */
	public Adapter createIfcRelFillsElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelFlowControlElements <em>Ifc Rel Flow Control Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelFlowControlElements
	 * @generated
	 */
	public Adapter createIfcRelFlowControlElementsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelInteractionRequirements <em>Ifc Rel Interaction Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelInteractionRequirements
	 * @generated
	 */
	public Adapter createIfcRelInteractionRequirementsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelNests <em>Ifc Rel Nests</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelNests
	 * @generated
	 */
	public Adapter createIfcRelNestsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelOccupiesSpaces <em>Ifc Rel Occupies Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelOccupiesSpaces
	 * @generated
	 */
	public Adapter createIfcRelOccupiesSpacesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelOverridesProperties <em>Ifc Rel Overrides Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelOverridesProperties
	 * @generated
	 */
	public Adapter createIfcRelOverridesPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelProjectsElement <em>Ifc Rel Projects Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelProjectsElement
	 * @generated
	 */
	public Adapter createIfcRelProjectsElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelReferencedInSpatialStructure <em>Ifc Rel Referenced In Spatial Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelReferencedInSpatialStructure
	 * @generated
	 */
	public Adapter createIfcRelReferencedInSpatialStructureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelSchedulesCostItems <em>Ifc Rel Schedules Cost Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelSchedulesCostItems
	 * @generated
	 */
	public Adapter createIfcRelSchedulesCostItemsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelSequence <em>Ifc Rel Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelSequence
	 * @generated
	 */
	public Adapter createIfcRelSequenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelServicesBuildings <em>Ifc Rel Services Buildings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelServicesBuildings
	 * @generated
	 */
	public Adapter createIfcRelServicesBuildingsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelSpaceBoundary <em>Ifc Rel Space Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelSpaceBoundary
	 * @generated
	 */
	public Adapter createIfcRelSpaceBoundaryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelVoidsElement <em>Ifc Rel Voids Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelVoidsElement
	 * @generated
	 */
	public Adapter createIfcRelVoidsElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelationship <em>Ifc Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelationship
	 * @generated
	 */
	public Adapter createIfcRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRelaxation <em>Ifc Relaxation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRelaxation
	 * @generated
	 */
	public Adapter createIfcRelaxationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRepresentation <em>Ifc Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRepresentation
	 * @generated
	 */
	public Adapter createIfcRepresentationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRepresentationContext <em>Ifc Representation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRepresentationContext
	 * @generated
	 */
	public Adapter createIfcRepresentationContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRepresentationItem <em>Ifc Representation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRepresentationItem
	 * @generated
	 */
	public Adapter createIfcRepresentationItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRepresentationMap <em>Ifc Representation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRepresentationMap
	 * @generated
	 */
	public Adapter createIfcRepresentationMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcResource <em>Ifc Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcResource
	 * @generated
	 */
	public Adapter createIfcResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRevolvedAreaSolid <em>Ifc Revolved Area Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRevolvedAreaSolid
	 * @generated
	 */
	public Adapter createIfcRevolvedAreaSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRibPlateProfileProperties <em>Ifc Rib Plate Profile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRibPlateProfileProperties
	 * @generated
	 */
	public Adapter createIfcRibPlateProfilePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRightCircularCone <em>Ifc Right Circular Cone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRightCircularCone
	 * @generated
	 */
	public Adapter createIfcRightCircularConeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRightCircularCylinder <em>Ifc Right Circular Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRightCircularCylinder
	 * @generated
	 */
	public Adapter createIfcRightCircularCylinderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRoof <em>Ifc Roof</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRoof
	 * @generated
	 */
	public Adapter createIfcRoofAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRoot <em>Ifc Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRoot
	 * @generated
	 */
	public Adapter createIfcRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRoundedEdgeFeature <em>Ifc Rounded Edge Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRoundedEdgeFeature
	 * @generated
	 */
	public Adapter createIfcRoundedEdgeFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcRoundedRectangleProfileDef <em>Ifc Rounded Rectangle Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcRoundedRectangleProfileDef
	 * @generated
	 */
	public Adapter createIfcRoundedRectangleProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSIUnit <em>Ifc SI Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSIUnit
	 * @generated
	 */
	public Adapter createIfcSIUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSanitaryTerminalType <em>Ifc Sanitary Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSanitaryTerminalType
	 * @generated
	 */
	public Adapter createIfcSanitaryTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcScheduleTimeControl <em>Ifc Schedule Time Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcScheduleTimeControl
	 * @generated
	 */
	public Adapter createIfcScheduleTimeControlAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSectionProperties <em>Ifc Section Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSectionProperties
	 * @generated
	 */
	public Adapter createIfcSectionPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSectionReinforcementProperties <em>Ifc Section Reinforcement Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSectionReinforcementProperties
	 * @generated
	 */
	public Adapter createIfcSectionReinforcementPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSectionedSpine <em>Ifc Sectioned Spine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSectionedSpine
	 * @generated
	 */
	public Adapter createIfcSectionedSpineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSensorType <em>Ifc Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSensorType
	 * @generated
	 */
	public Adapter createIfcSensorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcServiceLife <em>Ifc Service Life</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcServiceLife
	 * @generated
	 */
	public Adapter createIfcServiceLifeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcServiceLifeFactor <em>Ifc Service Life Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcServiceLifeFactor
	 * @generated
	 */
	public Adapter createIfcServiceLifeFactorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcShapeAspect <em>Ifc Shape Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcShapeAspect
	 * @generated
	 */
	public Adapter createIfcShapeAspectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcShapeModel <em>Ifc Shape Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcShapeModel
	 * @generated
	 */
	public Adapter createIfcShapeModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcShapeRepresentation <em>Ifc Shape Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcShapeRepresentation
	 * @generated
	 */
	public Adapter createIfcShapeRepresentationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcShellBasedSurfaceModel <em>Ifc Shell Based Surface Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcShellBasedSurfaceModel
	 * @generated
	 */
	public Adapter createIfcShellBasedSurfaceModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSimpleProperty <em>Ifc Simple Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSimpleProperty
	 * @generated
	 */
	public Adapter createIfcSimplePropertyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSite <em>Ifc Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSite
	 * @generated
	 */
	public Adapter createIfcSiteAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSlab <em>Ifc Slab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSlab
	 * @generated
	 */
	public Adapter createIfcSlabAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSlabType <em>Ifc Slab Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSlabType
	 * @generated
	 */
	public Adapter createIfcSlabTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSlippageConnectionCondition <em>Ifc Slippage Connection Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSlippageConnectionCondition
	 * @generated
	 */
	public Adapter createIfcSlippageConnectionConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSolidModel <em>Ifc Solid Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSolidModel
	 * @generated
	 */
	public Adapter createIfcSolidModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSoundProperties <em>Ifc Sound Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSoundProperties
	 * @generated
	 */
	public Adapter createIfcSoundPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSoundValue <em>Ifc Sound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSoundValue
	 * @generated
	 */
	public Adapter createIfcSoundValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpace <em>Ifc Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpace
	 * @generated
	 */
	public Adapter createIfcSpaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpaceHeaterType <em>Ifc Space Heater Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpaceHeaterType
	 * @generated
	 */
	public Adapter createIfcSpaceHeaterTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpaceProgram <em>Ifc Space Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpaceProgram
	 * @generated
	 */
	public Adapter createIfcSpaceProgramAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpaceThermalLoadProperties <em>Ifc Space Thermal Load Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpaceThermalLoadProperties
	 * @generated
	 */
	public Adapter createIfcSpaceThermalLoadPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpaceType <em>Ifc Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpaceType
	 * @generated
	 */
	public Adapter createIfcSpaceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpatialStructureElement <em>Ifc Spatial Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpatialStructureElement
	 * @generated
	 */
	public Adapter createIfcSpatialStructureElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpatialStructureElementType <em>Ifc Spatial Structure Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpatialStructureElementType
	 * @generated
	 */
	public Adapter createIfcSpatialStructureElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSphere <em>Ifc Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSphere
	 * @generated
	 */
	public Adapter createIfcSphereAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStackTerminalType <em>Ifc Stack Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStackTerminalType
	 * @generated
	 */
	public Adapter createIfcStackTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStair <em>Ifc Stair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStair
	 * @generated
	 */
	public Adapter createIfcStairAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStairFlight <em>Ifc Stair Flight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStairFlight
	 * @generated
	 */
	public Adapter createIfcStairFlightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStairFlightType <em>Ifc Stair Flight Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStairFlightType
	 * @generated
	 */
	public Adapter createIfcStairFlightTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralAction <em>Ifc Structural Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralAction
	 * @generated
	 */
	public Adapter createIfcStructuralActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralActivity <em>Ifc Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralActivity
	 * @generated
	 */
	public Adapter createIfcStructuralActivityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralAnalysisModel <em>Ifc Structural Analysis Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralAnalysisModel
	 * @generated
	 */
	public Adapter createIfcStructuralAnalysisModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralConnection <em>Ifc Structural Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralConnection
	 * @generated
	 */
	public Adapter createIfcStructuralConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralConnectionCondition <em>Ifc Structural Connection Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralConnectionCondition
	 * @generated
	 */
	public Adapter createIfcStructuralConnectionConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralCurveConnection <em>Ifc Structural Curve Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralCurveConnection
	 * @generated
	 */
	public Adapter createIfcStructuralCurveConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralCurveMember <em>Ifc Structural Curve Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralCurveMember
	 * @generated
	 */
	public Adapter createIfcStructuralCurveMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralCurveMemberVarying <em>Ifc Structural Curve Member Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralCurveMemberVarying
	 * @generated
	 */
	public Adapter createIfcStructuralCurveMemberVaryingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralItem <em>Ifc Structural Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralItem
	 * @generated
	 */
	public Adapter createIfcStructuralItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLinearAction <em>Ifc Structural Linear Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLinearAction
	 * @generated
	 */
	public Adapter createIfcStructuralLinearActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLinearActionVarying <em>Ifc Structural Linear Action Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLinearActionVarying
	 * @generated
	 */
	public Adapter createIfcStructuralLinearActionVaryingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoad <em>Ifc Structural Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoad
	 * @generated
	 */
	public Adapter createIfcStructuralLoadAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadGroup
	 * @generated
	 */
	public Adapter createIfcStructuralLoadGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadLinearForce <em>Ifc Structural Load Linear Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadLinearForce
	 * @generated
	 */
	public Adapter createIfcStructuralLoadLinearForceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadPlanarForce <em>Ifc Structural Load Planar Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadPlanarForce
	 * @generated
	 */
	public Adapter createIfcStructuralLoadPlanarForceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadSingleDisplacement <em>Ifc Structural Load Single Displacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadSingleDisplacement
	 * @generated
	 */
	public Adapter createIfcStructuralLoadSingleDisplacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadSingleDisplacementDistortion <em>Ifc Structural Load Single Displacement Distortion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadSingleDisplacementDistortion
	 * @generated
	 */
	public Adapter createIfcStructuralLoadSingleDisplacementDistortionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadSingleForce <em>Ifc Structural Load Single Force</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadSingleForce
	 * @generated
	 */
	public Adapter createIfcStructuralLoadSingleForceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadSingleForceWarping <em>Ifc Structural Load Single Force Warping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadSingleForceWarping
	 * @generated
	 */
	public Adapter createIfcStructuralLoadSingleForceWarpingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadStatic <em>Ifc Structural Load Static</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadStatic
	 * @generated
	 */
	public Adapter createIfcStructuralLoadStaticAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature <em>Ifc Structural Load Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralLoadTemperature
	 * @generated
	 */
	public Adapter createIfcStructuralLoadTemperatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralMember <em>Ifc Structural Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralMember
	 * @generated
	 */
	public Adapter createIfcStructuralMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarAction <em>Ifc Structural Planar Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralPlanarAction
	 * @generated
	 */
	public Adapter createIfcStructuralPlanarActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying <em>Ifc Structural Planar Action Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralPlanarActionVarying
	 * @generated
	 */
	public Adapter createIfcStructuralPlanarActionVaryingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralPointAction <em>Ifc Structural Point Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralPointAction
	 * @generated
	 */
	public Adapter createIfcStructuralPointActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralPointConnection <em>Ifc Structural Point Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralPointConnection
	 * @generated
	 */
	public Adapter createIfcStructuralPointConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralPointReaction <em>Ifc Structural Point Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralPointReaction
	 * @generated
	 */
	public Adapter createIfcStructuralPointReactionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralProfileProperties <em>Ifc Structural Profile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralProfileProperties
	 * @generated
	 */
	public Adapter createIfcStructuralProfilePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralReaction <em>Ifc Structural Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralReaction
	 * @generated
	 */
	public Adapter createIfcStructuralReactionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralResultGroup <em>Ifc Structural Result Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralResultGroup
	 * @generated
	 */
	public Adapter createIfcStructuralResultGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralSteelProfileProperties <em>Ifc Structural Steel Profile Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralSteelProfileProperties
	 * @generated
	 */
	public Adapter createIfcStructuralSteelProfilePropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralSurfaceConnection <em>Ifc Structural Surface Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralSurfaceConnection
	 * @generated
	 */
	public Adapter createIfcStructuralSurfaceConnectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralSurfaceMember <em>Ifc Structural Surface Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralSurfaceMember
	 * @generated
	 */
	public Adapter createIfcStructuralSurfaceMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralSurfaceMemberVarying <em>Ifc Structural Surface Member Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralSurfaceMemberVarying
	 * @generated
	 */
	public Adapter createIfcStructuralSurfaceMemberVaryingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuredDimensionCallout <em>Ifc Structured Dimension Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuredDimensionCallout
	 * @generated
	 */
	public Adapter createIfcStructuredDimensionCalloutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStyleModel <em>Ifc Style Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStyleModel
	 * @generated
	 */
	public Adapter createIfcStyleModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStyledItem <em>Ifc Styled Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStyledItem
	 * @generated
	 */
	public Adapter createIfcStyledItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStyledRepresentation <em>Ifc Styled Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStyledRepresentation
	 * @generated
	 */
	public Adapter createIfcStyledRepresentationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSubContractResource <em>Ifc Sub Contract Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSubContractResource
	 * @generated
	 */
	public Adapter createIfcSubContractResourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSubedge <em>Ifc Subedge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSubedge
	 * @generated
	 */
	public Adapter createIfcSubedgeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurface <em>Ifc Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurface
	 * @generated
	 */
	public Adapter createIfcSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid <em>Ifc Surface Curve Swept Area Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceCurveSweptAreaSolid
	 * @generated
	 */
	public Adapter createIfcSurfaceCurveSweptAreaSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceOfLinearExtrusion <em>Ifc Surface Of Linear Extrusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceOfLinearExtrusion
	 * @generated
	 */
	public Adapter createIfcSurfaceOfLinearExtrusionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceOfRevolution <em>Ifc Surface Of Revolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceOfRevolution
	 * @generated
	 */
	public Adapter createIfcSurfaceOfRevolutionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyle <em>Ifc Surface Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyle
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleLighting <em>Ifc Surface Style Lighting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyleLighting
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleLightingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleRefraction <em>Ifc Surface Style Refraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyleRefraction
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleRefractionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleRendering <em>Ifc Surface Style Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyleRendering
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleRenderingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleShading <em>Ifc Surface Style Shading</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyleShading
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleShadingAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleWithTextures <em>Ifc Surface Style With Textures</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyleWithTextures
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleWithTexturesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceTexture <em>Ifc Surface Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceTexture
	 * @generated
	 */
	public Adapter createIfcSurfaceTextureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSweptAreaSolid <em>Ifc Swept Area Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSweptAreaSolid
	 * @generated
	 */
	public Adapter createIfcSweptAreaSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSweptDiskSolid <em>Ifc Swept Disk Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSweptDiskSolid
	 * @generated
	 */
	public Adapter createIfcSweptDiskSolidAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSweptSurface <em>Ifc Swept Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSweptSurface
	 * @generated
	 */
	public Adapter createIfcSweptSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSwitchingDeviceType <em>Ifc Switching Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSwitchingDeviceType
	 * @generated
	 */
	public Adapter createIfcSwitchingDeviceTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSymbolStyle <em>Ifc Symbol Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSymbolStyle
	 * @generated
	 */
	public Adapter createIfcSymbolStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSystem <em>Ifc System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSystem
	 * @generated
	 */
	public Adapter createIfcSystemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSystemFurnitureElementType <em>Ifc System Furniture Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSystemFurnitureElementType
	 * @generated
	 */
	public Adapter createIfcSystemFurnitureElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTShapeProfileDef <em>Ifc TShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcTShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTable <em>Ifc Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTable
	 * @generated
	 */
	public Adapter createIfcTableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTableRow <em>Ifc Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTableRow
	 * @generated
	 */
	public Adapter createIfcTableRowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTankType <em>Ifc Tank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTankType
	 * @generated
	 */
	public Adapter createIfcTankTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTask <em>Ifc Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTask
	 * @generated
	 */
	public Adapter createIfcTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTelecomAddress <em>Ifc Telecom Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTelecomAddress
	 * @generated
	 */
	public Adapter createIfcTelecomAddressAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTendon <em>Ifc Tendon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTendon
	 * @generated
	 */
	public Adapter createIfcTendonAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTendonAnchor <em>Ifc Tendon Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTendonAnchor
	 * @generated
	 */
	public Adapter createIfcTendonAnchorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTerminatorSymbol <em>Ifc Terminator Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTerminatorSymbol
	 * @generated
	 */
	public Adapter createIfcTerminatorSymbolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextLiteral <em>Ifc Text Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextLiteral
	 * @generated
	 */
	public Adapter createIfcTextLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextLiteralWithExtent <em>Ifc Text Literal With Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextLiteralWithExtent
	 * @generated
	 */
	public Adapter createIfcTextLiteralWithExtentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextStyle <em>Ifc Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextStyle
	 * @generated
	 */
	public Adapter createIfcTextStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextStyleFontModel <em>Ifc Text Style Font Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextStyleFontModel
	 * @generated
	 */
	public Adapter createIfcTextStyleFontModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont <em>Ifc Text Style For Defined Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextStyleForDefinedFont
	 * @generated
	 */
	public Adapter createIfcTextStyleForDefinedFontAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextStyleTextModel <em>Ifc Text Style Text Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextStyleTextModel
	 * @generated
	 */
	public Adapter createIfcTextStyleTextModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextStyleWithBoxCharacteristics <em>Ifc Text Style With Box Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextStyleWithBoxCharacteristics
	 * @generated
	 */
	public Adapter createIfcTextStyleWithBoxCharacteristicsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextureCoordinate <em>Ifc Texture Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextureCoordinate
	 * @generated
	 */
	public Adapter createIfcTextureCoordinateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextureCoordinateGenerator <em>Ifc Texture Coordinate Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextureCoordinateGenerator
	 * @generated
	 */
	public Adapter createIfcTextureCoordinateGeneratorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextureMap <em>Ifc Texture Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextureMap
	 * @generated
	 */
	public Adapter createIfcTextureMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextureVertex <em>Ifc Texture Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextureVertex
	 * @generated
	 */
	public Adapter createIfcTextureVertexAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcThermalMaterialProperties <em>Ifc Thermal Material Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcThermalMaterialProperties
	 * @generated
	 */
	public Adapter createIfcThermalMaterialPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTimeSeries <em>Ifc Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTimeSeries
	 * @generated
	 */
	public Adapter createIfcTimeSeriesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTimeSeriesReferenceRelationship <em>Ifc Time Series Reference Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTimeSeriesReferenceRelationship
	 * @generated
	 */
	public Adapter createIfcTimeSeriesReferenceRelationshipAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTimeSeriesSchedule <em>Ifc Time Series Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTimeSeriesSchedule
	 * @generated
	 */
	public Adapter createIfcTimeSeriesScheduleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTimeSeriesValue <em>Ifc Time Series Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTimeSeriesValue
	 * @generated
	 */
	public Adapter createIfcTimeSeriesValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTopologicalRepresentationItem <em>Ifc Topological Representation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTopologicalRepresentationItem
	 * @generated
	 */
	public Adapter createIfcTopologicalRepresentationItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTopologyRepresentation <em>Ifc Topology Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTopologyRepresentation
	 * @generated
	 */
	public Adapter createIfcTopologyRepresentationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTransformerType <em>Ifc Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTransformerType
	 * @generated
	 */
	public Adapter createIfcTransformerTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTransportElement <em>Ifc Transport Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTransportElement
	 * @generated
	 */
	public Adapter createIfcTransportElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTransportElementType <em>Ifc Transport Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTransportElementType
	 * @generated
	 */
	public Adapter createIfcTransportElementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTrapeziumProfileDef <em>Ifc Trapezium Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTrapeziumProfileDef
	 * @generated
	 */
	public Adapter createIfcTrapeziumProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTrimmedCurve <em>Ifc Trimmed Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTrimmedCurve
	 * @generated
	 */
	public Adapter createIfcTrimmedCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTubeBundleType <em>Ifc Tube Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTubeBundleType
	 * @generated
	 */
	public Adapter createIfcTubeBundleTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTwoDirectionRepeatFactor <em>Ifc Two Direction Repeat Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTwoDirectionRepeatFactor
	 * @generated
	 */
	public Adapter createIfcTwoDirectionRepeatFactorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTypeObject <em>Ifc Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTypeObject
	 * @generated
	 */
	public Adapter createIfcTypeObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTypeProduct <em>Ifc Type Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTypeProduct
	 * @generated
	 */
	public Adapter createIfcTypeProductAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcUShapeProfileDef <em>Ifc UShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcUShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcUShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcUnitAssignment <em>Ifc Unit Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcUnitAssignment
	 * @generated
	 */
	public Adapter createIfcUnitAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcUnitaryEquipmentType <em>Ifc Unitary Equipment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcUnitaryEquipmentType
	 * @generated
	 */
	public Adapter createIfcUnitaryEquipmentTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcValveType <em>Ifc Valve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcValveType
	 * @generated
	 */
	public Adapter createIfcValveTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVector <em>Ifc Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVector
	 * @generated
	 */
	public Adapter createIfcVectorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVertex <em>Ifc Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVertex
	 * @generated
	 */
	public Adapter createIfcVertexAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVertexBasedTextureMap <em>Ifc Vertex Based Texture Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVertexBasedTextureMap
	 * @generated
	 */
	public Adapter createIfcVertexBasedTextureMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVertexLoop <em>Ifc Vertex Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVertexLoop
	 * @generated
	 */
	public Adapter createIfcVertexLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVertexPoint <em>Ifc Vertex Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVertexPoint
	 * @generated
	 */
	public Adapter createIfcVertexPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVibrationIsolatorType <em>Ifc Vibration Isolator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVibrationIsolatorType
	 * @generated
	 */
	public Adapter createIfcVibrationIsolatorTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVirtualElement <em>Ifc Virtual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVirtualElement
	 * @generated
	 */
	public Adapter createIfcVirtualElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVirtualGridIntersection <em>Ifc Virtual Grid Intersection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVirtualGridIntersection
	 * @generated
	 */
	public Adapter createIfcVirtualGridIntersectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWall <em>Ifc Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWall
	 * @generated
	 */
	public Adapter createIfcWallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWallStandardCase <em>Ifc Wall Standard Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWallStandardCase
	 * @generated
	 */
	public Adapter createIfcWallStandardCaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWallType <em>Ifc Wall Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWallType
	 * @generated
	 */
	public Adapter createIfcWallTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWasteTerminalType <em>Ifc Waste Terminal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWasteTerminalType
	 * @generated
	 */
	public Adapter createIfcWasteTerminalTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWaterProperties <em>Ifc Water Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWaterProperties
	 * @generated
	 */
	public Adapter createIfcWaterPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWindow <em>Ifc Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWindow
	 * @generated
	 */
	public Adapter createIfcWindowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWindowLiningProperties <em>Ifc Window Lining Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWindowLiningProperties
	 * @generated
	 */
	public Adapter createIfcWindowLiningPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWindowPanelProperties <em>Ifc Window Panel Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWindowPanelProperties
	 * @generated
	 */
	public Adapter createIfcWindowPanelPropertiesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWindowStyle <em>Ifc Window Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWindowStyle
	 * @generated
	 */
	public Adapter createIfcWindowStyleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWorkControl <em>Ifc Work Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWorkControl
	 * @generated
	 */
	public Adapter createIfcWorkControlAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWorkPlan <em>Ifc Work Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWorkPlan
	 * @generated
	 */
	public Adapter createIfcWorkPlanAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcWorkSchedule <em>Ifc Work Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcWorkSchedule
	 * @generated
	 */
	public Adapter createIfcWorkScheduleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcZShapeProfileDef <em>Ifc ZShape Profile Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcZShapeProfileDef
	 * @generated
	 */
	public Adapter createIfcZShapeProfileDefAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcZone <em>Ifc Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcZone
	 * @generated
	 */
	public Adapter createIfcZoneAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcActorSelect <em>Ifc Actor Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcActorSelect
	 * @generated
	 */
	public Adapter createIfcActorSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAppliedValueSelect <em>Ifc Applied Value Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAppliedValueSelect
	 * @generated
	 */
	public Adapter createIfcAppliedValueSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcAxis2Placement <em>Ifc Axis2 Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcAxis2Placement
	 * @generated
	 */
	public Adapter createIfcAxis2PlacementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcBooleanOperand <em>Ifc Boolean Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcBooleanOperand
	 * @generated
	 */
	public Adapter createIfcBooleanOperandAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCharacterStyleSelect <em>Ifc Character Style Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCharacterStyleSelect
	 * @generated
	 */
	public Adapter createIfcCharacterStyleSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcClassificationNotationSelect <em>Ifc Classification Notation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcClassificationNotationSelect
	 * @generated
	 */
	public Adapter createIfcClassificationNotationSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcColour <em>Ifc Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcColour
	 * @generated
	 */
	public Adapter createIfcColourAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcColourOrFactor <em>Ifc Colour Or Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcColourOrFactor
	 * @generated
	 */
	public Adapter createIfcColourOrFactorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcConditionCriterionSelect <em>Ifc Condition Criterion Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcConditionCriterionSelect
	 * @generated
	 */
	public Adapter createIfcConditionCriterionSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCsgSelect <em>Ifc Csg Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCsgSelect
	 * @generated
	 */
	public Adapter createIfcCsgSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveFontOrScaledCurveFontSelect <em>Ifc Curve Font Or Scaled Curve Font Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveFontOrScaledCurveFontSelect
	 * @generated
	 */
	public Adapter createIfcCurveFontOrScaledCurveFontSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveOrEdgeCurve <em>Ifc Curve Or Edge Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveOrEdgeCurve
	 * @generated
	 */
	public Adapter createIfcCurveOrEdgeCurveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcCurveStyleFontSelect <em>Ifc Curve Style Font Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcCurveStyleFontSelect
	 * @generated
	 */
	public Adapter createIfcCurveStyleFontSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDateTimeSelect <em>Ifc Date Time Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDateTimeSelect
	 * @generated
	 */
	public Adapter createIfcDateTimeSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDefinedSymbolSelect <em>Ifc Defined Symbol Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDefinedSymbolSelect
	 * @generated
	 */
	public Adapter createIfcDefinedSymbolSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDerivedMeasureValue <em>Ifc Derived Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDerivedMeasureValue
	 * @generated
	 */
	public Adapter createIfcDerivedMeasureValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDocumentSelect <em>Ifc Document Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDocumentSelect
	 * @generated
	 */
	public Adapter createIfcDocumentSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcDraughtingCalloutElement <em>Ifc Draughting Callout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcDraughtingCalloutElement
	 * @generated
	 */
	public Adapter createIfcDraughtingCalloutElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFillAreaStyleTileShapeSelect <em>Ifc Fill Area Style Tile Shape Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFillAreaStyleTileShapeSelect
	 * @generated
	 */
	public Adapter createIfcFillAreaStyleTileShapeSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcFillStyleSelect <em>Ifc Fill Style Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcFillStyleSelect
	 * @generated
	 */
	public Adapter createIfcFillStyleSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcGeometricSetSelect <em>Ifc Geometric Set Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcGeometricSetSelect
	 * @generated
	 */
	public Adapter createIfcGeometricSetSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcHatchLineDistanceSelect <em>Ifc Hatch Line Distance Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcHatchLineDistanceSelect
	 * @generated
	 */
	public Adapter createIfcHatchLineDistanceSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLayeredItem <em>Ifc Layered Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLayeredItem
	 * @generated
	 */
	public Adapter createIfcLayeredItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLibrarySelect <em>Ifc Library Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLibrarySelect
	 * @generated
	 */
	public Adapter createIfcLibrarySelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcLightDistributionDataSourceSelect <em>Ifc Light Distribution Data Source Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcLightDistributionDataSourceSelect
	 * @generated
	 */
	public Adapter createIfcLightDistributionDataSourceSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMaterialSelect <em>Ifc Material Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMaterialSelect
	 * @generated
	 */
	public Adapter createIfcMaterialSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMeasureValue <em>Ifc Measure Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMeasureValue
	 * @generated
	 */
	public Adapter createIfcMeasureValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcMetricValueSelect <em>Ifc Metric Value Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcMetricValueSelect
	 * @generated
	 */
	public Adapter createIfcMetricValueSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcObjectReferenceSelect <em>Ifc Object Reference Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcObjectReferenceSelect
	 * @generated
	 */
	public Adapter createIfcObjectReferenceSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcOrientationSelect <em>Ifc Orientation Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcOrientationSelect
	 * @generated
	 */
	public Adapter createIfcOrientationSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPointOrVertexPoint <em>Ifc Point Or Vertex Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPointOrVertexPoint
	 * @generated
	 */
	public Adapter createIfcPointOrVertexPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcPresentationStyleSelect <em>Ifc Presentation Style Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcPresentationStyleSelect
	 * @generated
	 */
	public Adapter createIfcPresentationStyleSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcShell <em>Ifc Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcShell
	 * @generated
	 */
	public Adapter createIfcShellAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSimpleValue <em>Ifc Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSimpleValue
	 * @generated
	 */
	public Adapter createIfcSimpleValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSizeSelect <em>Ifc Size Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSizeSelect
	 * @generated
	 */
	public Adapter createIfcSizeSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSpecularHighlightSelect <em>Ifc Specular Highlight Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSpecularHighlightSelect
	 * @generated
	 */
	public Adapter createIfcSpecularHighlightSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcStructuralActivityAssignmentSelect <em>Ifc Structural Activity Assignment Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcStructuralActivityAssignmentSelect
	 * @generated
	 */
	public Adapter createIfcStructuralActivityAssignmentSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceOrFaceSurface <em>Ifc Surface Or Face Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceOrFaceSurface
	 * @generated
	 */
	public Adapter createIfcSurfaceOrFaceSurfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSurfaceStyleElementSelect <em>Ifc Surface Style Element Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSurfaceStyleElementSelect
	 * @generated
	 */
	public Adapter createIfcSurfaceStyleElementSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcSymbolStyleSelect <em>Ifc Symbol Style Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcSymbolStyleSelect
	 * @generated
	 */
	public Adapter createIfcSymbolStyleSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextFontSelect <em>Ifc Text Font Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextFontSelect
	 * @generated
	 */
	public Adapter createIfcTextFontSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTextStyleSelect <em>Ifc Text Style Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTextStyleSelect
	 * @generated
	 */
	public Adapter createIfcTextStyleSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcTrimmingSelect <em>Ifc Trimming Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcTrimmingSelect
	 * @generated
	 */
	public Adapter createIfcTrimmingSelectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcUnit <em>Ifc Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcUnit
	 * @generated
	 */
	public Adapter createIfcUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcValue <em>Ifc Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcValue
	 * @generated
	 */
	public Adapter createIfcValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.ifc2x3.IfcVectorOrDirection <em>Ifc Vector Or Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.ifc2x3.IfcVectorOrDirection
	 * @generated
	 */
	public Adapter createIfcVectorOrDirectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //Ifc2x3AdapterFactory
