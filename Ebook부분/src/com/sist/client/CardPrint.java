package com.sist.client;
import java.util.*;


import java.awt.*;
import javax.swing.*;

import com.sist.data.*;
public class CardPrint extends JFrame{ 
    public CardPrint()
    {

    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(5,2));
    	JScrollPane pp=new JScrollPane();
    	Dimension size = new Dimension();
    	size.setSize(1000, 600);
    	p.setPreferredSize(size);
    	pp.setViewportView(p);
    	add("Center",pp);
    	add("Center",p);
    	

    	
    	setSize(1300, 1000);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CardPrint();
	}

}
