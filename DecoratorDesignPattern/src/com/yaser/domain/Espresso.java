package com.yaser.domain;

public class Espresso extends Beverage {

	public Espresso() {
		setName("Espresso");
		setDescription("Espresso, koyu kavrulmu�, T�rk Kahvesi kadar "
				+ "olmasa da, yeteri kadar ince �ekilmi� �talya'ya �zg� bir kahve t�r�d�r.");
	}
	@Override
	public double price() {
		return 7.50;
	}

}
