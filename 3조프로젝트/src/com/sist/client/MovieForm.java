package com.sist.client;
import java.awt.*;



import java.util.Locale.Category;
import javax.swing.*;
import com.sist.data.*;
import java.util.*; //ArrayList

public class MovieForm extends JPanel{ 
	JButton b1,b2;
	MovieCard[] mc=new MovieCard[10];
	JPanel p=new JPanel();
	
	ClientMainFrame c;
	
	public MovieForm(ClientMainFrame c) 
	{	
		this.c=c;
		
		//전체화면
		setLayout(new BorderLayout()); 
		
		//좌우넘기는 버튼
		b1=new JButton("◀");
		b2=new JButton("▶");		
		
		p.setLayout(new GridLayout(2,5,5,5));
		
		//페이지메소드  => 페이지가 바뀌는 부분들은 메소드로 만드는게 좋다
		ebookPrint(1); 
		
		//화면에 추가
		add("West",b1);add("Center",p);add("East",b2);
	}
	public void ebookPrint(int page)
	{
		
		EbookManager m=new EbookManager();
		ArrayList<EbookVO> list=m.ebookListData(page);
		int i=0;
		for(EbookVO vo:list)
		{
			mc[i]=new MovieCard(vo.getTitle(), vo.getPoster()); //포스터가 원래 지역변수여서 상세보기 못했는데 전역변수로 만등어야 => 객체생성 => 번호 cno
			p.add(mc[i]);
			
			//this를 여기로 보낸다 //(c) 클라이언트메인에 MouseListener가 있다 // 
			mc[i].addMouseListener(c);
			
			i++; 
		}
	}

}
