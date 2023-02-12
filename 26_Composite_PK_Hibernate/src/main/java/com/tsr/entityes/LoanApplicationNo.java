package com.tsr.entityes;

import java.io.Serializable;

public class LoanApplicationNo implements Serializable{
	
	protected int applicationNo;
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
