package com.sis.exception;


// (����ó��) �κ� ó��


public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�κ������� try�� ��� �� �� �ִ�
		//����ó�� ��ġ
		 try 
		 {
			 for(int i=0;i<=10;i++)
			 {
				 try 
				 {
				 System.out.println("i="+i);
				 int a=i/(int)(Math.random()*3); //ERROR�߻��κ�
				 System.out.println("a="+a);
				 }catch(Exception e) {System.out.println("for�� i++�� �̵�");} //for���ȿ� ����ó�� �� ��� �̷��� ����
			 }                                                             //for�� ������ ó�� ��ų��� ��� ���ʿ� ����ó�����ش� //����ó�� ��ġ�� ����
		 }catch(Exception ex)
		 {
			 System.out.println("���� �߻�");
		 }
		 System.out.println("���α׷� ���� ����");

	}

}
