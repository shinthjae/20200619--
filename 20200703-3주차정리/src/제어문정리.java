//20200703(4)

/*
 * 		제어문                                                                              //**섞어서 사용 중요
 * 		=====
 * 			1) 조건문
 * 				= 단일조건문 ==> 단독 수행
 * 					=> if(조건문) ------> 조건문(true/false) 비교연산자,논리연산자,부정연산자
 * 						{
 * 							조건문이 true만 수행하는 문장
 * 						}
 * 				= 선택조건문 ==> true/false 나눠서 처리
 * 					=> if(조건문)
 * 						{
 * 							조건문 => true 처리문장
 * 						}
 * 						else
 * 						{		
 * 							조건문 => false 처리문장
 * 						}
 * 						==> ID중복체크 => 경우의 수 
 * 				= 다중조건문 ==> 한개의 조건만 수행 (ex)메뉴창)      
 * 					if(조건문)
 * 					{
 * 					}
 * 					else if(조건문)
 * 					{
 * 					}
 * 					else if(조건문)
 * 					{
 * 					}
 * 				 	else
 * 					{
 * 						조건이 없는 경우에 처리 => 생략이 가능	
 * 					}
 * 				
 * 			2) 선택문	
 * 				=> 조건이 많이 있는 경우에 주로 사용 (web=> 조건=> if)
 * 				=> 게임
 * 				=> 한개의 값을 선택시에 처리
 * 				
 * 				switch(정수,문자 문자열)
 * 				{
 * 					case 정수:
 * 						처리
 * 					 break;
 * 					case 정수:
 * 						처리
 * 					 break;
 * 					case 정수:
 * 						처리
 * 					 break;
 * 					case 정수:
 * 						처리
 * 					 break;
 * 					default:
 * 					  해당 정수가 없는 경우
 * 				}
 * 			3) 반복문
 * 				= for : 횟수가 지정(개수를 알고 있다면)
 * 					= 제어 => 일반 for문 => 값변경, 수정   => 서버 : 받은 내용을 처리 (JSP, Spring, Oracle) 
 * 						for(초기값;조건식;증가식)
 * 						{
 * 							처리문장
 * 							처리문장
 * 						}
 * 					= 출력 => for-each => 클라이언트 : 사용자에게 보여주는 부분 (HTML, CSS)
 * 						for(실제 데이터를 받는 변수:저장된 데이터)
 * 
 * 		
 * 				= while : (셀수 있지만)애매하면 while => 종료 조건(없으면 무한루프)
 * 				= do~while(XXXXXX)
 * 			4) 반복제어문
 * 				break; : 종료
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
