package com.sist.dao;
import java.sql.*;

import java.util.*;

import com.sist.manager.MovieVO;
import com.sist.manager.NewsVO;
import com.sist.manager.ReplyVO;
import com.sist.recipe.ChefVO;
import com.sist.recipe.RecipeVO;

import sun.awt.RepaintArea;
public class MovieDAO {
		//연결
		private Connection conn; //오라클 연결 클래스
		
		//SQL문장을 전송
		private PreparedStatement ps;
		
		//오라클 주소 첨부
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		
		///연결준비
		// 1.드라이버 등록
		public MovieDAO() 
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
		//연결/닫기 반복 => 기능이 반복일 경우 => 메소드로 처리
		public void getConnection()
		{
			try {
				conn=DriverManager.getConnection(URL,"hr","happy");
			}catch(Exception ex){}
		}
		public void disConnection()
		{
			try {
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {}
		}
		
		// 기능
		// 1. 저장 => INSERT
		//       	여기 INSERT,UPDATE,DELETE가 나올때 => 결과값이 없다(void)
		
		//vo에 모아논 전체 데이터를 활용할 것인가 => 이 방법이 좋다 
		public void movieInsert(MovieVO vo)
		{
			try 
			{
				getConnection();
				String sql="INSERT INTO daum_movie VALUES("
							+"(SELECT NVL(MAX(no)+1,1) FROM daum_movie),?,?,?,?,?,?,?,?,?,?,?)"; //데이터가 총11개 라서 물음표 10개
				ps=conn.prepareStatement(sql);
				
				// ?에 값을 채운다
				ps.setInt(1, vo.getCateno());
				ps.setString(2, vo.getTitle());
				ps.setString(3, vo.getPoster());
				ps.setString(4, vo.getRegdate());
				ps.setString(5, vo.getGenre());
				ps.setString(6, vo.getGrade());
				ps.setString(7, vo.getActor());
				ps.setString(8, vo.getScore());
				ps.setString(9, vo.getDirector());
				ps.setString(10, vo.getStory());
				ps.setString(11, vo.getKey());
				
				//실행명령
				ps.executeUpdate();
				
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			/*
			 * finally {
			 * 		disConnection();
			 * }
			 */
		}
		
		public void newsInsert(NewsVO vo)
		{
			try
			{
				getConnection();
				String sql="INSERT INTO daum_news VALUES("
						+"?,?,?,?,?)"; 
			ps=conn.prepareStatement(sql);
			
			// ?에 값을 채운다
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getPoster());
			ps.setString(3, vo.getLink());
			ps.setString(4, vo.getContent());
			ps.setString(5, vo.getAuthor());
			
			
			//실행명령
			ps.executeUpdate();
			
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			finally {
				disConnection();
			}
		}
		
		public ArrayList<MovieVO> movieListData(int cno)
		{
			ArrayList<MovieVO> list=new ArrayList<MovieVO>();
			try
			{
				// 연결
				getConnection();
				// SQL문장 
				String sql="SELECT poster,title,no FROM daum_movie "
						  +"WHERE cateno=? ORDER BY no";
				ps=conn.prepareStatement(sql);
				ps.setInt(1, cno);
				// 전송
				
				// 실행후네 데이터를 받는다 
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					MovieVO vo=new MovieVO();
					vo.setPoster(rs.getString(1));
					vo.setTitle(rs.getString(2));
					vo.setNo(rs.getInt(3));
					
					// ArrayList에 첨부
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
		
		public ArrayList<NewsVO> newsListData()
		{
			ArrayList<NewsVO> list=new ArrayList<NewsVO>();
			try
			{
				getConnection();
				String sql="SELECT title,link,author,poster,content "
						  +"FROM daum_news";
				ps=conn.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					NewsVO vo=new NewsVO();
					vo.setTitle(rs.getString(1));
					vo.setLink(rs.getString(2));
					vo.setAuthor(rs.getString(3));
					vo.setPoster(rs.getString(4));
					vo.setContent(rs.getString(5));
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
		
		// 영화 상세보기 VO(영화 한개에 대한 모든 정보)
		public MovieVO movieDetailData(int no)
		{
			MovieVO vo=new MovieVO();
			try
			{
				//연결
				getConnection();
				//SQL전송
				String sql="SELECT * FROM daum_movie "
							+"WHERE no=?";
				ps=conn.prepareStatement(sql);
				//실행요청하기 전에 ?에 값을 채운다
				ps.setInt(1, no);
				//결과값받기 
				ResultSet rs=ps.executeQuery(); //실행
				rs.next(); //커서이동(데이터가 출력된 위치)
				
				 vo.setNo(rs.getInt(1));
			     vo.setCateno(rs.getInt(2));
			     vo.setTitle(rs.getString(3));
			     vo.setPoster(rs.getString(4));
			     vo.setRegdate(rs.getString(5));
			     vo.setGenre(rs.getString(6));
			     vo.setGrade(rs.getString(7));
			     vo.setActor(rs.getString(8));
			     vo.setScore(rs.getString(9));
			     vo.setDirector(rs.getString(10));
			     vo.setStory(rs.getString(11));
			     vo.setKey(rs.getString(12));
			     
				 rs.close();
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}finally
			{
				disConnection();
			}
			return vo;
		}
		
		//댓글관련 => INSERT, UPDATE, DELETE
		public ArrayList<ReplyVO> movieReplyData(int mno)
		{
			ArrayList<ReplyVO> list=new ArrayList<ReplyVO>();
			try
			{
				getConnection();
				String sql="SELECT no,mno,id,msg,TO_CHAR(regdate,'YYYY-MM-DD HH24:MI:SS') "
							+"FROM daum_reply "
							+"WHERE mno=? "
							+"ORDER BY no DESC"; 
				
				ps=conn.prepareStatement(sql);
				ps.setInt(1, mno);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					ReplyVO vo=new ReplyVO();
					vo.setNo(rs.getInt(1));
					vo.setMno(rs.getInt(2));
					vo.setId(rs.getString(3));
					vo.setMsg(rs.getString(4));
					vo.setDbday(rs.getString(5));
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
		
		//댓글달기(2)
		public void movieReplyInsert(ReplyVO vo)
		{
			try
			{
				getConnection();
				
				String sql="INSERT INTO daum_reply VALUES("
							+"(SELECT NVL(MAX(no)+1,1) FROM daum_reply),"
							+"?,?,?,SYSDATE)";
				ps=conn.prepareStatement(sql);
				
				//?값을 채운다
				ps.setInt(1, vo.getMno());
				ps.setString(2, vo.getId());
				ps.setString(3, vo.getMsg());
				
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
		
		
		//레시피저장
		public void recipeInsert(RecipeVO vo)
		{
			try
			{
				getConnection();
				String sql="INSERT INTO recipe VALUES("
						+"(SELECT NVL(MAX(no)+1,1) FROM recipe),?,?,?,?)"; 
			ps=conn.prepareStatement(sql);
			
			// ?에 값을 채운다
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getPoster());
			ps.setString(3, vo.getChef());
			ps.setString(4, vo.getLink());
			
			
			//실행명령
			ps.executeUpdate();
			
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			finally {
				disConnection();
			}
		}
		
		//
		 public void chefInsert(ChefVO vo)
		   {
		      try {
		         //연결
		         getConnection();
		         
		         //sql
		         String sql="INSERT INTO chef VALUES(?,?,?,?,?,?)";
		         //전송
		         ps=conn.prepareStatement(sql);
		         ps.setString(1,vo.getPoster());
		         ps.setString(2,vo.getChef());
		         ps.setString(3,vo.getMem_cont1());
		         ps.setString(4,vo.getMem_cont3());
		         ps.setString(5,vo.getMem_cont7());
		         ps.setString(6,vo.getMem_cont2());
		         
		         //실행
		         ps.executeUpdate();
		      }catch (Exception e) {
		         e.printStackTrace();
		      }finally {
		         disConnection();
		      }
		   }
		 
		 // 로그인
		 /*
		  * 	목록 ===> ArrayList
		  * 	상세보기 ==> ~VO
		  * 	경우의 수 
		  * 		2개일때 =====> boolean
		  * 			ID중복 => boolean
		  * 		3개이상
		  * 			String , int 
		  * 
		  * 			ID가 없는 경우
		  * 			PWD가 틀리다
		  * 			로그인
		  */
		 public String isLogin(String id,String pwd)
		 {
			 String result="";
			 try
			 {
				 getConnection();
				 String sql="SELECT COUNT(*) FROM member "
						 	+"WHERE id=?"; //ID가 존재?
				 
				ps=conn.prepareStatement(sql);
				ps.setString(1, id);
				ResultSet rs=ps.executeQuery();
				rs.next();
				int count=rs.getInt(1);
				rs.close();
				
				if(count == 0) //ID가 없는 상태
				{
					result="NOID";
				}
				else
				{
					sql="SELECT pwd FROM momber "
						+"WHERE id=?";
					ps=conn.prepareStatement(sql);
					ps.setString(1, id);
					
					rs=ps.executeQuery();
					rs.next();
					String db_pwd=rs.getString(1);
					rs.close();
					
					if(db_pwd.equals(pwd)) //Login
					{
						result="OK";
					}
					else //비밀번호가 틀린상태
					{
						result="NOPWD";
					}
				}
			 }catch(Exception ex)
			 {
				 
			 }
			 finally
			 {
				 disConnection();
			 }
			return result;
		 }
		 
		 ///
		 public void replyDelete(int no)
		 {
			 try
			 {
				 getConnection();
				 String sql="DELETE FROM daum_reply "
						 	+"WHERE no=?";
				 
				 //전송
				 ps=conn.prepareStatement(sql);
				 ps.setInt(1, no);
				 
				 ps.executeUpdate();
			 }catch(Exception ex)
			 {
				 ex.printStackTrace();
			 }
			 finally
			 {
				 disConnection();
			 }
		 }
		
}