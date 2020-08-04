package com.sist.client;

import javax.swing.*;


import com.sist.common.Function;

import java.awt.*; // 색상, 배치
import java.awt.event.*; // 인터페이스

import java.io.*;
import java.util.*;
import java.net.*;



public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{ 
    
	
	JLabel title=new JLabel("영화 예매  & 추천 프로그램",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	
	ControllPanel cp; 
	
	Login login=new Login();
	

	int curpage=1;
	int totalpage=5;
	

	Socket s; 
	OutputStream out; 
	BufferedReader in; 
	
	public ClientMainFrame()
	{
		
		cp=new ControllPanel(this);
		
		
		title.setFont(new Font("굴림체",Font.BOLD,55));
		title.setOpaque(true);
		
		setLayout(null);
		title.setBounds(10, 15, 1570, 100);
		
		add(title);
		
		mf.setBounds(10, 120, 100, 300 );
		add(mf);
		
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600, 1000);
		setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this); 
		cp.ff.b2.addActionListener(this); 
		
		cp.df.b2.addActionListener(this); 
		
		//*
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		

		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		
		mf.b7.addActionListener(this);
		
		
		cf.tf.addActionListener(this);
		
	}
		

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}
	
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5)
		{
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==cp.ff.b1)
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll(); 
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
				
			}
		}
		else if(e.getSource()==cp.ff.b2) 
		{
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			
			String ss=cp.lf.tf.getText();
			if(ss.length()<1) 
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus();
				return;
			}
			cp.lf.movieFindData(ss); 
		}
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			
			
			try
			{
				
				s=new Socket("localhost",3355);
				
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    
			    new Thread(this).start();
			    
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)
		{
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2) 
				{
					int a=(i+1)+((curpage*10)-10);
					
					cp.card.show(cp,"DF");
					
					cp.df.detailPrint(a);
					
					break;
				}
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		// 서버에서 들어오는 데이터를 받아서 처리
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);
					   setVisible(true); 
				   }
				   break;
				   case Function.LOGIN:
				   {
					  
					   String[] data= {
						  st.nextToken(),
						  st.nextToken(), 
						  st.nextToken() 
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     cf.ta.append(st.nextToken()+"\n");
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();
					   System.exit(0);
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}

}




