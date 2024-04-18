package com.javaex.ex04;


//클래스Rectangle 선언
//shape클래스를 상속받고 resizeable이라 하는 인터페이스 구현해준다
public class Rectangle extends Shape implements Resizeable {


	//필드/---------------------------------------------------
	private double width;
	private double height;

	//-------------------------------------------------------
	//생성자
	public Rectangle(double width,double height) {
	this.width = width;
	this.height = height;
	}

	//-------------------------------------------------------
	//alt.+ shift s source override implement method하기
	
	//resize() method 위에서 인터페이스 선언해주었기때문에 
	//그 안의 메소드 구현해주기위해
	//마찬가지로 resize() method 오버라이드해주기
	@Override 
	public void resize(double s) {
	width = width* s;
	height = height* s;
	}

	//-------------------------------------------------------
	//getArea() shape 클래스로부터 받은 메소드 오버라이드해주기
	@Override
	public double getArea() {
	return width * height;
	}

	//getPerimeter() shape 클래스로부터 받은 메소드 오버라이드해주기
	@Override
	public double getPerimeter() {
	return 2 * (width + height);
	}



	

}