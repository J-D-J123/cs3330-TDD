package edu.oop.guild.creature;

/**
 * Author:          Joseph Johnson
 * Date:            05/06/2026
 * File:            TunnelMole.java
 * Desc:            Builds a tunnel mole creature with a carrying capacity of 30Kg
 * 						which comes from the UNDERGROUND 
 */

import edu.oop.guild.model.RealmType;

public class TunnelMole implements Creature {
    @Override
    public String name() { return "Tunnel Mole"; }

    @Override
    public int carryingCapacityKg() { return 30; }

    @Override
    public RealmType nativeRealm() { return RealmType.UNDERGROUND; }
}
