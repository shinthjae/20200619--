package com.sist.stirng;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

/*
 * 		Find
 * 		  => 포함 contains()   
 * 		  => 시작 문자열 startsWith()
 * 		  => 끝 문자열 endsWith()
 * 
 */

public class MainClass2 {
	public void find(String ss)
	{
		try
		{
			for(int i=1;i<=3;i++) // 다음영화 총 3페이지
			{
				Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get(); //페이지 긁어오기 // page 숫자 지우고 +i
				Elements title=doc.select("a.name_movie");
				
				for(int j=0;j<title.size();j++)
				{
					
					// boolean java.lang.String.endsWith(String suffix)
	    			// boolean java.lang.String.startsWith(String prefix)
					// boolean java.lang.String.contains(CharSequence s)
					if(title.get(j).text().endsWith(ss))
					if(title.get(j).text().startsWith(ss))
//					if(title.get(j).text().contains(ss)) // (1)포함된 단어 수색
						
					{
						System.out.println(title.get(j).text());
					}
				}
			}
			
		}catch(Exception ex) {}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
//		Scanner scan=new Scanner(System.in);
//		System.out.print("검색어:");
//		String ss=scan.next();
		m.find("");

	}

}
