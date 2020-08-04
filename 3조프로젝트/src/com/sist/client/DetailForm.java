package com.sist.client;

import javax.swing.*;

import com.sist.data.EbookManager;
import com.sist.data.EbookVO;


import java.awt.*;
import java.net.*;
public class DetailForm extends JPanel{
	static JLabel poster=new JLabel();
	static JLabel la1=new JLabel();
	static JLabel[] la=new JLabel[6];
	static JTextPane ta=new JTextPane(); // JTextPane > JTextArea 
	JButton b1,b2;
	
	public DetailForm()
	{
		setLayout(null);
		poster.setBounds(10, 15, 350, 450);
		add(poster);
		la1.setBounds(365, 15, 500, 45);
		la1.setFont(new Font("굴림체",Font.BOLD,40));
		add(la1);
		
		////내용 상세보기
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(6,1,5,5));
		String[] str= {"작가","출판사","카테고리","등급","출판일","가격"};
		for(int i=0;i<6;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("굴림체",Font.BOLD,30));
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 290);
		add(p);
		
		////줄거리 상세보기
		ta.setEditable(false); //편집불가능
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 470, 855, 150);
		add(js);
		
		////예매하기 버튼만들기
		b1=new JButton("예매");
		b2=new JButton("목록");
		b1.setBackground(Color.red); //버튼색상
		b2.setBackground(Color.green); //버튼색상
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365, 385, 200, 35);
		add(p2);
		
		
		
	}
	
	
	
	////상세보기
	public static void detailPrint(int mno)
	{
		EbookManager m=new EbookManager();
		EbookVO vo=m.ebookDetailData(mno);
		la1.setText(vo.getTitle());
		
		////포스터 상세보기
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url),poster.getWidth(), poster.getHeight());
					
			poster.setIcon(new ImageIcon(img));
			
		}catch(Exception ex) {}
		
		la[0].setText("작가:"+vo.getWriter());
		la[0].setText("출판사:"+vo.getPublisher());
		la[0].setText("카테고리:"+vo.getCategory());
		la[0].setText("등급:"+vo.getGrade());
		la[0].setText("출판일:"+vo.getPublish());
		la[0].setText("가격:"+vo.getPrice());
		ta.setText(vo.getStory());
	}

}
