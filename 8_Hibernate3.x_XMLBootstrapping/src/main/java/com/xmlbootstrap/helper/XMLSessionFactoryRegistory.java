package com.xmlbootstrap.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XMLSessionFactoryRegistory {

	private static SessionFactory factory;

	static {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("com/xmlbootstrap/config/HR.cfg.xml");
			factory = configuration.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

	public static void closeSessionFactory() {
		if (factory != null && !factory.isClosed()) {
			factory.close();
		}
	}
}
