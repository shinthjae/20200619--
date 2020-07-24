//1

/*
 * 		순차적인 코딩 => 구조화된 코딩(메소드)
 * 		========   기능병로 묶어서 사용이 가능 (재사용, 코드의 중복을 제거)
 * 									    ==== 수정,추가를  편리하게 만드는 프로그램
 * 
 * 		1. 사용자로부터 '년도', '월'을 받는다
 * 		2. 요일을 구한다 ==> 세분화 
 * 		3. 해당 요일부터 달력을 출력한다
 */

import java.util.*;
public class 달력만들기_절차적언어 {
	static void process(int year,int month) // 메소드와 메소드를 연결하려면 매개변수가 있어야
	{										// 지역변수를 다른 메소드에서 사용할때는 ==> 매개변수를 이용해서 전송
		System.out.println(year+"년도"+month+"월");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.사용자 입력값 받기
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:"); // 입력된 데이터를 메모리에 저장
		int year=scan.nextInt();
		
		System.out.print("월 입력:"); // 입력된 데이터를 메모리에 저장
		int month=scan.nextInt(); // 저장딘 year,month =>main이 끝날때까지 사용이 가능
		
//		process(year,month);
		
		
		// 2.요일구하기
		//		1) 전년도까지의 총 날수를 구하기 (year-1) 2020 => 1.1.1~2019.12.31
		int total=(year-1)*365
					+(year-1)/4 	// 4년마다 1번씩
					-(year-1)/100 	// 100년마다 1번씩
					+(year-1)/400; 	// 400년마다 1번씩 
									//	=> 윤년구하기
		
		//		2) 전달까지의 총 날수
		//			3 ===> total+31+28
		//			4 ===> total+31+28+31
		int[] lastDay= {
				31,28,31,30,31,30,
				31,31,30,31,30,31
		};
		
		// 요청 날짜 윤년이면 => lastDay[1]=29
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastDay[i];
		}
		
		// 요청한 달의 1일자의 요일 구하기
		total++;
		
		// 요일 구하기     // 1년 1월 1일 => 월요일 부터
		int week=total%7;
		
		// 출력 (달력)
		System.out.println(year+"년도"+month+"월");
		
//		System.out.print("일\t");
//		System.out.print("월\t");
//		System.out.print("화\t");
//		System.out.print("수\t");
//		System.out.print("목\t");
//		System.out.print("금\t");
//		System.out.print("토\t");
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.print("\n\n");
		
		// 달력 출력
		for(int i=1;i<=lastDay[month-1];i++) // 인덱스 0부터 시작해서 -1로 맞춘다
		{
			///공백
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
		// 1부터 출력
			System.out.printf("%2d\t",i);
		// 요일 증가
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
			}
	}

}
