package edu.oop.guild.strategy;

/*	File: StandardDeliveryStrategy.java
 * 	Author: Tucker Potts
 *  Description: This file is the standard delivery cost strategy.
 *  It determines the price of the delivery for normal handling.
 *  Price is determined by the package type, not the realm.
 *
 *
 */

import edu.oop.guild.model.DeliveryRequest;

import java.util.Objects;

public class StandardDeliveryStrategy implements DeliveryCostStrategy {
	@Override
	public int estimateCoins(DeliveryRequest request) {
		Objects.requireNonNull(request);
		int fragileFee = request.isFragile() ? 5 : 0;
		return request.getWeightKg() + 2 * request.getDistanceLeagues() + 10 + fragileFee;
	}
}
