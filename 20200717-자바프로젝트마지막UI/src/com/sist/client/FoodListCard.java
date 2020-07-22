package com.sist.client;
import java.awt.*;
import javax.swing.*;

import com.sist.data.FoodHouseVO;
import java.net.*;

public class FoodListCard extends JPanel{

	JLabel posterLa=new JLabel();
	JLabel la1,la2,la3;
	JTextPane ta;
	
	public FoodListCard(FoodHouseVO vo) //[4]
	{
		//poserLa.setOpaque(true);
		//poserLa.setBackground(Color.black);
		
		try //[5]
		{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), 200, 200);
			posterLa.setIcon(new ImageIcon(img));
			
		}catch(Exception ex) {}
		
		la1=new JLabel(vo.getTitle());
		la2=new JLabel(String.valueOf(vo.getScore()));
		la2.setForeground(Color.orange);  //평점 색상
		la3=new JLabel(vo. getAddress());
		ta=new JTextPane();
		ta.setText(vo.getReview());
		
		setLayout(null);
		posterLa.setBounds(10, 15, 200, 200);
		la1.setBounds(215, 15, 350, 30);
		la2.setBounds(570, 15, 60, 30);
		la3.setBounds(215, 50, 415, 30);
		ta.setBounds(215, 85, 415, 230);
		
		add(posterLa);
		add(la1);add(la2);
		add(la3);add(ta);
		
	}
}

		
	


