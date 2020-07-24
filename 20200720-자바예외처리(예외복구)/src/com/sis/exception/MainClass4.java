package com.sis.exception;

import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;

//(����ó��)����ó��

/*
 * 		���� ó�� ==> ����Ǵ� ������ ������ �ִ� ���
 * 		
 * 		try
 * 		{
 * 			���������� ����Ǵ� ����
 * 		}
 * 		catch(����Ǵ� ����Ŭ����)
 * 		{
 * 			����ó��
 * 		}
 * 		catch(����Ǵ� ����Ŭ����)
 * 		{
 * 			����ó��
 * 		}
 * 		catch(����Ǵ� ����Ŭ����)
 * 		{
 * 			����ó��
 * 		}
 * 
 * 
 * 		catch�� ������ ���ÿ��� ������ ���� �Ѵ�
 * 
 * 		����ó�� ���� ����
 * 		============
 * 				�ֻ��� Ŭ���� => ��� Ŭ������ ���� Ŭ���� 
 * 				 Object
 * 			 	|(����)
 * 				Throwable
 * 			-----------------
 * 			|				|
 * 	  	  Error			Exception
 * 							|
 * 					-------------------
 * 					|
 * 				IOException
 * 				
 * 
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=0;//�迭 2�� ���� [0,1] ERROR
			
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("������ȯ�� �ȵ�");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭������ ��� ���");
		}
		catch(ArithmeticException e)    //���� ���� 3�� , �� �̻��϶� RuntimeException
		{
			System.out.println("0���� ���� ���");
		}
		catch(RuntimeException e) //RuntimeException�� �� 3�� �տ� ���� ����. ��? RuntimeException�� ������ �� ��⶧���� �׷��� ������ �߿�
		{
			System.out.println("����� ��� ������ ó��");
		}
		catch(Exception e) // Exception�� �������� ���ִ°� ���� ��? ���� ������ ���� �͵麸�� ����, ���� ���� ���� ������ ���� ���� �ֱ� ������ 
		{
			System.out.println("������ ������ ��� ������ ó��");	
		}
		catch(Throwable e) //���� ����� ���� ����
		{
			System.out.println("���ܿ� ������ ���� ó��");
		}

	}

}
