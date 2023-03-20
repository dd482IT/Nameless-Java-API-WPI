package com.namelessmc.java_api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Announcement {

	private final int id;
	private final String header;
	private final String message;
	private final Set<String> displayPages;
	private final int[] displayGroups;

	Announcement(JsonObject announcementJson) {
		this.id = announcementJson.get("id").getAsInt();
		this.header = announcementJson.get("header").getAsString();
		this.message = announcementJson.get("message").getAsString();
		this.displayPages = Collections.unmodifiableSet(
				StreamSupport.stream(announcementJson.getAsJsonArray("pages").spliterator(), false)
						.map(JsonElement::getAsString)
						.collect(Collectors.toSet())
				);
		this.displayGroups = StreamSupport.stream(announcementJson.getAsJsonArray("groups").spliterator(), false)
						.mapToInt(JsonElement::getAsInt)
						.toArray();
	}

	public int id() {
		return id;
	}

	public String header() {
		return this.header;
	}

	public String message() {
		return this.message;
	}

	public Set<String> displayedPages() {
		return this.displayPages;
	}

	public int[] displayedGroupIds() {
		return this.displayGroups;
	}

}
