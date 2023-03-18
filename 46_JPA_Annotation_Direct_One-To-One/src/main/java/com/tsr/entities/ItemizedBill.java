package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table(name = "itemized_bill")
@GenericGenerator(name = "fkGen",parameters = {@Parameter( name = "property",value = "bill")}, strategy = "foreign" )
public class ItemizedBill implements Serializable{
	
	@Id
	@GeneratedValue(generator = "fkGen")
	@Column(name = "bill_no")
	protected int billNo;
	
	@Column(name = "fm_date")
	protected LocalDate fromDate;
	
	@Column(name = "to_date")
	protected LocalDate toDate;
	
	@Column(name = "local_min")
	protected int localMinutes;
	
	@Column(name = "isd_min")
	protected int isdMinutes;
	
	@Column(name = "local_sms")
	protected int localSms;
	
	@Column(name = "isd_sms")
	protected int isdSms;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	protected Bill bill;
}
