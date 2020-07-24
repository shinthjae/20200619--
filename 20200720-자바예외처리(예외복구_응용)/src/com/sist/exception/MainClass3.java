package com.sist.exception;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*<ul class="list-toplist-slider" style="width: 531px;">
<li>
  <img class="center-croping" alt="티라미수 맛집 베스트 50곳 사진"
       data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rjo80nepigkxn637.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

  <a href="/top_lists/633_tiramisu"
     onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;LMUMANJ&quot;});">
    <figure class="ls-item">
      <figcaption class="info">
        <div class="info_inner_wrap">                            			//(7-1)Elements title=doc.select(""); 
          <span class="title">티라미수 맛집 베스트 50곳</span>
          <p class="desc">"최애 디저트는 당근 티라미수 아니겠어?"</p>*/ //(6)


public class MainClass3 {
	
	public static CategoryVO[] categoryListData() //(10) 
	{
		CategoryVO[] cate=new CategoryVO[10]; //맛집 10개 정보 데이터 모으는 클래스 => [10]배열
		
		
		try //(11)아래코드들 복사붙여넣기
		{
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get(); // Document => jsoup
//		System.out.println(doc);  //(2) url페이지소스불러온다
		
		Elements title=doc.select("div.info_inner_wrap span.title");  //(7) Elements => jsoup
		Elements subject=doc.select("div.info_inner_wrap p.desc");
		Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
//		Elements link=doc.select("");
		
		/*
		 *  <p>aaa</p>   ==> p.text() 태그안
		 *  <p src="">   ==> p.attr() 태그밖
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
			
			
//			try //(9) //(데이터수집) 위치에 category.txt 저장, 뒤에 true를 줘야함
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
			ex.printStackTrace(); // 어디서 에러났는 확인 코드
		}
		return cate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// URL ==> https://www.mangoplate.com/ ==> CheckException 	//(1)
		
		try //(1)
		{
		Document doc=Jsoup.connect("https://www.mangoplate.com/").get(); // Document => jsoup
//		System.out.println(doc);  //(2) url페이지소스불러온다
		
		Elements title=doc.select("div.info_inner_wrap span.title");  //(7) Elements => jsoup
		Elements subject=doc.select("div.info_inner_wrap p.desc");
		Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
//		Elements link=doc.select("");
		
		/*
		 *  <p>aaa</p>   ==> p.text() 태그안
		 *  <p src="">   ==> p.attr() 태그밖
		 */
		for(int i=0;i<10;i++) //(8)
		{
			System.out.println("=====================================");
			System.out.println(title.get(i).text());
			System.out.println(subject.get(i).text());
			System.out.println(poster.get(i).attr("data-lazy"));
			
			
			
//			try //(9) //(데이터수집) 위치에 category.txt 저장, 뒤에 true를 줘야함
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
			ex.printStackTrace(); // 어디서 에러났는 확인 코드
		}
	}

}
