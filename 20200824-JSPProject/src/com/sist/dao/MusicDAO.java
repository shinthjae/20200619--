package com.sist.dao;
/*
 * 	제어문(출력) , 변수(데이터 모우기) ,
 * 	예외처리(오라클 연결)
 * 
 * 	오라클 연결 => ArrayList => add() , get() , size()
 */
import java.sql.*; //Connection, PrepareedStatemen,ResultSet
import java.util.*; // ArrauList
public class MusicDAO {
	//연결
	private Connection conn;
	//SQL 전송
	private PreparedStatement ps;
	//오라클 주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//1. 실제 오라클 연결해주는 드라이버
	public MusicDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	//2. 연결메소드
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL, "hr", "happy");
		}catch(Exception ex) {}
	}
	//3.닫는 메소드
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	
	// DAO(JDBC => 기본셋팅)
	// 기능 => MusicTop200
	public ArrayList<MusicVO> musicAllData()
	{
		ArrayList<MusicVO> list=
				new ArrayList<MusicVO>();
		try
		{
			getConnection(); //연결
			String sql="SELECT mno,title,singer,album,poster "
					+"FROM genie_music";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				MusicVO vo=new MusicVO();
				vo.setMno(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setSinger(rs.getString(3));
				vo.setAlbum(rs.getString(4));
				vo.setPoster(rs.getString(5));
				
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
	// 영화 => 출력
	
	public ArrayList<MovieVO> movieAllData()
	{
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		
		try
		{
			getConnection();
			String sql="SELECT no,title,director,actor,poster "
						+"FROM daum_movie";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				MovieVO vo=new MovieVO();
				vo.setNo(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setDirector(rs.getString(3));
				vo.setActor(rs.getString(4));
				vo.setPoster(rs.getString(5));
				
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
