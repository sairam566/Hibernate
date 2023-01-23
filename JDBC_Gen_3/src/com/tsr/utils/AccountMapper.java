package com.tsr.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tsr.dto.Account;

public class AccountMapper {
	public static Account mapRecordToAccount(ResultSet resultSet) throws SQLException {
		Account account = null;
		account = new Account();
		account.setAccountNo(resultSet.getInt(1));
		account.setAccountHolderName(resultSet.getString(2));
		account.setAccountType(resultSet.getString(3));
		account.setMobileNo(resultSet.getString(4));
		account.setEmail(resultSet.getString(5));
		account.setBranchCode(resultSet.getString(6));
		account.setBalance(resultSet.getInt(7));
		return account;
	}
}
