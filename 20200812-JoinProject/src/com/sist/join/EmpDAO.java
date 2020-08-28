package com.sist.join;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class EmpDAO {

	//����Ŭ ����
			private Connection conn;	
			//SQL������ ����Ŭ�� ����
			private PreparedStatement ps;	
			//����Ŭ �ּ�
			private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
			//����̹� ��ġ
			public EmpDAO()
			{
				//�������� ��Ȱ => ��������� �ʱ�ȭ�� �������� ��Ʈ��ũ ���� ���ῡ�� ��� ��
				try
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			}
			//����
			public void getConnection()
			{
				try
				{
					conn=DriverManager.getConnection(URL, "hr", "happy");
				}catch(Exception ex){}
			}
			//���� ����
			
			
			public void disConnection() 
			{
				try
				{
					if(ps!=null) ps.close();
					if(conn!=null) conn.close();
				}catch(Exception ex) {}		
			}
			
			
			
			
			public ArrayList<EmpVO> empDeptJoinData()
			{
				ArrayList<EmpVO> list=
						new ArrayList<EmpVO>();
				try
				{
					getConnection();
					
					//String sql="SELECT empno,ename,job,hiredate,sal,dname,loc FROM emp,dept WHERE emp.deptno=dept.deptno";
					
					String sql="SELECT empno,ename,job,hiredate,sal,dname,loc "
							+"FROM emp,dept "
							+"WHERE emp.deptno=dept.deptno";
					
					ps=conn.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					
					while(rs.next())
					{
						EmpVO vo=new EmpVO();
						vo.setEmptno(rs.getInt(1));
						vo.setEname(rs.getString(2));
						vo.setJob(rs.getString(3));
						vo.setHiredate(rs.getDate(4));
						vo.setSal(rs.getInt(5));
						vo.getDvo().setDname(rs.getString(6));
						vo.getDvo().setLoc(rs.getString(7));
						list.add(vo);
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				finally
				{
					disConnection();
				}
				return list;
			}
}
