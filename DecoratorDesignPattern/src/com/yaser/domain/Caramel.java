package com.yaser.domain;

public class Caramel extends FlavoreDecorator{

	public Caramel(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double price() {
		return 10.0;
	}

}
