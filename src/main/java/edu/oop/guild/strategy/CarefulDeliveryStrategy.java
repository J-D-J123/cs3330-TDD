package edu.oop.guild.strategy;

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

import edu.oop.guild.model.DeliveryRequest;

import java.util.Objects;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {
	@Override
	public int estimateCoins(DeliveryRequest request) {
		Objects.requireNonNull(request);
		int packageBonus = switch (request.getPackageType()) {
			case FOOD -> 0;
			case POTION -> 5;
			case ARTIFACT -> 17;
		};
		return request.getWeightKg() + 2 * request.getDistanceLeagues() + 22 + packageBonus;
	}
}
