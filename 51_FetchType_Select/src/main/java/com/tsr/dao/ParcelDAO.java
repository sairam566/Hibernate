package com.tsr.dao;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class ParcelDAO {
	
	public void addParcelAndDeliveryAssociate(Set<Parcel> parcels, DeliveryAssociate deliveryAssociate) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			int PK_val = (int) session.save(deliveryAssociate);
			System.out.println("Primary Key Val: "+PK_val);
			System.out.println(deliveryAssociate);
			for (Parcel parcel : parcels) {
				parcel.setDeliveryAssociate(deliveryAssociate);
				session.save(parcel);
			}
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

	public void getDeliveryAssociate(int deliveryAssociateNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			
			DeliveryAssociate deliveryAssociate = session.find(DeliveryAssociate.class,deliveryAssociateNo);
			System.out.println(deliveryAssociate);
			for(Parcel parcel : deliveryAssociate.getParcels()) {
				System.out.println(parcel);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
}
