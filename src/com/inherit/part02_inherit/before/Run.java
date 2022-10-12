package com.inherit.part02_inherit.before;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		Desktop d = new Desktop("삼성","01","S-01234","매직스테이션","i9",500,16,"windows10",1000000, new Date(), false);
		
		d.printInformation();
		
		SmartPhone s = new SmartPhone("Apple","02","A21XP@43J","IPhone13Pro","A14",128,8,"IOS",1500000, new Date(),"LG U+");
		
		s.printInformation();
	}
}
