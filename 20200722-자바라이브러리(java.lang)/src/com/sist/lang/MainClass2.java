package com.sist.lang;

import sun.applet.Main;

class Change
{
	int x,y;   // Change => x=0,y=0
	/*
	 * 		int => 0
	 * 		String => null
	 * 		class => null
	 * 		double => 0.0
	 * 		boolean => false
	 */
}

public class MainClass2 {
	
	/*
	 * 		int x=10;
	 * 		int y=20; => x=10,y=20
	 * 
	 * 		x=y; x=20
	 * 		y=x; y=20 => 값 주려는데 이렇게 하면 값이 같아진다
	 * 
	 * 		int temp=x; temp=y;
	 * 
	 * 		int a=10;
	 * 		
	 * 		a=20;
	 */
	public void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp; // 임시변수 사용  왜?=> 임시변수 안쓰면 값이 똑같이 나옴 => 위에 주석 참조
		
	}
	
	public void swap2(Change c)
	{
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("변경전:x="+x+"y="+y);
		m.swap(x,y);
		System.out.println("변경전:x="+x+"y="+y);
		
		Change ccc=new Change();
		ccc.x=10;
		ccc.y=20;
		System.out.println("변경전:ccc.x="+ccc.x+"ccc.y="+ccc.y);
		m.swap2(ccc);
		System.out.println("변경전:ccc.x="+ccc.x+"ccc.y="+ccc.y);
		
		
	}

}
