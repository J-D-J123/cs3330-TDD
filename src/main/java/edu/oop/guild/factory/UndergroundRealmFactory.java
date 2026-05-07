package edu.oop.guild.factory;

/**
 * Author:          Joseph Johnson
 * Date:            05/06/2026
 * File:            UndergroundRealmFactory.java
 */

import edu.oop.guild.creature.Creature;
import edu.oop.guild.creature.TunnelMole;
import edu.oop.guild.seal.GlowStoneSeal;
import edu.oop.guild.seal.PackageSeal;

public class UndergroundRealmFactory implements RealmFactory{

	
	@Override 
	public Creature createCourier() {
		
		return new TunnelMole(); 
	}
	
	@Override 
	public PackageSeal createSeal() {
		
		return new GlowStoneSeal(); 
	}
}
