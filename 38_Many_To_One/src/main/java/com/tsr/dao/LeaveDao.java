package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.Associate;
import com.tsr.entities.Leave;
import com.tsr.helper.SessionFactoryRegistory;

public class LeaveDao {
	
	public void addAssociate(Associate associate) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(associate);
			System.out.println("PK Value" + pk_val);
			System.out.println(associate);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void addLeave(Leave leave) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(leave);
			System.out.println("PK Value" + pk_val);
			System.out.println(leave);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getLeave(int leaveId) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Leave leave = session.get(Leave.class, leaveId);
			System.out.println(leave);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
