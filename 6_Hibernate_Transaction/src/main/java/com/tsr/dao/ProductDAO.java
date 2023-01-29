package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entitys.Product;
import com.tsr.helper.SessionFactoryRegistory;

public class ProductDAO {

	public void addProduct(Product product) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(product);
			flag = true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(transaction != null && flag) {
				// Note: If we get error while committing then session is not closed.
				transaction.commit(); 
				System.out.println("Inserted Sussess");
			}else {
				transaction.rollback();
				System.out.println("Inserted Failed");
			}
			if (session != null) {
				session.close();
			}
		}
	}
}
