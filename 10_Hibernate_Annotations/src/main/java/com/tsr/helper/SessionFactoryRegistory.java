package com.tsr.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {

	private static SessionFactory sessionFactory;
	
	static {
		try {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory!=null && sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
}
