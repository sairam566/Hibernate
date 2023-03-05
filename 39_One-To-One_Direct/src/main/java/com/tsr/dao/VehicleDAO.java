package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.InspectionReport;
import com.tsr.entities.VehicleInspection;
import com.tsr.helper.SessionFactoryRegistory;

public class VehicleDAO {
	
	public void addVehicleInspection(VehicleInspection inspection) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(inspection);
			System.out.println("Primary Key: "+pk_val);
			System.out.println(inspection);
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
	
	public void addInspectionReport(InspectionReport report) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(report);
			System.out.println("Primary Key: "+pk_val);
			System.out.println(report);
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
	
	public void getInspectionReport(int reportNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			InspectionReport inspectionReport = session.get(InspectionReport.class,reportNo);
			System.out.println(inspectionReport);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
	public void getVehicleInspection(int vehicleNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			VehicleInspection vehicleInspection = session.get(VehicleInspection.class,vehicleNo);
			System.out.println(vehicleInspection);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}

}
