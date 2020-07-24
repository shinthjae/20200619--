package com.sist.exception;

public class MainClass1 {
	public void display() throws ArrayIndexOutOfBoundsException,
    ArithmeticException,NumberFormatException,Exception
    {
    	
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass1 m=new MainClass1();
        
		try {
			m.display();
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException|
				NumberFormatException e)
		{
			
		}catch(Exception e) {}

	}

}
