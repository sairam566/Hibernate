package com.tsr.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.tsr.entities.Bill;
import com.tsr.entities.ItemizedBill;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class BillDAO {
	
	public void addBill(Bill bill) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bill);
			System.out.println(bill);
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
	
	public void addItemizedBill(ItemizedBill itemizedBill ) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(itemizedBill);
			System.out.println(itemizedBill);
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
	
	public void getBill(int billNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Bill bill = entityManager.find(Bill.class, billNo);
			System.out.println(bill);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	
	public void getItemizedBill(int itemizedBillNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			ItemizedBill itemizedBill = entityManager.find(ItemizedBill.class, itemizedBillNo);
			System.out.println(itemizedBill);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
}
