package com.sist.front;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;
import java.util.*;
import java.text.*; //��¥ // SimpleDataFormat
public class BoardMainFrame extends JFrame implements ActionListener{

	
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane();
	
	//���α׷� ���� => ArrayList => BoardMananger
	BoardManager bm= BoardManager();
	
	
	public BoardMainFrame()
	{
			
		tp.addTab("�Խ��� ���",bp);
		tp.addTab("�۾���",bi);
		tp.setTabPlacement(tp.BOTTOM);//���� �Ʒ���
		tp.setSelectedIndex(1);//1�� �Է��ϸ� �ڵ����� �̵�
		
		add("Center",tp);
		
		setSize(640, 480);
		setVisible(true);
		
		bp.b.addActionListener(this);//����
		bi.b1.addActionListener(this);//�۾���
		bi.b2.addActionListener(this);//���
	}
	private BoardManager BoardManager() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		new BoardMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bp.b)//���� ��ư Ŭ��
		{
			//�۾��� ȭ�� �̵�
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1) //�۾��� ��ư
		{
			//ArrayList�� ����
			//�Է��� ������ �б�
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword()); 
			//password�� char[]�� �Ǿ��ִ�
			
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); //ArrayList�� �߰�
			
			listPrint();
			//����߰� => �޼ҵ�
			tp.setSelectedIndex(0);
		}
		else if(e.getSource()==bi.b2)//���
		{
			//������� �̵�
			tp.setSelectedIndex(0);
		}
		
	}
	
	public void listPrint()
	{
		// ArrayList�ޱ�
		ArrayList<BoardVO> list=bm.select();
		
		//���̺� ���
		//���⼭ ���̺� �����
		for(int i=bp.model.getRowCount()-1;i<=0;i--)//���̺� ���ﶩ �Ʒ����� ���� 
		{
			bp.model.removeRow(i);
		}
		
		//���
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //��¥
		// MM(��) mm(��)
		
		for(BoardVO vo:list)
		{
			String[] data= {
				String.valueOf(vo.getNo()), //����(int)�� ����� �� ���� ������ valueOf�� String
				vo.getSubject(),
				vo.getName(),
				//vo.getRegdate().toString(),
				sdf.format(vo.getRegdate()),
				String.valueOf(vo.getHit())
				
			};
			
			bp.model.addRow(data); //=> 
		}
	}
}
