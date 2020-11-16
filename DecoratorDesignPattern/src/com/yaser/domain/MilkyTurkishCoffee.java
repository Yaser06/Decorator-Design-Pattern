package com.yaser.domain;

public class MilkyTurkishCoffee  extends TurkishCoffee{
	
	@Override
	public double price() {
		return super.price()+2.0;
	}

}
