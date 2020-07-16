package com.sist.inter;
import java.util.*;


// 인터페이스 => 여러개 클래스를 묶어서 인터페이스로 관리 (서로 다른 클래스들에게 관계를 맺어준다)
// Spring 자체가 인터페이스 기반으로 하기 때문에 꼭 잘 공부하기
// 이부분은 "팩토리 패턴" => Spring이 요고 기반으로 만들어짐

interface Connection{
	public void connection();
}

class 오라클 implements Connection{
	public void connection()
	{
		System.out.println("오라클 연결");
	}
	
}

class DB2 implements Connection{
	public void connection()
	{
		System.out.println("DB2 연결");
	}
	
}
class MSSQL implements Connection{
	public void connection()
	{
		System.out.println("MSSQL 연결");
	}
	
}
class MySQL implements Connection{
	public void connection()
	{
		System.out.println("MySQL 연결");
	}
	
}
public class Container {
	Map map=new HashMap();
	public Container()
	{
		map.put("oracle",new 오라클());
		map.put("db2",new DB2());
		map.put("mssql",new MSSQL());
		map.put("mysql",new MySQL());
		
	}
	  public Connection getBean(String key)
	   {
		   return (Connection)map.get(key);
	   }

}
