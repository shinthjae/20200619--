package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class MainClass5 extends JFrame {
	JTable table; //모양
	DefaultTableModel model; //테이블 안에 있는 데이터 제어 => MV
	public MainClass5()
	{
		String[] col= {"이름","성별","주소"};
		Object[][] row=new String[0][4]; //0줄(1줄) 데이터 3개거 들어간다 //String=>Object
		
		model=new DefaultTableModel(row,col) // 요기서 재정의 할 수 있다 // 꼭 상속을 받아야만 재정의 할 수 있는 건 아니다 // "익명의 클래스"
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
		
		
		
		 //테이블에 첨부
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		//윈도우에추가
		add("Center",js);
		setSize(350, 450);
		setVisible(true);
		
		//데이터추거ㅏ
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"홍길동","남자","서울"};
		model.addRow(data);
		model.addRow(data);
		model.addRow(data);
//		model.addRow(data);
//		model.addRow(data); //요렇게 데이터 추가 가능
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}

}
