package com.javaex.ex04;
//추상클래스 -> 안쪽에 추상 메서드를 가지고 있어야 한다 (넓이,둘레길이 메서드를 이경우엔 생성해주면 됨)
//이 아래 두 메서드는 물려주기 위해서만 존재하는 메서드며 직접 객체화 될 순 없다는 사실에 주의하자

public abstract class Shape { //abstract class로 shape클래스 선언
    
    public abstract double getArea(); // 넓이 메서드 추가
    public abstract double getPerimeter(); // 둘레 길이 메서드 추가
    
}
