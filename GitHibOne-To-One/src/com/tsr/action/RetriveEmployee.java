package com.tsr.action;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tsr.output.OutputTo;
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
			//int id=100;
			
			//Retrieve Employee obj from Employees table
			List<Employees> employees = session.createQuery("from Employees").list();
			
			if(employees!=null)
			{
				new OutputTo().generateTxtFile(employees);
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
