package edu.oop.guild.types;

import edu.oop.guild.model.EnumLabel;

/*	File: RealmType.java
 * 	Author: Tucker Potts
 *  Description: This file...
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
