package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;
/*	File: ExpressDeliveryStrategy.java
 * 	Author: Tucker Potts
 *  Description: This file is also just like the default
 *  DeliveryCostStrategy.java class in that it also determines
 *  the price of the delivery. Speedy delivery means
 *  that the price of shipping goes up by 2x the amount. Price
 *  is determined by the package type, not the realm.
 * 
 */
public class ExpressDeliveryStrategy {
	private int coins;
	
	public int estimateCoins(DeliveryRequest request) {
		//price is double for express delivery
		if(request.getPackageType() == PackageType.FOOD) {
			coins = 48;
		}
		else if(request.getPackageType() == PackageType.POTION) {
			coins = 108;
		}
		else if(request.getPackageType() == PackageType.ARTIFACT) {
			coins = 218;
		}
		else {
			throw new NullPointerException("I'm not seeing any cost estimate here...");
		}
		//we'll just do it based on package type.
		return coins;
	}
}
