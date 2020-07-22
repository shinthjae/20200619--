package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.net.*;
public class FoodCategoryCard extends JPanel{ //(3) �̹���(ī��)�ϳ� ����� ������ ������ �ݺ�
	
	String title,subject,poster; //(4)
	Image img;
	public FoodCategoryCard(String title,String subject, String poster)
	{
		this.title=title;
		this.subject=subject;
		this.poster=poster;
		try
		{
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception ex) {}
	}
	public void paint(Graphics g) //(5)
	{
		g.drawImage(img,0,0,getWidth(),getHeight(),this);
		g.setColor(Color.white);
		g.setFont(new Font("����ü",Font.BOLD,25));
		g.drawString(title, 10, 100); 
		g.drawString(subject, 50, 150); //ī�常��� �ϼ� => FoodCategoryForm
		
	}
	
}
