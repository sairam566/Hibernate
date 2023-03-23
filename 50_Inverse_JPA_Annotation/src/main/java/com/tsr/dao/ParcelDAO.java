package com.tsr.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class ParcelDAO {
	
	public void addParcelAndDeliveryAssociate(Set<Parcel> parcels, DeliveryAssociate deliveryAssociate) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			
			entityManager.persist(deliveryAssociate);
			System.out.println(deliveryAssociate);
			for (Parcel parcel : parcels) {
				parcel.setDeliveryAssociate(deliveryAssociate);
				entityManager.persist(parcel);
			}
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
}
