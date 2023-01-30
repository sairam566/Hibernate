package com.programmaticbootstrapping;

import com.programmaticbootstrapping.dao.AddressDAO;
import com.programmaticbootstrapping.entityes.Address;
import com.programmaticbootstrapping.helper.ProgrammaticSessionFactoryRegistory;

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
			ProgrammaticSessionFactoryRegistory.closeSessionFactory();
		}
    }
}
