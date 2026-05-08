package edu.oop.guild.strategy;

/*	File: DeliveryCostStrategy.java
 * 	Author: Tucker Potts
 *  Description: This file has the standard delivery costs for
 *  the delivery. It estimates the coins needed to pay for the
 *  delivery of the item. Price is based on package type, not realm.
 *
 *
 */

import edu.oop.guild.model.DeliveryRequest;

public interface DeliveryCostStrategy {
	int estimateCoins(DeliveryRequest request);
}
