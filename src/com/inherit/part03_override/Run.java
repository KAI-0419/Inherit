package com.inherit.part03_override;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("가나다", "강현", 100);
		Book b2 = new Book("ABC", "Kai", 1000);
		
		System.out.println("b1= "+b1.toString());
		System.out.println("b2= "+b2.toString());
		
		System.out.println("b1= "+b1);
		System.out.println("b2= "+b2);
		
		System.out.println("b1 == b2 ? " + b1.equals(b2));
		
		Book b3 = b1;
		System.out.println("b1 == b3 ? " + b1.equals(b3));
		
		Book b4 = new Book("가나다", "강현", 100);
		
		//주소는 다르지만 같은 객체로 취급하는 객체 => "동등객체"
		//주소값까지 같은 객체 => "동일객체"
		System.out.println("b4 == b1 ? " + b1.equals(b4));
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
		
		
	}

}
