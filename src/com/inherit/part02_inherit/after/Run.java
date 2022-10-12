package com.inherit.part02_inherit.after;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Television t = new Television("LG", "03", "T-1990", "LG-OLED", 5000000, new Date(), 70);
		
		System.out.println(t.printInformation());
		System.out.println(t.getPrice());
		
		SmartPhone s = new SmartPhone("Apple", "02", "A-0292", "IPhone13Pro", 1500000, new Date(), "A13", 128, 16, "IOS16", "LGU+");
		System.out.println(s.printInformation());		
		System.out.println(t.getBrand());
	}
}
