package com.tsr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.tsr.entities.Journey;
import com.tsr.entities.Passenger;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class JourneyDAO {
	
	public void addPassenger(Passenger passenger) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(passenger);
			System.out.println(passenger);
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
	
	public void addJourney(Journey journey) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(journey);
			System.out.println(journey);
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}

	public void getPassenger(int passengerNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Passenger passenger = entityManager.find(Passenger.class,passengerNo);
			System.out.println(passenger);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	
	public void getJourney(int journeyNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Journey journey = entityManager.find(Journey.class,journeyNo);
			System.out.println(journey);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	
}
