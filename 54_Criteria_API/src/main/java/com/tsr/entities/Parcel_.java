package com.tsr.entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Parcel.class)
public abstract class Parcel_ {

	public static volatile SingularAttribute<Parcel, Integer> parcelNo;
	public static volatile SingularAttribute<Parcel, DeliveryAssociate> deliveryAssociate;
	public static volatile SingularAttribute<Parcel, Double> charges;
	public static volatile SingularAttribute<Parcel, String> deliveryType;
	public static volatile SingularAttribute<Parcel, String> description;
	public static volatile SingularAttribute<Parcel, Integer> weight;

	public static final String PARCEL_NO = "parcelNo";
	public static final String DELIVERY_ASSOCIATE = "deliveryAssociate";
	public static final String CHARGES = "charges";
	public static final String DELIVERY_TYPE = "deliveryType";
	public static final String DESCRIPTION = "description";
	public static final String WEIGHT = "weight";

}

