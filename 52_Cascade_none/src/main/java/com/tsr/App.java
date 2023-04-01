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
			
			/**
			 * When running addParcelAndDeliveryAssociate_Cascade_NONE method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="none"/>
			 */
			
			//addParcelAndDeliveryAssociate_Cascade_NONE();
			
			
			/**
			 * When running addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_Transient method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="save-update"/>
			 */
			//addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_Transient();
			
			/**
			 * When running addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_1_Transient_1_Existing method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="save-update"/>
			 */
			//addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_1_Transient_1_Existing();
			
			
			/**
			 * When running addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_2_Existing_Objects method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="save-update"/>
			 */
			//addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_2_Existing_Objects();
			
			/**
			 * When running deleteDeliveryAssociate_With_Parcels_Cascade_NONE method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="none"/>
			 */
			//deleteDeliveryAssociate_With_Parcels_Cascade_NONE();
			
			/**
			 * When running deleteDeliveryAssociate_With_Parcels_Cascade_DELETE method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="delete"/>
			 */
			//deleteDeliveryAssociate_With_Parcels_Cascade_DELETE();
			
			
			/**
			 * When running deleteDeliveryAssociate_With_Parcels_Cascade_orphan_delete method
			 * check that Parcel.hbm.xml has below line uncommented. Then you can see the expected behavior
			 * <many-to-one name="deliveryAssociate" column="delivery_associate_no" cascade="orphan-delete"/>
			 */
			deleteDeliveryAssociate_With_Parcels_Cascade_orphan_delete();
			
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}

	public static void addParcelAndDeliveryAssociate_Cascade_NONE() {
		ParcelDAO dao = new ParcelDAO();

		Parcel parcel1 = Parcel.builder().description("IPhone 15 pro").deliveryType("HD").weight(56).charges(55623.23)
				.build();

		Set<Parcel> parcels = new HashSet<>();
		parcels.add(parcel1);

		DeliveryAssociate deliveryAssociate = DeliveryAssociate.builder().associateName("BH").experience(6)
				.designation("OGL").contactNo("56891937").parcels(parcels).build();

		dao.addParcelAndDeliveryAssociate_Cascade_NONE(parcels, deliveryAssociate);
	}
	
	
	/**
	 * Here in this method we are trying to save 2 associated Transient objects
	 * and trying to understand how save-update will work in case of 2 Transient objects
	 */
	
	public static void addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_Transient() {
		ParcelDAO dao = new ParcelDAO();

		Parcel parcel1 = Parcel.builder().description("IPhone 15 pro").deliveryType("HD").weight(56).charges(55623.23)
				.build();

		Set<Parcel> parcels = new HashSet<>();
		parcels.add(parcel1);

		DeliveryAssociate deliveryAssociate = DeliveryAssociate.builder().associateName("BH").experience(6)
				.designation("OGL").contactNo("56891937").parcels(parcels).build();

		dao.addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_Transient(parcels, deliveryAssociate);
	}
	
	/**
	 * Here in this method we are trying to save 1 object and update another another object
	 * and trying to understand how save-update will work in case of update objects
	 */
	
	public static void addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_1_Transient_1_Existing() {
		ParcelDAO dao = new ParcelDAO();

		Set<Parcel> parcels = new HashSet<>();

		DeliveryAssociate deliveryAssociate = DeliveryAssociate.builder().associateName("JAGA").experience(5)
				.designation("HYD").contactNo("891937").parcels(parcels).build();

		dao.addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_1_Transient_1_Existing(parcels, deliveryAssociate);
	}
	
	/**
	 * Here in this method we are trying to update 2 objects 
	 * and trying to understand how save-update will work in case of updating objects
	 */
	
	public static void addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_2_Existing_Objects() {
		ParcelDAO dao = new ParcelDAO();

		dao.addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_2_Existing_Objects(1, 1);
	}
	
	public static void deleteDeliveryAssociate_With_Parcels_Cascade_NONE() {
		ParcelDAO dao = new ParcelDAO();
		dao.deleteDeliveryAssociate_With_Parcels_Cascade_NONE(1);
	}
	
	public static void deleteDeliveryAssociate_With_Parcels_Cascade_DELETE() {
		ParcelDAO dao = new ParcelDAO();
		dao.deleteDeliveryAssociate_With_Parcels_Cascade_DELETE(2);
	}
	
	public static void deleteDeliveryAssociate_With_Parcels_Cascade_orphan_delete() {
		ParcelDAO dao = new ParcelDAO();
		dao.deleteDeliveryAssociate_With_Parcels_Cascade_DELETE(1);
	}
	
}
