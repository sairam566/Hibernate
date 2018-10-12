package com.tsr.pojo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employees
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE , generator="EmpGen")
	@SequenceGenerator(name="EmpGen" , sequenceName="EMPLOYEES_SEQ" , allocationSize=1)
	@Column(name="EMPLOYEE_ID")
	private int empId;
	
	@Column(name="FIRST_NAME")
	private String fName;
	
	@Column(name="LAST_NAME")
	private String lName;
	
	@Column(name="EMAIL")
	private String email;

	@Column(name="PHONE_NUMBER")
	private String phoneNo;
	
	@Column(name="HIRE_DATE")
	private Date hireDate;
	
	@Column(name="JOB_ID")
	private String jobId;
	
	@Column(name="SALARY")
	private BigDecimal sal;
	
	@Column(name="COMMISSION_PCT")
	private Double commissionPct;
	
	@Column(name="MANAGER_ID")
	private Integer managerId;
	
	@Column(name="DEPARTMENT_ID")
	private Integer deptId;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employees(String fName, String lName, String email, String phoneNo, Date hireDate, String jobId, BigDecimal sal,
			Double commissionPct, Integer managerId, Integer deptId) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.sal = sal;
		this.commissionPct = commissionPct;
		this.managerId = managerId;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public BigDecimal getSal() {
		return sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public Double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", phoneNo="
				+ phoneNo + ", hireDate=" + hireDate + ", jobId=" + jobId + ", sal=" + sal + ", commissionPct="
				+ commissionPct + ", managerId=" + managerId + ", deptId=" + deptId + "]";
	}
	
	
	
}
