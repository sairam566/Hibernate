package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entityes.Vehicles;
import com.tsr.helper.SessionFactoryRegistory;

public class VehicleDAO {
	
	public String addVehicle(Vehicles vehicle) {
		String pkVal = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			pkVal =  (String) session.save(vehicle);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return pkVal;
	}
}
