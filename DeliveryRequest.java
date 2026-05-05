package edu.oop.guild.model;


import edu.oop.guild.types.PackageType;
import edu.oop.guild.types.RealmType;

/*	File: DeliveryRequest.java
 * 	Author: Tucker Potts
 *  Description: This file...
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
		this.packageType = packageType;
		this.weightKg = weightKg;
		this.distanceLeagues = distanceLeagues;
		this.destinationRealm = destinationRealm;
		this.fragile = fragile;
	}



	public PackageType getPackageType() {
		if(packageType == null) {
			throw new NullPointerException("There is no package!");
		}
		return packageType;
	}




	public int getWeightKg() {
		if(weightKg <= 0) {
			throw new IllegalArgumentException("How can that be possible?");
		}
		return weightKg;
	}

	public int getDistanceLeagues() {
		if(distanceLeagues <= 0) {
			throw new IllegalArgumentException("So, you're saying that the distance is 0 or less??");
		}
		return distanceLeagues;
	}

	public RealmType getDestinationRealm() {
		if(destinationRealm == null) {
			throw new NullPointerException("There is no destination realm!");
		}
		return destinationRealm;
	}

	public boolean isFragile() {
		return fragile;
	}
	
	
}
