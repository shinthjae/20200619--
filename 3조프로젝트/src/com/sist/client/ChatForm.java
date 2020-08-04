package com.sist.client;
import java.awt.Color;//1

import javax.swing.*; //1
import javax.swing.table.*;;//(14)
public class ChatForm extends JPanel{ //1
	
	JTextArea ta;
	JTextField tf; 
	JComboBox box;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;   //(14-1)
	
	public ChatForm() //2
	{	
		setLayout(null);
//		setBackground(Color.yellow);
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta); //(14-2) 세로 스크롤바
		
		js.setBounds(10, 15, 850, 150);
		
		add(js); //(14-3) 위
		
		tf=new JTextField();
		tf.setBounds(10, 160, 740, 30);
		
		add(tf); //(14-4) 아래
		
		box=new JComboBox();
		box.addItem("black");
		box.addItem("red");
		box.addItem("blue");
		box.addItem("green");
		box.addItem("gray");
		box.addItem("yellow");
		box.addItem("cyan");
		
		box.setBounds(755, 165, 105, 30);
		add(box);  //(14-5) 선택박스)
		
		String[] col= {"ID","대화명","성별"};
		String[][] row= new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js1=new JScrollPane(table);
		js1.setBounds(865, 15, 500, 135);
		add(js1); //(14-6)
		
		JPanel p=new JPanel();
		b1=new JButton("정보보기");
		b2=new JButton("쪽지보내기");
		p.add(b1);
		p.add(b2);
		p.setBounds(865, 155, 500, 35);
		add(p); //(14-7) 우측하단 버튼
					
		
		
	}
	



}
