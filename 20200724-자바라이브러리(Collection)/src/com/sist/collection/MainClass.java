package com.sist.collection;

import java.util.ArrayList;

/*
 * 		Collection
 * 		=========== 자료구조
 * 		메모리 저장해서 사용시 편리하게 사용이 가능
 * 		=> 사용되는 프로그램 : 입출력 => CURD => 단점 1. (메모리)-메모리에 저장하는 것이기 때문에  끄면 끝 그래서 <=> 파일 연결
 * 									 => 단점 2. 모든 데이터 저장이 가능
 * 									 CURD => 읽기,저장,삭제,수정,저장갯수
 * 									  라이브러리 => 모든개발자 동일화 => 표준화
 * 										읽기 : get(0)
 * 								    	갯수 : size()
 * 										수정 : set()
 * 										삭제 : remove:
 * 										저장 : add()
 * 		=> 가변형 => 배열
 * 		=> 종류
 * 
 * 
 * 
 * 		1) 순서가 존재 중복된 데이터 추가  =====> 데이터베이스
 * 			List
 * 				=> 구현한 클래스
 * 		★★★		ArratList
 * 		★★★		Vector
 * 				LinkedList
 * 				Queue
 * 				Stack
 * 			
 * 		2) 순서가 없고 중복이 없는 데이터 추가  ======> 탐색기
 * 			Set
 * 				HashSet
 * 				TreeSet
 * 			
 * 		3) 키,데이터 ==> 두개를 동시에 저장 =====> 클래스관리(Spring)
 * 			Map
 * 				Hashtable
 * 	★★★			HashMap
 * 			
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
        // 추가 
		/*
		 * list.add(10);//0 list.add(10.5);//1 list.add("홍길동");//2 list.add('A');//3 //
		 * 값 읽기 int a=(int)list.get(0); double d=(double)list.get(1); String
		 * s=(String)list.get(2); char c=(char)list.get(3);
		 * 
		 * System.out.println(a); System.out.println(d); System.out.println(s);
		 * System.out.println(c);
		 */
		
		list.add("홍길동"); //0
		list.add("심청이"); //1
		list.add("이순신"); //2 => 2번삭제 
		list.add("박문수"); //3 			=>2번
		list.add("춘향이"); //4			=>3번
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		System.out.println();
		
		
		list.remove(2); //2번삭제 => 다음 차례가 번호가 2번이 됨 => 자동으로 바꿔줘서 편리함
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		System.out.println();
		
		list.add(1,"강감찬"); //"강감찬" 1번 추가 => 원래 1번 심청이는 자동으로 2번이 됨
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		System.out.println();
	}
		
}


