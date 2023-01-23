package com.tsr.dao;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tsr.dto.Account;
import com.tsr.utils.ConnectionManager;
import com.tsr.utils.GenericMapper;

public class AccountAccessor {
	
	public static void main(String[] args) {
		Account acByACNO = findAccountByAccountNo(1);
		Account acByMOBNO = findAccountByMobileNo("8989898988");
		System.out.println("BY ACNO: "+acByACNO);
		System.out.println("BY MobNo: "+acByMOBNO);
	}
	
	public static Account findAccountByAccountNo(int accountNo) {

		String SQL_FIND_ACCOUNT_BY_ACCOUNTNO = "select account_no, account_holder_nm, account_type, mobile_no,"
				+ " email_address, branch_code, balance from account where account_no = ?";

		Account acc = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(SQL_FIND_ACCOUNT_BY_ACCOUNTNO);
			ps.setInt(1, accountNo);
			rs = ps.executeQuery();
			if (rs.next()) {
				//acc = AccountMapper.mapRecordToAccount(rs);
				try {
					acc = (Account) GenericMapper.mapRecordToObject(rs, Account.class);
				} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException
						| IllegalArgumentException | InvocationTargetException | IOException e) {
					e.printStackTrace();
				}
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
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(SQL_FIND_ACCOUNT_BY_MOBILENO);
			ps.setString(1, mobileNo);
			rs = ps.executeQuery();
			if (rs.next()) {
				//ac = AccountMapper.mapRecordToAccount(rs);
				try {
					ac = (Account) GenericMapper.mapRecordToObject(rs, Account.class);
				} catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException
						| IllegalArgumentException | InvocationTargetException | IOException e) {
					e.printStackTrace();
				}
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
