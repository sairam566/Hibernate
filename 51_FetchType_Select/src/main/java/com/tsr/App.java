package com.tsr;

import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.ParcelDAO;
import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			//addParcelAndDeliveryAssociate();
			
			/**
			 * Before you uncomment and run below method 
			 * Uncomment DeliveryAssociate.hbm.xml 
			 * <set name="parcels" inverse="true" fetch="select">
			 */
			//getDeliveryAssociateSelect();
			
			/**
			 * Before you uncomment and run below method 
			 * Uncomment DeliveryAssociate.hbm.xml 
			 * <set name="parcels" inverse="true" fetch="join">
			 */
			//getDeliveryAssociateJoin();
			
			/**
			 * Before you uncomment and run below method 
			 * Uncomment DeliveryAssociate.hbm.xml 
			 * <set name="parcels" inverse="true" fetch="subselect">
			 */
			getDeliveryAssociateSubSelect();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void addParcelAndDeliveryAssociate() {
		ParcelDAO dao = new ParcelDAO();
		Parcel parcel1 = Parcel.builder().description("IPhone 15 pro").deliveryType("HD").weight(56).charges(55623.23)
				.build();
		Parcel parcel2 = Parcel.builder().description("IPad-12 Pro").deliveryType("HD").weight(56).charges(65623.23)
				.build();
		Set<Parcel> parcels = new HashSet<>();
		parcels.add(parcel1);
		parcels.add(parcel2);
		DeliveryAssociate deliveryAssociate = DeliveryAssociate.builder().associateName("BH").experience(6)
				.designation("OGL").contactNo("56891937").parcels(parcels).build();

		dao.addParcelAndDeliveryAssociate(parcels, deliveryAssociate);
	}
	
	public static void getDeliveryAssociateSelect() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateSelect(1);
	}
	
	public static void getDeliveryAssociateJoin() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateJoin(1);
	}
	
	public static void getDeliveryAssociateSubSelect() {
		ParcelDAO dao = new ParcelDAO();
		dao.getDeliveryAssociateSubSelect(3);
	}
}
