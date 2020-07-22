package com.sist.client;
import java.awt.*;
import java.util.Locale.Category;

import javax.swing.*;

import com.sist.data.*;

public class FoodCategoryForm extends JPanel{ //(1)data ÆÐÅ°Áö (2)
	public FoodCategoryForm() //(6)
	{
		setLayout(new GridLayout(2,5,5,5));
		CategoryVO[] cate=MainClass3.categoryListData();
		
		for(CategoryVO vo:cate)
		{
			FoodCategoryCard fc=new FoodCategoryCard(vo.getTitle(), vo.getSubject(), vo.getPoster());
			add(fc);
		}
	}

}
