package com.tsr;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tsr.entityes.LoanApplication;
import com.tsr.entityes.LoanApplicationNo;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = null;
    	Session session = null;
    	try {
			Configuration configuration = new Configuration().configure();
			factory = configuration.buildSessionFactory();
			session = factory.openSession();
			
			/*
			 * Below code for composite-id declaration
			 */
//			LoanApplication application = new LoanApplication(1,"SBI-San");
//			application = session.load(LoanApplication.class, application);
			
			/*
			 * Below code for key class declaration
			 */
			
			LoanApplicationNo loanAppNo = new LoanApplicationNo();
			loanAppNo.setApplicationNo(1);
			loanAppNo.setBranchCode("SBI-San");
			
			LoanApplication application = session.load(LoanApplication.class, loanAppNo);
			System.out.println(application);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session!=null && session.isOpen()) {
				session.close();
			}
			if(factory!=null && factory.isOpen()) {
				factory.close();
			}
		}
    }
}
