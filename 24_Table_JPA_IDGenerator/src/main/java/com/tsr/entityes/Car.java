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
@Table(name = "car")
@TableGenerator(name = "carGen",table = "id_gen",pkColumnName = "generator_name",pkColumnValue = "car_no",valueColumnName = "value",initialValue = 0,allocationSize = 1)
public class Car implements Serializable{
	
	@Id
	@Column(name = "car_no")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "carGen")
	protected int carNo;
	
	protected String name;
	protected String color;
	
	public Car() {
		super();
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", name=" + name + ", color=" + color + "]";
	}
	
}
