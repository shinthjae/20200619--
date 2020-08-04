package com.sist.data;

import java.io.FileWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class EbookManager1 { //���������� ���� ���� �ִ� ���� final�ۿ� ���� 
	public void ebookAllData () 
    {
     try {
	    	ArrayList<EbookVO> list=new ArrayList<EbookVO>();
	    	String[] site={
	    			"https://series.naver.com/ebook/top100List.nhn?page=",
	    			"https://series.naver.com/ebook/top100List.nhn?page=2",
	    			"https://series.naver.com/ebook/top100List.nhn?page=3",
	    			"https://series.naver.com/ebook/top100List.nhn?page=4",
	    			"https://series.naver.com/ebook/top100List.nhn?page=5"
	    			
	    	};
	    	// <a href="/moviedb/main?movieId=135083" class="name_movie"
	    	// HTML (���������� ����Ǵ� ���) 
	    	// �±� <> , �Ӽ� 
	    	// ȭ�� UI => ����  => id(�ߺ��� ����),class(�ߺ��̵ɶ�)
	    	
	    	int mno=1;
	    	int cno=1; //1,1 //45,2 //78,3 //88,4 //107,5 => �޸����� �ܾ����
	    	
	    	//��� �ݺ�
	    	for(int i=1;i<=1;i++) //1,3 4,6 �ּ�
	    	{
	    		// ����Ʈ �����ؼ� �����͸� �ѹ��� �б� => �޸� ���� => Document
	    		Document doc=Jsoup.connect("https://series.naver.com/ebook/top100List.nhn?page=").get();
	    	    Elements link=doc.select("div.top100 a");// css
	    	    
	    	    //���<->�󼼺��� �ݺ�
	    	    for(int j=0;j<link.size();j++)
	    	    {
	    	    	// class Elements extends ArrayList
//	    	    	System.out.println(link.get(j).attr("href"));
	    	    	
	    	    	try { //�߰��� �ش� �׸�(�⿬)�� ���� ��ȭ�� ����ó��
	    	    		
	    	    	String url="https://series.naver.com"+link.get(j).attr("href");
	    	    	Document doc2=Jsoup.connect(url).get();
	    	    	
	    	    	//�귣��
	    	    	Element title=doc2.select("div.end_head h2").get(0);
	    	    	System.out.println("����:"+title.text());
	    	    	//������ 
	    	    	Element poster=doc2.selectFirst("a.pic_area img");
	    	    	System.out.println("������:"+poster.attr("src"));
	    	    	//����
	    	    	Element price=doc2.selectFirst("dl.end_price_box strong");
	    	    	System.out.println("����:"+price.text());
	    	    	//�۰�
	    	    	Element writer=doc2.selectFirst("li span.tit_writer a");
	    	    	System.out.println("�۰�:"+writer.text());
	    	    	
//	    	    	String writer =null;
//					try{
//						Element s=doc2.select("li.info_lst li a").get(0);
//						writer =s.text();
//						System.out.println("�۰�:"+writer);
//					}catch (Exception e) {
//						writer = " ";
//						System.out.println("�ű���: ");
//					}
	    	    	
	    	    	
	    	    	
	    	    	//���ǻ�
	    	    	Element publisher=doc2.select("li.info_lst li a").get(1);
	    	    	System.out.println("���ǻ�:"+publisher.text());
	    	    	//ī�װ�
	    	    	Element category=doc2.select("li.info_lst li a").get(2);
	    	    	System.out.println("ī�װ�:"+category.text());
	    	    	//���
	    	    	Element grade=doc2.select("li.info_lst li ").get(3);
	    	    	System.out.println("���:"+grade.text());
	    	    	//������
	    	    	Element publish=doc2.select("li.info_lst li").get(4);
	    	    	System.out.println("������:"+publish.text());
	    	    	//�ٰŸ�
    	    	    Element story=doc2.selectFirst("div._synopsis");
    	    	    System.out.println("�ٰŸ�:"+story.text());
    	    	    
    	    	    
    	    	    System.out.println(" ");
	    	    	

    	    	    String msg=mno+"|"+cno+"|"
	    	    				+title.text()+"|"
	    	    					+poster.attr("src")+"|"
	    	    						+price.text()+"|"
	    	    							+writer+"|"
	    	    								+publisher.text()+"|"
	    	    									+category.text()+"|" 
	    	    										+grade.text()+"|"
	    	    											+publish.text()+"|" 
	    	    												+story.text()+"\r\n";
	    	    													
	    	    	
	    	    	// ���Ͽ� ����
	    	    	FileWriter fw=new FileWriter("c:\\javaDev\\naverseries_ebook4.txt",true);
	    	    	fw.write(msg);
	    	    	fw.close();
	    	    	
	    	    	mno++;
	
	    	    	}catch(Exception ex) {}
	    	    	
	    	    	
	    	    }
	    	}
      }catch(Exception ex)
      {
    	   System.out.println(ex.getMessage());// ���� �޼��� ��� 
      }
     // finally => ���� �ݱ� , ����Ŭ ���� ���� ���� , ��Ʈ��ũ ���� 
    }
	
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��ü ���� 
		EbookManager1 m=new EbookManager1();
		m.ebookAllData();
		//m.daumNewsData();
	}
}
