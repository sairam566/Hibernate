package com.tsr.dao;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.Student;
import com.tsr.helper.SessionFactoryRegistory;

public class StudentDAO {
	
	public void addStudent_SAVE(Student student) {
		
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			
			int regNo = (int) session.save(student);
			System.out.println("Student ID: "+regNo);
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
	
	public void addStudent_PERSIST(Student student) {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();

			session.persist(student);
			// No guarantee that we can fetch the id of the Student immediately
			// (depends on implementation vendor) it may be delayed unit we commit the
			// transaction.
			// In case of Hibernate as implementation vendor it will fetch id before commit
			// the transaction
			System.out.println("Before commit trying to fetch ID: " + student.getStudentId());
			System.out.println(student);
			transaction.commit();
			System.out.println("After commit trying to fetch ID: " + student.getStudentId());
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void addStudent_SAVE_OR_UPDATE_ThatInsert(Student student) {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			
			System.out.println(student);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void addStudent_SAVE_OR_UPDATE_ThatUpdate(Student student) {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(student);
			
			System.out.println(student);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void addStudent_Partial_UPDATE() {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Student stu = session.get(Student.class, 4);
			System.out.println("Before Update: "+stu);
			transaction = session.beginTransaction();
			stu.setName("TSR");
			session.update(stu);
			
			System.out.println("After Update: "+stu);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void addStudent_Full_UPDATE() {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Student student = new Student();
			student.setStudentId(4);
			student.setGrade("XXXXXXXX");
			student.setJoiningDate(new Date());
			student.setName("Ramana");
			student.setClassTeacher("Full UPDATE");
			transaction = session.beginTransaction();
			
			session.update(student);
			
			System.out.println(" Update: "+student);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void merge(Student student) {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Student stu = session.get(Student.class, 5);
			transaction = session.beginTransaction();
			
			session.merge(student);
			
			System.out.println(student);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
	
	public void detete(int studentID) {

		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			Student stu = session.get(Student.class, studentID);
			transaction = session.beginTransaction();
			
			session.delete(stu);
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
