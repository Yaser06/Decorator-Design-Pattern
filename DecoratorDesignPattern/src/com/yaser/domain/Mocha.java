package com.yaser.domain;

public class Mocha extends FlavoreDecorator{

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double price() {
		return 10.0+getBeverage().price();
	}

}
