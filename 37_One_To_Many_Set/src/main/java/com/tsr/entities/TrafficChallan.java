package com.tsr.entities;

import java.io.Serializable;
import java.util.Date;

public class TrafficChallan implements Serializable{
	
	protected int challanNo;
	protected String description;
	protected Date issuedDate;
	protected String violationType;
	protected double amount;
	
	public TrafficChallan() {
		super();
	}

	public int getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(int challanNo) {
		this.challanNo = challanNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getViolationType() {
		return violationType;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TrafficChallan [challanNo=" + challanNo + ", description=" + description + ", issuedDate=" + issuedDate
				+ ", violationType=" + violationType + ", amount=" + amount + "]";
	}
	
}
