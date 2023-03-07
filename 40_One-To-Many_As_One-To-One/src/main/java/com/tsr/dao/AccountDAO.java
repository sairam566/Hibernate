package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.Account;
import com.tsr.entities.Locker;
import com.tsr.helper.SessionFactoryRegistory;

public class AccountDAO {

	public void addAccount(Account account) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(account);
			System.out.println("PK value: " + pk_val);
			System.out.println(account);
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

	public void addLocker(Locker locker) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(locker);
			System.out.println("PK value: " + pk_val);
			System.out.println(locker);
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

	public void getAccount(int i) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Account account = session.get(Account.class, i);
			System.out.println(account);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getLocker(int i) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Locker locker = session.get(Locker.class, i);
			System.out.println(locker);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}
}
