package com.sist.dao;

import java.sql.*;

import java.util.*;

public class MyDAO {
   //연결
   private Connection conn;
   //전송
   private PreparedStatement ps;
   //URL
   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
   
   //드라이버 등록
   public MyDAO()
   {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver"); 
      }catch (Exception e) {
         // TODO: handle exception
      }
   }
   //연결
   public void getConnection() {
      try {
         conn=DriverManager.getConnection(URL,"hr","happy");
      }catch (Exception e) {}
   }
   //해제
   public void disConnection() {
      try {
         if(ps!=null)ps.close();
         if(conn!=null)conn.close();
      }catch (Exception e) {
      }
      //JDBC (원시소스) => DBCP => ORM(MyBatis,Hibername,JPA)
      
   }
   
   
   
   
   public String isLogin(String ename,int empno)
   {
      String result="";
      
      try 
      {
         getConnection(); 
         
         //SQL 문장 전송 
         String sql="SELECT COUNT(*) FROM emp WHERE ename=?";
         ps=conn.prepareStatement(sql);

         // ?에 채울 값
         ps.setString(1, ename);   
         ResultSet rs=ps.executeQuery();
         rs.next();
         int count=rs.getInt(1);
         rs.close();
         
         
         if(count ==0) //사원이름이 존재 하지 않음
         {
            result="NONAME";
         }
         else //사원이름이 존재 
         {
            sql="SELECT empno FROM emp WHERE ename=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,ename);
            rs=ps.executeQuery();
            rs.next(); //데이터 있는 위치에 커서 변경
            int db_empno=rs.getInt(1);
            rs.close();
            
            if(empno==db_empno) //로그인
            {
               result=ename;
            }
            else //사번이 틀린상태
            {
               result="NOSABUN";
            }
         }
      }
      catch (Exception e) 
      {
         System.out.println(e.getMessage());   
      }
      finally 
      {
         //닫기
         disConnection();
      }
      return result;   
   }
}