package com.sist.oop;
/*
 * 		자바
 * 			1번째줄 => package명 (한번만 사용이 가능)
 * 			2번째줄 => import (여러번 사용이 가능)
 * 			3번째줄
 * 			public class className{
 * 				필요한  변수 설정 ==> 멤버변수
 * 				변수에 대한 초기화 ==> 생성자
 * 				기능 ==> 메소드 
 * 			}
 * 
 * 			===> 다른 클래스에서 사용시에는 
 * 				 import com.sist.oop.*
 * 				  패키지
 * 				 	com.회사명.기능명 => com.sist.client , com.sist.server
 * 					org.조직명.기능명 => org.springframework.web.servlet.view.*
 * 
 * 
 * 
 * 
 * 
 * 			캡슐화
 * 				= 변수는 private
 * 				= 메소드 public ===> 변수 (getter/setter)
 * 			상속
 * 				= extends : 기존의 클래스를 기능 가지고 온다
 * 				   단일 상속만 가능
 * 			다형성
 * 				= 수정,추가
 * 			============================================= 문법사항이 아니라 권장 사항
 */

/* 
 * 		오버로딩 (생성자에서 주로 사용)
 * 		= 같은 메소드명으로 여러개의 기능을 만든다 (같은 기능 예)+ 일때 같은 메소드명으로 다른 타입으로 만듬)
 * 		  =========
 * 	      	1. 매개변수가 다르다(갯수나 데이터형이 다르다)
 * 			2. 리턴형은 관계없다
 * 			3. 같은 클래스내에서 만든다
 * 
 * 		plus() :
 * 		int + int ===========> plusInt(int a, int b)
 * 		double + double =====> plusDouble(double d, double d1)
 * 		int + double ========> plusIntDouble(int a, double b)
 * 		String + String =====> plusString(String s1, String s2)
 * 		float + double
 * 		long + int
 * 		int + char
 * 		char + double
 * 		String + char
 */

class Calc{
	// 인스턴스 메소드 : new 사용시 마다 저장되는 메소드
	public void plus(int a, int b)
	{
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
//	public void plus(int a, int b)
//	{
//		retrun a+b;
//	}
	
	public void plus(double a, double b)
	{
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a, String b)
	{
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
}

/*
 * 		변수 
 * 		===
 * 		  멤버변수
 * 		 static 공유변수
 * 
 * 		메소드
 * 		=====
 * 		  멤버메소드
 * 		 static 메소드
 * 
 * 		class A 
 * 		{
 * 			int a;
 * 			static int b;
 * 				
 * 				public void disp1()
 * 				{
 * 					=> a,b 사용이 가능
 * 					=> disp2() 호출이 가능
 * 				}
 * 				
 * 				public static
 */
public class 오버로딩_중복메소드정의 {
	int a=10;//=> static안에서만 static은 static만 사용가능
	static int b=20; 
	public void disp1()
	{
		System.out.println(this.a);  // static 안에서는  객체를 생성해야만 this 사용가능, this는 모든 클래스에 붆포
		System.out.println(this.b);
	}
	
	public void disp2()
	{
		System.out.println(b);
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		
		System.out.println(aa.a); // 같은 이름을 쓸수 있는 이유는 저장공간이 같기 때문	
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); // 메소드 전체가 저장
		cc.plus("Hello", "Java");
		cc.plus(100,200);
		System.out.println(b);
		
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		System.out.println("aa="+                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aa);
		System.out.println(aa.a);
	}

}
