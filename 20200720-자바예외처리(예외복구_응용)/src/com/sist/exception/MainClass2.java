package com.sist.exception;
//��Ƽ  catch��� p.423
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		}catch(ArithmeticException e) //0������
		{
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			
		}catch(NumberFormatException e) //web���� ���� ��
		{
			
		}
//		======================================================================================= �� �ڵ��� �Ȱ���
		try
		{
			
		}catch(RuntimeException e) {}
		
//		======================================================================================== 
		try
		{
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			
		}
	}

}
