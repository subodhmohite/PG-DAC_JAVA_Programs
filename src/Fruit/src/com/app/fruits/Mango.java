package com.app.fruits;

public class Mango extends Fruit{
	//Parameterized constructor
	public Mango(String name,String color,double weight,boolean fresh){
		super(name,color,weight,fresh);
		
	}
	//Special Method
	public void pulp() {
		System.out.println("The Fruit "+super.getName()+" extracts Pulp and the Color is "+super.getColor());
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	
	public String taste() {
		return "Taste Sweet";
		
	}
	
	

}
