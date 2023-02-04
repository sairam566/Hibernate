package com.tsr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.tsr.entityes.Address;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class AddressDAO {
	
	public void addAddress(Address address) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(address);
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
	}
	
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
