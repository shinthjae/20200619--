package com.sist.util;

/*
 * 		java.util 	=> ���α׷����� ���� ����ϴ� Ŭ������ ����

 * 		      		=> �ݵ�� import�� ����Ѵ�		
 */
import java.util.*;
/*
 * 		Random
 * 	�ڡڡ�	StringTokenier
 * 	�ڡڡ�	Date
 * 		Calendar
 * 	�ڡڡ�	ArrayList , Vector
 * 	�ڡڡ�	HashMap
 * 		==========================
 * 		= regex
 * 		= reflext
 * 		==========================
 */
public class MainClass {
	/*
	 *  Random() => ���� (���Ǽ��� ��ǻ�Ͱ� ����)
	 *  ========
	 *  	=>  ���� 	=> nextInt() => 0 ~ 21�� 4õ(int����)
	 *  			=> nextInt(int n) ==> �����ε�	=>	������ ������ ������ ���� ���´�
	 *  											n���� ����
	 *  			=> nextInt(100) => 0 ~ 99 => 0 ~100 nextInt(101)
	 *  			  =============================================== ststic�� �ƴϴ�
	 *  			     �ν��Ͻ�
	 *  
	 *  				ststic => Random.nextInt()
	 *  				intstancce => ����
	 *  								Random r=new Random();
	 *  								r.nextInt()
	 *  
	 *  				static => �����ϰ� ���ÿ� ����
	 *  				instance => �޸� �Ҵ�ÿ� ����
	 *  							=========
	 *  								new������()
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
			//����� ���Ǹ޼ҵ�� �ڵ� ȣ���� ����
			
	}

}
