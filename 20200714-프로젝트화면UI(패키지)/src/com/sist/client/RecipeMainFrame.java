package com.sist.client;
import java.awt.*;

import java.awt.event.*; // ActionListener => * �ٲ�
import javax.swing.*; // ��Ű����


/*
 * 		�ڹ���Ű�� ==> java(JDK v1.0~), javax(JDK v1.2~)			JDK1.8 ���� ����Ŭ�� ����(���� �޶���)
 * 					===============  ================            => JavaScript��ü����, ���ٽ�(�Լ�������) -> 
 * 						java1				java2					==========
 * 																	-web������ ����� ���� ==> ES5 => ES6 => ES8
 * 																	-�Լ� ����					    ====
 * 																							        ���ٽ�
 * 	
 * 
 * 		Java	  => ���� O
 * 		Oracle    => ���� O
 * 		==================
 * 		HTML, CSS => ���� O
 * 		JavaScript
 * 		==================
 * 		JSP		  => ���� O	
 * 		Spring    => ���� O    Annotation, XML, MyBatis,        Hadoop, Spark, deep => ������
 * 		==================
 * 		��Ʋ��, �������� �˰���(�̻����)
 * 		 	
 * 
 * 		������ Ŭ���� ����ϴ� ���
 * 		 => ���� ==> �ִ� �״��(�������)
 * 		 => ��� ==> �ʿ��� �κ��� �״��
 */

import com.sist.common.*;
public class RecipeMainFrame extends JFrame implements ActionListener{
	
//	JFrame f=new JFrame(); // �̷��� JFrame �ҷ��͵� ��
	//��ġ
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		// GUI�� ȭ�� ������, ���� �ʱ�ȭ, �����ͺ��̽� ����, ��������, ������ ����
		// Layout => ȭ�� ��ġ
		setLayout(card);
		// ȭ���߰�
		add("JOIN",join);  // ���� add ���� �ִ°� ����
		add("RM",rm);
		add("LOGIN",login);
		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		login.b2.addActionListener(this);   // ��ư
		join.b3.addActionListener(this);  
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)  // ��ư�� ��������
		{
			card.show(getContentPane(),"JOIN");
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(),"LOGIN");
		}
		
	}

	}


