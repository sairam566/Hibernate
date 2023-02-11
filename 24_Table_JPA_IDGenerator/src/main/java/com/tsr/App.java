package com.tsr;

import javax.persistence.EntityManagerFactory;

import com.tsr.dao.BusDAO;
import com.tsr.dao.CarDAO;
import com.tsr.entityes.Bus;
import com.tsr.entityes.Car;
import com.tsr.helper.EntityManagerFactoryRegistery;

public class App 
{
    public static void main( String[] args )
    {
        BusDAO busDAO = null;
        CarDAO carDAO = null;
        Bus bus = null;
        Car car = null;
        try {
			bus = new Bus();
			bus.setBusType("Volva");
			bus.setCapacity(50);
			bus.setColor("Blue");
			bus.setFuelType("Petrol");
			bus.setRegistrationNo("TS00XX0007");
			busDAO = new BusDAO();
			busDAO.addBus(bus);
			
			carDAO = new CarDAO();
			car = new Car();
			car.setColor("bule");
			car.setName("Dugaty");
			carDAO.addCar(car);
		} finally {
			EntityManagerFactoryRegistery.closeEntityManagerFactory();
		}
    }
}
