package com.yaser.domain;

public abstract class Beverage {
	
	private String name;
	private String description;
	
	public abstract double price();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}
