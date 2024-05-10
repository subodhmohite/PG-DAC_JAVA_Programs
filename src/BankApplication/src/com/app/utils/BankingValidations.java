package com.app.utils;

import java.time.LocalDate;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.customexceptions.BankingExceptions;

public class BankingValidations {
	//Adding a Public static method to validate inputs
	//public static BankAccount validateInputs(int acctNo,String firstname,String lastname,
		//	String acType,String dob,String creationDate,double balance,BankAccount[] accounts)throws BankingExceptions{
		
	public static BankAccount validateInputs(int acctNo,String firstname,String lastname, 
			String acType,String dob,String creationDate,double balance,BankAccount[] accounts)throws BankingExceptions {
		checkforDups(acctNo,accounts);
		AcType type=parseandValidateAcType(acType);
		LocalDate birthdate= parseDate(dob);
		LocalDate crDate= parseDate(creationDate);
		validateBalance(type,balance);
		return new BankAccount(acctNo,firstname,lastname,type,birthdate,crDate,balance);
}
	
	
    //Adding a static method to validate balance with AcType
	public static void  validateBalance(AcType type, double balance) throws BankingExceptions {
		if(balance<type.getMinBalance())
			throw new BankingExceptions("Insufficient Balance");
		System.out.println("Valid Balance");
}



	//Adding a method for parsing and validating AcType 
	public static AcType parseandValidateAcType(String acType) {
		return AcType.valueOf(acType.toUpperCase());
	}
	
	//Adding a method for parsing String to LocalDate
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	//Adding a static method to Check Duplicate acct(PK/UID---accNo)
	public static void checkforDups(int acctNo, BankAccount[] accts)throws BankingExceptions {
		//Encapsulate accNo(PK) in Object
		BankAccount acct=new BankAccount(acctNo );
		for(BankAccount a:accts) {
			if(a!=null && a.equals(acct))
				throw new BankingExceptions("Duplicate Account No.");
		}
    }
}
