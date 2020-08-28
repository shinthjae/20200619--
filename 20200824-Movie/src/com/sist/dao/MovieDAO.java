package com.sist.dao;
/*
 * 	제어문(출력) , 변수(데이터 모우기) ,
 * 	예외처리(오라클 연결)
 * 
 * 	오라클 연결 => ArrayList => add() , get() , size()
 */
import java.sql.*; //Connection, PrepareedStatemen,ResultSet
import java.util.*; // ArrauList
public class MovieDAO {
	//연결
	private Connection conn;
	//SQL 전송
	private PreparedStatement ps;
	//오라클 주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//1. 실제 오라클 연결해주는 드라이버
	public MovieDAO()
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
	
	// 영화 => 출력
	
	
	
	public ArrayList<MovieVO> movieAllData(int page)
	{
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		
		try
		{
			getConnection();
			
			////몇개를 나눌거야
			int rowSize=10;
			
			////BETWEEN start AND end
			int start=(page*rowSize)-(rowSize-1);
			
			////rownum=>1
			/*
			 * 		1page = 1
			 * 		2page = 11
			 * 		3page = 21
			 */
			int end=page*rowSize;
			
			
			String sql="SELECT no,title,director,actor,poster,num "
						+"FROM (SELECT no,title,director,actor,poster, rownum as num "
						+"FROM (SELECT no,title,director,actor,poster "
						+"FROM daum_movie ORDER BY no DESC)) "
						+"WHERE num BETWEEN ? AND ?";
			
			ps=conn.prepareStatement(sql);
			
			////
			ps.setInt(1, start);
			ps.setInt(2, end);
			
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
	public int movieTotalPage()
	{
		int total=0;
		try 
		{
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/10.0) FROM daum_movie";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			disConnection();
		}
		return total;
	}
	

}
