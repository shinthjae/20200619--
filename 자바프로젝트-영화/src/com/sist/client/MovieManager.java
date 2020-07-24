package com.sist.client;

import java.io.*; 


 
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.data.BackListVO;

public class MovieManager { 
	static BackListVO[] movies=new BackListVO[10];
    static
    {
    	try
    	{
    		Document doc=Jsoup.connect("http://www.cgv.co.kr/movies/").get();
    		Elements link=doc.select("div.box-contents a");
    		int j=0;
    		for(int i=0;i<10;i++)
    		{
    			movies[i]=new BackListVO(); //(10) ������ �ϼ��Ǹ�
    
    			Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get();
    			Element title=doc2.selectFirst("div.title strong");
    			Element poster=doc2.selectFirst("span.thumb-image img"); //(4)
    			Element grade=doc2.selectFirst("span.ico-grade");
    			Element reserve=doc2.selectFirst("strong.percent span");


    			Element director=doc2.select("div.spec dd").get(0); //(6) => ���� ��������
    			
    			movies[i].setDirector(director.text()); //(11)
    			
    			Element actor=doc2.select("div.spec dd").get(2); //(7) ��� get(2)=>3��°
				
				movies[i].setActor(actor.text());
				
				Element etc=doc2.select("div.spec dd").get(4); //(8) 
				
				
				Element regdate=doc2.select("div.spec dd").get(5); //(8) 
			
				movies[i].setRegdate(regdate.text());
				
				if(i==0)
				{
					Element genre=doc2.select("div.spec dd").get(3); //(9) dt3 ��°
					
					movies[i].setRegdate(genre.text().substring(genre.text().indexOf(":")+1)); //Ŭ��: �ڿ���©���
				}
				else
				{
					Element genre=doc2.select("div.spec dd").get(2); //(9) �󼼺��⸶�� ������ �޶� ���° ��ġ���ִ��� ���� get()���� ���� ���� 
				
					movies[i].setRegdate(genre.text().substring(genre.text().indexOf(":")+1));
				}


    			movies[i].setTitle(title.text()); //(11)
    			movies[i].setPoster(poster.attr("src"));
    			movies[i].setGrade(grade.text());
    			movies[i].setReserve(reserve.text());
    			movies[i].setMno(i+1);//(14)
    			
    			Element story=doc2.selectFirst("div.sect-story-movie"); //(15)
    			movies[i].setStory(story.text());
    			j+=2;
    		}
    	}catch(Exception ex){}
    }
}
