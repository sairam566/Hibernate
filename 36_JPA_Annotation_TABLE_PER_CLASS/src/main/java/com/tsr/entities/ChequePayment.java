package com.tsr.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ChequePayment extends Payment {
	
	@Column(name = "cheque_no")
	protected String chequeNo;
	@Column(name = "bank_nm")
	protected String bankName;
	@Column(name = "branch_nm")
	protected String branchName;
	@Column(name = "payee_nm")
	protected String payeeName;
	@Column(name = "cheque_dt")
	protected Date chequeDate;
	
	public ChequePayment() {
		super();
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public Date getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	@Override
	public String toString() {
		return "ChequePayment [chequeNo=" + chequeNo + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", payeeName=" + payeeName + ", chequeDate=" + chequeDate + ", paymentNo=" + paymentNo
				+ ", description=" + description + ", customerName=" + customerName + ", paymentDate=" + paymentDate
				+ ", paidAmount=" + paidAmount + "]";
	}
	
}
