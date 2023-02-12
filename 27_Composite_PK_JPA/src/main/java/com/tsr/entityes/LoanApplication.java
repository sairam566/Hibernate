package com.tsr.entityes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication implements Serializable{
	
	@EmbeddedId
	protected LoanApplicationNo applicationNo;
	
	@Column(name = "applicant_nm")
	protected String applicantName;
	
	@Column(name = "applied_dt")
	protected Date appliedDate;
	
	@Column(name = "loan_type")
	protected String loanType;
	
	protected Date dob;
	protected String gender;
	
	@Column(name = "loan_amount")
	protected float loanAmount;

	public LoanApplicationNo getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(LoanApplicationNo applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getApplicantName() {
		return applicantName;
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
	
}
