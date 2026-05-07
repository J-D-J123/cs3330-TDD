package edu.oop.guild.model;

/*	File: RealmType.java
 * 	Author: Tucker Potts
 *  Description: This file contains info about the
 *  destination realm. It contains the label (e.g. SKY
 *  and UNDERGROUND) and the displayName (e.g. Sky Kingdom
 *  and Underground Market).
 * 
 * 
 */

public enum RealmType implements EnumLabel {
	
	SKY("SKY", "Sky Kingdom"),
    UNDERGROUND("UNDERGROUND", "Underground Market");
	
	private final String label;
	private final String displayName;
	
	RealmType(String label, String displayName) {
		this.label = label;
		this.displayName = displayName;
	}
	
	@Override
	public String displayName() {
		return displayName;
	}

	@Override
	public String label() {
		return label;
	}
	
}
