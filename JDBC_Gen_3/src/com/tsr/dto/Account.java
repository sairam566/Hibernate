package com.tsr.dto;

public class Account {
	
	private int accountNo;
	private String accountHolderName;
	private String accountType;
	private String mobileNo;
	private String email;
	private String branchCode;
	private int balance;
	
	public Account() {}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", mobileNo=" + mobileNo + ", email=" + email + ", branchCode=" + branchCode
				+ ", balance=" + balance + "]";
	}
	
}
