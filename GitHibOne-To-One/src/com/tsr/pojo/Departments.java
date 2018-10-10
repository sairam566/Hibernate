package com.tsr.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="DEPARTMENTS")
public class Departments {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="DeptSeq")
	@SequenceGenerator(name="DeptSeq",sequenceName="DEPARTMENTS_SEQ",allocationSize=10)
	@Column(name="DEPARTMENT_ID")
	private int deptId;
	
	@Column(name="DEPARTMENT_NAME")
	private String deptName;
	
	@Column(name="MANAGER_ID")
	private int managerId;
	
	@Column(name="LOCATION_ID")
	private int locationId;
	
	public Departments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Departments(String deptName, int managerId, int locationId) {
		super();
		this.deptName = deptName;
		this.managerId = managerId;
		this.locationId = locationId;
	}


	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	@Override
	public String toString() {
		return "Departments [deptId=" + deptId + ", deptName=" + deptName + ", managerId=" + managerId + ", locationId="
				+ locationId + "]";
	}
	
	
	
}
