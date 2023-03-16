package com.tsr.dao;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.tsr.entities.Account;
import com.tsr.entities.Branch;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class BranchDAO {
	
	public void addAccount(Account account) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(account);
			System.out.println(account);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	
	public void addBranch(Branch branch) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(branch);
			System.out.println(branch);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	public void addAccountsToBranch(Set<Account> accounts,int branchNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			Branch branch = entityManager.find(Branch.class, branchNo);
			transaction.begin();
			branch.setAccounts(accounts);
			entityManager.merge(branch);
			System.out.println(branch);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	
	public void getAccount(int accountNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Account account = entityManager.find(Account.class, accountNo);
			System.out.println(account);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
	
	public void getBranch(int branchNo) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			entityManagerFactory = EntityManagerFactoryRegistory.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			Branch branch = entityManager.find(Branch.class, branchNo);
			System.out.println(branch);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(entityManager!=null && entityManager.isOpen()) {
				entityManager.close();
			}
		}
	}
}
