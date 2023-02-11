package com.tsr.entityes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "bus")
@TableGenerator(name = "busSeqGen",table = "id_gen", pkColumnName = "generator_name", pkColumnValue = "bus_no" ,valueColumnName = "value",allocationSize = 1,initialValue = 0)
public class Bus implements Serializable{
	
	@Id
	@Column(name = "bus_no")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "busSeqGen")
	protected int busNo;
	
	@Column(name = "bus_type")
	protected String busType;
	
	@Column(name = "registration_no")
	protected String registrationNo;
	
	@Column(name = "fuel_type")
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
