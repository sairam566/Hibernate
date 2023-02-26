package com.tsr.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistory {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	public static void closeEntityManagerFactory() {
		if(entityManagerFactory!=null && entityManagerFactory.isOpen()) {
			entityManagerFactory.close();
		}
	}
}
