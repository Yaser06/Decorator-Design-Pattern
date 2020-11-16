package com.yaser.program;

import com.yaser.domain.Beverage;
import com.yaser.domain.Espresso;
import com.yaser.domain.Milk;
import com.yaser.domain.MilkyDecafWithStrawberry;
import com.yaser.domain.TurkishCoffee;
import com.yaser.domain.Whip;

//DECORATOR DESIGN PATTERN

//Open-Closed Principle

public class Driver {
	public static void main(String[] args) {
		
		Beverage beverage=new Whip(new Milk(new TurkishCoffee()));
		System.out.println("Köpüklü sütlü türk kahvesi fiyatý: " +beverage.price());
		//Whip:3TL Milk: 3TL Türk kahvesi : 8 tl ->>> 14TL
		
		TurkishCoffee turkishCoffee=new TurkishCoffee();
		System.out.println(turkishCoffee.getName());
		System.out.println(turkishCoffee.getDescription());
				
		
		//2 ornek fiyat gösterimi
		Beverage beverage2=new Milk(new Whip(new Espresso()));
		System.out.println(beverage2.price());
		
		Beverage beverage3 =new Whip(new MilkyDecafWithStrawberry());
		System.out.println(beverage3.price());
	}
}
