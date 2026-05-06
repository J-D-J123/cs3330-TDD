package edu.oop.guild.model;

/*	File: DeliveryRequest.java
 * 	Author: Tucker Potts
 *  Description: This file contains information about the package
 *  and its contents. It has its label (e.g. FOOD, POTION, and 
 *  ARTIFACT) and its display name (e.g. snack crate, potion case, etc.).
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
