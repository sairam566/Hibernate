package com.tsr.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.entities.AccidentalInsurancePlan;
import com.tsr.entities.InsurancePlan;
import com.tsr.entities.MedicalInsurancePlan;
import com.tsr.helper.SessionFactoryRegistory;

public class InsuranceDAO {
	
	public void addInsurancePlan(InsurancePlan insurancePlan) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int insurance_Plan_No = (int) session.save(insurancePlan);
			System.out.println("InsurancePlan No: "+insurance_Plan_No);
			System.out.println(insurancePlan);
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

	public void addMedicalInsurancePlan(MedicalInsurancePlan medicalInsurancePlan) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int insurance_Plan_No = (int) session.save(medicalInsurancePlan);
			System.out.println("MedicalInsurancePlan No: "+insurance_Plan_No);
			System.out.println(medicalInsurancePlan);
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

	public void addAccidentalInsurancePlan(AccidentalInsurancePlan accidentalInsurancePlan) {
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			int insurance_Plan_No = (int) session.save(accidentalInsurancePlan);
			System.out.println("AccidentalInsurancePlan No: "+insurance_Plan_No);
			System.out.println(accidentalInsurancePlan);
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
	public void getInsurancePlan(int id) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			InsurancePlan insurancePlan = session.get(InsurancePlan.class,id);
			System.out.println(insurancePlan);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getAccidentalInsurancePlan(int id) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			AccidentalInsurancePlan accidentalInsurancePlan = session.get(AccidentalInsurancePlan.class,id);
			System.out.println(accidentalInsurancePlan);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getMedicalInsurancePlan(int id) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			MedicalInsurancePlan medicalInsurancePlan = session.get(MedicalInsurancePlan.class,id);
			System.out.println(medicalInsurancePlan);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}

	public void getAccidentalInsurancePlanRefInInsurancePlan(int id) {
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = SessionFactoryRegistory.getSessionFactory();
			session = factory.openSession();
			InsurancePlan insurancePlan = session.get(InsurancePlan.class,id);
			if(insurancePlan instanceof AccidentalInsurancePlan) {
				System.out.println("Object of AccidentalInsurancePlan");
			}
			System.out.println(insurancePlan);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
		}
	}
}
