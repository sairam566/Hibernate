package com.tsr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entityes.Address;
import com.tsr.helper.SessionFactoryRegistory;

public class AddressDAO {

	public Address getAddressById(int addressId) {
		Address address = null;
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory("HR");
			session = factory.openSession();
			address = session.get(Address.class, addressId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return address;
	}

}
