// p.287

package com.sist.method;

import java.lang.reflect.Method;

/*
 *  display (int,int)
 *  display (String,String,int) 
 *  display (double,String,int)
 *  => display(Object...arg) => �������� ����
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
public class �޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new A(); //�ν��Ͻ��� new�̿� ����
//		a.display("ȫ�浿");
		try
		{
			Class clsName=Class.forName("com.sis.method.A");
			Object obj=clsName.newInstance();
//			System.out.println(obj);
//			A a=(A)obj;
//			a.display("��û��"); //����ȯ ���� ���ð���
			Method[] method=clsName.getDeclaredMethods();
//			method[0].invoke(obj, "�̼���");   //invoke �޼ҵ� ȣ��
			for(Method m:method)
			{
				System.out.println(m.getName());
			}
		}catch (Exception e) {}
	}

}
