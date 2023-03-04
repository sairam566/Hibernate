package com.tsr;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.ChallanDAO;
import com.tsr.entities.BikeRegistration;
import com.tsr.entities.TrafficChallan;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    	//	addBikeDetails();
    		getBikeRegDetails();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }

	private static void getBikeRegDetails() {
		ChallanDAO challanDAO = new ChallanDAO();
		challanDAO.getBikeRegDetails(1);
	}

	private static void addBikeDetails() {
		ChallanDAO challanDAO = new ChallanDAO();
		Set<TrafficChallan> tfChallan = new HashSet<>();
		TrafficChallan challan = new TrafficChallan();
		challan.setDescription("Helmet");
		challan.setAmount(500);
		challan.setIssuedDate(new Date());
		challan.setViolationType("Drive helmet");
		
		tfChallan.add(challan);
		
		BikeRegistration bikeRegistration = new BikeRegistration();
		bikeRegistration.setChasisNo("TSR123");
		bikeRegistration.setEngineNo("EG-M-8956");
		bikeRegistration.setManufacturer("TSR Groups");
		bikeRegistration.setModelName("MG");
		bikeRegistration.setOwnerName("Sai");
		bikeRegistration.setPurchaseDate(new Date());
		bikeRegistration.setRegistrationNo("12KQ566");
		bikeRegistration.setTrafficChallans(tfChallan);
		
		challanDAO.addBikeRegDetails(bikeRegistration);
		
	}
}
