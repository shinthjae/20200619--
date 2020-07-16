package com.sist.client;

// 생성자 => 변수
// GridLayout // 썸네일 같은거

import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
// 윈도우창 => Frame


public class PuzzleGame extends	JFrame implements ActionListener{
	JButton b1,b2;
	JButton[][] pan=new JButton[3][3];
	int[][] panCount=new int[3][3];
	int brow=0;
	int bcol=0;
	// 0~8 난수 발생
	
	public void getRand()
	{
		int[] com=new int[9]; //중복없는 난수값을 저장
		int su=0; //난수 발생시 저장한 변수
		boolean bCheck=false; //중복여부확인
				for(int i=0;i<9;i++)
				{	
					//난수발생
					bCheck=true;
					while(bCheck)
					{	
						su=(int)(Math.random()*9); //0~8
						bCheck=false;
						// 검색 => 저장된 데이터가 중복여부 확인
							for(int j=0;j<i;j++)
							{
								if(su==com[j]) // 같은 수가 저장
									{
										// while을 다시 수행
										bCheck=true;
										break;
					
									}
					
							}
					
					}
					com[i]=su;
					panCount[i/3][i%3]=com[i];
					if(su==8)
				    {
				       brow=i/3;
				       bcol=i%3;
				    }

				}
			}
	// 배치함수
	public void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
		
				if(i==brow && j==bcol)
				{
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);
				}
				else
				{
				pan[i][j].setText(String.valueOf(panCount[i][j]+1));
				pan[i][j].setEnabled(true);
				}
		}
	}
		// public
		// 버튼클릭
	public PuzzleGame()
	{
		// 배치
		JPanel p=new JPanel();
		b1=new JButton("시작");
		b2=new JButton("종료");
		p.add(b1);p.add(b2);
		add("South",p);
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3,3,5,5));
		int k=1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
				pan[i][j]=new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("굴림체",Font.BOLD,50));
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;
			}
		}
		
		add("Center",p2);
		
		getRand();
		display();
		
		setSize(350, 400);
		setVisible(true);
		
		b1.addActionListener(this);//이벤트등록
		 b2.addActionListener(this); //종료

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PuzzleGame();
		// 생성자 호출시에는 반드시 앞에 new

}
	//종료여부 확인
	public boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			getRand();
			display();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e.getSource()==pan[i][j])
				{
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					
					display();
					if(isEnd())
					{
						JOptionPane.showMessageDialog(this, "GAME OVER!!");
						System.exit(0);
					}
					
				}
			}
		}
	}
}
