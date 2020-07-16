package com.sist.inter; //p.390 // Container Å¬·¡½º¿Í Â¦Â¦²á

import com.sist.inter.Connection.Container;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		Connection conn=c.getBean("oracle");
		conn.connection();
		
		conn=c.getBean("mssql");
		conn.connection();
	}

}
