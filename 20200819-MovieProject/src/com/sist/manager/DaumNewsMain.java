package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.dao.MovieDAO;

/*
 *  <ul class="list_line #list">

							<li>
				<a href="http://v.movie.daum.net/v/20191129113631107" class="thumb_line bg_noimage2 @1">
																				<span class="thumb_img" style="background-image:url(//img1.daumcdn.net/thumb/S320x200/?fname=https://t1.daumcdn.net/news/201911/29/sportsdonga/20191129113632574euca.jpg);"></span>
				</a>
				<span class="cont_line">
					<strong class="tit_line"><a href="http://v.movie.daum.net/v/20191129113631107" class="link_txt @1">������, '������ ����'�� 'SKYĳ��' ������ ��ȸ�ϳ�..�Ҽӻ� "���� ��"</a></strong>
					<a href="http://v.movie.daum.net/v/20191129113631107" class="desc_line @1">
						[���ƴ���]  ��� �����ư� ��� SKYĳ�� ����Ź PD�� ��ȭ ������ �⿬�� ���� ���̴�. �������� �Ҽӻ� ��Ƽ��Ʈ���۴� �����ڴ� 29�� ���ƴ��Ŀ� �������ư� ����Ź ������ ������ ���� �⿬�� ���� ���̴ٶ�� ������ ������ ��ȭ �λ��� �Ƹ��ٿ��� �����ϰ� �ִٶ�� ���ߴ�. ������ ������ 2015�� 11�� ������ ������ ����� ��ȭ��
					</a>
					<span class="state_line">
						����������<span class="txt_dot"></span><span class="screen_out">��������</span>19.11.29
					</span>
				</span>
			</li>
 */
public class DaumNewsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	MovieDAO dao=new MovieDAO();
        	for(int i=1;i<=7;i++)
        	{
	        	Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20200818&page="+i).get();
	        	Elements title=doc.select("ul.list_line span.cont_line a.link_txt");
	        	Elements poster=doc.select("ul.list_line a.thumb_line span.thumb_img");
	        	Elements link=doc.select("ul.list_line a.thumb_line");
	        	Elements content=doc.select("ul.list_line span.cont_line a.desc_line");
	        	Elements author=doc.select("ul.list_line span.cont_line span.state_line");
	        	
	        	for(int j=0;j<title.size();j++)
	        	{
	        		String p=poster.get(j).attr("style");
	        		p=p.substring(p.indexOf("(")+1,p.lastIndexOf(""));
	        		System.out.println(title.get(j).text());
	        		System.out.println(content.get(j).text());
	        		System.out.println(author.get(j).text());
	        		System.out.println(p);
	        		System.out.println(link.get(j).attr("href"));
	        		
	        		System.out.println("================================================================");
	        		
	        		NewsVO vo=new NewsVO();
	        		vo.setTitle(title.get(j).text());
	        		vo.setPoster(p);
	        		vo.setLink(link.get(j).attr("href"));
	        		vo.setContent(content.get(j).text());
	        		vo.setAuthor(author.get(j).text());
	        		Thread.sleep(300); //�о���� �ӵ��� ������ �����Ͱ� �������� ����
	        		dao.newsInsert(vo);
	        	}
        	}
        	System.out.println("End...");
        }catch(Exception ex){ex.printStackTrace();}
	}

}


















