package com.sist.client;

import java.awt.*; // graphics *로 바꾸기


import javax.swing.*;

import sun.net.www.content.image.jpeg;
// JPanel 가지고 있는 모든 기능을 가지고 온다
// JoinForm=JPanel

/*
 *		class A ===============> 데이터형 A
 *		class B extends A =====> 데이터형 B,A
 *
 *		class 동물
 *		동물 a=new 동물()
 *		Object obj=new 동물() //=> Object는 어떤 데이터든 다 받음
 *		class 남자 extends 동물 ==> 남자, 동물 데이터형이 2개
 *		남자 a=new 남자()
 *		동물 a=new 남자()
 *			
 *		==> 상속 
 *			모든 클래스는 Object 상속을 가지고 있다
 *
 */

//	public static void main(String[] args) {
//		JoinForm f=new JoinForm();
//		JPanel p=new JoinForm();
//		Object obj=new JoinForm();   // Object로도 쓸 수 있다
//		
//		
//	}

public class JoinForm extends JPanel {     //회원가입
	
	private Image back;
	
	JLabel title=new JLabel("회원가입",JLabel.CENTER);
	JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,la10,la11; //아이디중복체크,비밀번호, 성명  ,성별,우편번호,주소,상세주소,전화번호,소개,취미
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	JLabel dash=new JLabel("-");
	JButton b2=new JButton("우편번호검색");
	JPasswordField pf1,pf2;
	JRadioButton rb1,rb2;
	JTextArea ta;
	JCheckBox box1,box2,box3,box4,box5;
	
	//초기화
	JButton b1;
	JComboBox telBox=new JComboBox();
	JTextField tf7,tf8;
	JLabel dash2=new JLabel("-");
	JButton b3=new JButton("회원가입");
	JButton b4=new JButton("취소");
	
	
	public JoinForm()
	{
		
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\peng3.jpg");
		
		
		la1=new JLabel("아이디",JLabel.RIGHT);     // JLabel.RIGHT  오른쪽정렬
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la3=new JLabel("재입력",JLabel.RIGHT);
		la4=new JLabel("이름",JLabel.RIGHT);
		la5=new JLabel("성별",JLabel.RIGHT);
		la6=new JLabel("우편번호",JLabel.RIGHT);
		la7=new JLabel("주소",JLabel.RIGHT);
		la8=new JLabel("상세주소",JLabel.RIGHT);
		la9=new JLabel("전화번호",JLabel.RIGHT);
		la10=new JLabel("소개",JLabel.RIGHT);
		la11=new JLabel("레시피",JLabel.RIGHT);
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();
		
		pf1=new JPasswordField();
		
		pf2=new JPasswordField();
		
		rb1=new JRadioButton("남자");
		rb2=new JRadioButton("여자");
		ButtonGroup gb=new ButtonGroup();   //라디오버튼은 1개만 체크되어야한다   <=> 체크버튼은 다중 선택 가능 
		gb.add(rb1);
		gb.add(rb2);   
		
		b1=new JButton("중복체크");
		
		title.setFont(new Font("굴림체",Font.BOLD,45));   // HTML => <h1><b>회원가입</b></h1>
		
		// 배치
		setLayout(null); // 사용자 정의 배치
		title.setBounds(10, 15, 1000, 55);
		
		// 추가
		add(title);
		
		la1.setBounds(300, 100, 80, 30);			//아이디
		tf1.setBounds(385, 100, 200, 30);
		b1.setBounds(590, 100, 150, 30);
		add(la1);add(tf1);add(b1);
		
		la2.setBounds(300, 135, 80, 30);			//비밀번호
		pf1.setBounds(385, 135, 200, 30);
		add(la2);add(pf1);
		
		la3.setBounds(300, 170, 80, 30);			//재입력
		pf2.setBounds(385, 170, 200, 30);
		add(la3);add(pf2);
		
		la4.setBounds(300, 205, 80, 30);			//이름
		tf2.setBounds(385, 205, 200, 30);
		add(la4);add(tf2);
		
		la5.setBounds(300, 240, 80, 30);			//성별
		rb1.setBounds(385, 240, 95, 30);
		rb2.setBounds(485, 240, 95, 30);
		
		add(la5);add(rb1);add(rb2);
		
		la6.setBounds(300, 275, 80, 30);			//우편번호
		tf3.setBounds(385, 275, 100, 30);
		dash.setBounds(500, 275, 20, 30);	
		tf4.setBounds(525, 275, 100, 30);
		b2.setBounds(630, 275, 150, 30);	
		add(la6);add(tf3);add(dash);add(tf4);add(b2);
		
		la7.setBounds(300, 310, 80, 30);			//주소
		tf5.setBounds(385, 310, 450, 30);
		add(la7);add(tf5);
		
		la8.setBounds(300, 345, 80, 30);			//상세주소
		tf6.setBounds(385, 345, 450, 30);
		add(la8);add(tf6);
		
		telBox.addItem("010");
		telBox.addItem("011");
		telBox.addItem("017");
		
		la9.setBounds(300, 380, 80, 30);			//전화번호
		telBox.setBounds(385, 380, 100, 30);
		tf7.setBounds(490, 380, 100, 30);
		dash.setBounds(595, 380, 10, 30);	
		tf8.setBounds(620, 380, 100, 30);
		add(la9);add(telBox);add(tf7);add(dash);add(tf8);
		
		ta=new JTextArea();
		JScrollPane js= new JScrollPane();   // 세로 스크롤 , 이게 꼭 있어야함
		
		la10.setBounds(300, 415, 80, 30);
		js.setBounds(385, 415, 450, 200);
		add(la10);add(js);
		
		box1=new JCheckBox("국/탕"); 					//레시피
		box2=new JCheckBox("디저트");
		box3=new JCheckBox("샐러드");
		box4=new JCheckBox("술안주");
		box5=new JCheckBox("야식");
		
		JPanel p=new JPanel();                                             
		p.add(box1);p.add(box2);p.add(box3);p.add(box4);p.add(box5);
		la11.setBounds(300, 620, 80, 30);
		p.setBounds(385, 620, 450, 35);
		
		
		add(la11);add(p);
										
		JPanel p2=new JPanel();                        //회원가입 버튼
		p2.add(b3);p2.add(b4);
		p2.setBounds(300, 665, 485, 35);
		add(p2);
		
		// JPanel 주위 깨끗하게 불투명모드
		p.setOpaque(false);
		p2.setOpaque(false);
		rb1.setOpaque(false);
		rb2.setOpaque(false);
		box1.setOpaque(false);
		box2.setOpaque(false);
		box3.setOpaque(false);
		box4.setOpaque(false);
		box5.setOpaque(false);
		
		
	}
   
	@Override // 텍스트 지워도 됨 알려주는 애
	protected void paintComponent(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
	}  
	

	
	
	
	
}
