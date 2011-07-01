package org.bimserver.clients.j3d;

import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.media.j3d.TransparencyAttributes;
import javax.vecmath.Color3f;

import org.bimserver.models.ifc2x3.IfcBeam;
import org.bimserver.models.ifc2x3.IfcBuildingElementProxy;
import org.bimserver.models.ifc2x3.IfcColumn;
import org.bimserver.models.ifc2x3.IfcDistributionFlowElement;
import org.bimserver.models.ifc2x3.IfcDoor;
import org.bimserver.models.ifc2x3.IfcFlowTerminalType;
import org.bimserver.models.ifc2x3.IfcFurnishingElement;
import org.bimserver.models.ifc2x3.IfcOpeningElement;
import org.bimserver.models.ifc2x3.IfcRailing;
import org.bimserver.models.ifc2x3.IfcRelSpaceBoundary;
import org.bimserver.models.ifc2x3.IfcRoof;
import org.bimserver.models.ifc2x3.IfcRoot;
import org.bimserver.models.ifc2x3.IfcSite;
import org.bimserver.models.ifc2x3.IfcSlab;
import org.bimserver.models.ifc2x3.IfcSlabTypeEnum;
import org.bimserver.models.ifc2x3.IfcSpace;
import org.bimserver.models.ifc2x3.IfcStair;
import org.bimserver.models.ifc2x3.IfcWall;
import org.bimserver.models.ifc2x3.IfcWindow;

public class Appearances {
	private Appearance openingAppearance;
	private Appearance wallAppearance;
	private Appearance windowAppearance;
	private Appearance slabAppearance;
	private Appearance roofAppearance;
	private Appearance columnAppearance;
	private Appearance spaceAppearance;
	private Appearance doorAppearance;
	private Appearance railingAppearance;
	private Appearance furnishingAppearance;
	private Appearance stairAppearance;
	private Appearance proxyAppearance;
	private Appearance beamAppearance;
	private Appearance flowTerminalAppearance;
	private Appearance distributionFlowElementAppearance;
	private Appearance siteAppearance;

	public Appearances() {
		wallAppearance = makeMaterial(0.537255f, 0.537255f, 0.537255f);
		windowAppearance = makeMaterial(0f, 0f, 1f, 0.5f);
		openingAppearance = makeMaterial(1f, 1f, 1f, 1f);
		slabAppearance = makeMaterial(0.137255f, 0.137255f, 0.170588f);
		roofAppearance = makeMaterial(1f, 0f, 0f);
		columnAppearance = makeMaterial(0.437255f, 0.603922f, 0.370588f);
		spaceAppearance = makeMaterial(0.137255f, 0.403922f, 0.870588f);
		doorAppearance = makeMaterial(0.637255f, 0.603922f, 0.670588f);
		railingAppearance = makeMaterial(0.137255f, 0.203922f, 0.270588f);
		furnishingAppearance = makeMaterial(0.437255f, 0.603922f, 0.370588f);
		stairAppearance = makeMaterial(0.137255f, 0.137255f, 0.170588f);
		beamAppearance = makeMaterial(0.437255f, 0.603922f, 0.370588f);
		flowTerminalAppearance = makeMaterial(0.437255f, 0.603922f, 0.370588f);
		distributionFlowElementAppearance = makeMaterial(0.437255f, 0.603922f, 0.370588f);
		siteAppearance = makeMaterial(0f, 0.5f, 0f);
		proxyAppearance = slabAppearance;
	}
	
	private Appearance makeMaterial(float f, float g, float h) {
		return makeMaterial(f, g, h, Float.NaN);
	}

	private Appearance makeMaterial(float r, float g, float b, float transparency) {
		Appearance appearance = new Appearance();
		Color3f color3f = new Color3f(r, g, b);
		Material material = new Material(color3f, new Color3f(0f, 0f, 0f), color3f, color3f, 10f);
		material.setLightingEnable(true);
		appearance.setMaterial(material);
		if (!Float.isNaN(transparency)) {
			TransparencyAttributes ta = new TransparencyAttributes();
			ta.setTransparencyMode(TransparencyAttributes.NICEST);
			ta.setTransparency(transparency);
			appearance.setTransparencyAttributes(ta);
		}
		return appearance;
	}

	public Appearance getAppearance(IfcRoot ifcRootObject) {
		Appearance appearance = null;
		if (ifcRootObject instanceof IfcWall) {
			appearance = wallAppearance;
		} else if (ifcRootObject instanceof IfcWindow) {
			appearance = windowAppearance;
		} else if (ifcRootObject instanceof IfcColumn) {
			appearance = columnAppearance;
		} else if (ifcRootObject instanceof IfcSpace) {
			appearance = spaceAppearance;
		} else if (ifcRootObject instanceof IfcRoof) {
			appearance = roofAppearance;
		} else if (ifcRootObject instanceof IfcDoor) {
			appearance = doorAppearance;
		} else if (ifcRootObject instanceof IfcSlab) {
			IfcSlab ifcSlab = (IfcSlab) ifcRootObject;
			if (ifcSlab.getPredefinedType() == IfcSlabTypeEnum.ROOF) {
				appearance = roofAppearance;
			} else {
				appearance = slabAppearance;
			}
		} else if (ifcRootObject instanceof IfcRailing) {
			appearance = railingAppearance;
		} else if (ifcRootObject instanceof IfcFurnishingElement) {
			appearance = furnishingAppearance;
		} else if (ifcRootObject instanceof IfcStair) {
			appearance = stairAppearance;
		} else if (ifcRootObject instanceof IfcOpeningElement) {
			appearance = openingAppearance;
		} else if (ifcRootObject instanceof IfcBuildingElementProxy) {
			appearance = proxyAppearance;
		} else if (ifcRootObject instanceof IfcBeam) {
			appearance = beamAppearance;
		} else if (ifcRootObject instanceof IfcFlowTerminalType) {
			appearance = flowTerminalAppearance;
		} else if (ifcRootObject instanceof IfcDistributionFlowElement) {
			appearance = distributionFlowElementAppearance;
		} else if (ifcRootObject instanceof IfcSite) {
			appearance = siteAppearance;
		} else if (ifcRootObject instanceof IfcRelSpaceBoundary) {
		} else {
			System.out.println(ifcRootObject);
		}
		return appearance;
	}
}