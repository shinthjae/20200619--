package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel {
	
	//스킨
	private Image back;
	JLabel la1,la2;
	// Login 사용
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	// MainForm에서 사용
	public Login()
	{
		//이미지 정보 읽기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\peng.jpg");
		
		setLayout(null); //직접배치
		la1=new JLabel("아이디",JLabel.RIGHT);
		la1.setBounds(350, 400, 80, 30);
		tf=new JTextField();
		tf.setBounds(450, 400, 150, 30);
		   
		add(la1);add(tf);
		
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la2.setBounds(350, 430, 80, 30);
		pf=new JPasswordField();
		pf.setBounds(450, 430, 150, 30);
		
		add(la2);add(pf);
		
		b1=new JButton("로그인");
		b2=new JButton("회원가입");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setOpaque(false);  //불투명모드
		p.setBounds(365, 460, 320, 35);
		add(p);
		   
		
	}
	@Override
	protected void paintComponent(Graphics g) {
	g.drawImage(back,0,0,getWidth(),getHeight(),this);
	

}
}