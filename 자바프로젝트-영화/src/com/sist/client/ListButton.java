package com.sist.client;

import java.awt.*;


import javax.swing.*;

public class ListButton extends JPanel{

	
		JButton b1,b2,b3,b4,b5;
		public ListButton()
		{
			b1=new JButton("현재상영");        
			b2=new JButton("개봉예정");     
			b3=new JButton("주간");
			b4=new JButton("월간");
			b5=new JButton("연간");
			
			b1.setBounds(20, 170, 150, 50);
			b2.setBounds(20, 175, 150, 50);
			b3.setBounds(20, 180, 150, 50);
			b4.setBounds(20, 185, 150, 50);
			b4.setBounds(20, 190, 150, 50);
			
//			setLayout(new GridLayout(7,1,5,5));
			
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
		}

	}


