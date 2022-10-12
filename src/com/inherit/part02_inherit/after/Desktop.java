package com.inherit.part02_inherit.after;

import java.util.Date;

public class Desktop extends Computer {
	private boolean allInOne;
	
	public Desktop() {}

	public Desktop(String brand, String pNumber, String pCode, String pName, int price, Date date, String cpu, int hdd,
			int ram, String os, boolean allInOne) {
		
		super(brand, pNumber, pCode, pName, price, date, cpu, hdd, ram, os);
		
		this.allInOne = allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation()+","+this.allInOne;
	}
	
	
}
