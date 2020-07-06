/*
 * 		프로그램 
 * 
 * 		= 데이터 저장
 * 			변수 ===> 배열, 클래스
 * 		= 명령문
 * 			===> 명령문 묶기 ===> 메소드
 * 	 ================================
 * 			객체 지향 프로그램 (Web)
 * 
 *	 =======================================================
 *	 데이터 저장
 *		 한개 ====> 변수/상수
 *		여러개 ===> 배열
 *	 데이터 처리 (사용자의 요청)
 *		제어문 , 연산자
 *		결과값 제시 (출력) ==> 도스, 윈도우, 브라우저, 핸드폰
 *						  ==== 
 *						    테스트
 *   ======================================================= 클래스
 *   
 *   ==> 테스트 , 사용자가 입력값이 잘못되면 => 쉽게 종료하려 한다 => "견고한 프로그램" 만들기 목표
 *   												  =>  1) if
 *   													  2) 예외 처리
 *   
 *   // 년, 월 ===> 입력값
 */

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
public class 달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// 년, 월 ===> 입력값
		
		//입력
		int year; int month;
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		
		System.out.print("월 입력:");
		month=scan.nextInt();
		
		//출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		System.out.println(year+"년도"+month+"월");
			for (String week:strWeek) 
			{
				System.out.print(week+"\t");
			}
			
		
		// 요일구하기
		/*			
		 * 		2020년
		 * 		전년도까지의 총 날 수 1년~2019.12.31
		 * 		7
		 * 		전달까지의 합 2020.1.1 ~ 2020.6.30
		 * 		+1 (=> 달력을 출력할땐 1일자 부터 시작한다)
		 * 		===============================
		 */
			
		// 1년~2019.12.31
			int total=(year-1)*365
					  +(year-1)/4    // 4년마다 1번씩 (윤년)
					  -(year-1)/100 
					  +(year-1)/400;
		//전달
			int[] lastDay= {31,28,31,30,31,30,
							31,31,30,31,30,31};
			
			if((year%4==0 && year%100!=0)||(year%400==0))  //윤년
				lastDay[1]=29;
			else
				lastDay[1]=28;
			
			for (int i = 0; i < month-1; i++) {
				total+=lastDay[i];
			}
			
		//1일자의 요일
			total++;
			
			int week=total%7;
			
			
		// 달력 출력
			System.out.println();
			for (int i = 1; i <= lastDay[month-1]; i++) 
			{
				if (i==1) 
				{
					for (int j = 0; j < week; j++)
					{
						System.out.print("\t");
					}
					
					
				}
				
				System.out.printf("%2d\t",i);
				week++;
				
				if(week>6) 
				{
					week=0;
					System.out.println();
				}
			}
			
	}

}
