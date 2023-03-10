package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.Player;
import com.tsr.entities.Team;
import com.tsr.helper.SessionFactoryRegistory;

public class PlayerDAo {
	
	public void addPlayer(Player player) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(player);
			System.out.println("PK value: " + pk_val);
			System.out.println(player);
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

	public void addTeam(Team team) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int pk_val = (int) session.save(team);
			System.out.println("PK value: " + pk_val);
			System.out.println(team);
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

	public void getPlayer(int playerNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Player player = session.get(Player.class,playerNo);
			System.out.println(player);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void getTeam(int teamNo) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Team team = session.get(Team.class,teamNo);
			System.out.println(team);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
