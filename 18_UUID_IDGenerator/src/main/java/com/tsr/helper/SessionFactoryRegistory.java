package com.tsr.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {
	private static SessionFactory factory;
	
	static {
		try {
			Configuration config = new Configuration().configure();
			factory = config.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	public static void closeSessionFactory() {
		if(factory!=null && factory.isOpen()) {
			factory.close();
		}
	}
}
