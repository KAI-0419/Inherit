package com.inherit.part01.test.test01;

public class MTest {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("참치");
		
		System.out.println("==========");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("뼈다귀");
	}
}
