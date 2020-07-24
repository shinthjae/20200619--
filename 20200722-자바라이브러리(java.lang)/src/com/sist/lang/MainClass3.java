package com.sist.lang;

class B
{
	int x,y;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Call By Value => 값을 전송
			int x=10;
			int y=20;
			
			int i=x;
			int j=y;  //=> 매개변수
			
			int temp=i;
			i=j;
			j=temp;
			
			System.out.println("i="+i+",j="+j); //i=20,j=10
			System.out.println("x="+x+",y="+y); //x=10,y=20
			 
			
		// Call By Reference => 주소 전송
			B b=new B();
			b.x=10;
			b.y=20;
			B c=b; // b 라는 주소가 같기 때문에 어느것을 줘도 상관없다 
				   // 참조 => swap(B c) ==> swap(b)
			c.x=100;
			c.y=200;
			
			System.out.println("b="+b); //b=com.sist.lang.B@15db9742
			System.out.println("c="+c); //c=com.sist.lang.B@15db9742 =b에서 c로 주소가 전송되어 주소가 같다, 주소값이 같으면 같이 제어된다
			System.out.println(b.x); //100
			System.out.println(b.y); //200 
			
			/*
			 *  매개변수 => class,배열 ==> (주소) 원본 
			 *  매개변수 => 기본형데이터,String ==> (메모리) 복사본
			 *  
			 *  메모리(클래스) => 같이 사용 (참조)
			 *  메모리(클래스) => 이미 만들어진 클래스를 사용 => 복제 => clone()
			 *  메모리(클래스) => 새로운 내용(처음부터 사용) => new
			 */
	}

}
