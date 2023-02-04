package com.tsr;

import com.tsr.dao.AddressDAO;
import com.tsr.entityes.Address;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class AppTest {

	public static void main(String[] args) {
		AddressDAO addressDAO = null;
		Address address1 = null;
		
		try {
			addressDAO = new AddressDAO();
			Address address = new Address();
			address.setAddressLine1("5 Girija Nagar");
			address.setAddressLine2("Kolathur");
			address.setCity("Chennai");
			address.setState("TN");
			address.setCountry("India");
			address.setZip(600099);
			addressDAO.addAddress(address);
			address1 = addressDAO.getAddressById(1);
			System.out.println(address1);
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
	}

}
