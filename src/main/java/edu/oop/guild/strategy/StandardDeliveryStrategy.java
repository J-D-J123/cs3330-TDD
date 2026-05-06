package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;

import java.util.Map;
import java.util.Objects;

public class StandardDeliveryStrategy implements DeliveryCostStrategy {
    private static final Map<PackageType, Integer> BASES = Map.of(
            PackageType.FOOD, 17,
            PackageType.POTION, 22,
            PackageType.ARTIFACT, 34
    );

    @Override
    public int estimateCoins(DeliveryRequest request) {
        Objects.requireNonNull(request);
        return request.getDistanceLeagues() + BASES.get(request.getPackageType()) + (request.isFragile() ? 5 : 0);
    }
}
