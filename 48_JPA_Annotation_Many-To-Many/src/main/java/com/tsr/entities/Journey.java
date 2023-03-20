package com.tsr.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "journey_dtls")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Journey implements Serializable{
	
	@Id
	@Column(name = "journey_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int journeyNo;

	protected String source;
	
	protected String destinaton;
	
	@Column(name = "journey_dt")
	protected LocalDate journeyDate;
	
	@Column(name = "bus_no")
	protected String busNo;
	
	protected double amount;
	
	@ManyToMany
	@JoinTable(name = "journey_passengers",joinColumns = {@JoinColumn(name="journey_no")},inverseJoinColumns = {@JoinColumn(name="passenger_no")} )
	protected Set<Passenger> passengers;
	
	
}
