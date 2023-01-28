package com.tsr.helper;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistory {
	
	private static Map<String, SessionFactory> sfMap = null;
	
	static{
		Configuration salesConfig = new Configuration().configure("sales.cfg.xml");
		SessionFactory salesSF = salesConfig.buildSessionFactory();
		
		Configuration hrConfig = new Configuration().configure("hr.cfg.xml");
		SessionFactory hrSF = hrConfig.buildSessionFactory();
		
		sfMap = new HashMap<String, SessionFactory>(2);
		sfMap.put("SALES", salesSF);
		sfMap.put("HR", hrSF);
	}
	
	public static SessionFactory getSessionFactory(String schemaName) {
		if(sfMap.containsKey(schemaName)) {
			return sfMap.get(schemaName);
		}
		return null;
	}
	
	public static void closeSessionFactory(String schemaName) {
		if(sfMap.containsKey(schemaName)) {
			sfMap.get(schemaName).close();
		}
	}
}
