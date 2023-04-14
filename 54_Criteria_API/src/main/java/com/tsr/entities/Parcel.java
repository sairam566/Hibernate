package com.tsr.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"deliveryAssociate"})
@Builder
@Entity
@Table(name = "parcel")
public class Parcel implements Serializable{
	
	@Id
	@Column(name = "parcel_No")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int parcelNo;
	
	protected String description;
	
	@Column(name = "delivery_type")
	protected String deliveryType;
	
	protected int weight;
	
	protected double charges;
	
	@ManyToOne
	@JoinColumn(name = "delivery_Associate_No")
	protected DeliveryAssociate deliveryAssociate;
}
