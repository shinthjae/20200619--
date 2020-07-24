/*
 * 		사용자 정수입력 => 짝수, 홀수
 * 
 * 		메소드 => 결과값 => 리턴값
 * 				메소드 자체에서 출력 => 리턴값(X) void
 * 
 * 		1) ==> 입력
 * 		2) ==> 입력 처리
 * 		3) ==> 결과 출력
 */

import java.util.*;
public class 자바메소드3 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		return num;
	}
	// 연산자+제어문=메소드
	/* 
	 * 	클래스 : 변수+메소드
	 * 	====
	 */
	static void process(int num)
	{
		if(num%2==0)
			System.out.println(num+"는(은) 짝수입니다");
		else
			System.out.println(num+"는(은) 홀수입니다");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자 입력값을 받는다
		int num=userInput();
		process(num);

	}

}
