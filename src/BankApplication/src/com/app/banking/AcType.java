package com.app.banking;

public enum AcType {
	SAVINGS(5000),CURRENT(10000),FD(50000),
	LOAN(25000),DMAT(40000),NRE(150000);
	
	private double minBalance;
	
	//Constructor
	AcType(double minBalance){
		this.minBalance=minBalance;
	}
	
	//We can Override toString method in Enum
	@Override
	public String toString() {
		return name()+": "+minBalance;
	}
	
	//We can Add methods in Enum
	public double getMinBalance() {
		return minBalance;
	}

}
