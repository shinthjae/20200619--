package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class MainClass5 extends JFrame {
	JTable table; //���
	DefaultTableModel model; //���̺� �ȿ� �ִ� ������ ���� => MV
	public MainClass5()
	{
		String[] col= {"�̸�","����","�ּ�"};
		Object[][] row=new String[0][4]; //0��(1��) ������ 3���� ���� //String=>Object
		
		model=new DefaultTableModel(row,col) // ��⼭ ������ �� �� �ִ� // �� ����� �޾ƾ߸� ������ �� �� �ִ� �� �ƴϴ� // "�͸��� Ŭ����"
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
			
			
			
		};
		
		
		
		 //���̺� ÷��
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		//�����쿡�߰�
		add("Center",js);
		setSize(350, 450);
		setVisible(true);
		
		//�������߰Ť�
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"ȫ�浿","����","����"};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
//		model.addRow(data);
//		model.addRow(data); //�䷸�� ������ �߰� ����
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}

}
