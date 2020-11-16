package com.yaser.domain;

public class TurkishCoffee  extends Beverage{
	public TurkishCoffee() {
		setName("Turkish Coffee");
		setDescription("T�rk kahvesi, daha �ok T�rk k�lt�r�nde �nemli yere sahip"
				+ " Osmanl� �mparatorlu�u'dan g�n�m�ze kadar gelmi� en eski kahve"
				+ " haz�rlama ve pi�irme metotlar�ndand�r");
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
