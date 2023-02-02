package com.tsr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entityes.Address;
import com.tsr.helper.SessionFactoryRegistory;

public class AddressDAO {
	
	public Address getAddressById(int addressNo) {
		Address address = null;
		Session session = null;
		SessionFactory factory = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			address = session.get(Address.class, addressNo);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return address;
	}
}
