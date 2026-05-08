package edu.oop.guild.model;

/*	File: PackageType.java
 * 	Author: Tucker Potts
 *  Description: Enum of package categories with a human-readable label.
 *
 *
 */

public enum PackageType {

	FOOD("Snack crate"),
	POTION("Potion case"),
	ARTIFACT("Ancient artifact");

	private final String label;

	PackageType(String label) {
		this.label = label;
	}

	public String label() {
		return label;
	}

}
