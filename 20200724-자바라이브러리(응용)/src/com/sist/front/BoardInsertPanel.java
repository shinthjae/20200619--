package com.sist.front;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BoardInsertPanel extends JPanel {
	JLabel title=new JLabel("글쓰기",JLabel.CENTER); //가운데정렬
	JLabel la1,la2,la3,la4;
	JTextField tf1,tf2;
	JTextArea ta;
	JPasswordField pf;
	JButton b1,b2;
	
	public BoardInsertPanel()
	{
    	title.setFont(new Font("굴림체",Font.BOLD,40));
    	la1=new JLabel("이름",JLabel.RIGHT);
    	la2=new JLabel("제목",JLabel.RIGHT);
    	la3=new JLabel("내용",JLabel.RIGHT);
    	la4=new JLabel("비밀번호",JLabel.RIGHT);
    	
    	tf1=new JTextField();
    	tf2=new JTextField();
    	
    	ta=new JTextArea();
    	JScrollPane js=new JScrollPane(ta);
    	
    	pf=new JPasswordField();
    	
    	b1=new JButton("글쓰기");
    	b2=new JButton("취소");
    	
    	setLayout(null);
    	title.setBounds(10, 15, 600, 45);
    	add(title);
    	
    	la1.setBounds(50, 70, 100, 30);
    	tf1.setBounds(155, 70, 200, 30);
    	
    	add(la1);
    	add(tf1);
    	
    	la2.setBounds(50, 105, 100, 30);
    	tf2.setBounds(155, 105, 350, 30);
    	
    	add(la2);
    	add(tf2);
    	
    	la3.setBounds(50, 140, 100, 30);
    	js.setBounds(155, 140, 350, 150);
    	
    	add(la3);
    	add(js);
    	
    	la4.setBounds(50, 295, 100, 30);
    	pf.setBounds(155, 295, 100, 30);
    	
    	add(la4);
    	add(pf);
    	
    	JPanel p=new JPanel();
    	p.add(b1);
    	p.add(b2);
    	
    	p.setBounds(10, 330, 600, 35);
    	add(p);
    }

	
}
