package com.tsr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entity.Address;

public class AddressDAO {

	private SessionFactory factory;

	public AddressDAO(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Address getAddress(int addressId) {
		Address address = null;
		Session session = null;
		try {
			session = factory.openSession();
			address = session.get(Address.class, addressId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return address;
	}
	
}
