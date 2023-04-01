package com.tsr.dao;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class ParcelDAO {
	
	public void addParcelAndDeliveryAssociate_Cascade_NONE(Set<Parcel> parcels, DeliveryAssociate deliveryAssociate) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
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
	
	public void addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_Transient(Set<Parcel> parcels, DeliveryAssociate deliveryAssociate) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
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
	
	public void addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_1_Transient_1_Existing(Set<Parcel> parcels, DeliveryAssociate deliveryAssociate) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			
			Parcel parcel = session.get(Parcel.class, 2);
			transaction = session.beginTransaction();
			parcel.setDeliveryAssociate(deliveryAssociate);
			parcel.setDescription("UPdated through SAVE-UPDATE");
			session.save(parcel);
			
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
	
	public void addParcelAndDeliveryAssociate_Cascade_SAVE_UPDATE_2_Existing_Objects(int parcelsNo, int deliveryAssociateNo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			
			Parcel parcel = session.get(Parcel.class, parcelsNo);
			DeliveryAssociate deliveryAssociate = session.get(DeliveryAssociate.class, deliveryAssociateNo);
			transaction = session.beginTransaction();
			deliveryAssociate.setContactNo("000000000");
			parcel.setDeliveryAssociate(deliveryAssociate);
			parcel.setDescription("UPdated through SAVE-UPDATE-2");
			session.update(parcel);
			
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
	
	public void deleteDeliveryAssociate_With_Parcels_Cascade_NONE(int deliveryAssociateNo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			
			DeliveryAssociate deliveryAssociate = session.get(DeliveryAssociate.class, deliveryAssociateNo);
			transaction = session.beginTransaction();
			session.delete(deliveryAssociate);
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
	
	public void deleteDeliveryAssociate_With_Parcels_Cascade_DELETE(int deliveryAssociateNo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			
			DeliveryAssociate deliveryAssociate = session.get(DeliveryAssociate.class, deliveryAssociateNo);
			transaction = session.beginTransaction();
			
			Iterator<Parcel> iterable = deliveryAssociate.getParcels().iterator(); 
			while(iterable.hasNext()) {
				Parcel parcel = iterable.next();
				if(parcel.getWeight() > 25) {
					iterable.remove();
				}
			}
			session.update(deliveryAssociate);
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

	public void deleteDeliveryAssociate_With_Parcels_Cascade_orphan_delete(int deliveryAssociateNo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			
			DeliveryAssociate deliveryAssociate = session.get(DeliveryAssociate.class, deliveryAssociateNo);
			transaction = session.beginTransaction();
			session.delete(deliveryAssociate);
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
	
}
