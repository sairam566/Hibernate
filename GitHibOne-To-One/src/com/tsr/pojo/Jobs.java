package com.tsr.pojo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
public class Jobs {

	@Id
	@Column(name="JOB_ID")
	private String jobId;
	
	@Column(name="JOB_TITLE")
	private String jobTitle;
	
	@Column(name="MIN_SALARY")
	private BigDecimal minSal;
	
	@Column(name="MAX_SALARY")
	private BigDecimal maxSal;

	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobs(String jobId, String jobTitle, BigDecimal minSal, BigDecimal maxSal) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSal = minSal;
		this.maxSal = maxSal;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public BigDecimal getMinSal() {
		return minSal;
	}

	public void setMinSal(BigDecimal minSal) {
		this.minSal = minSal;
	}

	public BigDecimal getMaxSal() {
		return maxSal;
	}

	public void setMaxSal(BigDecimal maxSal) {
		this.maxSal = maxSal;
	}

	@Override
	public String toString() {
		return "Jobs [jobId=" + jobId + ", jobTitle=" + jobTitle + ", minSal=" + minSal + ", maxSal=" + maxSal + "]";
	}
	
	
}
