package com.sist.cgv;
import java.util.*;
import javax.swing.*;

import java.awt.CardLayout;
import java.awt.event.*;
public class CGVMainFrame extends JFrame{ 
	
	CardLayout card=new CardLayout();//<1>
	MovieListPanel mp=new MovieListPanel();
	
	public CGVMainFrame()
	{
		setLayout(card);
		add("MP",mp);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CGVMainFrame();
	}

}
