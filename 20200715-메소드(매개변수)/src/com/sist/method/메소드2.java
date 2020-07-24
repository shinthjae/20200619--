// p.287

package com.sist.method;

import java.lang.reflect.Method;

/*
 *  display (int,int)
 *  display (String,String,int) 
 *  display (double,String,int)
 *  => display(Object...arg) => 데이터형 통일
 *  
 *  display (int,int)
 *  display (int,int,int) 
 *  display (int,iny,int)
 *  => display(int...arg) 
 *  
 */

class A
{
	public void display1(String name)
	{
		System.out.println("Hello~~\n"+name);
	}
	public void display2(String name)
	{
		System.out.println("Hello~~\n"+name);
	}
}
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A(); //인스턴스는 new이용 저장
//		a.display("홍길동");
		try
		{
			Class clsName=Class.forName("com.sis.method.A");
			Object obj=clsName.newInstance();
//			System.out.println(obj);
//			A a=(A)obj;
//			a.display("심청이"); //형변환 많이 나올거임
			Method[] method=clsName.getDeclaredMethods();
//			method[0].invoke(obj, "이순신");   //invoke 메소드 호출
			for(Method m:method)
			{
				System.out.println(m.getName());
			}
		}catch (Exception e) {}
	}

}
