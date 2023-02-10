package com.tsr.entityes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
@SequenceGenerator(name = "busSeqGen", sequenceName = "bus_seq",initialValue = 1,allocationSize = 1)
public class Bus implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "busSeqGen")
	@Column(name = "bus_no")
	protected int busNo;
	
	@Column(name = "bus_type")
	protected String busType;
	
	@Column(name = "REGISTRATION_NO")
	protected String registrationNo;
	
	@Column(name = "FUEL_TYPE")
	protected String fuelType;
	
	//No need to mention @column as both the column name and attribute name matches
	protected String color;
	protected int capacity;
	
	public Bus() {
		super();
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busType=" + busType + ", registrationNo=" + registrationNo + ", fuelType="
				+ fuelType + ", color=" + color + ", capacity=" + capacity + "]";
	}
}
