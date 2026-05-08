package edu.oop.guild.notification;

/**
 * Author:          Jack Belleville
 * Date:            05/07/2026
 * File:            LegacyOwlScroll.java
 * Desc:            Legacy owl scroll dispatcher. Kept with its original API;
 *                  the OwlScrollNotificationAdapter bridges it to the modern
 *                  NotificationChannel interface.
 */

public class LegacyOwlScroll {
	public String dispatchScroll(String recipient, String inscription) {
		if (recipient == null || recipient.isBlank()) {
			throw new IllegalArgumentException("recipient must not be null or blank");
		}
		if (inscription == null || inscription.isBlank()) {
			throw new IllegalArgumentException("inscription must not be null or blank");
		}
		return "Owl scroll sent to " + recipient + ": " + inscription;
	}
}
