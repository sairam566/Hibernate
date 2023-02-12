package com.tsr.entityes;

import java.io.Serializable;
import java.util.Date;

public class LoanApplication implements Serializable{
	
//	protected int applicationNo;
//	protected String branchCode;
	protected LoanApplicationNo applicationNo;
	protected String applicantName;
	protected Date appliedDate;
	protected String loanType;
	protected Date dob;
	protected String gender;
	protected float loanAmount;
	
	public LoanApplication() {
		super();
	}

//	public LoanApplication(int applicationNo, String branchCode) {
//		super();
//		this.applicationNo = applicationNo;
//		this.branchCode = branchCode;
//	}

//	public int getApplicationNo() {
//		return applicationNo;
//	}
//
//	public void setApplicationNo(int applicationNo) {
//		this.applicationNo = applicationNo;
//	}

//	public String getBranchCode() {
//		return branchCode;
//	}
//
//	public void setBranchCode(String branchCode) {
//		this.branchCode = branchCode;
//	}
	
	public String getApplicantName() {
		return applicantName;
	}

	public LoanApplicationNo getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(LoanApplicationNo applicationNo) {
		this.applicationNo = applicationNo;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationNo=" + applicationNo + ", applicantName=" + applicantName + ", appliedDate="
				+ appliedDate + ", loanType=" + loanType + ", dob=" + dob + ", gender=" + gender + ", loanAmount="
				+ loanAmount + "]";
	}

//	@Override
//	public String toString() {
//		return "LoanApplication [applicationNo=" + applicationNo + ", branchCode=" + branchCode + ", applicantName="
//				+ applicantName + ", appliedDate=" + appliedDate + ", loanType=" + loanType + ", dob=" + dob
//				+ ", gender=" + gender + ", loanAmount=" + loanAmount + "]";
//	}
	
	
}
