package com.sist.util;

import java.util.Calendar;
import java.util.Scanner;

// Calender ==> 요일, 마지막날짜
// 날짜관련
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 클래스 생성 
				Calendar cal=Calendar.getInstance();// 싱클턴 패턴 => 메모리를 한개만 생성 
				// 시스템의 실제 날짜를 읽어 온다 
				/*
				 * System.out.println(cal.get(Calendar.YEAR));
				 * System.out.println(cal.get(Calendar.MONTH)+1);
				 * System.out.println(cal.get(Calendar.DATE));
				 * System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); int
				 * week=cal.get(Calendar.DAY_OF_WEEK)-1;
				 */
				String[] strWeek={"일","월","화","수","목","금","토"};
				/*
				 * System.out.println(strWeek[week]+"요일");
				 * System.out.println(cal.getActualMaximum(Calendar.DATE));
				 */
				Scanner scan=new Scanner(System.in);
				System.out.print("년도 입력:");
				int year=scan.nextInt();
				
				System.out.print("월 입력:");
				int month=scan.nextInt();
				
				//System.out.print("일 입력:");
				//int day=scan.nextInt();
				
				cal.set(Calendar.YEAR,year);
				cal.set(Calendar.MONTH,month-1); //0-1
				cal.set(Calendar.DATE, 1);
				
				 System.out.println(cal.get(Calendar.YEAR));
				 System.out.println(cal.get(Calendar.MONTH)+1);
				 System.out.println(cal.get(Calendar.DATE));
				 System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); int
				 week=cal.get(Calendar.DAY_OF_WEEK)-1;
				 
				 System.out.println(strWeek[week]+"요일");
				
				
			}

}
