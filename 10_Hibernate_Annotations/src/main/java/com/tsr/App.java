package com.tsr;

import com.tsr.dao.AddressDAO;
import com.tsr.entityes.Address;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	AddressDAO addressDAO = null;
    	Address address = null;
        try {
			addressDAO = new AddressDAO();
			address = addressDAO.getAddressById(1);
			System.out.println(address);
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }
}
