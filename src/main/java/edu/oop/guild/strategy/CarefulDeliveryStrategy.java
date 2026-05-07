package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;
/*	File: CarefulDeliveryStrategy.java
 * 	Author: Tucker Potts
 *  Description: This file is just like the default
 *  DeliveryCostStrategy.java class in that it determines
 *  the price of the delivery. Careful handling means
 *  that the price of shipping goes up by 1.5x the amount.
 *  Price is determined by the package type, not the realm.
 * 
 * 
 */
public class CarefulDeliveryStrategy {
	private int coins;
	
	public int estimateCoins(DeliveryRequest request) {
		//price is 1.5 times the standard delivery cost
		if(request.getPackageType() == PackageType.FOOD) {
			coins = 36;
		}
		else if(request.getPackageType() == PackageType.POTION) {
			coins = 81;
		}
		else if(request.getPackageType() == PackageType.ARTIFACT) {
			coins = 154;
		}
		else {
			throw new NullPointerException("I'm not seeing any cost estimate here...");
		}
		//we'll just do it based on package type.
		return coins;
	}
}
