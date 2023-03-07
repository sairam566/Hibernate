package com.tsr;

import java.time.LocalDate;

import com.tsr.dao.AccountDAO;
import com.tsr.entities.Account;
import com.tsr.entities.Locker;
import com.tsr.helper.SessionFactoryRegistory;

public class App 
{
    public static void main( String[] args )
    {
        try {
			//addAccount();
			//addLocker();
        	//getAccount();
        	getLocker();
		} finally {
			SessionFactoryRegistory.closeSessionFactory();
		}
    }

	private static void addAccount() {
		AccountDAO accountDAO = new AccountDAO();
		Account account = new Account();
		account.setAccountHolderName("TRS");
		account.setAccountType("Current");
		account.setBalance(896532);
		account.setBranchCode("SBI-123");
		account.setOpenedDate(LocalDate.of(2021, 8, 2));
		
		accountDAO.addAccount(account);
	}
	
	private static void addLocker() {
		AccountDAO accountDAO = new AccountDAO();
		Locker locker = new Locker();
		locker.setKeyNo("k9898");
		locker.setDimensions("24x12x24");
		locker.setCharges(2000);
		Account account = new Account();
		account.setAccountNo(1);
		locker.setAccount(account);
		
		accountDAO.addLocker(locker);
	}
	
	private static void getAccount() {
		AccountDAO accountDAO = new AccountDAO();
		accountDAO.getAccount(1);
	}
	
	private static void getLocker() {
		AccountDAO accountDAO = new AccountDAO();
		accountDAO.getLocker(1);
	}
}
