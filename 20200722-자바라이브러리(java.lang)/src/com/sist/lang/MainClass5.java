package com.sist.lang;
/*
 * 		finalize() �Ҹ��� �Լ�
 * 		
 * 		=> ������
 */

class C
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�޸� ����");
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.display();
		// �Ҹ�
		c=null; //garbage collection ���̻� ���� �ʰڴ� ����
		System.gc(); //garbage collection
	}
}

