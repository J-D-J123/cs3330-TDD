package edu.oop.guild.creature;

/**
 * Author: 			Joseph Johnson
 * Date:			05/06/2026
 * File:			CloudDragon.java
 * Desc:			builds the cloud dragon creature with a carrying capacity of 80Kg
 * 						that is from the SKY
 */

import edu.oop.guild.model.RealmType;

public class CloudDragon implements Creature {
    @Override
    public String name() { return "Cloud Dragon"; }

    @Override
    public int carryingCapacityKg() { return 80; }

    @Override
    public RealmType nativeRealm() { return RealmType.SKY; }
}
