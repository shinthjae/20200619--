package com.sist.inter;



/*  		자바에서 지원한 인터페이스
  		1. Window (javax.swing)
  				ActionListener : 버튼메뉴 , text에서 엔터
  					=actionPerformed()
  				MouseLisener : 마우스 관련, 전체 해당
  					= mouseClicked()
  					= mouseReleased()
  					= mousePressed()
  					= mouseEntered()
  					= mouseExited()
  				MouseMotionListener
  					= mouseMoveed()
  					= mouseDrgged()
  				KeyListener : 키보드
  					= keyPressed()
  					= keyReleased()
  					= keyTyped()
  				FocusListener
  					= focusLost()
  					= focusGained()
  				ItemListener
  					= ComboBox , JList
  					= itemStateChanged()
  		================================================	
  		2. 데이터베이스 연결
  			Connection
  			Statement
  			ResultSet
  		================================================
  		
 */
  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	
	
	// 위에 J시리즈 초기화 => 메모리에 저장(생성자)
	public MainClass2()
	{
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("C:\\javaDev\\air.png"));
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("박문수");
		box.addItem("이순신");
		
		
		
		//Jframe => BorderLayout  // 윈도우창에 놓을 위치
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		// East, West
		
		//화면크기
		setSize(450, 500);
		setVisible(true);
		
		
	// 이벤트등록
	// => b1이라는 버튼을 클리하면 => actionPerformed()호출
	b1.addActionListener(this); 	// this => 자신(MainClass2)    => 다른곳에서 처리하면 처리되는 (this대신) class의 이름을 넣어준다 
	tf.addActionListener(this);		//							  => 예) b1.addActionListener(joinForm); 						
	la.addMouseListener(this);
	box.addItemListener(this);
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			if(e.getClickCount()==2)								  // 2번 클릭(더블ㄹ클릭)했을때
			{
				JOptionPane.showMessageDialog(this, "상세보기로 이동");    //  메시지창 뜸
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)  //클릭한게 뭐냐
		{
			JOptionPane.showMessageDialog(this, "버튼클릭");  //this 버튼클릭창을 윈도우에 띄울것인가 // null 입력하면 윈도우 벗어나서 창열림
		}
		else if(e.getSource()==tf) //엔터치면 처리되는 이벤트
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			Object name=box.getSelectedItem();    //getSelectedItem 눌러서 String으로 형변환
			JOptionPane.showMessageDialog(this, name);
			
		}
	}

}
