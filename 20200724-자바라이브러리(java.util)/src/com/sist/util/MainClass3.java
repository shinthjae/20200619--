package com.sist.util; 
//p.507
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; //5~14
		
		String day="";
		for(int i=0;i<resDay.length;i++)
		{
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0, day.lastIndexOf("|")); // lastIndexOf("|") ¸¶Áö¸· ¿À¾Æ Á¦°Å
		
		System.out.println(day);
		
		
		
		
		
		// ³¯Â¥º° ºĞ¸®
		String[] resdays=day.split("\\|");
		
		/*
		 *    Á¤±Ô½Ä
		 *     ^ => ½ÃÀÛ ¹®ÀÚ    ^A  => ^[°¡-ÆR] ^[A-Za-z] ^[0-9]
		 *                          [^°¡-ÆR] => Á¦¿Ü 
		 *     $ => ³¡¹®ÀÚ
		 *     . => ÀÓÀÇÀÇ ÇÑ±ÛÀÚ(¸ğµç±ÛÀÚ) ==> \\.
		 *     | => ¼±ÅÃ
		 *     ? => ÀÖÀ¸¸éÃâ·Â, ¾øÀ¸¸é ¹ÌÃâ·Â
		 */
		for(String s:resdays)
		{
			System.out.println(s);
		}
		
		System.out.println("===========StirngTokenizer=====");
		
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens())

			System.out.println(st.nextToken());
		}
		
	}

