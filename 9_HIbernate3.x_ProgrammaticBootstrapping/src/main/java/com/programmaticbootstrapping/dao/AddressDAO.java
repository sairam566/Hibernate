package com.programmaticbootstrapping.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.programmaticbootstrapping.entityes.Address;
import com.programmaticbootstrapping.helper.ProgrammaticSessionFactoryRegistory;

public class AddressDAO {

	public Address getAddressById(int addressNo) {
		SessionFactory factory = null;
		Address address = null;
		Session session = null;
		try {
			factory = ProgrammaticSessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			address = session.get(Address.class, addressNo);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return address;
	}
}
