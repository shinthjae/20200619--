package com.sist.collection;

import java.util.ArrayList;

/*
 * 		Collection
 * 		=========== �ڷᱸ��
 * 		�޸� �����ؼ� ���� ���ϰ� ����� ����
 * 		=> ���Ǵ� ���α׷� : ����� => CURD => ���� 1. (�޸�)-�޸𸮿� �����ϴ� ���̱� ������  ���� �� �׷��� <=> ���� ����
 * 									 => ���� 2. ��� ������ ������ ����
 * 									 CURD => �б�,����,����,����,���尹��
 * 									  ���̺귯�� => ��簳���� ����ȭ => ǥ��ȭ
 * 										�б� : get(0)
 * 								    	���� : size()
 * 										���� : set()
 * 										���� : remove:
 * 										���� : add()
 * 		=> ������ => �迭
 * 		=> ����
 * 
 * 
 * 
 * 		1) ������ ���� �ߺ��� ������ �߰�  =====> �����ͺ��̽�
 * 			List
 * 				=> ������ Ŭ����
 * 		�ڡڡ�		ArratList
 * 		�ڡڡ�		Vector
 * 				LinkedList
 * 				Queue
 * 				Stack
 * 			
 * 		2) ������ ���� �ߺ��� ���� ������ �߰�  ======> Ž����
 * 			Set
 * 				HashSet
 * 				TreeSet
 * 			
 * 		3) Ű,������ ==> �ΰ��� ���ÿ� ���� =====> Ŭ��������(Spring)
 * 			Map
 * 				Hashtable
 * 	�ڡڡ�			HashMap
 * 			
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
        // �߰� 
		/*
		 * list.add(10);//0 list.add(10.5);//1 list.add("ȫ�浿");//2 list.add('A');//3 //
		 * �� �б� int a=(int)list.get(0); double d=(double)list.get(1); String
		 * s=(String)list.get(2); char c=(char)list.get(3);
		 * 
		 * System.out.println(a); System.out.println(d); System.out.println(s);
		 * System.out.println(c);
		 */
		
		list.add("ȫ�浿"); //0
		list.add("��û��"); //1
		list.add("�̼���"); //2 => 2������ 
		list.add("�ڹ���"); //3 			=>2��
		list.add("������"); //4			=>3��
		
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		System.out.println();
		
		
		list.remove(2); //2������ => ���� ���ʰ� ��ȣ�� 2���� �� => �ڵ����� �ٲ��༭ ����
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		System.out.println();
		
		list.add(1,"������"); //"������" 1�� �߰� => ���� 1�� ��û�̴� �ڵ����� 2���� ��
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);
			System.out.println(name);
			
		}
		System.out.println();
	}
		
}


