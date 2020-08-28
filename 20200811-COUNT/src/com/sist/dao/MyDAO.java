package com.sist.dao;

import java.sql.*;

import java.util.*;

public class MyDAO {
   //����
   private Connection conn;
   //����
   private PreparedStatement ps;
   //URL
   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
   
   //����̹� ���
   public MyDAO()
   {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver"); 
      }catch (Exception e) {
         // TODO: handle exception
      }
   }
   //����
   public void getConnection() {
      try {
         conn=DriverManager.getConnection(URL,"hr","happy");
      }catch (Exception e) {}
   }
   //����
   public void disConnection() {
      try {
         if(ps!=null)ps.close();
         if(conn!=null)conn.close();
      }catch (Exception e) {
      }
      //JDBC (���üҽ�) => DBCP => ORM(MyBatis,Hibername,JPA)
      
   }
   
   
   
   
   public String isLogin(String ename,int empno)
   {
      String result="";
      
      try 
      {
         getConnection(); 
         
         //SQL ���� ���� 
         String sql="SELECT COUNT(*) FROM emp WHERE ename=?";
         ps=conn.prepareStatement(sql);

         // ?�� ä�� ��
         ps.setString(1, ename);   
         ResultSet rs=ps.executeQuery();
         rs.next();
         int count=rs.getInt(1);
         rs.close();
         
         
         if(count ==0) //����̸��� ���� ���� ����
         {
            result="NONAME";
         }
         else //����̸��� ���� 
         {
            sql="SELECT empno FROM emp WHERE ename=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,ename);
            rs=ps.executeQuery();
            rs.next(); //������ �ִ� ��ġ�� Ŀ�� ����
            int db_empno=rs.getInt(1);
            rs.close();
            
            if(empno==db_empno) //�α���
            {
               result=ename;
            }
            else //����� Ʋ������
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
         //�ݱ�
         disConnection();
      }
      return result;   
   }
}