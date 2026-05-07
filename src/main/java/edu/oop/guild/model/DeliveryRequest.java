package edu.oop.guild.model;

/*	File: DeliveryRequest.java
 * 	Author: Tucker Potts
 *  Description: This file contains details about the package,
 *  its weight in kg, its distance, its destination, and whether 
 *  it is fragile or not.
 * 
 * 
 */
public class DeliveryRequest {
	PackageType packageType;
	int weightKg; 
	int distanceLeagues; 
	RealmType destinationRealm; 
	boolean fragile;
	
	public DeliveryRequest(PackageType packageType, int weightKg, int distanceLeagues, RealmType destinationRealm, boolean fragile) {
		if(packageType == null) {
			throw new NullPointerException("There is no package!");
		}
		if(weightKg <= 0) {
			throw new IllegalArgumentException("How can that be possible?");
		}
		if(distanceLeagues <= 0) {
			throw new IllegalArgumentException("So, you're saying that the distance is 0 or less??");
		}
		if(destinationRealm == null) {
			throw new NullPointerException("There is no destination realm!");
		}
		this.packageType = packageType;
		this.weightKg = weightKg;
		this.distanceLeagues = distanceLeagues;
		this.destinationRealm = destinationRealm;
		this.fragile = fragile;
	}



	public PackageType getPackageType() {
		return packageType;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public int getDistanceLeagues() {
		return distanceLeagues;
	}

	public RealmType getDestinationRealm() {
		return destinationRealm;
	}

	public boolean isFragile() {
		return fragile;
	}
	
	
}
