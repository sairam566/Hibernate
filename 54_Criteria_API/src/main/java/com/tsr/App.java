package com.tsr;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.DeliveryAssociate_;
import com.tsr.entities.Parcel;
import com.tsr.entities.Parcel_;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App {
	public static void main(String[] args) {
		try {
			// getAllDeliveryAssociates();
			// getAllDeliveryAssociatesWhoseExpGt4();
			// GetAllDeliveryAssociateNamePhoneNo();
			// GetAllDeliveryAssociateCountByExperience();
			// getNewDriverCount();
			// getDeliveryAssociateBYParcel();
			getParcelDeliveredbyDeliveryAssociate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
	}

	public static void getAllDeliveryAssociates() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder builder = null;
		CriteriaQuery<DeliveryAssociate> criteriaQuery = null;

		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			builder = entityManager.getCriteriaBuilder();
			criteriaQuery = builder.createQuery(DeliveryAssociate.class);
			Root<DeliveryAssociate> root = criteriaQuery.from(DeliveryAssociate.class);
			criteriaQuery.select(root);
			TypedQuery<DeliveryAssociate> typedQuery = entityManager.createQuery(criteriaQuery);
			List<DeliveryAssociate> DeliveryAssociates = typedQuery.getResultList();
			DeliveryAssociates.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}

	// Get all delivery associates whose experience is greater than 4 years
	public static void getAllDeliveryAssociatesWhoseExpGt4() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder builder = null;
		CriteriaQuery<DeliveryAssociate> criteriaQuery = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			builder = entityManager.getCriteriaBuilder();
			criteriaQuery = builder.createQuery(DeliveryAssociate.class);

			Root<DeliveryAssociate> root = criteriaQuery.from(DeliveryAssociate.class);
			criteriaQuery.select(root);
			criteriaQuery.where(builder.greaterThan(root.get("experience"), 4));
			TypedQuery<DeliveryAssociate> query = entityManager.createQuery(criteriaQuery);
			query.getResultList().forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}

	// Get all DeliveryAssociate Name and PhoneNO
	public static void GetAllDeliveryAssociateNamePhoneNo() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder builder = null;
		CriteriaQuery<Object[]> criteriaQuery = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			builder = entityManager.getCriteriaBuilder();

			criteriaQuery = builder.createQuery(Object[].class);

			// from
			Root<DeliveryAssociate> root = criteriaQuery.from(DeliveryAssociate.class);

			// projection part
			criteriaQuery.multiselect(root.get("associateName"), root.get("contactNo"));

			// where
			// No need for this query as all DeliveryAssociates are needed

			TypedQuery<Object[]> query = entityManager.createQuery(criteriaQuery);

			query.getResultList().forEach((obj) -> System.out.println("Name : " + obj[0] + " PhoneNo: " + obj[1]));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.isOpen();
			}
		}
	}

	// Get all DeliveryAssociate Name and PhoneNO
	public static void GetAllDeliveryAssociateCountByExperience() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder builder = null;
		CriteriaQuery<Object[]> criteriaQuery = null;

		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			builder = entityManager.getCriteriaBuilder();
			criteriaQuery = builder.createQuery(Object[].class);

			// from
			Root<DeliveryAssociate> root = criteriaQuery.from(DeliveryAssociate.class);

			// projection
			criteriaQuery.multiselect(root.get("experience"), builder.count(root.get("deliveryAssociateNo")));

			// where
			// No need for where condition as all DeliveryAssociates are needed

			// group by condition
			criteriaQuery.groupBy(root.get("experience"));

			TypedQuery<Object[]> typedQuery = entityManager.createQuery(criteriaQuery);

			typedQuery.getResultList()
					.forEach((obj) -> System.out.println("Experience : " + obj[0] + " Count: " + obj[1]));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.isOpen();
			}
		}
	}

	// Get all DeliveryAssociates whose designation is New-Driver
	public static void getNewDriverCount() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder builder = null;
		CriteriaQuery<Long> criteriaQuery = null;

		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			builder = entityManager.getCriteriaBuilder();

			criteriaQuery = builder.createQuery(Long.class);

			// From
			Root<DeliveryAssociate> root = criteriaQuery.from(DeliveryAssociate.class);

			// projection
			criteriaQuery.multiselect(builder.count(root.get(DeliveryAssociate_.DELIVERY_ASSOCIATE_NO)));

			// Where
			criteriaQuery.where(builder.equal(root.get(DeliveryAssociate_.DESIGNATION), "New-Driver"));

			TypedQuery<Long> query = entityManager.createQuery(criteriaQuery);

			query.getResultList().forEach((x) -> System.out.println("No.Of New Drivers are: " + x));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.isOpen();
			}
		}
	}

	// Get the DeliveryAssociate who delivered parcel 2;
	public static void getDeliveryAssociateBYParcel() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder criteriaBuilder = null;
		CriteriaQuery<DeliveryAssociate> criteriaQuery = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			criteriaBuilder = entityManager.getCriteriaBuilder();
			criteriaQuery = criteriaBuilder.createQuery(DeliveryAssociate.class);

			// from
			Root<DeliveryAssociate> root = criteriaQuery.from(DeliveryAssociate.class);

			// Join
			// HQL select da.* from DeliveryAssociate da inner join da.parcels pa where
			// pa.parcelNo = 2;
			// Criteria Join
			Join<DeliveryAssociate, Parcel> join = root.join(DeliveryAssociate_.parcels);

			criteriaQuery.where(criteriaBuilder.equal(join.get(Parcel_.PARCEL_NO), 2));

			TypedQuery<DeliveryAssociate> query = entityManager.createQuery(criteriaQuery);

			query.getResultList().forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.isOpen();
			}
		}
	}

	public static void getParcelDeliveredbyDeliveryAssociate() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		CriteriaBuilder criteriaBuilder = null;
		CriteriaQuery<Parcel> criteriaQuery = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			criteriaBuilder = entityManager.getCriteriaBuilder();
			criteriaQuery = criteriaBuilder.createQuery(Parcel.class);

			// from
			Root<Parcel> root = criteriaQuery.from(Parcel.class);

			// Join
			// HQL select pa.* from Parcel pa where pa.deliveryAssociate.deliveryAssociateNo
			// = ?;
			// Criteria Join
			Join<Parcel, DeliveryAssociate> join = root.join(Parcel_.deliveryAssociate);

			criteriaQuery.where(criteriaBuilder.equal(join.get(DeliveryAssociate_.deliveryAssociateNo), 2));

			TypedQuery<Parcel> query = entityManager.createQuery(criteriaQuery);

			query.getResultList().forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (entityManager != null && entityManager.isOpen()) {
				entityManager.isOpen();
			}
		}
	}
}
