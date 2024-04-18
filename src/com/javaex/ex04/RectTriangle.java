package com.javaex.ex04;

//RectTriangle 클래스를 선언
//shape 클래스를 extends해서 물려받았다는 뜻임 
public class RectTriangle extends Shape{


	//필드/----------------------------------------------
	private double width;
	private double height;

	
	//생성자---------------------------------------------
	public RectTriangle(double width, double height) {
		this.width	= width;
		this.height = height;

	}

	//-------------------------------------------------
	//alt shift s source override implement method 
	//getArea, get Perimeter()_ 기능 자동 복붙하기)
	//오버라이드를 통해 이 클래스 내에 추상클래스의 추상 메서드를 반드시 구현
	//필수 필수
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	//여기서 나중에 넓이과 길이에 대한 0값을 리턴해주는것 
	

}



	