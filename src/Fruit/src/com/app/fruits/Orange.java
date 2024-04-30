package com.app.fruits;

public class Orange extends Fruit{
	//Parameterized constructor
	public Orange(String name,String color,double weight,boolean fresh){
		super(name,color,weight,fresh);
		
	}
	//Special Method
	public void juice() {
		System.out.println("The Fruit "+super.getName()+" has Weight "+super.getWeight()+" and extracts Juice");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	public String taste() {
		return "Taste Sour";
		
	}
}

