package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel {
	
	//��Ų
	private Image back;
	JLabel la1,la2;
	// Login ���
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	// MainForm���� ���
	public Login()
	{
		//�̹��� ���� �б�
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\peng.jpg");
		
		setLayout(null); //������ġ
		la1=new JLabel("���̵�",JLabel.RIGHT);
		la1.setBounds(350, 400, 80, 30);
		tf=new JTextField();
		tf.setBounds(450, 400, 150, 30);
		   
		add(la1);add(tf);
		
		la2=new JLabel("��й�ȣ",JLabel.RIGHT);
		la2.setBounds(350, 430, 80, 30);
		pf=new JPasswordField();
		pf.setBounds(450, 430, 150, 30);
		
		add(la2);add(pf);
		
		b1=new JButton("�α���");
		b2=new JButton("ȸ������");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setOpaque(false);  //��������
		p.setBounds(365, 460, 320, 35);
		add(p);
		   
		
	}
	@Override
	protected void paintComponent(Graphics g) {
	g.drawImage(back,0,0,getWidth(),getHeight(),this);
	

}
}