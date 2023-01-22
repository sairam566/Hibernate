package com.tsr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tsr.dto.Account;

public class AccountAccessor {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
	 String SQL_FIND_ACCOUNT_BY_ACCOUNTNO= "select account_no, account_holder_nm, account_type, mobile_no,"
				+ " email_address, branch_code, balance from account where account_no = ?";
	int accountNo=1;
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
		try {
			//Class.forName("");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate", "sairam", "sairam");
			ps = con.prepareStatement(SQL_FIND_ACCOUNT_BY_ACCOUNTNO);
			ps.setInt(1, accountNo);
			rs = ps.executeQuery();
			if(rs.next()) {
				Account acc = new Account();
				acc.setAccountNo(rs.getInt(1));
				acc.setAccountHolderName(rs.getString(2));
				acc.setAccountType(rs.getString(3));
				acc.setMobileNo(rs.getString(4));
				acc.setEmail(rs.getString(5));
				acc.setBranchCode(rs.getString(6));
				acc.setBalance(rs.getInt(7));
				
				System.out.println(acc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException sqlRS) {
				sqlRS.printStackTrace();
			}
			try {
				if(ps != null) {
					ps.close();
				}
			} catch (SQLException sqlPS) {
				sqlPS.printStackTrace();
			}
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException sqlCon) {
				sqlCon.printStackTrace();
			}
		}
		
	}
	
}
