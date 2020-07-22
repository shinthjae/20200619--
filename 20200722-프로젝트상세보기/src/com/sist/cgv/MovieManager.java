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
//			int j=0; //�߰��� A�±װ� �ϳ� �־, ¦�� ���� ��������           		//<a href="/movies/detail-view/?midx=83160">
//			for(int i=0;i<7;i++)
//			{
//				System.out.println("http://www.cgv.co.kr"+link.get(i).attr("href"));
//				Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get(); //(3)
////				Element title=doc2.select().get(0);
//				Element title=doc2.selectFirst("div.title strong"); // ó�� �ϳ��� �����´�
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
	    			movies[i]=new MovieVO(); //(10) ������ �ϼ��Ǹ�
	    			//System.out.println("http://www.cgv.co.kr"+link.get(j).attr("href")); //(13)����ּ�ó��
	    			Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get();
	    			Element title=doc2.selectFirst("div.title strong");
	    			Element poster=doc2.selectFirst("span.thumb-image img"); //(4)
	    			Element grade=doc2.selectFirst("span.ico-grade");
	    			Element reserve=doc2.selectFirst("strong.percent span");
//	    			Elements dt=doc2.select("div.spec dd");//dd(dt�ȵǸ�) �ܱ� (5)
//	    			for(int k=0;k<dt.size();k++)
//	    			{
//	    				System.out.println("==========");
//	    				System.out.println(dt.get(k).text());
//	    				System.out.println("=========="); 
//	    			}
	    			Element director=doc2.select("div.spec dd").get(0); //(6) => ���� ��������
	    			//System.out.println(director.text()); //(6) 
	    			movies[i].setDirector(director.text()); //(11)
	    			
	    			Element actor=doc2.select("div.spec dd").get(2); //(7) ��� get(2)=>3��°
    				//System.out.println(actor.text());
    				movies[i].setActor(actor.text());
    				
    				Element etc=doc2.select("div.spec dd").get(4); //(8) 
    				//System.out.println(etc.text());
    				String[] temp=etc.text().split(","); //(12) �⺻ :��ü, 128��, �̱�  �̷��� ���ͼ� �޹ٷ� �迭 �ڸ��� 
    				movies[i].setTime(temp[1].trim());
        			movies[i].setFrom(temp[2].trim());
    				
    				Element regdate=doc2.select("div.spec dd").get(5); //(8) 
    				//System.out.println(regdate.text());
    				movies[i].setRegdate(regdate.text());
    				
    				if(i==0)
    				{
    					Element genre=doc2.select("div.spec dd").get(3); //(9) dt3 ��°
    					//System.out.println(genre.text());
    					movies[i].setRegdate(genre.text().substring(genre.text().indexOf(":")+1)); //Ŭ��: �ڿ���©���
    				}
    				else
    				{
    					Element genre=doc2.select("div.spec dd").get(2); //(9) �󼼺��⸶�� ������ �޶� ���° ��ġ���ִ��� ���� get()���� ���� ���� 
    					//System.out.println(genre.text());
    					movies[i].setRegdate(genre.text().substring(genre.text().indexOf(":")+1));
    				}

//    				if(i==0) 
//	    			{
//	    				Element actor=doc2.select("div.spec dd").get(2); //������ �����ּ� �Ƚᵵ��
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
		 * System.out.println("��ȭ��ȣ:"+vo.getMno());
		 * System.out.println("������:"+vo.getPoster());
		 * System.out.println("����:"+vo.getTitle());
		 * System.out.println("����:"+vo.getDirector());
		 * System.out.println("�⿬:"+vo.getActor());
		 * System.out.println("�帣:"+vo.getGenre());
		 * System.out.println("���:"+vo.getGrade());
		 * System.out.println("�󿵽ð�:"+vo.getTime());
		 * System.out.println("����:"+vo.getFrom());
		 * System.out.println("����:"+vo.getRegdate());
		 * System.out.println("������:"+vo.getReserve());
		 * System.out.println("�ٰŸ�:"+vo.getStory());
		 * 
		 * } }
		 */

}
