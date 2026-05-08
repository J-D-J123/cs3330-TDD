package edu.oop.guild.notification;

/**
 * Author:          Jack Belleville
 * Date:            05/07/2026
 * File:            NotificationChannel.java
 * Desc:            Modern notification interface used by the rest of the app.
 */

import edu.oop.guild.model.DeliveryPlan;

public interface NotificationChannel {
	String send(DeliveryPlan plan);
}
