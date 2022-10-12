package com.inherit.part01.test.test01;

public class Dog extends Animal{
	
	@Override
	public void bark() {
		System.out.println("멍멍");
		super.bark();
	}
}
