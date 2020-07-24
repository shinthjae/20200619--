package com.sist.front;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;
import java.util.*;
import java.text.*; //날짜 // SimpleDataFormat
public class BoardMainFrame extends JFrame implements ActionListener{

	
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane();
	
	//프로그램 연결 => ArrayList => BoardMananger
	BoardManager bm= BoardManager();
	
	
	public BoardMainFrame()
	{
			
		tp.addTab("게시판 목록",bp);
		tp.addTab("글쓰기",bi);
		tp.setTabPlacement(tp.BOTTOM);//탭을 아래로
		tp.setSelectedIndex(1);//1번 입력하면 자동으로 이동
		
		add("Center",tp);
		
		setSize(640, 480);
		setVisible(true);
		
		bp.b.addActionListener(this);//새글
		bi.b1.addActionListener(this);//글쓰기
		bi.b2.addActionListener(this);//취소
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
		if(e.getSource()==bp.b)//새글 버튼 클릭
		{
			//글쓰기 화면 이동
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1) //글쓰기 버튼
		{
			//ArrayList에 저장
			//입력한 데이터 읽기
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword()); 
			//password는 char[]로 되어있다
			
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); //ArrayList에 추가
			
			listPrint();
			//목록추가 => 메소드
			tp.setSelectedIndex(0);
		}
		else if(e.getSource()==bi.b2)//취소
		{
			//목록으로 이동
			tp.setSelectedIndex(0);
		}
		
	}
	
	public void listPrint()
	{
		// ArrayList받기
		ArrayList<BoardVO> list=bm.select();
		
		//테이블에 출력
		//여기서 테이블 지우기
		for(int i=bp.model.getRowCount()-1;i<=0;i--)//테이블 지울땐 아래부터 비운다 
		{
			bp.model.removeRow(i);
		}
		
		//출력
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //날짜
		// MM(월) mm(분)
		
		for(BoardVO vo:list)
		{
			String[] data= {
				String.valueOf(vo.getNo()), //정수(int)를 사용할 수 없기 때문에 valueOf로 String
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
