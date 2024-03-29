package com.xmlbootstrap.entityes;

import java.io.Serializable;

public class Address implements Serializable{
	
	protected int addressNo;
	protected String addressLine1;
	protected String addressLine2;
	protected String country;
	protected String state;
	protected String city;
	protected int zip;
	
	public Address() {
		super();
	}

	public int getAddressNo() {
		return addressNo;
	}

	public void setAddressNo(int addressNo) {
		this.addressNo = addressNo;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [addressNo=" + addressNo + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", zip=" + zip + "]";
	}

}
