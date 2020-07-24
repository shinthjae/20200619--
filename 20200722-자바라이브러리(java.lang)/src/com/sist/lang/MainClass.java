package com.sist.lang;

/*
 * 		java.lang
 * 		=========
 * 		= Object
 * 			1) 최상위 클래스 => 모든 데이터형을 포함
 * 				class A
 * 				Object obj=new A();
 * 				Object obj=10.5;
 * 				Object[] obj={new A(),10.5,100,'A',"Hello"}
 * 				double[] d={10.5,'A',100,10.5F}
 * 			2) 모든 클래스(사용자 정의) => 상속을 내린다
 * 			   ================ Object가 가지고 있는 모든 기능을 사용 할 수 있다
 * 			3) 주요 기능(메소드)
 * 				clone() => prototype => 나중에 이름이 바뀜
 * 				
 * 	
 * 		= String
 * 		= StringBuffer
 * 		= System
 * 		= Math
 * 		= Wrapper : 모든 데이터형을 사용하기 쉽게 클래스로 변경
 * 		  =======
 * 			Double => double
 * 			Byte => byte
 * 			Integer => int
 * 			Boolean => boolean
 * 		  ====================== 박싱/언방식
 * 			Integer i=10
 * 			Integer i=new Integer(100);
 * 			int k=i;
 * 
 */

/*
 *  	class A
 *  	{
 * 	  		int a=10;
 * 		}
 * 		class B
 * 		{
 * 			// int a;
 * 			public B()
 * 			{
 * 				this.a=100;		// 자신 클래스 => int a=10;
 * 				super.a=200;	// 상속을 내린 클래스 => // int a;
 * 			}
 * 		}
 * 
 * 
 * 		상속
 * 			extends ====> class
 * 			=======
 * 			단일 상속
 * 
 * 
 * 			implements => interface => interface(클래스의 일종)
 * 			==========
 * 			다중 상속
 * 
 * 		=> 클래스 사용
 * 			1) new => 처음부터 시작
 * 			2) 참조 => 별로 사용 안하지만 클래스 -> 매개변수로 전송
 * 				-> 메소드를 통해서 전송
 * 			3) 복제  => 변경된 것부터 시작
 * 
 * 
 * 			class A
 * 			{
 * 				int aa=10;
 * 			}
 * 			
 * 			A aaa=new A();
 * 			==> display(aaa); ==> aaa.aa=1000 : Call By Reference
 * 
 * 			public void display(A a)
 * 			{
 *				a.aa=1000; 
 * 			}
 * 		
 * 
 */
class A implements Cloneable
{
	int aa=10;
	public A clone()
	{
		A a=new A();
		try
		{
			a=(A)super.clone();
			/*
			 * 		Object (double)
			 * 		A (int)
			 * 
			 * 		double d=10;
			 * 		int a=(int)10.5
			 * 		A a=(A)new Object()   ===> 이건 안된 왜? 먼저 '형변환'을 하고 Object를 사용한다
			 */
		}catch (Exception e) {
			
		}return a;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // a.aa
		a.aa=100;
		A b=new A(); // b.aa
		System.out.println(b.aa); //10
		
		// 별칭, 같은 메모리를 참조
		A c=new A();
		c.aa=100;
		A d=c; // 동일한 저장장소를 가지고 있다
		System.out.println(d.aa); //100
		d.aa=1000;
		System.out.println(c.aa); //1000
		
		A e=c.clone();
		System.out.println(e.aa); //1000 => c복제 e값 대입 
	}
	
}


