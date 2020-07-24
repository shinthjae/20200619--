package com.sist.stirng;
// StringBuffer : 문자열을 결합할 경우  ==> append()
import java.io.*; // CheckExceotin => 예외처리를 하고 사용

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
	        {
	        	// 파일 읽기 
	        	//String data="";
	        	StringBuffer data=new StringBuffer();
	        	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
	        	int i=0;
	        	while((i=fr.read())!=-1)// -1 EOF
	        	{
	        		data.append(String.valueOf((char)i));
	        	}
	        	fr.close();
	        	
	        	System.out.println(data.toString());
	        }catch(Exception ex){}
		}

}
