package com.tsr.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {
	
	private static SessionFactory factory;
	
	static {
		Configuration cfg = new Configuration().configure();
		factory = cfg.buildSessionFactory();
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
