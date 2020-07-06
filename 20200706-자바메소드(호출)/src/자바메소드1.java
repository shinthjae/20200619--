
//		프로그램(저장된 데이터 + 명령문)
//		변수 ==> 배열 ==>클래스 ==> 파일 ==> 데이터베이스
//		==========
//		명령문 ==:> 메소드(한개의 가능) ==> 클래스 ==> 패키지 ==> .jar(라이브러리)
//		====		


//		메소드 
//			= 사용자정의 매소드
//				=형식)
//						반환형 메소드명(매개변수...)
//						{
//							return 값; => 값=변환형
//							반환형이 없는 경우에는 => void, return은 생략이 가능
//						}
//						
//						==>메소드안에서 처리> 출력
//						   ======일반 도스
//						==>메소드안에서 처리 => 결고값을 전송 할 수 있다 
//						   ====== 웹, 윈도우
//						   
//				=호출)
//					메소드
//					=>void method(int a,int b)
//					=>method(10,20)
//					메소드를 호출하고 ==> 메소드가 수행이 종료
//					=다시 호출된 위치로 돌아온다
//					
//					=>int method()
//					=>호출
//					int a=method()
//					
//					=> String 
//					
//					=> double methoid(int a)
//						=> 호출
//						double d=method(10) => int a=10
//				   void peintln()
//						
//						
//						
//					=>double random()
//					=> String substing(int s)
//					=>boolean equals(Sting s)
//					=>void printlm()
//					
//					
//					반환값(리턴형) 매개변수
//						0		0 String substring(int s, inte)
//						0	    X int length()
//							      double random!
//						X       0 sysout
//						X       X
//						
//						
//						
//						
//	    = 라이브러리
//		메소드 : 특정 작업을 수행하기 위한 컴퓨터 명령문의 집합
//			  *** 한가지 일만 수행
//			  *** 세분화 작업
//			  	  ======= 재사용의 목적 ==> import
//			  	  목적: 재사용성, 중복된 코드 제거
//			  	  사용법: 구조화(단락(기능))
//			  	  
//			  예) 숫자 야구 게임
//			    = 3자리 정수의 난수 발생
//				= 사용자에게 입력을 요청
//				= 난수와 사용자 입력값을 비교
//				= 힌트
//				= 정답일 경우에 종료
//				= 다시 게임을 할지 여부 확인
				
// 실행형식 => 메소드가 종료해야 => 다른 문장을 수행한다				

/*
 * 			1)목록찾기
 * 			2) 찾기(검색)
 * 			3) 수정
 * 			4) 삭제 
 * 			5) 추가
 * 			  ====> 판배
 */
public class 자바메소드1 {
	static void aaa()
	{
		System.out.println(" 호출시작..."); //첫번째 호출
		bbb(); //bbb() 이동
		System.out.println("aaa() 호출종료...");
	}
	static void bbb()
	{
		System.out.println("bbb() 호출시작...");
		ccc();//2
		System.out.println("bbb() 호출종료...");
	}
		
	static void ccc()
	{
		System.out.println("ccc() 호출시작..."); //3
		ddd();
		System.out.println("ccc() 호출종료...");
	}
	static void ddd()
	{
		System.out.println("ddd() 호출시작..."); //14
		System.out.println("ddd() 호출종료...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa(); //시작하는 메소드를 효출(

	}

}
