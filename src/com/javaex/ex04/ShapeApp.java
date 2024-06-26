package com.javaex.ex04;
//
import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
    	
    	//리스트 사용해서 shape갖다 쓰는 새로운 배열리스트 객체 생성
    	//<shape>가 갖고있는 모든 객체들?이 담길수 있을 것
        List<Shape> sList = new ArrayList<Shape>(); 
        
        //---------------------------------------------
        //객체 생성 r,t ->파라미터 할당 (double width, double height)
        Shape r= new Rectangle( 5, 6 );
        Shape t= new RectTriangle( 6, 2 );
        
        //---------------------------------------------
        //어레이 리스트로 추가해주기 메서드 .add() r,t 추가해주기
        sList.add(r);
        sList.add(t);
        
        //for문 돌려서 요소의 개수(.size())메서드 이용해서 넓이,길이 값 하나씩 출력
        for( int i=0; i<sList.size(); i++ ) {
            
            System.out.println( "area: " + sList.get(i).getArea() );
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            //----------------------------------------------------
            //if 문 돌려서 i의 인덱스값이 인터페이스로부터 생성된 객체인지 물어보기?
            //instanceof 는 다운캐스팅시 어떤 클래스를 객체화한것인지 알고자 할때 사용됨
            //resize()methode 를 이용해서 리사이즈해주기 
            //(캐스팅: shape 클래스 내부에서는 resizable() 이란 메서드가 없기때문에
            //따로 Resizable로 다운캐스팅해준후 메소드구현 및 새로운 파라미터 할당(0,5)
            if( sList.get(i) instanceof Resizeable ) {
                ((Resizeable)sList.get(i)).resize( 0.5 );
                
                //(출력)
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            
            }
            //if문 finish------------------------------------------
            
            
        }//for문 finish--------------------------------------------
        
        
        
    }
}
