package com.tsr.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entities.Parcel;
import com.tsr.helper.SessionFactoryRegistory;

public class ParcelDAO {

	public void getAllPArcels_QUERY() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Query query = session.createQuery("from Parcel");
			List<Parcel> parcels = query.getResultList();
			for (Parcel parcel : parcels) {
				System.out.println(parcel);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void getAllParcels_TypedQuery() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Parcel> query = session.createQuery("from Parcel",Parcel.class);
			List<Parcel> parcels = query.getResultList();
			for (Parcel parcel : parcels) {
				System.out.println(parcel);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getAllParcels_Weight_gt_20() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Parcel> typedQuery = session.createQuery("from Parcel p where p.weight > :weight",Parcel.class);
			typedQuery.setParameter("weight", 20);
			List<Parcel> parcels = typedQuery.getResultList();
			for (Parcel parcel : parcels) {
				System.out.println(parcel);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

}
