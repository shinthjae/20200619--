package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.data.NewsVO;


public class NewsCard extends JPanel {
	JLabel poster=new JLabel();
	JLabel title=new JLabel();
	JTextPane tp=new JTextPane(); // JLabel=> 한줄  JTextPane=> 여러줄
	JLabel author=new JLabel();
	
	public NewsCard()
	{
		setLayout(null);
		poster.setBounds(10, 5, 300, 150);
		add(poster);
		title.setBounds(315, 5, 900, 35);
		add(title);
		JScrollPane js=new JScrollPane(tp);
		js.setBounds(315, 45, 900, 120);
		add(js);
		author.setBounds(315, 170, 900, 35);
		add(author);
	}
	// 값을 채운다
	public void newsPrint(NewsVO vo) {
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), 300, 150);
			poster.setIcon(new ImageIcon(img));
			title.setText(vo.getTitle());
	        tp.setText(vo.getContent());
	        author.setText(vo.getAuthor());

		}catch(Exception ex) {}
		
	}
}
