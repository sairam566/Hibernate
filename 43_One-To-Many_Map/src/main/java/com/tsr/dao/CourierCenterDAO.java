package com.tsr.dao;

import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.CourierCenter;
import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class CourierCenterDAO {
	
	public void addCourierCenter(CourierCenter center) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int PK_val = (int) session.save(center);
			System.out.println("Primary Key Val: "+PK_val);
			System.out.println(center);
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
	
	public void addParcel(Parcel parcel) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int PK_val = (int) session.save(parcel);
			System.out.println("Primary Key Val: "+PK_val);
			System.out.println(parcel);
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
	
	public void addParcelToCourrierCenter(Map<String, Parcel> parceMap,int centerNo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			CourierCenter courierCenter = session.get(CourierCenter.class, centerNo);
			System.out.println("From DB"+courierCenter);
			
			courierCenter.setParcelMap(parceMap);
			
			session.update(courierCenter);
			
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
	
	public void getParcel(int parcelNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Parcel parcel = session.get(Parcel.class,parcelNo);
			System.out.println(parcel);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void getCourierCenter(int courierCenterNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			CourierCenter courierCenter = session.get(CourierCenter.class,courierCenterNo);
			System.out.println(courierCenter);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
}
