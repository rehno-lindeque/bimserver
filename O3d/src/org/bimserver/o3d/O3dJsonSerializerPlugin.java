package org.bimserver.o3d;

import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.SerializerPlugin;

public class O3dJsonSerializerPlugin implements SerializerPlugin {

	private boolean initialized = false;

	@Override
	public EmfSerializer createSerializer() {
		return new O3dJsonSerializer();
	}

	@Override
	public String getDescription() {
		return "O3dJsonSerializer";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		pluginManager.requireSchemaDefinition();
		pluginManager.requireIfcEngine();
		initialized  = true;
	}

	@Override
	public String getDefaultSerializerName() {
		return "O3DJSON";
	}

	@Override
	public String getDefaultContentType() {
		return "application/json";
	}

	@Override
	public String getDefaultExtension() {
		return "o3djson";
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}
}