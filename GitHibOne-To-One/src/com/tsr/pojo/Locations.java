package com.tsr.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LOCATIONS")
public class Locations {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LocSeq")
	@SequenceGenerator(name="LocSeq",sequenceName="LOCATIONS_SEQ",allocationSize=100)
	@Column(name="LOCATION_ID")
	private int locationId;
	
	@Column(name="STREET_ADDRESS")
	private String StreetAddress;
	
	@Column(name="POSTAL_CODE")
	private String postalCode;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE_PROVINCE")
	private String stateProvince;
	
	@Column(name="COUNTRY_ID")
	private String countryCode;

	public int getLocationId() {
		return locationId;
	}
	
	public Locations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Locations(String streetAddress, String postalCode, String city, String stateProvince, String countryCode) {
		super();
		StreetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
		this.countryCode = countryCode;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getStreetAddress() {
		return StreetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Locations [locationId=" + locationId + ", StreetAddress=" + StreetAddress + ", postalCode=" + postalCode
				+ ", city=" + city + ", stateProvince=" + stateProvince + ", countryCode=" + countryCode + "]";
	}
	
	
}
