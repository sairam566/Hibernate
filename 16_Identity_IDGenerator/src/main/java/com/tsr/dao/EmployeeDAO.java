package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entityes.Employee;
import com.tsr.helper.SessionFactoryRegistory;

public class EmployeeDAO {
	public int addEmployee(Employee employee) {
		int pkValue = 0;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			pkValue = (int) session.save(employee);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		
		return pkValue;
	}
}
