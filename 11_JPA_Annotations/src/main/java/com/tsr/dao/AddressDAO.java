package com.tsr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.tsr.entityes.Address;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class AddressDAO {
	
	public Address getAddressById(int addressId) {
		Address address = null;
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		try {
			factory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = factory.createEntityManager();
			address = entityManager.find(Address.class, addressId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return address;
	}
}
