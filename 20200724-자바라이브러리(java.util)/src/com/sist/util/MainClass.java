package com.sist.util;

/*
 * 		java.util 	=> 프로그램에서 많이 사용하는 클래스의 집합

 * 		      		=> 반드시 import를 사용한다		
 */
import java.util.*;
/*
 * 		Random
 * 	★★★	StringTokenier
 * 	★★★	Date
 * 		Calendar
 * 	★★★	ArrayList , Vector
 * 	★★★	HashMap
 * 		==========================
 * 		= regex
 * 		= reflext
 * 		==========================
 */
public class MainClass {
	/*
	 *  Random() => 난수 (임의수를 컴퓨터가 결정)
	 *  ========
	 *  	=>  정수 	=> nextInt() => 0 ~ 21억 4천(int범위)
	 *  			=> nextInt(int n) ==> 오버로딩	=>	지정된 범위의 사이의 수가 나온다
	 *  											n번은 제외
	 *  			=> nextInt(100) => 0 ~ 99 => 0 ~100 nextInt(101)
	 *  			  =============================================== ststic이 아니다
	 *  			     인스턴스
	 *  
	 *  				ststic => Random.nextInt()
	 *  				intstancce => 저장
	 *  								Random r=new Random();
	 *  								r.nextInt()
	 *  
	 *  				static => 컴파일과 동시에 저장
	 *  				instance => 메모리 할당시에 저장
	 *  							=========
	 *  								new생성자()
	 *  
	 *  		String s1="Hello Java";
	 *  		String s2="Hello Oracle";	
	 */
	
	public void random() {
		Random r=new Random();
		int a=r.nextInt();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			MainClass m=new MainClass();
			m.random();
			MainClass m1=new MainClass();
			m.random();
			//MainClass.random();
			//사용자 정의메소드는 자동 호출이 없다
			
	}

}
