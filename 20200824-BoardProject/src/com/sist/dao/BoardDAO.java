package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;
public class BoardDAO {
	    //����
		private Connection conn;
		//SQL ����
		private PreparedStatement ps;
		//����Ŭ �ּ�
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		
		//1. ���� ����Ŭ �������ִ� ����̹�
		public BoardDAO()
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(Exception ex) {}
		}
		//2. ����޼ҵ�
		public void getConnection()
		{
			try
			{
				conn=DriverManager.getConnection(URL, "hr", "happy");
			}catch(Exception ex) {}
		}
		//3.�ݴ� �޼ҵ�
		public void disConnection()
		{
			try
			{
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {}
		}
		
		public ArrayList<BoardVO> boardAlldata()
		{
			ArrayList<BoardVO> list=new ArrayList<BoardVO>();
			
			try
			{
				getConnection();
				String sql="SELECT no,subject,name,regdate,hit "
							+"FROM jsp_board";
				
				ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					BoardVO vo=new BoardVO();
					vo.setNo(rs.getInt(1));
					vo.setSubject(rs.getString(2));
					vo.setName(rs.getString(3));
					vo.setRegdate(rs.getDate(4));
					vo.setHit(rs.getInt(5));
					
					list.add(vo);
				}
				rs.close();
				
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
			finally
			{
				disConnection();
			}
			return list;
		}
		
}
