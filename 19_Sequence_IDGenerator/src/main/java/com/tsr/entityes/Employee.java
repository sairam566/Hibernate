package com.tsr.entityes;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	
	protected int employeeNo;
	protected String employeeName;
	protected String employeeDept;
	protected Date employeeDOJ;
	protected Double employeeSalary;
	
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
	public Date getEmployeeDOJ() {
		return employeeDOJ;
	}
	public void setEmployeeDOJ(Date employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + ", employeeDOJ=" + employeeDOJ + ", employeeSalary=" + employeeSalary + "]";
	}
	
}
