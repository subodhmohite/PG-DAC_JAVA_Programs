package com.gettersetter;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(){
		id=1;
		name="null";
		salary=0;
	}
	public void printdetails() {
		System.out.println("ID:"+id+" Name:"+name+ " Salary:"+salary);
		
	}

}
