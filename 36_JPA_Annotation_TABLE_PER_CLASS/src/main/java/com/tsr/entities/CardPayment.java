package com.tsr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CardPayment extends Payment{
	
	@Column(name = "card_no")
	protected String cardNo;
	@Column(name = "card_holder_nm")
	protected String cardHolderName;
	@Column(name = "issued_bank")
	protected String issuedBank;
	@Column(name = "expiry_day")
	protected int expiryDay;
	@Column(name = "expiry_month")
	protected int expiryMonth;
	
	public CardPayment() {
		super();
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getIssuedBank() {
		return issuedBank;
	}

	public void setIssuedBank(String issuedBank) {
		this.issuedBank = issuedBank;
	}

	public int getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(int expiryDay) {
		this.expiryDay = expiryDay;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	@Override
	public String toString() {
		return "CardPayment [cardNo=" + cardNo + ", cardHolderName=" + cardHolderName + ", issuedBank=" + issuedBank
				+ ", expiryDay=" + expiryDay + ", expiryMonth=" + expiryMonth + ", paymentNo=" + paymentNo
				+ ", description=" + description + ", customerName=" + customerName + ", paymentDate=" + paymentDate
				+ ", paidAmount=" + paidAmount + "]";
	}
	
}
