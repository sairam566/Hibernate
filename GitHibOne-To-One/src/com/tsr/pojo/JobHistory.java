package com.tsr.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JOB_HISTORY")
public class JobHistory {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private int empId;
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="END_DATE")
	private Date endDate;
	
	@Column(name="JOB_ID")
	private String jobId;
	
	@Column(name="DEPARTMENT_ID")
	private int deptId;
	
	public JobHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobHistory(int empId, Date startDate, Date endDate, String jobId, int deptId) {
		super();
		this.empId = empId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobId = jobId;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "JobHistory [empId=" + empId + ", startDate=" + startDate + ", endDate=" + endDate + ", jobId=" + jobId
				+ ", deptId=" + deptId + "]";
	}
	
	
}
