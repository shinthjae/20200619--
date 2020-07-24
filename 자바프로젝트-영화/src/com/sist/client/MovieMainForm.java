package com.sist.client;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;

import com.sist.client.MovieMainForm;
import com.sist.client.MovieListPanel;

public class MovieMainForm extends JFrame implements ActionListener{
	
	CardLayout card=new CardLayout(50,50);
	MovieListPanel mp=new MovieListPanel();
	ControllPanel cp=new ControllPanel();
	ListButton lb=new ListButton();
	
	public MovieMainForm()
	{
		
		

		setLayout(card);
		mp.setBounds(175, 170, 500, 100);
		add(mp);
		
		add(lb);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lb.b1.addActionListener(this); 
		lb.b2.addActionListener(this);
		lb.b3.addActionListener(this); 
		lb.b4.addActionListener(this);
		lb.b5.addActionListener(this); 
		
		setLocation(100	, 20);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MovieMainForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==lb.b1)
		{
			cp.card.show(cp, "NM");
		}
		else if(e.getSource()==lb.b2)
		{
			cp.card.show(cp, "SM");
		}
		else if(e.getSource()==lb.b3)
		{
			cp.card.show(cp, "WM");
		}
		else if(e.getSource()==lb.b4)
		{
			cp.card.show(cp, "MM");
		}
		else if(e.getSource()==lb.b5)
		{
			cp.card.show(cp, "YM");
		}
		
	}

}

