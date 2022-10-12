package com.inherit.part02_inherit.before;

import java.util.Date;

public class Desktop {
	
	//필드
	private String brand;     		  //제조사
	private String pNumber;   		  //삼풍번호
	private String pCode;     		  //상품코드
	private String pName;    		  //삼풍명
	private String cpu;      		  //cpu
	private int hdd;          		  //하드디스크
	private int ram;		 		  //메인메모리
	private String os;       		  //운영체제
	private int price;       		  //가격
	private Date date;        		  //제조일자
	private boolean allInOne; 		  //일체형 여부
	
	//생성자(기본, 매개변수)
	public Desktop() {}
	public Desktop(String brand, String pNumber, String pCode, String pName, String cpu, int hdd, 
			int ram, String os, int price, Date date,  boolean allInOne) {
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
		this.allInOne = allInOne;
	}
	
	//getter & setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPNumber() {
		return pNumber;
	}
	public void setPNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	
	public String getPCode() {
		return pCode;
	}
	public void setPCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getPName() {
		return pName;
	}
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public int getHdd() {
		return 0;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	public int getRam() {
		return 0;
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
		return 0;
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
	
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public void printInformation() {
		System.out.println(brand+", "+pNumber+", "+pCode+", "+pName+", "+cpu+", "+
							hdd+", "+ram+", "+os+", "+price+", "+date+", "+allInOne);
	}
	
	
	
	
	
	
}
