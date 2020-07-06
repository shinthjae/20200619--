//20200703(8)

//	로그인 처리

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
public class 문자열3 extends JFrame implements ActionListener{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	JLabel poster=new JLabel();
	final String ID="admin";
	final String PWD="1234";
	
	public 문자열3() 
	{
		la1=new JLabel("ID");
		la2=new JLabel("PW");
		pf=new JPasswordField();
		tf=new JTextField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
				
		String s="https://movie-phinf.pstatic.net/20200610_45/1591752004615kLWYv_JPEG/movie_image.jpg";
		try
		{
			poster.setIcon(new ImageIcon(new URL(s)));
		}catch(Exception ex) {}
		
		setLayout(null);
		
		la1.setBounds(10,15,30,30);
		tf.setBounds(45,15,150,30);
		la2.setBounds(10,50,30,30);
		pf.setBounds(45,50,150,30);
		
		
		
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		p.setBounds(10,90,195,35);
		add(la1);add(tf);
		add(la2);add(pf);
		add(p);
		
		poster.setBounds(10,135,300,300);
		add(poster);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this); //로그인
		b2.addActionListener(this); // 취소
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new 문자열3();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)  //로그인 버튼 클릭
		{
			String id=tf.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요!!");
				tf.requestFocus();
				return;
			}
			
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "Password를 입력하세요!!");
				pf.requestFocus();
				return;
			}
			
			// 입력이 완료
			// 처리
			if(id.equalsIgnoreCase(ID))
			{
				if(pwd.equals(PWD))
				{
					JOptionPane.showMessageDialog(this,id+"님이 로그인되었습니다");
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Password가 틀립니다");
					pf.setText("");
					pf.requestFocus();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this, "ID가 존재하지 않습니다");
				tf.setText("");
				pf.setText("");
				tf.requestFocus();
			}
			}
		
	
		if(e.getSource()==b2)  //취소
		{
			System.exit(0); //정상종료 
		}
		}
		
	}

