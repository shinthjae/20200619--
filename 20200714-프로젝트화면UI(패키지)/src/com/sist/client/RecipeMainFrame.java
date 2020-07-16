package com.sist.client;
import java.awt.*;

import java.awt.event.*; // ActionListener => * 바꿈
import javax.swing.*; // 패키지명


/*
 * 		자바패키지 ==> java(JDK v1.0~), javax(JDK v1.2~)			JDK1.8 부터 오라클이 만든(많이 달라짐)
 * 					===============  ================            => JavaScript자체제어, 람다식(함수포인터) -> 
 * 						java1				java2					==========
 * 																	-web에서만 사용이 가능 ==> ES5 => ES6 => ES8
 * 																	-함수 단위					    ====
 * 																							        람다식
 * 	
 * 
 * 		Java	  => 교재 O
 * 		Oracle    => 교재 O
 * 		==================
 * 		HTML, CSS => 교재 O
 * 		JavaScript
 * 		==================
 * 		JSP		  => 교재 O	
 * 		Spring    => 교재 O    Annotation, XML, MyBatis,        Hadoop, Spark, deep => 리눅스
 * 		==================
 * 		코틀린, 지능형웹 알고리즘(이산수학)
 * 		 	
 * 
 * 		기존의 클래스 사용하는 방법
 * 		 => 포함 ==> 있는 그대로(변경없이)
 * 		 => 상속 ==> 필요한 부분을 그대로
 */

import com.sist.common.*;
public class RecipeMainFrame extends JFrame implements ActionListener{
	
//	JFrame f=new JFrame(); // 이렇게 JFrame 불러와도 됨
	//배치
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		// GUI의 화면 디자인, 변수 초기화, 데이터베이스 연결, 서버연결, 쓰레드 동작
		// Layout => 화면 배치
		setLayout(card);
		// 화면추가
		add("JOIN",join);  // 가장 add 위에 있는게 먼저
		add("RM",rm);
		add("LOGIN",login);
		
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
		login.b2.addActionListener(this);   // 버튼
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
		if(e.getSource()==login.b2)  // 버튼을 눌렀을때
		{
			card.show(getContentPane(),"JOIN");
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(),"LOGIN");
		}
		
	}

	}


