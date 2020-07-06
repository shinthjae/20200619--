//20200703(5)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import sun.applet.Main;
public class Mainform extends JFrame implements ActionListener{
	JMenuBar bar=new JMenuBar();       // 메뉴바 (File, Edit....)
	JMenuItem open=new JMenuItem("열기");
	JMenuItem save=new JMenuItem("저장");  
	JMenuItem copy=new JMenuItem("복사");
	JMenuItem close=new JMenuItem("종료");
	
	//생성자 => 클래스저장
	public Mainform() {
		JMenu file=new JMenu("파일");
		file.add(open);
		file.add(save);
		file.add(copy);
		file.add(close);
		bar.add(file);
		
		//윈도우 올리기
		 setJMenuBar(bar);
		//윈도우 크기 결정
		 setSize(1024, 768);
		 setVisible(true); //윈도우를 보여준다
		 
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
			JOptionPane.showMessageDialog(this, "파일열기선택");
		}
		else if(e.getSource()==save){
			JOptionPane.showMessageDialog(this, "파일열기선택");
		}
		else if(e.getSource()==copy){
			JOptionPane.showMessageDialog(this, "파일열기선택");
		}
		else if(e.getSource()==close){
			JOptionPane.showMessageDialog(this, "파일열기선택");
		}
		
		{
		
	}
	}
}



