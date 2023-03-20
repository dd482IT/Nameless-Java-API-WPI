package com.namelessmc.java_api.integrations;

import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.checkerframework.checker.nullness.qual.NonNull;

public class IntegrationData {

	private final String integrationType;
	private final String identifier;
	private final String username;

	public IntegrationData(final String integrationType,
					final String identifier,
					final String username) {
		this.integrationType = integrationType;
		this.identifier = identifier;
		this.username = username;
	}

	public final String type(IntegrationData this) {
		return this.integrationType;
	}

	public final String identifier(IntegrationData this) {
		return this.identifier;
	}

	public final String username(IntegrationData this) {
		return this.username;
	}

}
