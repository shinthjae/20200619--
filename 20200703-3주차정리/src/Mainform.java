//20200703(5)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import sun.applet.Main;
public class Mainform extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();       // �޴��� (File, Edit....)
	JMenuItem open=new JMenuItem("����");
	JMenuItem save=new JMenuItem("����");  
	JMenuItem copy=new JMenuItem("����");
	JMenuItem close=new JMenuItem("����");
	
	//������ => Ŭ��������
	public Mainform() {
		JMenu file=new JMenu("����");
		file.add(open);
		file.add(save);
		file.add(copy);
		file.add(close);
		bar.add(file);
		
		//������ �ø���
		 setJMenuBar(bar);
		//������ ũ�� ����
		 setSize(1024, 768);
		 setVisible(true); //�����츦 �����ش�
		 
		 open.addActionListener(this);
		 open.addActionListener(this);
		 open.addActionListener(this);
		 open.addActionListener(this);

	}

	public static Main main(String[] args) {
		// TODO Auto-generated method stub
		new Mainform();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		if(e.getSource()==open){
			JOptionPane.showMessageDialog(this, "���Ͽ��⼱��");
		}
		else if(e.getSource()==save){
			JOptionPane.showMessageDialog(this, "���Ͽ��⼱��");
		}
		else if(e.getSource()==copy){
			JOptionPane.showMessageDialog(this, "���Ͽ��⼱��");
		}
		else if(e.getSource()==close){
			JOptionPane.showMessageDialog(this, "���Ͽ��⼱��");
		}
		
		{
		
	}
	}
}



