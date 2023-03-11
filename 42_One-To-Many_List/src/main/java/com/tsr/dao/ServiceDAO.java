package com.tsr.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.ServiceCenter;
import com.tsr.entities.Token;
import com.tsr.helper.SessionFactoryRegistory;


public class ServiceDAO {
	
	public void addServiceCenter(ServiceCenter center) {
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
	
	public void addToken(Token token) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int PK_val = (int) session.save(token);
			System.out.println("Primary Key Val: "+PK_val);
			System.out.println(token);
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
	
	public void getToken(int tokenNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Token token = session.get(Token.class,tokenNo);
			System.out.println(token);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void getServiceCenter(int serviceCtrNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			ServiceCenter serviceCenter = session.get(ServiceCenter.class,serviceCtrNo);
			System.out.println(serviceCenter);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void addTokensToServiceCenter(List<Token> tokens,int ServiceNo) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			ServiceCenter serviceCenter = session.get(ServiceCenter.class, ServiceNo);
			System.out.println("From DB"+serviceCenter);
			
			serviceCenter.setTokens(tokens);
			
			session.update(serviceCenter);
			
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
