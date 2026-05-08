package edu.oop.guild.model;

/*	File: DeliveryPlan.java
 * 	Author: Tucker Potts
 *  Description: This file contains the details about the delivery such as
 *  who is delivering the package along with the package, its sealed label,
 *  its price in coins, and its summary of all those things.
 *
 *
 */

import edu.oop.guild.creature.Creature;

import java.util.Objects;

public class DeliveryPlan {
	private final DeliveryRequest request;
	private final Creature courier;
	private final String sealedLabel;
	private final int priceInCoins;

	public DeliveryPlan(DeliveryRequest request, Creature courier, String sealedLabel, int priceInCoins) {
		Objects.requireNonNull(request);
		Objects.requireNonNull(courier);
		Objects.requireNonNull(sealedLabel);
		if (priceInCoins < 0) {
			throw new IllegalArgumentException("priceInCoins must be non-negative");
		}
		this.request = request;
		this.courier = courier;
		this.sealedLabel = sealedLabel;
		this.priceInCoins = priceInCoins;
	}

	public DeliveryRequest getRequest() {
		return request;
	}

	public Creature getCourier() {
		return courier;
	}

	public String getSealedLabel() {
		return sealedLabel;
	}

	public int getPriceInCoins() {
		return priceInCoins;
	}

	public String summary() {
		return courier.name() + " delivers " + sealedLabel + " for " + priceInCoins + " coins";
	}
}
