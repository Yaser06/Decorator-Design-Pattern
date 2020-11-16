package com.yaser.domain;

public class TurkishCoffee  extends Beverage{
	public TurkishCoffee() {
		setName("Turkish Coffee");
		setDescription("Türk kahvesi, daha çok Türk kültüründe önemli yere sahip"
				+ " Osmanlý Ýmparatorluðu'dan günümüze kadar gelmiþ en eski kahve"
				+ " hazýrlama ve piþirme metotlarýndandýr");
	}
	@Override
	public void setName(String name) {
		
		super.setName(name);
	}
	@Override
	public double price() {
		return 8.0;
	}

}
