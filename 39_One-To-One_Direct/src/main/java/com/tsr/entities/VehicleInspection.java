package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class VehicleInspection implements Serializable{
	protected int inspectionNo;
	protected String rtaRegistrationNo;
	protected String chasisNo;
	protected String engineNo;
	protected String modelName;
	protected String manufacturer;
	protected String vehicleType;
	protected LocalDate purchaseDate;
	
	public VehicleInspection() {
		super();
	}

	public int getInspectionNo() {
		return inspectionNo;
	}

	public void setInspectionNo(int inspectionNo) {
		this.inspectionNo = inspectionNo;
	}

	public String getRtaRegistrationNo() {
		return rtaRegistrationNo;
	}

	public void setRtaRegistrationNo(String rtaRegistrationNo) {
		this.rtaRegistrationNo = rtaRegistrationNo;
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

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "VehicleInspection [inspectionNo=" + inspectionNo + ", rtaRegistrationNo=" + rtaRegistrationNo
				+ ", chasisNo=" + chasisNo + ", engineNo=" + engineNo + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", vehicleType=" + vehicleType + ", purchaseDate=" + purchaseDate + "]";
	}
	
}
