package com.tsr;

import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.ParcelDAO;
import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		addParcelAndDeliveryAssociate();
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
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
