package com.sist.client;
import javax.swing.*;

import javax.swing.text.Document;


import com.sist.common.Function;

import java.awt.*; // Color,Layout
import java.awt.event.*;// interface
/*
 *    재사용 
 *      = 상속 (is-a) : 기존의 클래스를 변경해서 사용
 *      public class ClientMainFrame extends JFrame
 *                   ===============
 *                    JFrame의 기능을 전체 가지고 온다 
 *      class A
 *      {
 *         O X W
 *      }
 *      class B extends A
 *      {
 *          O X W
 *      }
 *      = 포함 (has-a) : 기존의 클래스를 변경없이 사용
 *      public class ClientMainFrame
 *      {
 *          JFrame f=new JFrame();
 *      }
 *      
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{ //(13)implements ActionListener
    // 윈도우 크기 결정  => 생성자에서 사용  ==> 291 page
	
	JLabel title=new JLabel("영화 예매  & 추천 프로그램",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	//ControllPanel cp=new ControllPanel();
	
	//현재 떠있는 창 처리
	ControllPanel cp; 
	
	Login login=new Login();
	
	
	//페이지
	int curpage=1;
	int totalpage=16;
	
	////네트워크 관련 프로그램
	Socket s; // 연결기계
	OutputStream out; // 서버로 요청값 전송 ==> 로그인 ,채팅 문자열 ,종료...
	BufferedReader in; // 서버로부터 값을 받아오는 클래스 ==> 쓰레드
	
	public ClientMainFrame()
	{
		
		cp=new ControllPanel(this);
	
		title.setFont(new Font("굴림체",Font.BOLD,55));
		title.setOpaque(true);
		
		setLayout(null);
		title.setBounds(10, 15, 1570, 100);
		// 추가 => add()
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300 );
		add(mf);
		// 채팅폼 
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면 
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600, 1000);
		setVisible(true); ////윈도우 안보여 //// 로그인되면 창이 보여지는
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// X버튼 클릭시 종료
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this); //이전
		cp.ff.b2.addActionListener(this); //다음
		
		cp.df.b2.addActionListener(this); //목록
		
		//*
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		//*검색  검색을 하다보면 검색버튼 누르거나 엔터치고 처리하는 두가지 경우에 => ActionListener
		
		
		////로그인처리
//		login.b1.addActionListener(this);
//		login.b2.addActionListener(this);
		
		////종료 
		mf.b7.addActionListener(this);
		
		////채팅
		cf.tf.addActionListener(this);
		
	}
		
		
		//10개 포스터 처리 (0번 ~ 9번)
//		for(int i=0;i<10;i++)
//		{
//			cp.ff.mc[i].addMouseListener(this);
//		}
//	}

		
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        // 생성자는 호출시에 반드시  => new 생성자()
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
		else if(e.getSource()==mf.b2) // 다시 홈으로, 보던 페이지로 다시 넘어옴
		{
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==cp.ff.b1) //이전버튼
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll(); //JPanel의 원래 기능 삭제
				cp.ff.ebookPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); //JPanel의 원래 기능을 재배치
				
			}
		}
		else if(e.getSource()==cp.ff.b2) //다음버튼
		{
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.ebookPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		
		//*
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
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf) //*검색  검색을 하다보면 검색버튼 누르거나 엔터치고 처리하는 두가지 경우에 => ActionListener -> ||
		{
			// 1.입력된 값 읽기(사용자가 검색하는단어)
			String ss=cp.lf.tf.getText();
			if(ss.length()<1) // 값이 입력이 안됐다면 ~ 검색하는 문자열 길이가 1(한글자)보다 작으니깐
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus();
				return;
			}
			cp.lf.movieFindData(ss); //입력값 검색
		}
		/////
//		else if(e.getSource()==login.b1)
//		{
//			String id=login.tf1.getText();
//			if(id.length()<1)// ID가 입력하지 않을 경우
//			{
//				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
//				login.tf1.requestFocus();
//				return;
//			}
//			
//			String name=login.tf2.getText();
//			if(name.length()<1)
//			{
//				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
//				login.tf2.requestFocus();
//				return;
//			}
//			
//			String sex="";
//			if(login.rb1.isSelected())
//				sex="남자";
//			else
//				sex="여자";
//			
//			// 서버로 입력받은 데이터 전송 
//			try
//			{
//				// 연결  => 서버에 대한 정보를 가지고 있다 
//				s=new Socket("localhost",3355);
//				// 송수신 위치 확인
//				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
//				out=s.getOutputStream();
//				
//				// 로그인 요청 (서버로 전송되는 부분)
//				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
//			}catch(Exception ex){}
//			    
//			    //서버에서 전송하는 데이터를 읽어서 출력 
//			    new Thread(this).start();
//			    // run()의 위치 확인 ==> 자신의 클래스안에 존재 => (this)
//		}
//		else if(e.getSource()==login.b2)
//		{
//			System.exit(0);
//		}
//		else if(e.getSource()==cf.tf)// 채팅 
//		{
//			String msg=cf.tf.getText();
//			if(msg.length()<1)
//				return;
//			// 데이터를 서버로 전송 
//			try
//			{
//				out.write((msg+"\n").getBytes());
//			}catch(Exception ex){}
//			
//			    cf.tf.setText("");
//		}
//		else if(e.getSource()==mf.b7)
//		{
//			try
//			{
//				out.write((Function.EXIT+"|\n").getBytes());
//			}catch(Exception ex) {}
//		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//포스터 상세보기
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2) //더블클릭
				{
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno"+a);
					
					//화면 전환(show)
					cp.card.show(cp,"DF");
					
					////상세보기
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
	public void run() {
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
					   login.setVisible(false);// 로그인창
					   setVisible(true);// 영화창 (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // 테이블에 출력 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
//					     initStyle();
//					     append(st.nextToken(),st.nextToken());
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
					   dispose();// 윈도우 메모리 해제 
					   System.exit(0);// 프로그램 종료 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}
   
}
