package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Leave implements Serializable{
	
	protected int leaveNo;
	protected String leaveType;
	protected String description;
	protected LocalDate startDate;
	protected LocalDate endDate;
	protected String status;
	protected Associate associate;
	
	public Leave() {
		super();
	}

	public int getLeaveNo() {
		return leaveNo;
	}

	public void setLeaveNo(int leaveNo) {
		this.leaveNo = leaveNo;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Associate getAssociate() {
		return associate;
	}

	public void setAssociate(Associate associate) {
		this.associate = associate;
	}

	@Override
	public String toString() {
		return "Leave [leaveNo=" + leaveNo + ", leaveType=" + leaveType + ", description=" + description
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + ", associate="
				+ associate + "]";
	}
	
}
