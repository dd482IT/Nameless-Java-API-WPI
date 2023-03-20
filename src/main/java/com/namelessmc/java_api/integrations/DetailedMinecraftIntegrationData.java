package com.namelessmc.java_api.integrations;

import com.google.gson.JsonObject;
import com.namelessmc.java_api.NamelessAPI;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;

public class DetailedMinecraftIntegrationData extends DetailedIntegrationData implements IMinecraftIntegrationData {

	private final UUID uuid;

	public DetailedMinecraftIntegrationData(final JsonObject json) {
		super(json);
		this.uuid = NamelessAPI.websiteUuidToJavaUuid(this.identifier());
	}

	@Override
	public final UUID uuid() {
		return this.uuid;
	}
}
