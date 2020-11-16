package com.yaser.domain;

public abstract class FlavoreDecorator extends Beverage {
	
	private Beverage beverage;// Composition

	public FlavoreDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public Beverage getBeverage() {
		return beverage;
	}

}
