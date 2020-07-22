
package com.sist.client;
import java.awt.*;
//1
import javax.swing.*;//1
public class ControllPanel extends JPanel{//1 //중간 메인내용있는 부분 (제이프레임(단독으로띄움)위에 제이패널 올리는거임)
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();//1
	
	FoodCategoryForm ff=new FoodCategoryForm(); //(7)
	
	public ControllPanel()//2
	{
		setLayout(card);
		add("FF",ff);
		add("LF",lf);
		add("DF",df);
	}



}
