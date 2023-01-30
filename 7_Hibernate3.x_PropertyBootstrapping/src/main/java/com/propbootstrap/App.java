package com.propbootstrap;

import com.propbootstrap.dao.AddressDAO;
import com.propbootstrap.entityes.Address;
import com.propbootstrap.helper.PropertySessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	AddressDAO addressDAO = null;
    	Address address = null;
    	try {
			addressDAO = new AddressDAO();
			address = addressDAO.getAddressById(1);
			System.out.println("Current Address \n"+address);
		} finally {
			PropertySessionFactoryRegistory.closeSessionFactory();
		}
    }
}
