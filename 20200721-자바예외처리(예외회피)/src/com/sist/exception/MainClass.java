package com.sist.exception;

/*
 * 		����ȸ��
 * 			= ������ ���� ������ �����ϰ� �����
 * 			    ��κ��� ���α׷��� = ����ó�� (try~catch)
 * 			  ==> API(�ڹ�, ���̺귯��)
 * 			= ���α׷��Ӱ� ����ó���� ���� ���α׷��� �°� ó�� ����
 * 		
 * 			����)
 * 				�޼ҵ� () throws ������ ���� Ŭ���� ���
 * 			��)
 * 				public void display() throws Exception,ArrayIntexOutOfBoundsException,NullPointException  //�ΰ� �̻� ���� �޸�
 * 				{
 * 				}
 * 			==> ����ó���� ȣ���ϴ� �޼ҵ忡�� ó��
 */

public class MainClass {
	public int div(int a,int b)throws ArithmeticException
	{
		return a/b; // 0���� ������ ������ �߻��� �� �ִ�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m=new MainClass();
		int res=m.div(10, 2);
		System.out.println(res);  //RuntimeException�� ������ ����
		
		

	}

}
