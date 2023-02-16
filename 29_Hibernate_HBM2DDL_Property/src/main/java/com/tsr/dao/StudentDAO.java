package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.Student;
import com.tsr.helper.SessionFactoryRegistory;

public class StudentDAO {
	
	public void addStudent(Student student) {
		
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			String UID = (String) session.save(student);
			System.out.println("Student ID: "+UID);
			System.out.println(student);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
}
