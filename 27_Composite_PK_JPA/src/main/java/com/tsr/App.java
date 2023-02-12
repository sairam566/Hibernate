package com.tsr;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tsr.entityes.LoanApplication;
import com.tsr.entityes.LoanApplicationNo;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = null;
    	EntityManager entityManager = null;
        try {
			entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
			entityManager = entityManagerFactory.createEntityManager();
			LoanApplicationNo applicationNo = new LoanApplicationNo();
			applicationNo.setApplicationNo(1);
			applicationNo.setBranchCode("SBI-San");
			LoanApplication application = entityManager.find(LoanApplication.class, applicationNo);
			System.out.println(application);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
			if (entityManagerFactory!=null && entityManagerFactory.isOpen()) {
				entityManagerFactory.close();
			}
		}
    }
}
