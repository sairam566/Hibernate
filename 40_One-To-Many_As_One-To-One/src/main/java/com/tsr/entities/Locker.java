package com.tsr.entities;

import java.io.Serializable;

public class Locker implements Serializable {
	
	protected int lockerNo;
	protected String keyNo;
	protected String dimensions;
	protected double charges;
	protected Account account;
	
	public Locker() {
		super();
	}

	public int getLockerNo() {
		return lockerNo;
	}

	public void setLockerNo(int lockerNo) {
		this.lockerNo = lockerNo;
	}

	public String getKeyNo() {
		return keyNo;
	}

	public void setKeyNo(String keyNo) {
		this.keyNo = keyNo;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Locker [lockerNo=" + lockerNo + ", keyNo=" + keyNo + ", dimensions=" + dimensions + ", charges="
				+ charges + "]";
	}
	
}
