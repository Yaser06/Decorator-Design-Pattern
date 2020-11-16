package com.yaser.domain;

public class Whip extends FlavoreDecorator{

	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double price() {
		return 3.0+getBeverage().price();
	}

}
