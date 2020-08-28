package com.sist.dao;
import java.util.*;
import java.sql.*;

public class MusicDAO {
   //오라클 연결
   private Connection conn;
   //sql 문장 오라클 전송
   private PreparedStatement ps;
   //오라클 주소
   private final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
   //드라이버 설치
   public MusicDAO()
   {
      //생성자 => 맴버변수의 초기화 , 네트워크 서버 연결
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      }catch (Exception e) 
      {
         System.out.println(e.getMessage());
      }
   }
   //연결
   public void getConnection()
   {
      try {
         conn=DriverManager.getConnection(URL,"hr","happy");
         // conn hr/happy
      }catch (Exception e) {}
   }
   //연결 종료 
   public void disConnection()
   {
      try {
         if(ps!=null)ps.close();
         if(conn!=null)conn.close();
      }catch (Exception e) {}
   }
   //SQL 문장 전송 => 200개의 데이터 요청 
   public ArrayList<MusicVO> musicAllData()
   {
      ArrayList<MusicVO> list = new ArrayList<MusicVO>();
      try {
         //오라클 연결
         getConnection();
         //SQL 문장 전송
         String sql="SELECT mno,poster,title,singer,album "
               + "FROM GENIE_MUSIC ORDER BY mno ASC";
         ps=conn.prepareStatement(sql); //아직 sql 문장만 만들어논 상태
         
         //결과값 받기
         ResultSet rs=ps.executeQuery(); //ps를 실행하고 결과값을 rs에 넣어준다 이말이야.!
         while(rs.next()) //next는 첫줄부터 previous는 맨마지막줄에서 위로
         {
            MusicVO vo = new MusicVO();
            vo.setMno(rs.getInt(1));
            vo.setPoster(rs.getString(2));
            vo.setTitle(rs.getString(3));
            vo.setSinger(rs.getString(4));
            vo.setAlbum(rs.getString(5));
//            vo.setState(rs.getString(6));
//            vo.setIdcrement(rs.getInt(7));
//            vo.setKey(rs.getString(8));
            
            //200개 모아서 브라우저 전송
            list.add(vo);
         }
         rs.close();
         //ArrayList 값 채우기
      }catch (Exception e) {
         System.out.println(e.getMessage());
      }
      finally {
         //서버 종료
         disConnection();
      }
      return list;
   }
   
   //상세보기
   public MusicVO musicDetailData(int mno)
   {
      
      MusicVO vo = new MusicVO();

      try {
         getConnection();
         String sql ="SELECT mno,title,singer,album,poster,key FROM genie_music WHERE mno="+mno;
         ps=conn.prepareStatement(sql);
         ResultSet rs= ps.executeQuery();
         rs.next();
         //값을 채운다
         vo.setMno(rs.getInt(1));
         vo.setTitle(rs.getString(2));
         vo.setSinger(rs.getString(3));
         vo.setAlbum(rs.getString(4));
         vo.setPoster(rs.getString(5));
         vo.setKey(rs.getString(6));
         
         rs.close();
         
      }catch (Exception e) {
      
      }finally {
         disConnection();
      }
      return vo;   
   }
}