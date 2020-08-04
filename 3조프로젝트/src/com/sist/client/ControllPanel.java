
package com.sist.client;
import java.awt.*;
//1
import javax.swing.*;//1
public class ControllPanel extends JPanel{
	CardLayout card=new CardLayout();
	
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	NewsForm nf=new NewsForm();
	//ClientMainFrame에 떠있는 창에 주소를 보내야 => new사용하면 새로운 창만 뜨기때문에 생성자를 이용해야
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
