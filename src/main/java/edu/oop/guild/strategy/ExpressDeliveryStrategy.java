package edu.oop.guild.strategy;

/*	File: ExpressDeliveryStrategy.java
 * 	Author: Tucker Potts
 *  Description: This file is also just like the default
 *  DeliveryCostStrategy.java class in that it also determines
 *  the price of the delivery. Speedy delivery means
 *  that the price of shipping goes up by 2x the amount. Price
 *  is determined by the package type, not the realm.
 *
 */

import edu.oop.guild.model.DeliveryRequest;

import java.util.Objects;

public class ExpressDeliveryStrategy implements DeliveryCostStrategy {
	@Override
	public int estimateCoins(DeliveryRequest request) {
		Objects.requireNonNull(request);
		int fragileFee = request.isFragile() ? 10 : 0;
		return 2 * request.getWeightKg() + 4 * request.getDistanceLeagues() + 25 + fragileFee;
	}
}
