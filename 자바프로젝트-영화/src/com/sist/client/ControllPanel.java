
package com.sist.client;
import java.awt.*;
//1
import javax.swing.*;//1
public class ControllPanel extends JPanel{//1 //�߰� ���γ����ִ� �κ� (����������(�ܵ����ζ��)���� �����г� �ø��°���)
	CardLayout card=new CardLayout();
	NowMovieForm nm=new NowMovieForm();
	SoonMovieForm sm=new SoonMovieForm();
	WeekMovieForm wm=new WeekMovieForm();
	MonthMovieForm mm=new MonthMovieForm();
	YearMovieForm ym=new YearMovieForm();
	
	
	
	public ControllPanel()//2
	{
		setLayout(card);
		add("NM",nm);
		add("SM",sm);
		add("WM",wm);
		add("MM",mm);
		add("YM",ym);
	}



}
