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
		JScrollPane js=new JScrollPane(ta); //(14-2) ���� ��ũ�ѹ�
		
		js.setBounds(10, 15, 850, 150);
		
		add(js); //(14-3) ��
		
		tf=new JTextField();
		tf.setBounds(10, 160, 740, 30);
		
		add(tf); //(14-4) �Ʒ�
		
		box=new JComboBox();
		box.addItem("black");
		box.addItem("red");
		box.addItem("blue");
		box.addItem("green");
		box.addItem("gray");
		box.addItem("yellow");
		box.addItem("cyan");
		
		box.setBounds(755, 165, 105, 30);
		add(box);  //(14-5) ���ùڽ�)
		
		String[] col= {"ID","��ȭ��","����"};
		String[][] row= new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js1=new JScrollPane(table);
		js1.setBounds(865, 15, 500, 135);
		add(js1); //(14-6)
		
		JPanel p=new JPanel();
		b1=new JButton("��������");
		b2=new JButton("����������");
		p.add(b1);
		p.add(b2);
		p.setBounds(865, 155, 500, 35);
		add(p); //(14-7) �����ϴ� ��ư
					
		
		
	}
	



}
