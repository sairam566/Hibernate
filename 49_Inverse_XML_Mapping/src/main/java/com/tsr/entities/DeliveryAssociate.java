package com.tsr.entities;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DeliveryAssociate {
	
	protected int deliveryAssociateNo;
	protected String associateName;
	protected int experience;
	protected String designation;
	protected String contactNo;
	protected Set<Parcel> parcels;
}
