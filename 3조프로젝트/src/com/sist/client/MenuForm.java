
package com.sist.client;
import java.awt.*;//1'
import javax.swing.*;//1

import javafx.scene.layout.GridPane;
public class MenuForm extends JPanel{ //1

	JButton b1,b2,b3,b4,b5,b6,b7; //2 //�ʱ�ȭ(��ư) => ��ġ(������)
	
	public MenuForm()  //3
	{
//		setBackground(Color.orange);//(10)
		b1=new JButton("Ȩ");        //4
		b2=new JButton("Ebookã��");     //�ϳ��� ������������ �����ؾ�
		b3=new JButton("null");
		b4=new JButton("null");
		b5=new JButton("����");
		b6=new JButton("null");
		b7=new JButton("����");
		
		setLayout(new GridLayout(7,1,5,5));     //5//�׸��巹�̾ƿ� ��ư ����, �޸� ���� �ΰ� ���� �ΰ�
//		setLayout(new FlowLayout(FlowLayout.CENTER,50,100)); //��ġ (����)
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		
//		b1.setPreferredSize(new Dimension(100, 50)); //��ư ũ��
//		b2.setPreferredSize(new Dimension(100, 50));
//		b3.setPreferredSize(new Dimension(100, 50));
//		b4.setPreferredSize(new Dimension(100, 50));
//		b5.setPreferredSize(new Dimension(100, 50));
//		b6.setPreferredSize(new Dimension(100, 50));
//		b7.setPreferredSize(new Dimension(100, 50));
//		

		
	}
	
	

}
