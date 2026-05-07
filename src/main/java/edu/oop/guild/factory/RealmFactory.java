package edu.oop.guild.factory;

/**
 * Author:          Joseph Johnson
 * Date:            05/06/2026
 * File:            RealmFactory.java
 */

import edu.oop.guild.creature.*;
import edu.oop.guild.seal.PackageSeal;

public interface RealmFactory {

	Creature createCourier(); 
	PackageSeal createSeal(); 
}
