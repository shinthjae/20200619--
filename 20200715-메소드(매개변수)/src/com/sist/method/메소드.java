//(1)
package com.sist.method;

/*
 * 	 	=> �޼ҵ�
 * 			= ���ϰ�
 * 			= �Ű����� : �ָ��� ���
 * 			printf("%d%d%d",10,20,30)
 * 			printf("%d%f%s",100,10.5,"")
 * 			============================= �����Ű����� => ���� �ָ��ϰ� �𸦶� Object... => ��� �������� �������ٶ�  => web�� ��� ��  ����ڰ� � �Է��� ���� ����(����ڸ� ���� ����)
 * 			String... a => ...�� ��ȣ�� �ƴ� 
 * 			Object... obj => ����ڰ� ���������� Ȯ�� �����ٶ�
 */

public class �޼ҵ� {
	public static void concat(String s,String... s1) // String�� �迭�����̶� for-each �� => ������ ������� 
	{
		for(String ss:s1)
		{
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat("Hello","ȫ�浿","��û��","�ڹ���","������","�̼���"); 
		
//		Object o=10;
//		Object o1=0.5;
//		Object o2='A';
//		Object o3="aaaaa";
//		Object o4=new �޼ҵ�();
	}

}
