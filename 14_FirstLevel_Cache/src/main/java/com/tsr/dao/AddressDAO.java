package com.tsr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entityes.Address;
import com.tsr.helper.SessionFactoryRegistory;

public class AddressDAO {
	
	public Address getAddressById(int addressNo) {
		Address address1 = null;
		Address address2 = null;
		Session session = null;
		SessionFactory factory = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			address1 = session.get(Address.class, addressNo);
			System.out.println(address1);
			address2 = session.get(Address.class, addressNo);
			System.out.println(address1);
			System.out.println("(address1 == address2) : "+(address1==address2));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return address1;
	}
}
