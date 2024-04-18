package com.javaex.ex04;



//resizeable이라 하는 인터페이스 구현

public class Rectangle extends Shape implements Resizeable {



//필드

	private double width;

	private double height;



//생성자

	public Rectangle(double width,double height) {

	this.width = width;

	this.height = height;

	}

//als shift s source override implement method하기
	//resize() method override

	@Override 

	public void resize(double s) {

	width = width* s;

	height = height* s;
	
	}

	//getArea() method override
	@Override

	public double getArea() {

	return width * height;

	}

	

	@Override

	public double getPerimeter() {

	return 2 * (width + height);

	}



	

}