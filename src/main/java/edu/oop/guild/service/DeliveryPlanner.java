package edu.oop.guild.service;

/**
 * Author:          Jack Belleville
 * Date:            05/07/2026
 * File:            DeliveryPlanner.java
 * Desc:            Builds a DeliveryPlan from a DeliveryRequest using a realm
 *                  factory for courier+seal, a cost strategy for pricing, and
 *                  puts the resulting summary in the guild log.
 */

import edu.oop.guild.creature.Creature;
import edu.oop.guild.factory.RealmFactory;
import edu.oop.guild.log.GuildLog;
import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.seal.PackageSeal;
import edu.oop.guild.strategy.DeliveryCostStrategy;

import java.util.Objects;

public class DeliveryPlanner {
	private final RealmFactory factory;
	private final DeliveryCostStrategy strategy;
	private final GuildLog log;

	public DeliveryPlanner(RealmFactory factory, DeliveryCostStrategy strategy, GuildLog log) {
		Objects.requireNonNull(factory);
		Objects.requireNonNull(strategy);
		Objects.requireNonNull(log);
		this.factory = factory;
		this.strategy = strategy;
		this.log = log;
	}

	public DeliveryPlan plan(DeliveryRequest request) {
		Objects.requireNonNull(request);
		Creature courier = factory.createCourier();
		if (!courier.canCarry(request)) {
			throw new IllegalStateException("Courier cannot carry this package");
		}
		PackageSeal seal = factory.createSeal();
		String labelText = request.getPackageType().label() + " to " + request.getDestinationRealm().displayName();
		String sealedLabel = seal.apply(labelText);
		int price = strategy.estimateCoins(request);
		DeliveryPlan plan = new DeliveryPlan(request, courier, sealedLabel, price);
		log.record(plan.summary());
		return plan;
	}
}
