package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import com.sist.data.*;
public class CardPrint extends JFrame{ //5]
	public CardPrint()
	{
		FoodHouseVO[] food=MainClass3.categoryFoodData();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5,2));
		add("Center",p);
		
		
		for(FoodHouseVO vo:food)
		{
			FoodListCard fc=new FoodListCard(vo);
			p.add(fc);
		}
			
		setSize(1200, 1000);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardPrint();
	}

}
