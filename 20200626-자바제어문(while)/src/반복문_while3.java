//202006226(3)
/*
 * 		데이터형
 * 		======
 * 			정수
 * 			= byte (-128~127)
 * 			= int (-21억4천~21억4천)
 * 			= long
 * 			실수
 * 			= double
 * 			문자
 * 			= char
 * 			논리
 * 			= boolean(true/false)
 * 			============================ 기본형
 * 			
 * 		 	참조형 변수: 배열,클래스
 * 			========
 * 		  	문자열 저장 변수 => String
 * 		  	형식)
 * 				char c='A' => 문자 한개만 저장
 * 				String s="ABCDEFG" ==> 웹,윈도우 (모든 데이터 문자열)
 * 				====== =
 * 				데이터형   변수
 * 				
 * 				==> String : 클래스
 * 					기능 (제공)
 * 
 * 					=> 문자 갯수
 * 					    String s="ABXDEF";
 * 						s.length() => 6개   ===> ex) 비밀번호
 * 
 * 					=> String s="ABXDEF";
 * 						=> s.charAt(0) ==> 'A'
 * 
 *  	p.468~478 String의 기능 외우기
 * 
 * 
 */
// 사용자가 문자열을 입력
// 대문자 갯수, 소문자 갯수 확인

import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="ABXDEFG"; // 문자 여러개 저장
//		System.out.println(s); 
		
		String s=""; 
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열을 입력하세요>>");
		s=scan.next(); //String으로 받은 값을 저장
//		s=scan.nextLine(); //공백인식(Scanner는 공백을 주면 다른 값으로 인식하기 때문에 여기서  nextLine을 쓰면 공백이 띄어진다)
		System.out.println(s);
		System.out.println("갯수:"+s.length());  
		
		
		//a=>소문자 갯수, b=대문자 갯수
		
//		int a=0,b=0; 
//		int i=0; //문자의 갯수마큼 증가하는 번수 => 루프변수
//		/*
//		 * 		ABCDEFG  ==>7
//		 * 		======
//		 * 		0123456
//		 */
//		while (i<s.length())
//		{
//			char c=s.charAt(i);
//			if(c>='A' && c<='Z')
//				b++; // 갯수 확 ==> 합+=
//			if(c>='a' && c<='z')
//				a++;
//			i++;
//		}
//			System.out.println("대문자 갯수:+b");
//			System.out.println("소문자 갯수:+a");
		}

	}


