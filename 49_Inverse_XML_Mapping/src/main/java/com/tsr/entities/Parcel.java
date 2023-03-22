package com.tsr.entities;

import java.io.Serializable;

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
@ToString
@Builder
public class Parcel implements Serializable{
	
	protected int parcelNo;
	protected String description;
	protected String deliveryType;
	protected int weight;
	protected double charges;
	protected DeliveryAssociate deliveryAssociate;
}
