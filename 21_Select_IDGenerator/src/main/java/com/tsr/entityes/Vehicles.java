package com.tsr.entityes;

import java.io.Serializable;

public class Vehicles implements Serializable{
	
	protected String vehicleNo;
	protected String modelName;
	protected String manufacturer;
	protected String registrationNo;
	protected String color;
	protected String fuelType;
	protected double leaseAmount;
	
	public Vehicles() {
		super();
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
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

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getLeaseAmount() {
		return leaseAmount;
	}

	public void setLeaseAmount(double leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicleNo=" + vehicleNo + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", registrationNo=" + registrationNo + ", color=" + color + ", fuelType=" + fuelType
				+ ", leaseAmount=" + leaseAmount + "]";
	}
	
}
