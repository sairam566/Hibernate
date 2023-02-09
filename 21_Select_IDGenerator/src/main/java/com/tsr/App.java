package com.tsr;

import com.tsr.dao.VehicleDAO;
import com.tsr.entityes.Vehicles;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {
		VehicleDAO dao = null;
		try {
			dao = new VehicleDAO();
			Vehicles vehicles = new Vehicles();
			vehicles.setRegistrationNo("TSR006");
			vehicles.setModelName("Corvette 2022");
			vehicles.setManufacturer("Chevrolet");
			vehicles.setLeaseAmount(56987444.0);
			vehicles.setFuelType("Petrol");
			vehicles.setColor("Navy Blue");
			String pkVal = dao.addVehicle(vehicles);
			System.out.println("The Vehicle Id: "+pkVal);
			System.out.println("The Vedical Details: "+vehicles);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}
}
