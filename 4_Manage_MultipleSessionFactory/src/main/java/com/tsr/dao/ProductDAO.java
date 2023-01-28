package com.tsr.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entityes.Product;
import com.tsr.helper.SessionFactoryRegistory;

public class ProductDAO {
	
	public Product getProductById(int productId) {
		SessionFactory factory = SessionFactoryRegistory.getSessionFactory("SALES");
		Session session = null;
		Product product = null;
		try {
			 session = factory.openSession();
			 product = session.get(Product.class, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return product;
	}

}
