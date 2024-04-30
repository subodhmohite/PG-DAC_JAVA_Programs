package com.app.fruits;

public abstract class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean fresh;
	
	public Fruit(String name,String color,double weight,boolean fresh) {
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.fresh=fresh;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public boolean getFresh() {
		return fresh;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh=fresh;
	}
	public abstract String taste();
	
	@Override
	public String toString() {
		return "Name of Fruit:"+getName()+ " Colour:"+getColor()+ " Weight:"+getWeight() ;
	}
	

}
