package com.tsr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "passenger_dtls")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Passenger implements Serializable{
	
	@Id
	@Column(name = "passenger_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int passengerNo;
	
	@Column(name = "passenger_name")
	protected String passengerName;
	
	protected int age;
	
	protected String gender;
	
	@Column(name = "mobile_no")
	protected String mobileNo;
}
