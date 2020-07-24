package com.sis.exception;


// (예외처리) 부분 처리


public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//부분적으로 try를 사용 할 수 있다
		//예외처리 위치
		 try 
		 {
			 for(int i=0;i<=10;i++)
			 {
				 try 
				 {
				 System.out.println("i="+i);
				 int a=i/(int)(Math.random()*3); //ERROR발생부분
				 System.out.println("a="+a);
				 }catch(Exception e) {System.out.println("for문 i++로 이동");} //for문안에 예외처리 할 경우 이렇게 나온
			 }                                                             //for문 끝까지 처리 시킬경우 제어문 안쪽에 예외처리해준다 //예외처리 위치에 따라
		 }catch(Exception ex)
		 {
			 System.out.println("에러 발생");
		 }
		 System.out.println("프로그램 정상 종료");

	}

}
