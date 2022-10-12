package com.inherit.part02_inherit.after;

import java.util.Date;

public class SmartPhone extends Computer {
	
	private String mobileAgency;
	
	public SmartPhone() {}

	public SmartPhone(String brand, String pNumber, String pCode, String pName, int price, Date date, String cpu,
			int hdd, int ram, String os, String mobileAgency) {
		super(brand, pNumber, pCode, pName, price, date, cpu, hdd, ram, os);
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	@Override
	public String printInformation() {
		return super.printInformation()+","+this.mobileAgency;
	}
	
	
	
	
	
	
}
