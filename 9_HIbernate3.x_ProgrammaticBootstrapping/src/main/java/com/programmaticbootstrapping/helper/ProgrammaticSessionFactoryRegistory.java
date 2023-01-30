package com.programmaticbootstrapping.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.programmaticbootstrapping.entityes.Address;

public class ProgrammaticSessionFactoryRegistory {

	private static SessionFactory factory;

	static {
		try {
			Configuration configuration = new Configuration();
			configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
			configuration.setProperty("hibernate.connection.username", "sairam");
			configuration.setProperty("hibernate.connection.password", "sairam");
			configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			
			configuration.addResource("com/programmaticbootstrapping/entityes/Address.hbm.xml");
			
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
