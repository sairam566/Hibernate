package com.tsr;

import java.util.HashSet;
import java.util.Set;

import com.tsr.dao.BranchDAO;
import com.tsr.entities.Account;
import com.tsr.entities.Branch;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App {
	
	public static void main(String[] args) {
		try {
			//addAccount();
			//addBranch();
			//addAccountsToBranch();
			//getAccount();
			getBranch();
		} finally {
			EntityManagerFactoryRegistory.closeEntityManagerFactory();
		}
	}

	private static void addAccount() {
		BranchDAO branchDAO = new BranchDAO();
		Account account1 = Account.builder().accountHolderName("sairam").accountType("Current").balance(1243567.23).build();
		Account account2 = Account.builder().accountHolderName("TSR").accountType("Current").balance(14545243567.23).build();
		branchDAO.addAccount(account1);
		branchDAO.addAccount(account2);
	}
	
	private static void addBranch() {
		BranchDAO branchDAO = new BranchDAO();
		Branch branch = Branch.builder().branchName("SRC").branchManager("TRS").location("HYD").build();
		branchDAO.addBranch(branch);
	}
	
	private static void addAccountsToBranch() {
		BranchDAO branchDAO = new BranchDAO();
		Account account1 = Account.builder().accountNo(3).build();
		Account account2 = Account.builder().accountNo(4).build();
		Set<Account> listAcc = new HashSet<>();
		listAcc.add(account1);
		listAcc.add(account2);
		branchDAO.addAccountsToBranch(listAcc, 5);
	}

	private static void getAccount() {
		BranchDAO branchDAO = new BranchDAO();
		branchDAO.getAccount(4);
	}
	
	private static void getBranch() {
		BranchDAO branchDAO = new BranchDAO();
		branchDAO.getBranch(5);
	}

}
