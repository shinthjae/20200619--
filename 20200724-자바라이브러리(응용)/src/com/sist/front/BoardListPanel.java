package com.sist.front;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class BoardListPanel extends JPanel{
	JButton b;
	JTable table; //모양관리 => View
	DefaultTableModel model; //데이터관리 => 수정,추가,출력 => model
	
	
	TableColumn column;
	
	
	public BoardListPanel()
	{
		b=new JButton("새글");
		String[] col= {"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		
		//상속이 없이 재정의가 가능한 클래스 ==> 익명의 클래스
		model=new DefaultTableModel(row,col) {
			public boolean isCellEditable(int r, int c)
			{
				return false;
			}
		};
		
		//테이블상단바 색
		table=new JTable(model);
		table.getTableHeader().setBackground(Color.orange);
		//테이블상단바 움직이지 못한게
		table.setShowVerticalLines(false);
		table.setRowHeight(35); //테두리 없애기
		table.setSelectionForeground(Color.white); //클릭시 글씨색 바꾸기
		table.setSelectionBackground(Color.magenta); //클릭시 배경색(선택라인)바꾸기
		table.getTableHeader().setReorderingAllowed(false);
		
		
		JScrollPane js=new JScrollPane(table);
		
		//배치
		setLayout(null);
		b.setBounds(10, 15, 100, 30);
		js.setBounds(10, 50, 605, 380);
		
		add(b);
		add(js);
		
		//
		for(int i=0;i<5;i++)
		{
   		 	column=table.getColumnModel().getColumn(i);
   		 	DefaultTableCellRenderer render=new DefaultTableCellRenderer();
   		 	if(i==0)
   		 	{
   		 		column.setPreferredWidth(30);
   		 		render.setHorizontalAlignment(JLabel.CENTER);
	   		 }
	   		 else if(i==1)
	   		 {
	   			 column.setPreferredWidth(400);
	   			 render.setHorizontalAlignment(JLabel.LEFT);
	   		 }
	   		 else if(i==2)
	   		 {
	   			 column.setPreferredWidth(60);
	   			 render.setHorizontalAlignment(JLabel.CENTER);
	   		 }
	   		 else if(i==3)
	   		 {
	   			 column.setPreferredWidth(80);
	   			 render.setHorizontalAlignment(JLabel.CENTER);
	   		 }
	   		 else if(i==4)
	   		 {
	   			 column.setPreferredWidth(40);
	   			 render.setHorizontalAlignment(JLabel.CENTER);
	   		 }
	   		 column.setCellRenderer(render);
	   	 }
		
//		//출력
//		String[] data= {"1","ArrayList 연습중입니다","홍길동","2020-07-24","0"};
//		model.addRow(data);
	}
}
