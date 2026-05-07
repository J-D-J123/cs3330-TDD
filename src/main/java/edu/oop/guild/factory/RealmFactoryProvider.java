package edu.oop.guild.factory;

/**
 * Author:          Joseph Johnson
 * Date:            05/06/2026
 * File:            RealmFactoryProvider.java
 */

import java.util.Objects; 
import edu.oop.guild.model.RealmType; 

public class RealmFactoryProvider {

	public RealmFactory forRealm(RealmType realmType) {
		
		// make sure that realmType is not null
		Objects.requireNonNull(realmType); 
		
		// switch in different type 
		// eaiser to handle compared to all else if(s)
		return switch (realmType) {
		
			case SKY -> new SkyRealmFactory(); 
			case UNDERGROUND -> new UndergroundRealmFactory(); 
		};
	}
}
