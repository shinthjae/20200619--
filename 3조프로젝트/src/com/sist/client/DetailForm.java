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
		la1.setFont(new Font("����ü",Font.BOLD,40));
		add(la1);
		
		////���� �󼼺���
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(6,1,5,5));
		String[] str= {"�۰�","���ǻ�","ī�װ�","���","������","����"};
		for(int i=0;i<6;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("����ü",Font.BOLD,30));
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 290);
		add(p);
		
		////�ٰŸ� �󼼺���
		ta.setEditable(false); //�����Ұ���
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 470, 855, 150);
		add(js);
		
		////�����ϱ� ��ư�����
		b1=new JButton("����");
		b2=new JButton("���");
		b1.setBackground(Color.red); //��ư����
		b2.setBackground(Color.green); //��ư����
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365, 385, 200, 35);
		add(p2);
		
		
		
	}
	
	
	
	////�󼼺���
	public static void detailPrint(int mno)
	{
		EbookManager m=new EbookManager();
		EbookVO vo=m.ebookDetailData(mno);
		la1.setText(vo.getTitle());
		
		////������ �󼼺���
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url),poster.getWidth(), poster.getHeight());
					
			poster.setIcon(new ImageIcon(img));
			
		}catch(Exception ex) {}
		
		la[0].setText("�۰�:"+vo.getWriter());
		la[0].setText("���ǻ�:"+vo.getPublisher());
		la[0].setText("ī�װ�:"+vo.getCategory());
		la[0].setText("���:"+vo.getGrade());
		la[0].setText("������:"+vo.getPublish());
		la[0].setText("����:"+vo.getPrice());
		ta.setText(vo.getStory());
	}

}
