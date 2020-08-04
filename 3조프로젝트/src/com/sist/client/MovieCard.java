package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.net.*;
public class MovieCard extends JPanel{ //(3) 이미지(카드)하나 만들고 루프로 여러개 반복
	
	String title,poster; //(4)
	Image img;
	public MovieCard(String title,String poster)
	{
		this.title=title;
		this.poster=poster;
		try
		{
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception ex) {}
		
		setToolTipText(title);
	}
	public void paint(Graphics g) //(5)
	{
//		g.drawImage(img,0,0,getWidth(),getHeight(),this);
//		g.setColor(Color.white);
//		g.setFont(new Font("굴림체",Font.BOLD,25));
//		g.drawString(title, 10, 100); 
		
		g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
		
		
	}
	
}
