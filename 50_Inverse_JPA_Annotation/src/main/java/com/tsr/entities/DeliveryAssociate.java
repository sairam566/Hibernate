package com.tsr.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Entity
@Table(name = "amazon_delivery_Associate")
public class DeliveryAssociate {
	
	@Id
	@Column(name = "delivery_Associate_No")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int deliveryAssociateNo;
	
	@Column(name = "associate_name")
	protected String associateName;
	
	protected int experience;
	
	protected String designation;
	
	@Column(name = "contact_no")
	protected String contactNo;
	
	@OneToMany(mappedBy = "deliveryAssociate")
	//@JoinColumn(name = "delivery_Associate_No")
	protected Set<Parcel> parcels;
}
