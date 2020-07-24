package com.sist.stirng;

import java.io.FileReader;

public class MainClass5 {
//StringBuffer StringBuilder

	/*
	 * 		StringBuffer : 동기화 => 안정성이 더 높음 
	 * 
	 * 		StringBuilder : 비동기화 => 더 빠름 => 중간에 약간의 손실이 있을 수 있음
	 * 
	 * 		======================================================= 문자열 결합 (빅데이터)
	 * 
	 */
	
	public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
		
		//수행시간재기
		
			long start=System.currentTimeMillis();
			//String data="";
			//StringBuffer sb=new StringBuffer();
			StringBuilder sb=new StringBuilder();
	    	FileReader fr=new FileReader("c:\\javaDev\\movie.txt"); 
	    	int i=0;
	    	while((i=fr.read())!=-1)// -1 EOF
	    	{
	    		//data+=String.valueOf((char)i);
	    		sb.append(String.valueOf((char)i));
	    	}
	    	fr.close();
	    	long end=System.currentTimeMillis();
	    	System.out.println("수행시간:"+(end-start));
		}


}
