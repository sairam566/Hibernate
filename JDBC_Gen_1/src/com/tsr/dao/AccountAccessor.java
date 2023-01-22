package com.tsr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tsr.dto.Account;

public class AccountAccessor {
	
	public static void main(String[] args) {
		Account acByACNO = findAccountByAccountNo(1);
		Account acByMOBNO = findAccountByMobileNo("8989898988");
		System.out.println("BY ID: "+acByACNO);
		System.out.println("BY ID: "+acByMOBNO);
	}
	
	public static Account findAccountByAccountNo(int accountNo) {

		String SQL_FIND_ACCOUNT_BY_ACCOUNTNO = "select account_no, account_holder_nm, account_type, mobile_no,"
				+ " email_address, branch_code, balance from account where account_no = ?";

		Account acc = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate", "sairam", "sairam");
			ps = con.prepareStatement(SQL_FIND_ACCOUNT_BY_ACCOUNTNO);
			ps.setInt(1, accountNo);
			rs = ps.executeQuery();
			if (rs.next()) {
				acc = new Account();
				acc.setAccountNo(rs.getInt(1));
				acc.setAccountHolderName(rs.getString(2));
				acc.setAccountType(rs.getString(3));
				acc.setMobileNo(rs.getString(4));
				acc.setEmail(rs.getString(5));
				acc.setBranchCode(rs.getString(6));
				acc.setBalance(rs.getInt(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException sqlRS) {
				sqlRS.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException sqlPS) {
				sqlPS.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException sqlCon) {
				sqlCon.printStackTrace();
			}
		}
		return acc;
	}
	
	public static Account findAccountByMobileNo(String mobileNo) {
		String SQL_FIND_ACCOUNT_BY_MOBILENO = "select account_no, account_holder_nm, account_type, mobile_no,"
				+ " email_address, branch_code, balance from account where mobile_no = ?";

		Account ac = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate", "sairam", "sairam");
			ps = con.prepareStatement(SQL_FIND_ACCOUNT_BY_MOBILENO);
			ps.setString(1, mobileNo);
			rs = ps.executeQuery();
			if (rs.next()) {
				ac = new Account();
				ac.setAccountNo(rs.getInt(1));
				ac.setAccountHolderName(rs.getString(2));
				ac.setAccountType(rs.getString(3));
				ac.setMobileNo(rs.getString(4));
				ac.setEmail(rs.getString(5));
				ac.setBranchCode(rs.getString(6));
				ac.setBalance(rs.getInt(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException sqlRS) {
				sqlRS.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException sqlPS) {
				sqlPS.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException sqlCon) {
				sqlCon.printStackTrace();
			}
		}
		return ac;
	}
}
