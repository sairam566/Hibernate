package com.tsr.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tsr.pojo.Employees;

public class RetriveEmployee {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employees.class).buildSessionFactory();
		
		//get current session
		Session session = factory.getCurrentSession();
		
		try {
			//began the transaction
			session.beginTransaction();
			
			//create an id to retrieve an employee
			int id=100;
			
			//Retrieve Employee obj from Employees table
			Employees employee = session.get(Employees.class, id);
			
			if(employee!=null)
			{
				System.out.println(employee);
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
			
			factory.close();
		}

	}

}
