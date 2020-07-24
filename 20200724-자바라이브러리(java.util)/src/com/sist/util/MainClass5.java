package com.sist.util;
import java.util.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		//요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		//출력
//		System.out.print("요일:"+strWeek[week]);
//		System.out.print("마지막날짜:"+lastday);
		
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t"); 
		} 
		
		System.out.println();
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++; 
			if(week>6) //일요일인지 확인
			{
				week=0;
				System.out.println();
				
			}
		}
	}

}
