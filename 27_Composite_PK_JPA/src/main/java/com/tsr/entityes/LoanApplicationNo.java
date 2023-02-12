package com.tsr.entityes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LoanApplicationNo implements Serializable{
	
	@Column(name = "application_no")
	protected int applicationNo;
	
	@Column(name = "branch_code")
	protected String branchCode;

	public LoanApplicationNo() {
		super();
	}

	public int getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(int applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "LoanApplicationNo [applicationNo=" + applicationNo + ", branchCode=" + branchCode + "]";
	}
	
}
