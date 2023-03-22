package com.tsr;

import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.ParcelDAO;
import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			//addParcel();
    		//addDeliveryAssociate();
    		addParcelAndDeliveryAssociate();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
    
    public static void addParcel() {
    	ParcelDAO dao = new ParcelDAO();
    	Parcel parcel = Parcel.builder().description("IPhone").deliveryType("HD").weight(56).charges(5623.23).build();
    	dao.addParcel(parcel);
    }
    
	public static void addDeliveryAssociate() {
		ParcelDAO dao = new ParcelDAO();
		Parcel parcel = Parcel.builder().parcelNo(1).build();
		Set<Parcel> parcels = new HashSet<>();
		parcels.add(parcel);
		DeliveryAssociate deliveryAssociate = DeliveryAssociate.builder().associateName("BH").experience(6)
				.designation("OGL").contactNo("56891937").parcels(parcels).build();
		dao.addDeliveryAssociate(deliveryAssociate);
	}
	
	public static void addParcelAndDeliveryAssociate() {
		// If you run this method You will see 2 insert and 1 update
		//If we add inverse=true we will only 2 inserts only
		ParcelDAO dao = new ParcelDAO();
		Set<Parcel> parcels = new HashSet<>();
    	Parcel parcel = Parcel.builder().description("IPAD").deliveryType("H34D").weight(756).charges(589623.23).build();
    	parcels.add(parcel);
    	DeliveryAssociate deliveryAssociate = DeliveryAssociate.builder().associateName("B89H").experience(6)
				.designation("HYD").contactNo("8888888").parcels(parcels).build();
    	dao.addParcelAndDeliveryAssociate(parcels,deliveryAssociate);
	}
}
