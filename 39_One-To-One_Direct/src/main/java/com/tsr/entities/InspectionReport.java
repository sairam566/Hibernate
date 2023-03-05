package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class InspectionReport implements Serializable{
	
	protected int inspectionNo;
	protected LocalDate reportDate;
	protected String agentName;
	protected String description;
	protected String observations;
	protected int rating;
	protected double valuation;
	protected LocalDate reportExpiryDate;
	protected VehicleInspection vehicleInspection;
	
	public InspectionReport() {
		super();
	}

	public int getInspectionNo() {
		return inspectionNo;
	}

	public void setInspectionNo(int inspectionNo) {
		this.inspectionNo = inspectionNo;
	}

	public LocalDate getReportDate() {
		return reportDate;
	}

	public void setReportDate(LocalDate reportDate) {
		this.reportDate = reportDate;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getValuation() {
		return valuation;
	}

	public void setValuation(double valuation) {
		this.valuation = valuation;
	}

	public LocalDate getReportExpiryDate() {
		return reportExpiryDate;
	}

	public void setReportExpiryDate(LocalDate reportExpiryDate) {
		this.reportExpiryDate = reportExpiryDate;
	}

	public VehicleInspection getVehicleInspection() {
		return vehicleInspection;
	}

	public void setVehicleInspection(VehicleInspection vehicleInspection) {
		this.vehicleInspection = vehicleInspection;
	}

	@Override
	public String toString() {
		return "InspectionReport [inspectionNo=" + inspectionNo + ", reportDate=" + reportDate + ", agentName="
				+ agentName + ", description=" + description + ", observations=" + observations + ", rating=" + rating
				+ ", valuation=" + valuation + ", reportExpiryDate=" + reportExpiryDate + ", vehicleInspection="
				+ vehicleInspection + "]";
	}
}
