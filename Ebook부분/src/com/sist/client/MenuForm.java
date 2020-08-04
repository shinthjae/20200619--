
package com.sist.client;
import java.awt.*;//1'
import javax.swing.*;//1

import javafx.scene.layout.GridPane;
public class MenuForm extends JPanel{ 

	JButton b1,b2,b3,b4,b5,b6,b7; 
	
	public MenuForm()  
	{

		b1=new JButton("홈");        
		b2=new JButton("영화찾기");     
		b3=new JButton("영화예매");
		b4=new JButton("영화추천");
		b5=new JButton("뉴스");
		b6=new JButton("영화뮤직");
		b7=new JButton("종료");
		
		setLayout(new GridLayout(7,1,5,5));     

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		

//		

		
	}
	
	

}
