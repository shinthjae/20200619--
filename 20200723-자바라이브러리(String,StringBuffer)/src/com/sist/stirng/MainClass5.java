package com.sist.stirng;

import java.io.FileReader;

public class MainClass5 {
//StringBuffer StringBuilder

	/*
	 * 		StringBuffer : ����ȭ => �������� �� ���� 
	 * 
	 * 		StringBuilder : �񵿱�ȭ => �� ���� => �߰��� �ణ�� �ս��� ���� �� ����
	 * 
	 * 		======================================================= ���ڿ� ���� (������)
	 * 
	 */
	
	public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
		
		//����ð����
		
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
	    	System.out.println("����ð�:"+(end-start));
		}


}
