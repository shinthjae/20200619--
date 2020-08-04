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
	 * 		기능을 만드려면 => 메소드만들기 => 리턴형, 매개변수 를 알아야
	 * 		ex) VO로 받을 것이냐 ArrayList로 받을 것이냐 응용해야
	 * 
	 * 		<오늘은 목표=> VO 만들기>
	 * 
	 * 		jpanel: 일자배치 => setBounds 안써도 됨
	 * 
	 * 		*** NullpointException => 자주 나오는 오류 
	 */
	
	public ListForm()
	{ 
		setLayout(null); // null=>'사용자 정의 배치' 안써주면 JTable이 붙어버린다 
		b1=new JButton("Ebook 1~20");
		b2=new JButton("Ebook 21~40");
		b3=new JButton("Ebook 41~60");
		b4=new JButton("Ebook 61~80");
		b5=new JButton("Ebook 81~99");
		b6=new JButton("검색");
		tf=new JTextField(20); //20글자
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6); //add는 코딩한 순서대로 나옴
		p.setBounds(10, 25, 900, 35);
		add(p);
		
		//
		String[] col= {"번호","","제목","작가","카테고리","등급"}; //빈 "" => 이미지 들어갈 자리
		Object[][] row=new Object[0][5]; //String도 들어가고 이미지(파일아님)도 들어가야해서 => Object
		
	
		model=new DefaultTableModel(row,col) { //Override => isCellEditable, getColumnClass
			
			// isCellEditable => (더블클릭하면) 편집 불가능
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
			// getColumnClass => 이미지 첨부
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
		
		//@2페이지 상제
		table.addMouseListener(this);
	}
	public void movieAllData(int cno)
	{
		//* 데이터 가져오기
		EbookManager m=new EbookManager(); // list가 인스턴스기 때문에 메모리 할당해서 불러온다 <=> 만약 static이 붙어 있으면 공공이기때문에 써서 쓸수 있다
		ArrayList<EbookVO> list=m.ebookAllData(cno);
		
		//* 테이블 한번 지우기 => 위에서부터 지우는게 아니라 밑에서 부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		//* 데이터 출력
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
		
		//*검색(위내용이랑 같음)
		public void movieFindData(String ss)
		{
			//* 데이터 가져오기
			EbookManager m=new EbookManager(); // list가 인스턴스기 때문에 메모리 할당해서 불러온다 <=> 만약 static이 붙어 있으면 공공이기때문에 써서 쓸수 있다
			ArrayList<EbookVO> list=m.ebookFindData(ss);
			
			//* 테이블 한번 지우기 => 위에서부터 지우는게 아니라 밑에서 부터 지운다
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
			}
			
			//* 데이터 출력
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
		//@2페이지 상제
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==table)
			{
				if(e.getClickCount()==2) //더블클릭
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
