package com.propbootstrap.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {

	private static SessionFactory factory;
	
	static {
		//Below line by default looks for hibernate.properties file in the class path
		try {
		Configuration configuration = new Configuration();
		configuration.addResource("com/propbootstrap/entityes/Address.hbm.xml");
		factory = configuration.buildSessionFactory();
		}catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	
	public static void closeSessionFactory() {
		if(factory!=null && !factory.isClosed()) {
			factory.close();
		}
	}
}
