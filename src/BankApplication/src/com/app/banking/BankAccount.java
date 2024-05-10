package com.app.banking;

import java.time.LocalDate;

public class BankAccount {
	//Tight encapsulation
	private int acctNo;
	private String firstname;
	private String lastname;
	private AcType acType;
	private LocalDate dob;
	private LocalDate creationDate;
	private double balance;
	
	//Parameterized Constructor
	public BankAccount(int acctNo,String fisrtname,String lastname,AcType acType,LocalDate dob,LocalDate creationDate,double balance) {
		
		this.acctNo=acctNo;
		this.firstname=fisrtname;
		this.lastname=lastname;
		this.acType=acType;
		this.dob=dob;
		this.creationDate=creationDate;
		this.balance=balance;
		
	}
	
	//add overloaded constructor to wrap:acctno
	public BankAccount(int acctNo) {
		this.acctNo=acctNo;
	}
	
	@Override
	public String toString() {
		return "BankAccount [acctNo:"+acctNo+ " First Name:"+firstname+ " Last Name:"+lastname+ " AcType:"+acType+ 
				" Date of Birth:"+dob+ " Created on:"+creationDate+ " Balance:"+balance+ "]";
	}

}
