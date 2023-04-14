package com.tsr.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeliveryAssociate.class)
public abstract class DeliveryAssociate_ {

	public static volatile SingularAttribute<DeliveryAssociate, String> associateName;
	public static volatile SingularAttribute<DeliveryAssociate, Integer> deliveryAssociateNo;
	public static volatile SingularAttribute<DeliveryAssociate, String> designation;
	public static volatile SingularAttribute<DeliveryAssociate, Integer> experience;
	public static volatile SingularAttribute<DeliveryAssociate, String> contactNo;
	public static volatile SetAttribute<DeliveryAssociate, Parcel> parcels;

	public static final String ASSOCIATE_NAME = "associateName";
	public static final String DELIVERY_ASSOCIATE_NO = "deliveryAssociateNo";
	public static final String DESIGNATION = "designation";
	public static final String EXPERIENCE = "experience";
	public static final String CONTACT_NO = "contactNo";
	public static final String PARCELS = "parcels";

}

