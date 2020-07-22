package com.sist.client;
//(1) => Ŭ���� 5�� ���� => ���� �޴��� ����, �ϴ� ä�� ����, ������ ������ �ȵǴ� �κ� ���̾ƿ� �������ټ� �ִ� 'ControllPanel' (���� �ȹٲ��� ��� �˴� ������ �׷��� ���� Ŭ����(controllpanel)����)
//(2) => ����Ÿ�� 

//(3) => MenuForm
//(4) => chatform
//(5) => listform setBackground(Color.pink);

//(6)=> ����Ŭ����-setLayout(null);

//(7) => ����Ŭ���� Ÿ��Ʋ
//(8)~(10) 

//(11) => ����Ŭ����-ä�����߰�
// ��Ʈ���г� 1,2
//(12)
//(13)implements ActionListener

//������������

//(14) ê��Ŭ����- �޺��ڽ�, ����� ���� �����ϸ� ���û������� �ٲ�°� 








//===============================================================================

// ������â����� => JFrame
// ������� ���õ� Ŭ������ �о�´� => 
import javax.swing.*;
import java.awt.*; // ����, ��ġ
import java.awt.event.*; // �������̽�
import java.awt.FlowLayout;

/*
 *    ���� 
 *      = ��� (is-a) : ������ Ŭ������ �����ؼ� ���
 *      public class ClientMainFrame extends JFrame
 *                   ===============
 *                    JFrame�� ����� ��ü ������ �´� 
 *      class A
 *      {
 *         O X W
 *      }
 *      class B extends A
 *      {
 *          O X W
 *      }
 *      = ���� (has-a) : ������ Ŭ������ ������� ���
 *      public class ClientMainFrame
 *      {
 *          JFrame f=new JFrame();
 *      }
 *      
 */
public class ClientMainFrame extends JFrame implements ActionListener{ //(13)implements ActionListener
    // ������ ũ�� ����  => �����ڿ��� ���  ==> 291 page
	
	JLabel title=new JLabel("������ & ������õ����Ʈ",JLabel.CENTER); //(7) Ÿ��Ʋ
	
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm(); //(8)
	
	ControllPanel cp=new ControllPanel();//(12)

	
	public ClientMainFrame()
	{
		/*
		 *   Ŭ�������� ������ ��� => ������ �ƴ϶� => �����Ҷ� 
		 *   ��)
		 *       �����ͺ��̽� : ����Ŭ���� 
		 *       ��Ʈ��ũ : ���� => IP,PORT => �ڵ��� (����)
		 *       �� : ��Ű���� ���б� => �����α��� 
		 */
		
			
		//< Ÿ��Ʋ�κ�>
		title.setOpaque(true);
//		title.setBackground(Color.magenta); //Ÿ��Ʋ ����
		add(title); //(9) 
		
		title.setFont(new Font("����ü",Font.BOLD,55));
		title.setBounds(10, 15, 1570, 100);
		add(title);  //(7-1)
		
		
		//<���ʸ޴���>
		add(mf);//(10-1) ���ʸ޴� �߰�
		mf.setBounds(10, 95, 100, 400); //(8-1)
//		mf.setBounds(10, 95, 1600, 300); //���
	
		
		
		//<ä����>
		cf.setBounds(115, 760, 1465, 200);
		add(cf); //(11)
		
		//<���ȭ��>
		cp.setBounds(115, 120, 1465, 635); //(12-1)
		
		
		setLayout(null); //(6) ����� ���� ��ġ-> null
//		getContentPane().setLayout(null);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// X��ư Ŭ���� ����
		
		mf.b1.addActionListener(this); 
		mf.b2.addActionListener(this); //(13-1)
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // �����ڴ� ȣ��ÿ� �ݵ��  => new ������()
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); //2
		
		new ClientMainFrame();
		
	}
	
	public static Image getImage(ImageIcon ii,int w,int h) //��ũ�⿡ �°� �̹���ũ������ [6]
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }

	@Override
	public void actionPerformed(ActionEvent e) { //(13-2)
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}

