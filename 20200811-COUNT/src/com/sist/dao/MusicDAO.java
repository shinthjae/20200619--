package com.sist.dao;
import java.util.*;
import java.sql.*;

public class MusicDAO {
   //����Ŭ ����
   private Connection conn;
   //sql ���� ����Ŭ ����
   private PreparedStatement ps;
   //����Ŭ �ּ�
   private final String URL ="jdbc:oracle:thin:@localhost:1521:XE";
   //����̹� ��ġ
   public MusicDAO()
   {
      //������ => �ɹ������� �ʱ�ȭ , ��Ʈ��ũ ���� ����
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      }catch (Exception e) 
      {
         System.out.println(e.getMessage());
      }
   }
   //����
   public void getConnection()
   {
      try {
         conn=DriverManager.getConnection(URL,"hr","happy");
         // conn hr/happy
      }catch (Exception e) {}
   }
   //���� ���� 
   public void disConnection()
   {
      try {
         if(ps!=null)ps.close();
         if(conn!=null)conn.close();
      }catch (Exception e) {}
   }
   //SQL ���� ���� => 200���� ������ ��û 
   public ArrayList<MusicVO> musicAllData()
   {
      ArrayList<MusicVO> list = new ArrayList<MusicVO>();
      try {
         //����Ŭ ����
         getConnection();
         //SQL ���� ����
         String sql="SELECT mno,poster,title,singer,album "
               + "FROM GENIE_MUSIC ORDER BY mno ASC";
         ps=conn.prepareStatement(sql); //���� sql ���常 ������ ����
         
         //����� �ޱ�
         ResultSet rs=ps.executeQuery(); //ps�� �����ϰ� ������� rs�� �־��ش� �̸��̾�.!
         while(rs.next()) //next�� ù�ٺ��� previous�� �Ǹ������ٿ��� ����
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
            
            //200�� ��Ƽ� ������ ����
            list.add(vo);
         }
         rs.close();
         //ArrayList �� ä���
      }catch (Exception e) {
         System.out.println(e.getMessage());
      }
      finally {
         //���� ����
         disConnection();
      }
      return list;
   }
   
   //�󼼺���
   public MusicVO musicDetailData(int mno)
   {
      
      MusicVO vo = new MusicVO();

      try {
         getConnection();
         String sql ="SELECT mno,title,singer,album,poster,key FROM genie_music WHERE mno="+mno;
         ps=conn.prepareStatement(sql);
         ResultSet rs= ps.executeQuery();
         rs.next();
         //���� ä���
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