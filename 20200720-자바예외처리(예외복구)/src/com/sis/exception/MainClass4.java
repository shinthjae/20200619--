package com.sis.exception;

import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;

//(예외처리)다중처리

/*
 * 		다중 처리 ==> 예상되는 에러가 여러개 있는 경우
 * 		
 * 		try
 * 		{
 * 			정산적으로 실행되는 문장
 * 		}
 * 		catch(예상되는 예외클래스)
 * 		{
 * 			예외처리
 * 		}
 * 		catch(예상되는 예외클래스)
 * 		{
 * 			예외처리
 * 		}
 * 		catch(예상되는 예외클래스)
 * 		{
 * 			예외처리
 * 		}
 * 
 * 
 * 		catch를 여러개 사용시에는 순서가 존재 한다
 * 
 * 		예외처리 계층 구조
 * 		============
 * 				최상위 클래스 => 모든 클래스의 상위 클래스 
 * 				 Object
 * 			 	|(오아)
 * 				Throwable
 * 			-----------------
 * 			|				|
 * 	  	  Error			Exception
 * 							|
 * 					-------------------
 * 					|
 * 				IOException
 * 				
 * 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=0;//배열 2는 없은 [0,1] ERROR
			
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("정수변환이 안됨");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열범위가 벗어난 경우");
		}
		catch(ArithmeticException e)    //예상 에러 3개 , 그 이상일땐 RuntimeException
		{
			System.out.println("0으로 나눌 경우");
		}
		catch(RuntimeException e) //RuntimeException을 앞 3개 앞에 쓰면 오류. 왜? RuntimeException이 오류를 다 잡기때문에 그래서 순서가 중요
		{
			System.out.println("실행시 모든 에러를 처리");
		}
		catch(Exception e) // Exception은 마지막에 써주는게 좋다 왜? 계층 구조상 위에 것들보다 상위, 내가 예상 못한 오류가 있을 수도 있기 때문에 
		{
			System.out.println("수정이 가능한 모든 에러를 처리");	
		}
		catch(Throwable e) //위에 내용과 이하 동문
		{
			System.out.println("예외와 에러를 동시 처리");
		}

	}

}
