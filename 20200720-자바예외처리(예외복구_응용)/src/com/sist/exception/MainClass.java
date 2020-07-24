package com.sist.exception;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/*
 * 		예외처리
 * 			형식)
 * 				1.직접처리 (try~catch)
 * 					try
 * 					{
 * 						실행이 가능한 코딩 (정상 수행할 수 있는 문장)
 * 					}catch(예외클래스 객체)
 * 					{
 * 						실행 과정에 에러가 날 경우에 처리 문장
 * 					}
 * 					*** catch는 여러번 사용이 가능
 * 					*** finally를 사용할 수 있다 (필요한 경우에만 사용을 한다)
 * 						서버,데이터베이스 관련 => 서버닫기, 오라클 연결 해제
 * 				
 * 				2. 자바에서 제공하는 예외처리
 * 
 * 					한개만 처리
 * 						NumberFormatException
 * 						ArrayIndexOutOfBoundse
 * 						NullPointerException
 * 						ioException
 * 						SQLException
 * 
 * 					여러개 처리
 * 						RuntimeException
 * 						Exception
 * 						Throwable
 * 				
 * 				3. catch는 여러개를 사용할 수 있다
 * 					해당 에러를 찾는 경우레는 처음부터 마지막까지 검색 => 예외처리 순서대로 코딩
 * 				
 * 				4. try에서 에러가 발생하면 발생위치에서 catch로 이동
 * 				   ====================== 밑에 있는 소스는 실행되지 않는다
 * 					int a=10; ==> 실행
 * 					int b=0; ==> 실행
 * 					int c=a/b; ==> 에러발생 =============> catch로 이동
 * 					System.out.println(c) ==> 실행되지 않는다
 * 
 * 				5. 목적 : 에러체크 (에러 확인 ==> 소스 변경) ==> 디버깅
 * 
 * 				6. 예외처리 => 수정이 가능한 에러 
 * 
 *       			1문장 
 *              	2문장 
 *           	 	3문장
 *           		 4문장 ====> error발생 ==> 프로그램을 종료 (비정상 종료)
 *            		5문장 
 *            		6문장 
 *            		7문장    
 *            		==============================> 7문장이 수행 (정상종료)
 *            
 *            1문장 
 *            2문장 
 *            try
 *            {
 *              3문장
 *              4문장 ====> error발생 ==> 프로그램을 종료 (비정상 종료)
 *              5문장
 *                ===> 4문장,5문장 ==> 건너뛴다 ==> 6문장이동 
 *            }catch(Exception e)
 *            {
 *               6문장  
 *            } 
 *            7문장 
 *            8문장    
 *            
 *            7. 자바의 모든 코딩은 예외처리가 존재한다
 *            	 단 실행시는 생략이 가능
 *            
 *            => 원래는 존재해야되는데 생략 ==> 예외처리
 *            IO
 *            System.out.println() => 예외처리가 생략이 가능
 *            System.in.read() => 예외처리를 생략할 수 없다
 *            *** 생략을 할 수 있지만 => 특별한 경우에는 예외처리를 할 줄 알아야 한다
 *            	  ====
 *            		조건문으로 주로 처리 => 조건문으로 처리가 어려운 경우에 예외처리 사용
 *            		=> 에러처리의 기본 조건문
 *            
 *             int a=10;
 *                 int b=0;
 *                 
 *                 if(b==0)
 *                   System.out.println("0으로 나눌 수 없다");
 *                 else
 *                   System.out.println(a/b);
 *                   
 *                 
 *                 try
 *                 {
 *                    int a=10;
 *                    int b=0;
 *                    System.out.println(a/b);
 *                 }catch(Exception ex)
 *                 {
 *                    System.out.println("0으로 나눌 수 없다");
 *                 }
 *                 
 *            *** 에러 잡을 땐 if문을 먼저 생각해보자
 *            
 *            
 *            8. 예외처리는 반드시 처리해야하는 클래스가 존재
 *            	 ==============
 *            		IO와 관련 **********
 *            		쓰레드와 관련 **********
 *            		네트워크 관련
 *            		데이터베이스 관련 **********
 *            	 
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	        String num1=JOptionPane.showInputDialog("첫번째 정수 입력:");
	        String num2=JOptionPane.showInputDialog("두번째 정수 입력:");
	        // 배열에 첨부 
	        int[] arr=new int[2];
	        // 문자열을 정수로 변환 
	        arr[0]=Integer.parseInt(num1);// 숫자 ==> "10" "1 0" " 10"
	        arr[1]=Integer.parseInt(num2);
	        
	        int result=arr[0]/arr[1];
	        System.out.println("result="+result);
		}
//	    catch(NumberFormatException e)
//		{
//			System.out.println("정수만 입력");
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("배열범위 초과");
//		}catch(ArithmeticException e)
//		{
//			System.out.println("0으로 나눌 수 없다");
//		}
	   
	        catch(RuntimeException e) //위에 3개 대신에 RuntimeException 하나만 사용해도 된다 하지만 통으로 잡으면 어떤 에러가 발생했는지 모름
	    {
//	    	System.out.println("오류발생");
	        	
	    	e.printStackTrace(); //에러 잡는 코딩 p.422
	    }
	    
		System.out.println("처음부터 다시 입력!!");
		
	}

}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
