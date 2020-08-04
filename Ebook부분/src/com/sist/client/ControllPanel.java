
package com.sist.client;
import java.awt.*;
//1
import javax.swing.*;//1
public class ControllPanel extends JPanel{
	
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	NewsForm nf=new NewsForm();
	
	MovieForm ff;
	ClientMainFrame c;
	
	
	public ControllPanel(ClientMainFrame c)
	{
		this.c=c;
		ff=new MovieForm(c);
		
		setLayout(card);
		add("FF",ff);
		add("LF",lf);
		add("DF",df);
		add("NF",nf);
	}



}
