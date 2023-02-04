package com.tsr.test;

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
			address.setAddressLine1("New york");
			address.setAddressLine2("Washinton State");
			address.setCity("Test");
			address.setState("Neeeeee");
			address.setCountry("USA");
			address.setZip(1234312);
			addressDAO.addAddress(address);
			address1 = addressDAO.getAddressById(1);
			System.out.println(address1);
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
	}

}
