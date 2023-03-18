package com.tsr;

import com.tsr.dao.BranchDAO;
import com.tsr.entities.Account;
import com.tsr.entities.Branch;
import com.tsr.helper.EntityManagerFactoryRegistory;

public class App {
	
	public static void main(String[] args) {
		try {
			//addAccount();
			//addBranch();
			//addBranchToAccount();
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
	
	private static void addBranchToAccount() {
		BranchDAO branchDAO = new BranchDAO();
		Branch branch = Branch.builder().branchNo(3).build();
		branchDAO.addBranchToAccount(2, 3);
	}

	private static void getAccount() {
		BranchDAO branchDAO = new BranchDAO();
		branchDAO.getAccount(2);
	}
	
	private static void getBranch() {
		BranchDAO branchDAO = new BranchDAO();
		branchDAO.getBranch(3);
	}

}
