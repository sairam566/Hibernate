package com.tsr.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class BikeRegistration implements Serializable{
	
	protected int bikeNo;
	protected String registrationNo;
	protected String modelName;
	protected String manufacturer;
	protected Date purchaseDate;
	protected String ownerName;
	protected String chasisNo;
	protected String engineNo;
	protected Set<TrafficChallan> trafficChallans;
	
	public BikeRegistration() {
		super();
	}

	public int getBikeNo() {
		return bikeNo;
	}

	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public Set<TrafficChallan> getTrafficChallans() {
		return trafficChallans;
	}

	public void setTrafficChallans(Set<TrafficChallan> trafficChallans) {
		this.trafficChallans = trafficChallans;
	}

	@Override
	public String toString() {
		return "BikeRegistration [bikeNo=" + bikeNo + ", registrationNo=" + registrationNo + ", modelName=" + modelName
				+ ", manufacturer=" + manufacturer + ", purchaseDate=" + purchaseDate + ", ownerName=" + ownerName
				+ ", chasisNo=" + chasisNo + ", engineNo=" + engineNo + ", trafficChallans=" + trafficChallans + "]";
	}
	
}
