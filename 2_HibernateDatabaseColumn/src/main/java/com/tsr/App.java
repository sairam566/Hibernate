package com.tsr;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tsr.dao.AddressDAO;
import com.tsr.entity.Address;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = null;
    	SessionFactory factory = null;
    	AddressDAO addressDAO = null;
    	Address address = null;
    	
    	try {
    	 configuration = new Configuration().configure();
    	 factory = configuration.buildSessionFactory();
    	
    	 addressDAO = new AddressDAO(factory);
    	 address = addressDAO.getAddress(1);
    	System.out.println(address);
    	}finally {
			if(factory !=null) {
				factory.close();
			}
		}
    }
}
