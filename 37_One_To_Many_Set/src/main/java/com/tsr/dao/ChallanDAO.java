package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.BikeRegistration;
import com.tsr.entities.TrafficChallan;
import com.tsr.helper.SessionFactoryRegistory;

public class ChallanDAO {
	
	public void addBikeRegDetails(BikeRegistration bikeReg) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			//insert TrafficChallan 
			for(TrafficChallan challan : bikeReg.getTrafficChallans()) {
				session.save(challan);
			}
			//insert BikeRegistration
			int bikeRegistration = (int) session.save(bikeReg);
			System.out.println("PK value:"+bikeRegistration);
			System.out.println(bikeReg);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void getBikeRegDetails(int bike_no) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			BikeRegistration bikeRegistration = session.get(BikeRegistration.class, bike_no);
			System.out.println(bikeRegistration);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
	
}
