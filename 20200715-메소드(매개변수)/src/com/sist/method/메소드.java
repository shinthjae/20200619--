//(1)
package com.sist.method;

/*
 * 	 	=> 메소드
 * 			= 리턴값
 * 			= 매개변수 : 애매한 경우
 * 			printf("%d%d%d",10,20,30)
 * 			printf("%d%f%s",100,10.5,"")
 * 			============================= 가변매개변수 => 값을 애매하게 모를때 Object... => 모든 데이터형 통합해줄때  => web의 경우 多  사용자가 어떤 입력을 할지 몰라서(사용자를 믿지 말라)
 * 			String... a => ...은 기호가 아님 
 * 			Object... obj => 사용자가 데이터형도 확인 안해줄때
 */

public class 메소드 {
	public static void concat(String s,String... s1) // String은 배열형식이라 for-each 써 => 갯수는 상관없어 
	{
		for(String ss:s1)
		{
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat("Hello","홍길동","심청이","박문수","춘향이","이순신"); 
		
//		Object o=10;
//		Object o1=0.5;
//		Object o2='A';
//		Object o3="aaaaa";
//		Object o4=new 메소드();
	}

}
