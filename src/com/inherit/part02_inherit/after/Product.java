package com.inherit.part02_inherit.after;

import java.util.Date;

public class Product {
	
	//field
	private String brand;
	private String pNumber;
	private String pCode;
	private String pName;
	private int price;
	private Date date;
	
	//생성자(기본, 매개변수)
	public Product() {}

	public Product(String brand, String pNumber, String pCode, String pName, int price, Date date) {
		super();
		this.brand = brand;
		this.pNumber = pNumber;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.date = date;
		
		System.out.println("=== !부모 클래스 생성자 호출 완료! ===");
	}
	
	//getter & setter

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
	
	public String printInformation() {
		return brand+", "+pNumber+", "+pCode+", "+pName+", "+price+", "+date;
	}
	
	
	
}
