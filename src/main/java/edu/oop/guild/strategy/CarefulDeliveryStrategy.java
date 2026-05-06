package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;

import java.util.Map;
import java.util.Objects;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {
    private static final Map<PackageType, Integer> BASES = Map.of(
            PackageType.FOOD, 26,
            PackageType.POTION, 31,
            PackageType.ARTIFACT, 43
    );

    @Override
    public int estimateCoins(DeliveryRequest request) {
        Objects.requireNonNull(request);
        return request.getDistanceLeagues() + BASES.get(request.getPackageType());
    }
}
