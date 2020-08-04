package com.sist.client;

import java.awt.*;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.data.*;
import java.net.*;

public class ListForm extends JPanel implements MouseListener{ 
	JButton b1,b2,b3,b4,b5,b6;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MovieDetailForm mdf=new MovieDetailForm();
	/*
	 * 		����� ������� => �޼ҵ常��� => ������, �Ű����� �� �˾ƾ�
	 * 		ex) VO�� ���� ���̳� ArrayList�� ���� ���̳� �����ؾ�
	 * 
	 * 		<������ ��ǥ=> VO �����>
	 * 
	 * 		jpanel: ���ڹ�ġ => setBounds �Ƚᵵ ��
	 * 
	 * 		*** NullpointException => ���� ������ ���� 
	 */
	
	public ListForm()
	{ 
		setLayout(null); // null=>'����� ���� ��ġ' �Ƚ��ָ� JTable�� �پ������ 
		b1=new JButton("Ebook 1~20");
		b2=new JButton("Ebook 21~40");
		b3=new JButton("Ebook 41~60");
		b4=new JButton("Ebook 61~80");
		b5=new JButton("Ebook 81~99");
		b6=new JButton("�˻�");
		tf=new JTextField(20); //20����
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6); //add�� �ڵ��� ������� ����
		p.setBounds(10, 25, 900, 35);
		add(p);
		
		//
		String[] col= {"��ȣ","","����","�۰�","ī�װ�","���"}; //�� "" => �̹��� �� �ڸ�
		Object[][] row=new Object[0][5]; //String�� ���� �̹���(���Ͼƴ�)�� �����ؼ� => Object
		
	
		model=new DefaultTableModel(row,col) { //Override => isCellEditable, getColumnClass
			
			// isCellEditable => (����Ŭ���ϸ�) ���� �Ұ���
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
			// getColumnClass => �̹��� ÷��
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		
		table=new JTable(model);
		table.setRowHeight(50);
		JScrollPane js=new JScrollPane(table);
		
		js.setBounds(10, 70, 700, 560);
		add(js);
		
		mdf.setBounds(715, 70, 800, 650);
		add(mdf);
		movieAllData(1);
		mdf.detailPrint(1);
		
		//@2������ ����
		table.addMouseListener(this);
	}
	public void movieAllData(int cno)
	{
		//* ������ ��������
		EbookManager m=new EbookManager(); // list�� �ν��Ͻ��� ������ �޸� �Ҵ��ؼ� �ҷ��´� <=> ���� static�� �پ� ������ �����̱⶧���� �Ἥ ���� �ִ�
		ArrayList<EbookVO> list=m.ebookAllData(cno);
		
		//* ���̺� �ѹ� ����� => ���������� ����°� �ƴ϶� �ؿ��� ���� �����
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		//* ������ ���
		for(EbookVO vo:list)
		{
			try
			{	 URL url=new URL(vo.getPoster()); //http: , c:\\image
				Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				
				Object[] data= {
					vo.getMno(),
					new ImageIcon(img),
					vo.getTitle(),
					vo.getWriter(),
					vo.getCategory(),
					vo.getGrade()
				};
				
			model.addRow(data);
			
			}catch(Exception ex) {ex.printStackTrace();}
		}
	}
		
		//*�˻�(�������̶� ����)
		public void movieFindData(String ss)
		{
			//* ������ ��������
			EbookManager m=new EbookManager(); // list�� �ν��Ͻ��� ������ �޸� �Ҵ��ؼ� �ҷ��´� <=> ���� static�� �پ� ������ �����̱⶧���� �Ἥ ���� �ִ�
			ArrayList<EbookVO> list=m.ebookFindData(ss);
			
			//* ���̺� �ѹ� ����� => ���������� ����°� �ƴ϶� �ؿ��� ���� �����
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
			}
			
			//* ������ ���
			for(EbookVO vo:list)
			{
				try
				{	 URL url=new URL(vo.getPoster()); //http: , c:\\image
					Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
					
					Object[] data= {
						vo.getMno(),
						new ImageIcon(img),
						vo.getTitle(),
						vo.getWriter(),
						vo.getCategory(),
						vo.getGrade()
					};
					
				model.addRow(data);
				
				}catch(Exception ex) {ex.printStackTrace();}
		}
			
		
}
		//@2������ ����
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==table)
			{
				if(e.getClickCount()==2) //����Ŭ��
				{
					int row=table.getSelectedRow();
					String mno=model.getValueAt(row, 0).toString();
					mdf.detailPrint(Integer.parseInt(mno));
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

}
