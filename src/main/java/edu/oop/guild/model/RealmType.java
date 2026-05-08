package edu.oop.guild.model;

/*	File: RealmType.java
 * 	Author: Tucker Potts
 *  Description: Enum of destination realms with a human-readable display name.
 *
 *
 */

public enum RealmType {

	SKY("Sky Kingdom"),
	UNDERGROUND("Underground Market");

	private final String displayName;

	RealmType(String displayName) {
		this.displayName = displayName;
	}

	public String displayName() {
		return displayName;
	}

}
