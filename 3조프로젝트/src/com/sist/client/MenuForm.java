
package com.sist.client;
import java.awt.*;//1'
import javax.swing.*;//1

import javafx.scene.layout.GridPane;
public class MenuForm extends JPanel{ //1

	JButton b1,b2,b3,b4,b5,b6,b7; //2 //초기화(버튼) => 배치(생성자)
	
	public MenuForm()  //3
	{
//		setBackground(Color.orange);//(10)
		b1=new JButton("홈");        //4
		b2=new JButton("Ebook찾기");     //하나씩 디테일페이지 생성해야
		b3=new JButton("null");
		b4=new JButton("null");
		b5=new JButton("뉴스");
		b6=new JButton("null");
		b7=new JButton("종료");
		
		setLayout(new GridLayout(7,1,5,5));     //5//그리드레이아웃 버튼 간격, 콤마 앞쪽 두개 뒷쪽 두개
//		setLayout(new FlowLayout(FlowLayout.CENTER,50,100)); //위치 (간격)
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		
//		b1.setPreferredSize(new Dimension(100, 50)); //버튼 크기
//		b2.setPreferredSize(new Dimension(100, 50));
//		b3.setPreferredSize(new Dimension(100, 50));
//		b4.setPreferredSize(new Dimension(100, 50));
//		b5.setPreferredSize(new Dimension(100, 50));
//		b6.setPreferredSize(new Dimension(100, 50));
//		b7.setPreferredSize(new Dimension(100, 50));
//		

		
	}
	
	

}
