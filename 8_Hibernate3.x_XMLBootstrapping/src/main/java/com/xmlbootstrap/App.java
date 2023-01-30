package com.xmlbootstrap;

import com.xmlbootstrap.dao.AddressDAO;
import com.xmlbootstrap.entityes.Address;
import com.xmlbootstrap.helper.XMLSessionFactoryRegistory;


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
			XMLSessionFactoryRegistory.closeSessionFactory();
		}
    }
}
