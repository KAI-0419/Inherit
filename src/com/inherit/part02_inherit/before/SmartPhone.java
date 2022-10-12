package com.inherit.part02_inherit.before;

import java.util.Date;

public class SmartPhone {
	
	public SmartPhone() {}
	
	public SmartPhone(String brand, String pNumber, String pCode, String pName, String cpu, int hdd, int ram, String os,
			int price, Date date, String mobileAgency) {
		super();
		this.brand = brand;
		this.pNumber = pNumber;
		this.pCode = pCode;
		this.pName = pName;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		this.price = price;
		this.date = date;
		this.mobileAgency = mobileAgency;
	}

	private String brand;
	private String pNumber;
	private String pCode;
	private String pName;
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	private int price;
	private Date date;
	private String mobileAgency;
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public void printInformation() {
		System.out.println(brand+", "+pNumber+", "+pCode+", "+pName+", "+cpu+", "+
							hdd+", "+ram+", "+os+", "+price+", "+date+", "+mobileAgency);
	}
	
	
	
	
}
