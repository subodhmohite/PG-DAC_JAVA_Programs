package com.app.fruits;

public class Apple extends Fruit {
	//Parameterized constructor
	public Apple(String name,String color,double weight,boolean fresh){
		super(name,color,weight,fresh);
		
	}
	//Special Method
	public void jam() {
		System.out.println("Jam is made of "+super.getName());
		
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public String taste() {
		return "Taste Sweet n Sour";
		
	}
	
	
	

}
