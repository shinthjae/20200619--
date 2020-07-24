package com.sist.exception;

/*
 * 		예외회피
 * 			= 에러에 대한 예측이 가능하게 만든다
 * 			    대부분의 프로그램은 = 직접처리 (try~catch)
 * 			  ==> API(자바, 라이브러리)
 * 			= 프로그래머가 예외처리를 각자 프로그램에 맞게 처리 유도
 * 		
 * 			형식)
 * 				메소드 () throws 예측한 예외 클래스 등록
 * 			예)
 * 				public void display() throws Exception,ArrayIntexOutOfBoundsException,NullPointException  //두개 이상 사용시 콤마
 * 				{
 * 				}
 * 			==> 예외처리는 호출하는 메소드에서 처리
 */

public class MainClass {
	public int div(int a,int b)throws ArithmeticException
	{
		return a/b; // 0으로 나누면 에러가 발생할 수 있다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		int res=m.div(10, 2);
		System.out.println(res);  //RuntimeException은 생략이 가능
		
		

	}

}
