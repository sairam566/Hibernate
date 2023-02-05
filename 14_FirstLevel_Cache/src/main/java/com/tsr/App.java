package com.tsr;

import com.tsr.dao.AddressDAO;
import com.tsr.entityes.Address;
import com.tsr.helper.SessionFactoryRegistory;

public class App {
	public static void main(String[] args) {

		AddressDAO addressDAO = null;
		Address address1 = null;

		try {
			addressDAO = new AddressDAO();
			address1 = addressDAO.getAddressById(1);
			//System.out.println(address1);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
	}
}
