package com.tsr.test;

import com.tsr.dao.AddressDAO;
import com.tsr.entityes.Address;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class AppTest {

	public static void main(String[] args) {
		AddressDAO addressDAO = null;
		Address address = null;
		
		try {
			addressDAO = new AddressDAO();
			address = addressDAO.getAddressById(1);
			System.out.println(address);
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
	}

}
