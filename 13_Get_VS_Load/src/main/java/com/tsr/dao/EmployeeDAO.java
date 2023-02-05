package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tsr.entityes.Employee;
import com.tsr.helper.SessionFactoryRegistory;

public class EmployeeDAO {
	public Employee getEmployeeUsingGet(int empId) {
		Employee employee = null;
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			employee = session.get(Employee.class, empId);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return employee;
	}
	
	public Employee getEmployeeUsingLoad(int empId) {
		Employee employee = null;
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			employee = session.load(Employee.class, empId);
			System.out.println(employee.getClass().getName()); //com.tsr.entityes.Employee$HibernateProxy$5gbHTzyX
			System.out.println(employee.getEmployeeName());
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return employee;
	}
}
