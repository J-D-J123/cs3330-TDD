package edu.oop.guild.strategy;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;
/*	File: DeliveryCostStrategy.java
 * 	Author: Tucker Potts
 *  Description: This file has the standard delivery costs for
 *  the delivery. It estimates the coins needed to pay for the 
 *  delivery of the item. Price is based on package type, not realm.
 * 
 * 
 */
public class DeliveryCostStrategy {
	private int coins;
	
	public int estimateCoins(DeliveryRequest request) {
		//sorry, i know, code smell...
		if(request.getPackageType() == PackageType.FOOD) {
			coins = 24;
		}
		else if(request.getPackageType() == PackageType.POTION) {
			coins = 54;
		}
		else if(request.getPackageType() == PackageType.ARTIFACT) {
			coins = 109;
		}
		else {
			throw new NullPointerException("I'm not seeing any cost estimate here...");
		}
		//we'll just do it based on package type.
		return coins;
	}
	
	
	public DeliveryCostStrategy () {
		
	}
	
	
}
