package com.app.banking;

import com.app.banking.BankAccount;
import com.app.custom_exceptions.BankingException;

public class BankingUtils {
	
//	add static method to return a/c details or throw exc 
	public static BankAccount findAccountDetailsByAcctno
	(int accNo,BankAccount[] accts) throws BankingException {
//		1.create bank a/c
		BankAccount acct=new BankAccount(accNo);
		for(BankAccount a: accts) {
			if(a!=null && a.equals(acct))
				return a;
		}
		throw new BankingException("Account not Found");
	}

}
