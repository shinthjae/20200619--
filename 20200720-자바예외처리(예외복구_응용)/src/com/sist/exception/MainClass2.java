package com.sist.exception;
//멀티  catch블록 p.423
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		}catch(ArithmeticException e) //0나누기
		{
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			
		}catch(NumberFormatException e) //web에서 가장 多
		{
			
		}
//		======================================================================================= 세 코딩다 똑같음
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
