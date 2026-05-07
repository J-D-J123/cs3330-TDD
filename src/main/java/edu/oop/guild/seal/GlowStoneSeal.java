package edu.oop.guild.seal;

/**
 * Author:          Joseph Johnson
 * Date:            05/06/2026
 * File:            GlowStoneSeal.java
 */

import java.util.Objects;

public class GlowStoneSeal implements PackageSeal{

	@Override 
	public String apply(String label) {
		
		// make sure that the label is not null
		Objects.requireNonNull(label); 
		
		return "◆ " + label + " ◆";
	}
	
	@Override
	public int durability() {
		return 12; 
	}
}
