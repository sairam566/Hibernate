package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bill_tb")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Bill implements Serializable{
	
	@Id
	@Column(name = "bill_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int billNo;
	
	@Column(name = "bill_dt")
	protected LocalDate billDate;
	
	@Column(name = "customer_nm")
	protected String customerName;
	
	@Column(name = "mobile_no")
	protected String mobileNo;
	
	protected double amount;
}
