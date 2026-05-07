package edu.oop.guild.model;

/*	File: DeliveryPlan.java
 * 	Author: Tucker Potts
 *  Description: This file contains the details about the delivery such as
 *  who is delivering the package along with the package, its sealed label,
 *  its price in coins, and its summary of all those things.
 * 
 * 
 */
public class DeliveryPlan {
	private PackageType request;
	private String courier;
	private String sealedLabel;
	private int priceInCoins;
	private String summary;
	
	public DeliveryPlan(PackageType request, String courier, String sealedLabel, int priceInCoins) {
		this.request = request;
		this.courier = courier;
		this.sealedLabel = sealedLabel;
		this.priceInCoins = priceInCoins;
		this.summary = courier + " " + sealedLabel + " for " + priceInCoins + " coins";
	}

	public PackageType getRequest() {
		return request;
	}

	public String getCourier() {
		return courier;
	}

	public String getSealedLabel() {
		return sealedLabel;
	}

	public int getPriceInCoins() {
		return priceInCoins;
	}

	public String summary() {
		return summary;
	}
	
}
