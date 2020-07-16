package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class RecipeForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel title=new JLabel();
	JLabel chef=new JLabel();
	JLabel score=new JLabel();
	
	//√ ±‚»≠
	public RecipeForm()
	{
		setLayout(null);
		poster.setBounds(5, 5, 300, 170);
		poster.setOpaque(true);
		poster.setBackground(Color.pink);
		
		title.setBounds(5, 180, 300, 30);
		title.setOpaque(true);
		title.setBackground(Color.orange);
		
		chef.setBounds(5, 215, 300, 30);
		chef.setOpaque(true);
		chef.setBackground(Color.cyan);
		
		score.setBounds(5, 250, 300, 30);
		score.setOpaque(true);
		score.setBackground(Color.magenta);
		
		add(poster);
		add(title);
		add(chef);
		add(score);
		
		
	}
	

}
