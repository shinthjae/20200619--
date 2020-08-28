package com.sist.dao;

import java.sql.*;
import java.util.*;




public class ReplyBoardDAO {
		 //연결
		private Connection conn;
		//SQL 전송
		private PreparedStatement ps;
		//오라클 주소
		private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
		
		//1. 실제 오라클 연결해주는 드라이버
		public ReplyBoardDAO()
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
	
		// 1. 목록출력 => 페이지 나누기
		public ArrayList<ReplyBoardVO> boardListData(int page)
		{
			ArrayList<ReplyBoardVO> list=
					new ArrayList<ReplyBoardVO>();
			try
			{
				getConnection();
				String sql="SELECT no,subject,name,regdate,hit,group_tab,num "
						  +"FROM (SELECT no,subject,name,regdate,hit,group_tab,rownum as num "
						  +"FROM (SELECT no,subject,name,regdate,hit,group_tab "
						  +"FROM replyBoard ORDER BY group_id DESC,group_step ASC)) "
						  +"WHERE num BETWEEN ? AND ?";
						  /* 
						   *                         group_id  group_step
						   *        AAAAAA             2           0
						   *          ->BBBBB          2           1
						   *           ->CCCCCC        2           2
						   *          ->KKKKKK         2           3
						   *        DDDDDD             1           0
						   */
				ps=conn.prepareStatement(sql);
				int rowSize=10;
				int start=(rowSize*page)-(rowSize-1);
				int end=rowSize*page;
				
				// ? 에 값 채우기 
				ps.setInt(1, start);
				ps.setInt(2, end);
				
				// 실행후에 결과 값 읽기
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					ReplyBoardVO vo=new ReplyBoardVO();
					vo.setNo(rs.getInt(1));
					vo.setSubject(rs.getString(2));
					vo.setName(rs.getString(3));
					vo.setRegdate(rs.getDate(4));
					vo.setHit(rs.getInt(5));
					vo.setGroup_tab(rs.getInt(6));
					
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
			
		// 1-1 전체갯수
			public int boardRowCount()
			{
				int count=0;
				try
				{
					getConnection();
					String sql="SELECT COUNT(*) FROM replyBoard";
					ps=conn.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					rs.next();
					count=rs.getInt(1);
					rs.close();
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally
				{
					disConnection();
				}
				return count;
			}
			
		// 2. 상세보기
			// 매개변수 => 사용자가 보내준 데이터
			public ReplyBoardVO boardDetail(int no)
			{
				ReplyBoardVO vo=new ReplyBoardVO();
				try
				{
					getConnection();
					String sql="UPDATE replyBoard SET "
								+"hit=hit+1 " //조회수증가
								+"WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, no);
					ps.executeUpdate();
					
					//증가된 조회수 읽기
					sql="SELECT no,name,subject,content,regdate,hit "
						+"FROM replyBoard "
						+"WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, no);
					
					//결과값
					ResultSet rs=ps.executeQuery();
					
					//커서 위치 변경 => 데이터 출력위치에 커서변경
					rs.next();
					vo.setNo(rs.getInt(1));
					vo.setName(rs.getString(2));
					vo.setSubject(rs.getString(3));
					vo.setContent(rs.getString(4));
					vo.setRegdate(rs.getDate(5));
					vo.setHit(rs.getInt(6));
					
					rs.close();
					
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally
				{
					disConnection();
				}
				return vo;
			}
			
		// 3. 새글등록 => INSERT
			public void boardInsert(ReplyBoardVO vo)
			{
				try
				{
					getConnection();
					String sql="INSERT INTO replyBoard(no,name,subject,content,pwd,group_id) " 
					         + "VALUES(rb_no_seq.nextval,?,?,?,?,"
							 +"(SELECT NVL(MAX(group_id)+1,1) FROM replyBoard))"; 
					ps=conn.prepareStatement(sql);
					ps.setString(1, vo.getName());
					ps.setString(2, vo.getSubject());
					ps.setString(3, vo.getContent());
					ps.setString(4, vo.getPwd());
					
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
			
		// 4. 답변하기 => SQL => 합쳐서 처리 (서브쿼리)
			/*
			 *                no   gi   gs   gt  root depth
			 *   AAAAAAA      1     1   0    0    0    0
			 *     =>BBBBBB   2     1   1    1
			 */
			public void boardReplyInsert(int root,ReplyBoardVO vo)
			{
				try
				{
					getConnection();
					
					// 1) 답변 대상의 group_id,group_step,group_tab
					/*
					 *                		no   		gi   	gs    	gt  	root 	depth
					 *   AAAAAAA      		1    		1   	0    	0    	0    	0
					 *   칸간격  =>BBBBBB  		2(root)     1   	1(+1)  	1(+1)
					 *     		=>CCCCCC  	3			1		2		2
					 *     		  =>DDDDDD 	4			1		3		3
					 *   		
					 *     
					 *     *** 	gs값을 알아야지 다음 댓글을 적을 수 있다
					 *     *** 	본게시글에 댓글 대댓글..은 한 그룹으로 있어야한다 => group_id
					 *     	  	그룹에서 순서 => group_step
					 *     		칸간격 => group_tab
					 *     *** 	root 그전에 게시글?
					 *     		depth 영향이되는 게시글
					 */
					
					String sql="SELECT group_id,group_step,group_tab "
								+"FROM replyBoard "
								+"WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, root);
					ResultSet rs=ps.executeQuery();
					rs.next();
					int gi=rs.getInt(1); // gi
					int gs=rs.getInt(2); // gs+1
					int gt=rs.getInt(3); // gt+1
					rs.close();
					
					
					// 1) 영향받는 게시글 다 지우기
					// 2) 삭제한 게시물만 "관리자가 삭제한 게시물입니다" 출력
					
					//* 문제발생
					//	 => 밑에 바껴진 게시글 group_step을 +1씩 해준다 (가장 최신 댓글을 본문 아래로 위치시킨다)
									/*
									 * 		AAAAA
									 * 			=>BBBBB
									 * 			=>
									 * 
									 * 	*** 오라클에서는 먼저 나온 순서대로 출력되기때문에 글의 순서가 바뀌면 상위영향받는(본문-댓글) 게시물까지 엉키게된 그래서 => 쿼리를 만들어 준다
									 * 		=> 밑에 바껴진 게시글 group_step을 +1씩 해준다 (가장 최신 댓글을 본문 아래로 위치시킨다)
									 * 
									 * 	
									 */
					sql="UPDATE replyBoard SET "
						+"group_step=group_step+1 "
						+"WHERE group_id=? AND group_step>?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, gi);
					ps.setInt(2, gs);
					ps.executeUpdate();
					
					//* INSERT
					sql="INSERT INTO replyBoard(no,name,subject,content,pwd,group_id,group_step,group_tab,root) " 
					         +"VALUES(rb_no_seq.nextval,?,?,?,?,"
							 +"?,?,?,?)"; 
					ps=conn.prepareStatement(sql);
					ps.setString(1, vo.getName());
					ps.setString(2, vo.getSubject());
					ps.setString(3, vo.getContent());
					ps.setString(4, vo.getPwd());
					ps.setInt(5, gi);
					ps.setInt(6, gs+1);
					ps.setInt(7, gt+1);
					ps.setInt(8, root);
					
					ps.executeUpdate();

					//* root => depth+1
					sql="UPDATE replyBoard SET "
						+"depth=depth+1 "
						+"WHERE no=?";
					ps=conn.prepareStatement(sql);
					ps.setInt(1, root);
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
			
		// 5. 수정하기 => UPDATE
		// 6. 삭제하기 => SQL => 합쳐서 처리 (서브쿼리)
		// 7. 찾기 => LIKE, REGEXP_LIKE
		
		}


