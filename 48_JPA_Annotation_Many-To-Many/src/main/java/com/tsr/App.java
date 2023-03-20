package com.tsr;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.JourneyDAO;
import com.tsr.entities.Journey;
import com.tsr.entities.Passenger;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			//addPassenger();
    		//addJourney();
    		//getPassenger();
    		getJourney();
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
    }
    
    public static void addPassenger() {
    	JourneyDAO dao = new JourneyDAO();
    	Passenger passenger = Passenger.builder().passengerName("TSR").age(29).gender("M").mobileNo("896532147").build();
    	dao.addPassenger(passenger);
    }
    
    public static void addJourney() {
    	JourneyDAO dao = new JourneyDAO();
    	Passenger passenger = Passenger.builder().passengerNo(9).build();
    	Set<Passenger> passengers = new HashSet<>();
    	passengers.add(passenger);
    	Journey journey = Journey.builder().source("OGL").destinaton("HYD").journeyDate(LocalDate.now()).busNo("AP8965").amount(569).passengers(passengers).build();
    	dao.addJourney(journey);
    }
    
    public static void getPassenger() {
    	JourneyDAO dao = new JourneyDAO();
    	dao.getPassenger(9);
    }
    
    public static void getJourney() {
    	JourneyDAO dao = new JourneyDAO();
    	dao.getJourney(0);
    }
}
