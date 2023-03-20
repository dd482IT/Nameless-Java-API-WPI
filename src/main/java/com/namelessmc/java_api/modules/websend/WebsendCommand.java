package com.namelessmc.java_api.modules.websend;

import org.checkerframework.checker.index.qual.Positive;
import org.checkerframework.checker.nullness.qual.NonNull;

public class WebsendCommand {

	private final int id;
	private final String commandLine;

	public WebsendCommand(final int id,
						  final String commandLine) {
		this.id = id;
		this.commandLine = commandLine;
	}

	public int id() {
		return id;
	}

	public String command() {
		return this.commandLine;
	}

}
