package edu.oop.guild.factory;

/**
 * Author:          Joseph Johnson
 * Date:            05/06/2026
 * File:            SkyRealmFactory.java
 */

import edu.oop.guild.creature.CloudDragon; 
import edu.oop.guild.creature.Creature; 
import edu.oop.guild.seal.PackageSeal; 
import edu.oop.guild.seal.SkyRibbonSeal;

public class SkyRealmFactory implements RealmFactory{

	@Override 
	public Creature createCourier() {
		
		return new CloudDragon(); 
	}
	
	@Override
	public PackageSeal createSeal() {
		
		return new SkyRibbonSeal(); 
	}
}
