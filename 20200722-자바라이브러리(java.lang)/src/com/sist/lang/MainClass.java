package com.sist.lang;

/*
 * 		java.lang
 * 		=========
 * 		= Object
 * 			1) �ֻ��� Ŭ���� => ��� ���������� ����
 * 				class A
 * 				Object obj=new A();
 * 				Object obj=10.5;
 * 				Object[] obj={new A(),10.5,100,'A',"Hello"}
 * 				double[] d={10.5,'A',100,10.5F}
 * 			2) ��� Ŭ����(����� ����) => ����� ������
 * 			   ================ Object�� ������ �ִ� ��� ����� ��� �� �� �ִ�
 * 			3) �ֿ� ���(�޼ҵ�)
 * 				clone() => prototype => ���߿� �̸��� �ٲ�
 * 				
 * 	
 * 		= String
 * 		= StringBuffer
 * 		= System
 * 		= Math
 * 		= Wrapper : ��� ���������� ����ϱ� ���� Ŭ������ ����
 * 		  =======
 * 			Double => double
 * 			Byte => byte
 * 			Integer => int
 * 			Boolean => boolean
 * 		  ====================== �ڽ�/����
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
 * 				this.a=100;		// �ڽ� Ŭ���� => int a=10;
 * 				super.a=200;	// ����� ���� Ŭ���� => // int a;
 * 			}
 * 		}
 * 
 * 
 * 		���
 * 			extends ====> class
 * 			=======
 * 			���� ���
 * 
 * 
 * 			implements => interface => interface(Ŭ������ ����)
 * 			==========
 * 			���� ���
 * 
 * 		=> Ŭ���� ���
 * 			1) new => ó������ ����
 * 			2) ���� => ���� ��� �������� Ŭ���� -> �Ű������� ����
 * 				-> �޼ҵ带 ���ؼ� ����
 * 			3) ����  => ����� �ͺ��� ����
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
			 * 		A a=(A)new Object()   ===> �̰� �ȵ� ��? ���� '����ȯ'�� �ϰ� Object�� ����Ѵ�
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
		
		// ��Ī, ���� �޸𸮸� ����
		A c=new A();
		c.aa=100;
		A d=c; // ������ ������Ҹ� ������ �ִ�
		System.out.println(d.aa); //100
		d.aa=1000;
		System.out.println(c.aa); //1000
		
		A e=c.clone();
		System.out.println(e.aa); //1000 => c���� e�� ���� 
	}
	
}


