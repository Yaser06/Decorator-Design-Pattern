package com.yaser.domain;

public class Espresso extends Beverage {

	public Espresso() {
		setName("Espresso");
		setDescription("Espresso, koyu kavrulmuþ, Türk Kahvesi kadar "
				+ "olmasa da, yeteri kadar ince çekilmiþ Ýtalya'ya özgü bir kahve türüdür.");
	}
	@Override
	public double price() {
		return 7.50;
	}

}
