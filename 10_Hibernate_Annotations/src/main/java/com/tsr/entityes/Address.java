package com.tsr.entityes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	@Id
	@Column(name = "address_no")
	protected int addressNo;
	@Column(name = "address_line1")
	protected String addressLine1;
	@Column(name = "address_line2")
	protected String addressLine2;
	protected String city;
	protected String state;
	protected int zip;
	protected String country;

	public Address() {
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressNo=" + addressNo + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country + "]";
	}

}
