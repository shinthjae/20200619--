package com.sist.stirng;

/*
 * 		java.lang
 * 		=========
 * 
 * 		  String / StirngBuffer
 * 		  ======
 * 			1) 문자열은 주소다 => "Hello","Java"...
 * 			2) char[] => 제어하는 클래스
 * 			3) 주요 ㅈ능(메소드)
 * 					1. langth()
 * 					2. trim() : 좌우 공백제거
 * 					3. substring() : 문자분해
 * 					4. indexOf() , lastIntexOf() : 문자위치
 * 					5. equals() : 저장된 문자를 비교
 * 					6. 찾기 ==>
 * 						포함 : contains
 * 						시작 : startsWith
 * 						 끝   : endsWith
 * 			============================================== 여기까지 인스턴스 메소드
 * 					7. static 메소드 : valueOf() => 모든 기뵨형을 문자열로 변한
 * 
 * 
 *			String s1="Hello"
 *				s1.length()
 *			String s2="Hello Java"                                                                                                                                                                                                      
 * 				s2.length()
 * 
 * 			Stirng.valueOf()
 */
public class MainClass {
	
	/*
	 * 	String s="0123456789"
	 * 	s.substring(3,7) end-1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 자르기
		String s="background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'")); //s.substring은 그 앞에부터 자르기때문에 +1해줘야한다 반면 lastIndexOf는 앞에서 제외되므로 괜찮음
		System.out.println(temp.trim()); //자른 값에 공백이 있으면 url경우 곤란하기때문에 trim으로 공백제거 해줘야
		
		
		//문자열이 길어 웹페이지 폼이 뭉개지는거 방지 +> ...
		String ss="예쁜 서해바다를 보면서 즐기는 애프터눈티. 조식먹는 곳 보다 뷰가 시원하지 않은게 아쉽지만 날 좋은 때 오후를 보내기에 나쁘지 않다. 샌드위치는";
		if(ss.length()>20) //ss 문자열리 20글자보다 크다면
		{
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		
		
		//new 사용하면 새로운 생성자가 생겨서 메모리(주소)가 다르기 때문에  == 사용하지않고 equals를 사용한다 
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		/*
		 * if(s1==s3) { System.out.println("s1==s3"); } else {
		 * System.out.println("s1!=s3"); }
		 */
		
		/*
		 * 	equalsIgnoreCase : 대소문자 구분이 없다 => 예)검색기능
		 * 	equals : 대소문자 구분 있음 => 예)로그인,중복체크
		 */
		if(s1.equals(s3))
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		} //=> s1==s3
		
		if(s1.equalsIgnoreCase(s3))
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		} //=>s1==s3
		
		
	}

}
