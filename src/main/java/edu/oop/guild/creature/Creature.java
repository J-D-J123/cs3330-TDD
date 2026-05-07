package edu.oop.guild.creature;

/**
 * Author: 			Joseph Johnson
 * Date:			05/06/2026
 * File:			Creature.java
 * Desc:			Defines the Creature interface for all guild creatures, 
 * 						including name, carrying capacity, and realm
 */

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.RealmType;

import java.util.Objects;

public interface Creature {
    String name();
    int carryingCapacityKg();
    RealmType nativeRealm();

    default boolean canCarry(DeliveryRequest request) {
        Objects.requireNonNull(request);
        return request.getWeightKg() <= carryingCapacityKg()
                && request.getDestinationRealm() == nativeRealm();
    }
}
