package com.inherit.part03_override;

public class Book {
	private String title;
	private String writer;
	private int price;
	
	public Book() {}

	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//1.toString() 오버라이딩
	@Override
	public String toString() {
		return title + "," + writer + "," + price;
	}
	
	//2. .equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		
		//필드값들끼리 비교
		Book other = (Book)obj;
		
		if(title == null) {
			if(other.title != null) {
				return false;
			}
		}else if(!title.equals(other.title)) {
			return false;
		}
		
		if(writer == null) {
			if(other.writer != null) {
				return false;
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		
		if(price != other.price) {
			return false;
		}
		
		//위에 모든 조건을 통과하면 두 객체는 같은 객체이다!!
		return true;
	}
	
	//3. 해쉬코드 오버라이딩
	@Override
	public int hashCode() {
		return (title + writer + price).hashCode();
		
	}
	
	
	
	
	
}