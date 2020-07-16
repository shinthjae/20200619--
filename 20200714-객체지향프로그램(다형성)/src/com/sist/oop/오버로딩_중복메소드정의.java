package com.sist.oop;
/*
 * 		�ڹ�
 * 			1��°�� => package�� (�ѹ��� ����� ����)
 * 			2��°�� => import (������ ����� ����)
 * 			3��°��
 * 			public class className{
 * 				�ʿ���  ���� ���� ==> �������
 * 				������ ���� �ʱ�ȭ ==> ������
 * 				��� ==> �޼ҵ� 
 * 			}
 * 
 * 			===> �ٸ� Ŭ�������� ���ÿ��� 
 * 				 import com.sist.oop.*
 * 				  ��Ű��
 * 				 	com.ȸ���.��ɸ� => com.sist.client , com.sist.server
 * 					org.������.��ɸ� => org.springframework.web.servlet.view.*
 * 
 * 
 * 
 * 
 * 
 * 			ĸ��ȭ
 * 				= ������ private
 * 				= �޼ҵ� public ===> ���� (getter/setter)
 * 			���
 * 				= extends : ������ Ŭ������ ��� ������ �´�
 * 				   ���� ��Ӹ� ����
 * 			������
 * 				= ����,�߰�
 * 			============================================= ���������� �ƴ϶� ���� ����
 */

/* 
 * 		�����ε� (�����ڿ��� �ַ� ���)
 * 		= ���� �޼ҵ������ �������� ����� ����� (���� ��� ��)+ �϶� ���� �޼ҵ������ �ٸ� Ÿ������ ����)
 * 		  =========
 * 	      	1. �Ű������� �ٸ���(������ ���������� �ٸ���)
 * 			2. �������� �������
 * 			3. ���� Ŭ���������� �����
 * 
 * 		plus() :
 * 		int + int ===========> plusInt(int a, int b)
 * 		double + double =====> plusDouble(double d, double d1)
 * 		int + double ========> plusIntDouble(int a, double b)
 * 		String + String =====> plusString(String s1, String s2)
 * 		float + double
 * 		long + int
 * 		int + char
 * 		char + double
 * 		String + char
 */

class Calc{
	// �ν��Ͻ� �޼ҵ� : new ���� ���� ����Ǵ� �޼ҵ�
	public void plus(int a, int b)
	{
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
//	public void plus(int a, int b)
//	{
//		retrun a+b;
//	}
	
	public void plus(double a, double b)
	{
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a, String b)
	{
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
}

/*
 * 		���� 
 * 		===
 * 		  �������
 * 		 static ��������
 * 
 * 		�޼ҵ�
 * 		=====
 * 		  ����޼ҵ�
 * 		 static �޼ҵ�
 * 
 * 		class A 
 * 		{
 * 			int a;
 * 			static int b;
 * 				
 * 				public void disp1()
 * 				{
 * 					=> a,b ����� ����
 * 					=> disp2() ȣ���� ����
 * 				}
 * 				
 * 				public static
 */
public class �����ε�_�ߺ��޼ҵ����� {
	int a=10;//=> static�ȿ����� static�� static�� ��밡��
	static int b=20; 
	public void disp1()
	{
		System.out.println(this.a);  // static �ȿ�����  ��ü�� �����ؾ߸� this ��밡��, this�� ��� Ŭ������ ����
		System.out.println(this.b);
	}
	
	public void disp2()
	{
		System.out.println(b);
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		
		System.out.println(aa.a); // ���� �̸��� ���� �ִ� ������ ��������� ���� ����	
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); // �޼ҵ� ��ü�� ����
		cc.plus("Hello", "Java");
		cc.plus(100,200);
		System.out.println(b);
		
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        aa);
		System.out.println(aa.a);
	}

}
