package com.tsr.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.dto.DeliveryPkgDetails;
import com.tsr.entities.DeliveryAssociate;
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

	public void getDeliveryAssociatesCount() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Long> typedQuery = session.createQuery("select count(*) from DeliveryAssociate",Long.class);
			 long count = typedQuery.getResultList().get(0);
			 System.out.println("Count: "+count);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getDeliveryAssociateExperience() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Integer> typedQuery = session.createQuery("select da.experience from DeliveryAssociate da where da.deliveryAssociateNo = :no",Integer.class);
			typedQuery.setParameter("no", 1);
			 int exp = typedQuery.getResultList().get(0);
			 System.out.println("Experience: "+exp);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getDeliveryAssociateColumnsDTO() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<DeliveryPkgDetails> typedQuery = session.createQuery(
					"select new com.tsr.dto.DeliveryPkgDetails(da.associateName,da.contactNo,da.designation) from DeliveryAssociate da where da.deliveryAssociateNo = :no",
					DeliveryPkgDetails.class);
			typedQuery.setParameter("no", 1);
			List<DeliveryPkgDetails> deliveryPkgDetails = typedQuery.getResultList();
			for (DeliveryPkgDetails deliveryPkgDetail : deliveryPkgDetails) {
				System.out.println(deliveryPkgDetail);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getDeliveryAssociateColumnsObjects() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Object[]> typedQuery = session.createQuery(
					"select da.associateName,da.contactNo,da.designation from DeliveryAssociate da where da.experience >= :exp",
					Object[].class);
			typedQuery.setParameter("exp", 5);
			List<Object[]> deliveryPkgDetails = typedQuery.getResultList();
			for (Object[] obj : deliveryPkgDetails) {
				System.out.println(" Name: "+obj[0]+" Contact: "+obj[1]+" Designation: "+obj[2]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getParcelsWithWeightGreaterThan() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Object[]> typedQuery = session.createQuery(
					"select pa.deliveryAssociate.deliveryAssociateNo,count(pa.parcelNo) from Parcel pa where pa.weight >= :weight group by pa.deliveryAssociate.deliveryAssociateNo",
					Object[].class);
			typedQuery.setParameter("weight", 20);
			List<Object[]> parcels = typedQuery.getResultList();
			for (Object[] obj : parcels) {
				System.out.println(" Delivery Associate No: "+obj[0]+" Count: "+obj[1]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getParcelDeliveredBy() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<Parcel> typedQuery = session.createQuery(
					"select pa from Parcel pa where pa.deliveryAssociate.deliveryAssociateNo = :associateNo",
					Parcel.class);
			typedQuery.setParameter("associateNo", 1);
			List<Parcel> parcels = typedQuery.getResultList();
			for (Parcel parcel : parcels) {
				System.out.println(parcel);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getDeliveryAssociateOnParcel() {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			TypedQuery<DeliveryAssociate> typedQuery = session.createQuery(
					"select da from DeliveryAssociate da inner join da.parcels pa where pa.parcelNo= :parcelno",
					DeliveryAssociate.class);
			typedQuery.setParameter("parcelno", 1);
			List<DeliveryAssociate> deliveryAssociates = typedQuery.getResultList();
			for (DeliveryAssociate deliveryAssociate : deliveryAssociates) {
				System.out.println(deliveryAssociate);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

}
