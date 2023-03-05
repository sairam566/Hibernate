package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Associate implements Serializable {
	
	protected int associateNo;
	protected String fullname;
	protected String designation;
	protected String department;
	protected LocalDate joinedDate;
	protected String emailAddress;
	protected String mobileNo;
	
	public Associate() {
		super();
	}

	public int getAssociateNo() {
		return associateNo;
	}

	public void setAssociateNo(int associateNo) {
		this.associateNo = associateNo;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(LocalDate joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Associate [associateNo=" + associateNo + ", fullname=" + fullname + ", designation=" + designation
				+ ", department=" + department + ", joinedDate=" + joinedDate + ", emailAddress=" + emailAddress
				+ ", mobileNo=" + mobileNo + "]";
	}
	
}
