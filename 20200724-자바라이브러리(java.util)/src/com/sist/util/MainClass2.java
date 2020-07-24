package com.sist.util;
import java.io.StreamTokenizer;

import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String[] data={
	        		"1|2|3|4|5",
	        		"6|7|8",
	        		"10|11",
	        		"10|11|12|13|14|15",
	        		"20|21|22|23|24|25|26|27"
	        };
	        for(int i=0;i<data.length;i++)
	        {
	        	StringTokenizer st=new StringTokenizer(data[i],"|");
//	        	System.out.println(data[i]);
//	        	System.out.println("===========");
	        	while(st.hasMoreTokens())
	        	{
	        		System.out.println(st.nextToken());
	        	}
	        }
		}


}
