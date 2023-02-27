package com.tsr.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "incrementGen", strategy = "increment")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment implements Serializable{
	
	@Id
	@Column(name = "payment_no")
	@GeneratedValue(generator = "incrementGen")
	protected int paymentNo;
	
	protected String description;
	@Column(name = "customer_name")
	protected String customerName;
	@Column(name = "payment_date")
	protected Date paymentDate;
	@Column(name = "paid_amt")
	protected double paidAmount;
	
	public Payment() {
		super();
	}
	
	public int getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(int paymentNo) {
		this.paymentNo = paymentNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Override
	public String toString() {
		return "Payment [paymentNo=" + paymentNo + ", description=" + description + ", customerName=" + customerName
				+ ", paymentDate=" + paymentDate + ", paidAmount=" + paidAmount + "]";
	}
	
}
