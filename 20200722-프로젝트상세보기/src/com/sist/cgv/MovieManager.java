package com.sist.cgv;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager {
//	static MovieVO[] movies=new MovieVO[7];  
//	static
//	{
//		try //(2)
//		{
//			Document doc=Jsoup.connect("http://www.cgv.co.kr/movies/").get();
//			Elements link=doc.select("div.box-contents a");		//<div class="box-contents">
//			int j=0; //중간에 A태그가 하나 있어서, 짝수 빼고 가져오기           		//<a href="/movies/detail-view/?midx=83160">
//			for(int i=0;i<7;i++)
//			{
//				System.out.println("http://www.cgv.co.kr"+link.get(i).attr("href"));
//				Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get(); //(3)
////				Element title=doc2.select().get(0);
//				Element title=doc2.selectFirst("div.title strong"); // 처음 하나만 가져온다
//				System.out.println(title.text());
//				j+=2;
//			}
//		}catch(Exception ex){}
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new MovieManager();
//	}
	
	 static MovieVO[] movies=new MovieVO[7];
	    static
	    {
	    	try
	    	{
	    		// <a href="/movies/detail-view/?midx=83160">
	    		// <a>aaaa</a> text()
	    		Document doc=Jsoup.connect("http://www.cgv.co.kr/movies/").get();
	    		Elements link=doc.select("div.box-contents a");
	    		int j=0;
	    		for(int i=0;i<7;i++)
	    		{
	    			movies[i]=new MovieVO(); //(10) 데이터 완성되면
	    			//System.out.println("http://www.cgv.co.kr"+link.get(j).attr("href")); //(13)출력주석처리
	    			Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get();
	    			Element title=doc2.selectFirst("div.title strong");
	    			Element poster=doc2.selectFirst("span.thumb-image img"); //(4)
	    			Element grade=doc2.selectFirst("span.ico-grade");
	    			Element reserve=doc2.selectFirst("strong.percent span");
//	    			Elements dt=doc2.select("div.spec dd");//dd(dt안되면) 긁기 (5)
//	    			for(int k=0;k<dt.size();k++)
//	    			{
//	    				System.out.println("==========");
//	    				System.out.println(dt.get(k).text());
//	    				System.out.println("=========="); 
//	    			}
	    			Element director=doc2.select("div.spec dd").get(0); //(6) => 감독 가져오기
	    			//System.out.println(director.text()); //(6) 
	    			movies[i].setDirector(director.text()); //(11)
	    			
	    			Element actor=doc2.select("div.spec dd").get(2); //(7) 배우 get(2)=>3번째
    				//System.out.println(actor.text());
    				movies[i].setActor(actor.text());
    				
    				Element etc=doc2.select("div.spec dd").get(4); //(8) 
    				//System.out.println(etc.text());
    				String[] temp=etc.text().split(","); //(12) 기본 :전체, 128분, 미국  이렇게 나와서 콤바로 배열 자르고 
    				movies[i].setTime(temp[1].trim());
        			movies[i].setFrom(temp[2].trim());
    				
    				Element regdate=doc2.select("div.spec dd").get(5); //(8) 
    				//System.out.println(regdate.text());
    				movies[i].setRegdate(regdate.text());
    				
    				if(i==0)
    				{
    					Element genre=doc2.select("div.spec dd").get(3); //(9) dt3 번째
    					//System.out.println(genre.text());
    					movies[i].setRegdate(genre.text().substring(genre.text().indexOf(":")+1)); //클론: 뒤에서짤라라
    				}
    				else
    				{
    					Element genre=doc2.select("div.spec dd").get(2); //(9) 상세보기마다 순서가 달라서 몇번째 위치해있는지 보고 get()으로 순서 기입 
    					//System.out.println(genre.text());
    					movies[i].setRegdate(genre.text().substring(genre.text().indexOf(":")+1));
    				}

//    				if(i==0) 
//	    			{
//	    				Element actor=doc2.select("div.spec dd").get(2); //공백을 만들어둬서 안써도됨
//	    				System.out.println(actor.text());
//	    			}
//	    			else
//	    			{
//	    				Element actor=doc2.select("div.spec dd").get(1);
//	    				System.out.println(actor.text());
//	    			}
	    			//System.out.println(title.text());
	    			movies[i].setTitle(title.text()); //(11)
	    			//System.out.println(poster.attr("src")); //(4)
	    			movies[i].setPoster(poster.attr("src"));
	    			//System.out.println(grade.text());
	    			movies[i].setGrade(grade.text());
	    			//System.out.println(reserve.text());
	    			movies[i].setReserve(reserve.text());
	    			movies[i].setMno(i+1);//(14)
	    			
	    			Element story=doc2.selectFirst("div.sect-story-movie"); //(15)
	    			movies[i].setStory(story.text());
	    			j+=2;
	    		}
	    	}catch(Exception ex){}
	    }
		/*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * MovieManager m=new MovieManager(); for(MovieVO vo:movies) //(14) {
		 * System.out.println("============================");
		 * System.out.println("영화번호:"+vo.getMno());
		 * System.out.println("포스터:"+vo.getPoster());
		 * System.out.println("제목:"+vo.getTitle());
		 * System.out.println("감독:"+vo.getDirector());
		 * System.out.println("출연:"+vo.getActor());
		 * System.out.println("장르:"+vo.getGenre());
		 * System.out.println("등급:"+vo.getGrade());
		 * System.out.println("상영시간:"+vo.getTime());
		 * System.out.println("국가:"+vo.getFrom());
		 * System.out.println("상영일:"+vo.getRegdate());
		 * System.out.println("예매일:"+vo.getReserve());
		 * System.out.println("줄거리:"+vo.getStory());
		 * 
		 * } }
		 */

}
