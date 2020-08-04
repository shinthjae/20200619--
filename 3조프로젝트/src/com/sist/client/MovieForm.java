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
		
		//��üȭ��
		setLayout(new BorderLayout()); 
		
		//�¿�ѱ�� ��ư
		b1=new JButton("��");
		b2=new JButton("��");		
		
		p.setLayout(new GridLayout(2,5,5,5));
		
		//�������޼ҵ�  => �������� �ٲ�� �κе��� �޼ҵ�� ����°� ����
		ebookPrint(1); 
		
		//ȭ�鿡 �߰�
		add("West",b1);add("Center",p);add("East",b2);
	}
	public void ebookPrint(int page)
	{
		
		EbookManager m=new EbookManager();
		ArrayList<EbookVO> list=m.ebookListData(page);
		int i=0;
		for(EbookVO vo:list)
		{
			mc[i]=new MovieCard(vo.getTitle(), vo.getPoster()); //�����Ͱ� ���� ������������ �󼼺��� ���ߴµ� ���������� ������ => ��ü���� => ��ȣ cno
			p.add(mc[i]);
			
			//this�� ����� ������ //(c) Ŭ���̾�Ʈ���ο� MouseListener�� �ִ� // 
			mc[i].addMouseListener(c);
			
			i++; 
		}
	}

}
