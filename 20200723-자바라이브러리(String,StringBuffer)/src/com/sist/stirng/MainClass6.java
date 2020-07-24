package com.sist.stirng;
//joint, format, valueOf => static

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//join
		String[] arr= {"홍길동","심청이","박문수","이순신","춘향이"};
		System.out.println(String.join("-",arr));  //=> 홍길동-심청이-박문수-이순신-춘향이
		
		//format
		String str=String.format("%d - %d = %d", 10,2,10-2);
		System.out.println(str); //=> 10 - 2 = 8

	}

}
