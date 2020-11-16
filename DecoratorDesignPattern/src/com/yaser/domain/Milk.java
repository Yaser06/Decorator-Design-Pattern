package com.yaser.domain;

public class Milk  extends FlavoreDecorator{

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double price() {
		return 3.00+ getBeverage().price();
	}

}
