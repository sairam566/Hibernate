package com.tsr;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.AccountDAO;
import com.tsr.entities.Account;
import com.tsr.entities.Locker;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			//addAccount();
			//addLocker();
    		//linkAccountToLocker();
    		//getAccount();
    		getLocker();
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
    }
    
    public static void addAccount() {
    	AccountDAO accountDAO = new AccountDAO();
    	Account account = Account.builder().accountHolderName("TSR").openedDate(LocalDate.now()).accountType("Current")
    						.branchCode("456jk").balance(1200000).build();
    	accountDAO.addAccount(account);
    }
    
    public static void addLocker() {
    	AccountDAO accountDAO = new AccountDAO();
    	Locker locker = Locker.builder().keyNo("we1232").dimensions("12X12").charges(122.2).build();
    	accountDAO.addLocker(locker);
    }
    
    public static void linkAccountToLocker() {
    	AccountDAO accountDAO = new AccountDAO();
    	Locker locker = Locker.builder().lockerNo(8).build();
    	Set<Locker> lockers = new HashSet<>();
    	lockers.add(locker);
    	accountDAO.linkAccountToLocker(lockers, 7);
    }
    
    public static void getAccount() {
    	AccountDAO accountDAO = new AccountDAO();
    	accountDAO.getAccount(7);
    }
    
    public static void getLocker() {
    	AccountDAO accountDAO = new AccountDAO();
    	accountDAO.getLocker(8);
    }
}
