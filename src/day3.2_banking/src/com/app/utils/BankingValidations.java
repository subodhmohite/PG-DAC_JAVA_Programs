package com.app.utils; 

import java.time.LocalDate;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.custom_exceptions.BankingException;

public class BankingValidations {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

//add public static method to validate for min bal
	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Insufficient Balance !!!!!");
		System.out.println("valid balance....");
	}
	//Add public static method to validte all i/ps
	public static BankAccount validateInputs(int acctno,String fname,
			String lname,String acType,String dob,String creationDate,double balance)
	throws BankingException
	{
		AcType type=AcType.valueOf(acType.toUpperCase());
		LocalDate birthDate=LocalDate.parse(dob);
		LocalDate crDate=LocalDate.parse(creationDate);
		validateBalance(balance);
		
		return new BankAccount(acctno,fname,lname,type,birthDate,crDate,balance);
	}
}
