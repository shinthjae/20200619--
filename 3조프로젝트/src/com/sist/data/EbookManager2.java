package com.sist.data;

import java.io.FileWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class EbookManager2 { //지역변수중 여기 쓸수 있는 것은 final밖에 없다 
	public void ebookAllData () 
    {
     try {
	    	ArrayList<EbookVO> list=new ArrayList<EbookVO>();
	    	String[] site={
	    			"http://ticket.interpark.com/contents/Ranking/RankList?pKind=P&pCate=&pType=D&pDate=20200804",
	    			"http://ticket.interpark.com/contents/Ranking/RankList?pKind=01011&pCate=&pType=D&pDate=20200804",
	    			"http://ticket.interpark.com/contents/Ranking/RankList?pKind=01009&pCate=&pType=D&pDate=20200804",
	    			"http://ticket.interpark.com/contents/Ranking/RankList?pKind=C&pCate=&pType=D&pDate=20200804",
	    			"http://ticket.interpark.com/contents/Ranking/RankList?pKind=F&pCate=&pType=D&pDate=20200804"
	    			
	    	};
	    	// <a href="/moviedb/main?movieId=135083" class="name_movie"
	    	// HTML (브라우저에서 실행되는 언어) 
	    	// 태그 <> , 속성 
	    	// 화면 UI => 구분  => id(중복이 없다),class(중복이될때)
	    	
	    	int mno=1;
	    	int cno=1; //1,1 //45,2 //78,3 //88,4 //107,5 => 메모장으 긁어오기
	    	
	    	//목록 반복
	    	for(int i=1;i<=1;i++) //1,3 4,6 주석
	    	{
	    		// 사이트 연결해서 데이터를 한번에 읽기 => 메모리 저장 => Document
	    		Document doc=Jsoup.connect("http://ticket.interpark.com/contents/Ranking/RankList?pKind=P&pCate=&pType=D&pDate=20200804").get();
	    	    Elements link=doc.select("div.rankingTitle a");// css
	    	    
	    	    //목록<->상세보기 반복
	    	    for(int j=0;j<link.size();j++)
	    	    {
	    	    	// class Elements extends ArrayList
//	    	    	System.out.println(link.get(j).attr("href"));
	    	    	
	    	    	try { //중간에 해당 항목(출연)이 없는 영화는 예외처리
	    	    		
	    	    	String url="http://book.interpark.com"+link.get(j).attr("href");
	    	    	Document doc2=Jsoup.connect(url).get();
	    	    	
	    	    	//브랜드
	    	    	Element title=doc2.select("div.dt_Name").get(0);
	    	    	System.out.println("제목:"+title.text());
	    	    	//포스터 
	    	    	Element poster=doc2.selectFirst("div.poster img");
	    	    	System.out.println("포스터:"+poster.attr("src"));
	    	    	//가격
	    	    	Element price=doc2.selectFirst("dl.end_price_box strong");
	    	    	System.out.println("가격:"+price.text());
	    	    	//작가
	    	    	Element writer=doc2.select("li.info_lst li a").get(0);
	    	    	System.out.println("작가:"+writer.text());
	    	    	//출판사
	    	    	Element publisher=doc2.select("li.info_lst li a").get(1);
	    	    	System.out.println("출판사:"+publisher.text());
	    	    	//카테고리
	    	    	Element category=doc2.select("li.info_lst li a").get(2);
	    	    	System.out.println("카테고리:"+category.text());
	    	    	//등급
	    	    	Element grade=doc2.select("li.info_lst li ").get(3);
	    	    	System.out.println("등급:"+grade.text());
	    	    	//출판일
	    	    	Element publish=doc2.select("li.info_lst li").get(4);
	    	    	System.out.println("출판일:"+publish.text());
	    	    	//줄거리
    	    	    Element story=doc2.selectFirst("div._synopsis");
    	    	    System.out.println("줄거리:"+story.text());
    	    	    
    	    	    
    	    	    System.out.println(" ");
	    	    	

//    	    	    String msg=mno+"|"+cno+"|"
//	    	    				+title.text()+"|"
//	    	    					+poster.attr("src")+"|"
//	    	    						+price.text()+"|"
//	    	    							+writer.text()+"|"
//	    	    								+publisher.text()+"|"
//	    	    									+category.text()+"|" 
//	    	    										+grade.text()+"|"
//	    	    											+publish.text()+"|" 
//	    	    												+story.text()+"\r\n";
//	    	    													
//	    	    	
//	    	    	// 파일에 저장
//	    	    	FileWriter fw=new FileWriter("c:\\javaDev\\naverseries_ebook4.txt",true);
//	    	    	fw.write(msg);
//	    	    	fw.close();
	    	    	
	    	    	mno++;
	
	    	    	}catch(Exception ex) {}
	    	    	
	    	    	
	    	    }
	    	}
      }catch(Exception ex)
      {
    	   System.out.println(ex.getMessage());// 에러 메세지 출력 
      }
     // finally => 파일 닫기 , 오라클 서버 연결 해제 , 네트워크 서버 
    }
	
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 객체 생성 
		EbookManager2 m=new EbookManager2();
		m.ebookAllData();
		//m.daumNewsData();
	}
}
