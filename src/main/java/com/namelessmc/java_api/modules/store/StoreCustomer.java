package com.namelessmc.java_api.modules.store;

import com.google.gson.JsonObject;
import com.namelessmc.java_api.NamelessAPI;
import com.namelessmc.java_api.exception.NamelessException;
import com.namelessmc.java_api.NamelessUser;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.UUID;

public class StoreCustomer {

	private final NamelessAPI api;
	private final int id;
	private final Integer userId;
	private final String username;
	private final String identifier;

	StoreCustomer(NamelessAPI api, JsonObject json) {
		this.api = api;
		this.id = json.get("customer_id").getAsInt();
		this.userId = json.has("user_id") ? json.get("user_id").getAsInt() : null;
		this.username = json.has("username") && !json.get("username").isJsonNull()
				? json.get("username").getAsString() : null;
		this.identifier = json.has("identifier") && !json.get("identifier").isJsonNull()
				? json.get("identifier").getAsString() : null;

		if (this.username == null && this.identifier == null) {
			throw new IllegalStateException("Username and identifier cannot be null at the same time");
		}
	}

	public int id() {
		return this.id;
	}

	public NamelessUser user() throws NamelessException {
		return this.userId != null ? this.api.user(this.userId) : null;
	}

	public String username() {
		return this.username;
	}

	public String identifier() {
		return this.identifier;
	}

	public UUID identifierAsUuid() {
		// Unlike NamelessMC, the store module sends UUIDs with dashes
		return this.identifier != null ? UUID.fromString(this.identifier) : null;
	}

}
