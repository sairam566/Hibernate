package com.tsr;

import com.tsr.dao.BusDAO;
import com.tsr.entityes.Bus;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			BusDAO busDAO = new BusDAO();
			Bus bus = new Bus();
			bus.setBusType("Volva");
			bus.setCapacity(50);
			bus.setColor("Blue");
			bus.setFuelType("Petrol");
			bus.setRegistrationNo("AP27007");
			busDAO.addBus(bus);
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
    }
}
