package edu.oop.guild.notification;

import edu.oop.guild.model.DeliveryPlan;

import java.util.Objects;

public class OwlScrollNotificationAdapter implements NotificationChannel {
    private final LegacyOwlScroll legacyOwlScroll;

    public OwlScrollNotificationAdapter(LegacyOwlScroll legacyOwlScroll) {
        Objects.requireNonNull(legacyOwlScroll);
        this.legacyOwlScroll = legacyOwlScroll;
    }

    @Override
    public String send(DeliveryPlan plan) {
        Objects.requireNonNull(plan);
        String recipient = plan.getRequest().getDestinationRealm().displayName();
        return legacyOwlScroll.dispatchScroll(recipient, plan.summary());
    }
}
