
package com.sist.client;
import java.awt.*;
//1
import javax.swing.*;//1
public class ControllPanel extends JPanel{//1 //�߰� ���γ����ִ� �κ� (����������(�ܵ����ζ��)���� �����г� �ø��°���)
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
