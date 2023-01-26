package com.tsr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tsr.entitys.Account;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Account account = session.get(Account.class, 1);
		
		System.out.println("Account Details: \n"+account);
	}

}
