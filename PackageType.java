package edu.oop.guild.types;

import edu.oop.guild.model.EnumLabel;

/*	File: DeliveryRequest.java
 * 	Author: Tucker Potts
 *  Description: This file...
 * 
 * 
 */

public enum PackageType implements EnumLabel {
	
	FOOD("FOOD", "snack crate"),
	POTION("POTION", "Potion case"),
	ARTIFACT("ARTIFACT", "Ancient artifact");
	
	private final String label;
	private final String displayName;
	
	
	PackageType(String label, String displayName) {
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
