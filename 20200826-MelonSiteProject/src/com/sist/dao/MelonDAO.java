package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.sist.manager.MelonVO;



public class MelonDAO {
			//연결
			private Connection conn;
			//SQL 전송
			private PreparedStatement ps;
			//오라클 주소
			private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
			
			//1. 실제 오라클 연결해주는 드라이버
			public MelonDAO()
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
			
			// 기능
			public void melonInsert(MelonVO vo)
			{
				try
				{
					//연결
					getConnection();
					
					//SQL문장
					String sql="INSERT INTO melon VALUES("
								+"melon_mno_seq.nextval,?,?,?,?,?)";
					ps=conn.prepareStatement(sql);
					
					// ?에 값을 채운다
					ps.setInt(1, vo.getCateno());
					ps.setString(2, vo.getTitle());
					ps.setString(3, vo.getPoster());
					ps.setString(4, vo.getSinger());
					ps.setString(5, vo.getAlbum());
					
					ps.executeUpdate();
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally
				{
					disConnection();
				}
			}
			
			// 장르
			public ArrayList<String> melonGenreAllData()
			{
				ArrayList<String> list=
						new ArrayList<String>();
				try
				{
					getConnection();
					String sql="SELECT genre FROM melon_genre "
								+"ORDER BY no";
					ps=conn.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						String genre=rs.getString(1);
						list.add(genre);
					}
					rs.close();
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally
				{
					disConnection();
				}
				return list;
			}
			//music출력
			public ArrayList<MelonVO> melonAllData(int cateno,int page)
			{
				ArrayList<MelonVO> list=
						new ArrayList<MelonVO>();
				try
				{
					getConnection();
					String sql="SELECT mno,title,poster,singer,album,RANK() OVER(ORDER BY mno ASC),num " //페이지 나누기 (num)
								+"FROM (SELECT mno,title,poster,singer,album,rownum as num "
								+"FROM (SELECT mno,title,poster,singer,album "
								+"FROM music WHERE cateno=? ORDER BY mno)) "
								+"WHERE num BETWEEN ? AND ?"; //페이징 기법
					
					int rowSize=30;
					int start=(rowSize*page)-(rowSize-1);
					
					int end=rowSize*page;
					
					ps=conn.prepareStatement(sql);
					ps.setInt(1, cateno);
					ps.setInt(2, start);
					ps.setInt(3, end);
					
					//실행
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						MelonVO vo=new MelonVO();
						vo.setMno(rs.getInt(1));
						vo.setTitle(rs.getString(2));
						vo.setPoster(rs.getString(3));
						vo.setSinger(rs.getString(4));
						vo.setAlbum(rs.getString(5));
						vo.setRank(rs.getInt(6));
						list.add(vo);
					}
					rs.close();
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally
				{
					disConnection();
				}
				return list;
			}
			public String melonGetGenre(int cateno)
			{
				String genre="";
				try
				{
					getConnection();
					
					String sql="SELECT genre FROM melon_genre "
								+"WHERE no=?";
					
					ps=conn.prepareStatement(sql);
					ps.setInt(1, cateno);
					
					ResultSet rs=ps.executeQuery();
					rs.next();
					
					genre=rs.getString(1);
					rs.close();
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally 
				{
					disConnection();
				}
				return genre;
			}

	}


