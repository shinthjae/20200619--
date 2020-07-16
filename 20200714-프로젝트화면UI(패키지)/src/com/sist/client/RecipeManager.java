package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class RecipeManager extends JPanel {
	RecipeForm[] recipes=new RecipeForm[9];
	public RecipeManager()
	{
		setLayout(null);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,3,5,5));
		for(int i=0;i<9;i++)
		{
			recipes[i]=new RecipeForm();
			p.add(recipes[i]);
		}
		
		p.setBounds(10, 15, 1000, 800);
		add(p);
	}

}
