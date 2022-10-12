package com.inherit.part02_inherit.after;

import java.util.Date;

public class Television extends Product {
	
	private int inchType;
	
	public Television() {
		super();
	}
	
	public Television(String brand, String pNumber, String pCode, String pName, int price, Date date,int inchType) {
		super(brand, pNumber, pCode, pName, price, date);
		this.inchType = inchType;
		System.out.println("=== !TV 클래스 생성자 호출 완료! ===");
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}
	
	public String printInformation() {
		return super.printInformation()+","+this.inchType;
	}
	
	
	
	
	
	
	
	
	
}
