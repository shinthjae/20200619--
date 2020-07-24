import java.util.Scanner;

//20200707(1)
/*
 *	메소드  : 	한가지 기능만 수행 => 다음에 다시 사용할 수 있게 만든다
 * 			목적
 * 				=> 재사용
 * 				=> 반복 제거
 *	형식)
 *		반환형이 없는 경우 : void
 *		매개변수가 없는 경우 (매개변수 => 주로 사용자가 요청한 값)
 *		반환형이 존재 => 사용자가 요청한 내용의 결과값 => 반드시 한개만 존재
 *					  여러개일 경우 : 배열, 클래스
 *		매가변수가 존재 => 아이디 중복체크(=> id), 우편번호 검색(동, 길)
 *					     로그인(id, password)
 *		반환형(리턴형) 메소드명(매개변수, 매개변수..)
 *	 	{
 *			종료 => return => 
 *		}
 *
 *		void process()
 *		{
 *			if(key==ENTER)
 *			{
 *				return;  // 강제로 종료
 *				System.out.println(); ==> 오류
 *			}
 *			동작
 *			return;	=> return문장 밑에는 소스 코딩을 할 수 없다
 *		 	제어
 *			= break
 *			= continue
 *			= return
 *		}
 *		
 *		선언
 *		int add(int a, int b)
 *		{
 *			return a+b;
 *		}
 *
 *		호출
 *		int a= add(10,20)
 *
 *
 *		void선언
 *		void add(int a, int b)
 *
 *		void선언
 *		add(10,20)
 *
 *		호출시마다 => 메소드 처음부터 => return까지 수행 => 다시 호출한 위치 돌아온다
 *		
 */

// 사용자가 년도를 입력하면 달력 생성 윤년여부 
// 다음에 '다시 사용(재활용)'할 수 있나? '수정'이 가능한가? '추가'가 가능한가?

/*
 *  사이트에 포함된 기본적인 4가지
 *  ====
 *   = 로그인
 *   = 회원가입
 *   = 게시판 
 *   = 공지사항
 */
import java.util.*;
public class 자바메소드 {
	// 사용자 입력 => 년도
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력:");
		int year=scan.nextInt();
		return year;
	}
	// 윤년여부를 확인하는 기능 ==> 재사용
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100==0 || year%400==0))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=========================================================================
//		Scanner scan=new Scanner(System.in);
//		System.out.print("년도를 입력:");
//		int year=scan.nextInt();
//		
//		if((year%4==0 && year%100==0 || year%400==0))
//		{
//			System.out.println(year+"년도는 윤년입니다");
//		}
//		else
//		{
//			System.out.println(year+"년도는 윤년이 아닙니다");
//		}
		//=====================================================> 이렇게 하면 재사용을 못한다
		
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
	
		

	}

}
