package com.namelessmc.java_api.integrations;

import com.namelessmc.java_api.NamelessAPI;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;

public class MinecraftIntegrationData extends IntegrationData implements IMinecraftIntegrationData {

	private final UUID uuid;

	public MinecraftIntegrationData(final UUID uuid,
									final String username) {
		super(StandardIntegrationTypes.MINECRAFT, NamelessAPI.javaUuidToWebsiteUuid(uuid), username);
		this.uuid = uuid;
	}

	public final UUID uuid() {
		return this.uuid;
	}

}
