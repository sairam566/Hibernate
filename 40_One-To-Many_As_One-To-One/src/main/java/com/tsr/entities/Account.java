package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

public class Account implements Serializable {

	protected int accountNo;
	protected String accountHolderName;
	protected LocalDate openedDate;
	protected String accountType;
	protected String branchCode;
	protected double balance;
	protected Set<Locker> lockers;

	public Account() {
		super();
	}

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

	public LocalDate getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = openedDate;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Set<Locker> getLockers() {
		return lockers;
	}

	public void setLockers(Set<Locker> lockers) {
		this.lockers = lockers;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", openedDate="
				+ openedDate + ", accountType=" + accountType + ", branchCode=" + branchCode + ", balance=" + balance
				+ ", lockers=" + lockers + "]";
	}

}
