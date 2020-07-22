package com.sist.data;

import java.io.FileWriter;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*<ul class="list-toplist-slider" style="width: 531px;">
<li>
  <img class="center-croping" alt="Ƽ��̼� ���� ����Ʈ 50�� ����"
       data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rjo80nepigkxn637.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

  <a href="/top_lists/633_tiramisu"
     onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;�ϰ� ���� ���� ����Ʈ&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;LMUMANJ&quot;});">
    <figure class="ls-item">
      <figcaption class="info">
        <div class="info_inner_wrap">                            			//(7-1)Elements title=doc.select(""); 
          <span class="title">Ƽ��̼� ���� ����Ʈ 50��</span>
          <p class="desc">"�־� ����Ʈ�� ��� Ƽ��̼� �ƴϰھ�?"</p>*/ //(6)


public class MainClass3 {
	
	public static FoodHouseVO[] categoryFoodData() //[1]
	{
		FoodHouseVO[] food=new FoodHouseVO[10];//10qoduf 10���� ��ƴ޶�
		try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
			
			Elements title=doc.select("span.title h3");
			Elements score=doc.select("strong.point span");
			Elements address=doc.select("p.etc");
			Elements poster=doc.select("img.center-croping");
			Elements review=doc.select("p.short_review");
			
			for(int i=0;i<10;i++)
			{
				System.out.println(title.get(i).text());//[3]
				System.out.println(score.get(i).text());
				System.out.println(address.get(i).text());
				System.out.println(title.get(i).text());
				System.out.println(poster.get(i).attr("data-original"));
				System.out.println(review.get(i).text());
				System.out.println("=====================================");
				
				food[i]=new FoodHouseVO(); //[3] ���ڿ� => ������ ��ȭ
				food[i].setTitle(title.get(i).text());
				food[i].setScore(Double.parseDouble(score.get(i).text()));
				//���ڿ� => ������ ��ȯ Double.parseDouble()
				//���ڿ� => ���� Interger.parsString()
				//���ڿ� => �� Boolean.parseBoolean()
				food[i].setAddress(address.get(i).text());
				food[i].setPoster(poster.get(i).attr("data-original"));
				food[i].setReview(review.get(i).text());
				
			}
			
			/*
			 *  <p>aaaaaaaaa</p>
			 *  <p data="aaaaaaa"/>  => attr  
			 */
		}catch(Exception ex)
		{
			ex.printStackTrace(); // ������ġȮ��
		}
		return food;
	}
	
	private static void Main(String[] arg) {
		// TODO Auto-generated method stub
			categoryFoodData();
			
	}
	
	
	
	
	public static CategoryVO[] categoryListData() //(10) 
	{
		CategoryVO[] cate=new CategoryVO[10]; //���� 10�� ���� ������ ������ Ŭ���� => [10]�迭
		
		
		try //(11)�Ʒ��ڵ�� ����ٿ��ֱ�
		{
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get(); // Document => jsoup
//		System.out.println(doc);  //(2) url�������ҽ��ҷ��´�
		
		Elements title=doc.select("div.info_inner_wrap span.title");  //(7) Elements => jsoup
		Elements subject=doc.select("div.info_inner_wrap p.desc");
		Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
//		Elements link=doc.select("");
		
		/*
		 *  <p>aaa</p>   ==> p.text() �±׾�
		 *  <p src="">   ==> p.attr() �±׹�
		 */
		for(int i=0;i<10;i++) //(8)
		{
			System.out.println("=====================================");
			System.out.println(title.get(i).text());
			System.out.println(subject.get(i).text());
			System.out.println(poster.get(i).attr("data-lazy"));
			
			cate[i]=new CategoryVO(); //(11)
			cate[i].setCno(i+1);
			cate[i].setTitle(title.get(i).text());
			cate[i].setSubject(subject.get(i).text());
			cate[i].setPoster(poster.get(i).attr("data-lazy"));
			
			
//			try //(9) //(�����ͼ���) ��ġ�� category.txt ����, �ڿ� true�� �����
//			{
//				String temp=(i+1)+"|"+title.get(i).text()+"|"
//							+subject.get(i).text()+"|"
//							+poster.get(i).attr("data-lazy")+"\r\n";
//				FileWriter fw=new FileWriter("c:\\javaDev\\category.txt",true); 
//	    		fw.write(temp);
//	    		fw.close();
//	    		
//			}catch(Exception ex){ //(1)
//				ex.printStackTrace();
//			}
		}
		
		}catch(Exception ex){ //(1)
			ex.printStackTrace(); // ��� �������� Ȯ�� �ڵ�
		}
		return cate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// URL ==> https://www.mangoplate.com/ ==> CheckException 	//(1)
		
		try //(1)
		{
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get(); // Document => jsoup
//		System.out.println(doc);  //(2) url�������ҽ��ҷ��´�
		
		Elements title=doc.select("div.info_inner_wrap span.title");  //(7) Elements => jsoup
		Elements subject=doc.select("div.info_inner_wrap p.desc");
		Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
//		Elements link=doc.select("");
		
		/*
		 *  <p>aaa</p>   ==> p.text() �±׾�
		 *  <p src="">   ==> p.attr() �±׹�
		 */
		for(int i=0;i<10;i++) //(8)
		{
			System.out.println("=====================================");
			System.out.println(title.get(i).text());
			System.out.println(subject.get(i).text());
			System.out.println(poster.get(i).attr("data-lazy"));
			
			
			
//			try //(9) //(�����ͼ���) ��ġ�� category.txt ����, �ڿ� true�� �����
//			{
//				String temp=(i+1)+"|"+title.get(i).text()+"|"
//							+subject.get(i).text()+"|"
//							+poster.get(i).attr("data-lazy")+"\r\n";
//				FileWriter fw=new FileWriter("c:\\javaDev\\category.txt",true); 
//	    		fw.write(temp);
//	    		fw.close();
//	    		
//			}catch(Exception ex){ //(1)
//				ex.printStackTrace();
//			}
		}
		
		}catch(Exception ex){ //(1)
			ex.printStackTrace(); // ��� �������� Ȯ�� �ڵ�
		}
	}

}
