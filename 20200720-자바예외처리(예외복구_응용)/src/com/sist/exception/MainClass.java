package com.sist.exception;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/*
 * 		����ó��
 * 			����)
 * 				1.����ó�� (try~catch)
 * 					try
 * 					{
 * 						������ ������ �ڵ� (���� ������ �� �ִ� ����)
 * 					}catch(����Ŭ���� ��ü)
 * 					{
 * 						���� ������ ������ �� ��쿡 ó�� ����
 * 					}
 * 					*** catch�� ������ ����� ����
 * 					*** finally�� ����� �� �ִ� (�ʿ��� ��쿡�� ����� �Ѵ�)
 * 						����,�����ͺ��̽� ���� => �����ݱ�, ����Ŭ ���� ����
 * 				
 * 				2. �ڹٿ��� �����ϴ� ����ó��
 * 
 * 					�Ѱ��� ó��
 * 						NumberFormatException
 * 						ArrayIndexOutOfBoundse
 * 						NullPointerException
 * 						ioException
 * 						SQLException
 * 
 * 					������ ó��
 * 						RuntimeException
 * 						Exception
 * 						Throwable
 * 				
 * 				3. catch�� �������� ����� �� �ִ�
 * 					�ش� ������ ã�� ��췹�� ó������ ���������� �˻� => ����ó�� ������� �ڵ�
 * 				
 * 				4. try���� ������ �߻��ϸ� �߻���ġ���� catch�� �̵�
 * 				   ====================== �ؿ� �ִ� �ҽ��� ������� �ʴ´�
 * 					int a=10; ==> ����
 * 					int b=0; ==> ����
 * 					int c=a/b; ==> �����߻� =============> catch�� �̵�
 * 					System.out.println(c) ==> ������� �ʴ´�
 * 
 * 				5. ���� : ����üũ (���� Ȯ�� ==> �ҽ� ����) ==> �����
 * 
 * 				6. ����ó�� => ������ ������ ���� 
 * 
 *       			1���� 
 *              	2���� 
 *           	 	3����
 *           		 4���� ====> error�߻� ==> ���α׷��� ���� (������ ����)
 *            		5���� 
 *            		6���� 
 *            		7����    
 *            		==============================> 7������ ���� (��������)
 *            
 *            1���� 
 *            2���� 
 *            try
 *            {
 *              3����
 *              4���� ====> error�߻� ==> ���α׷��� ���� (������ ����)
 *              5����
 *                ===> 4����,5���� ==> �ǳʶڴ� ==> 6�����̵� 
 *            }catch(Exception e)
 *            {
 *               6����  
 *            } 
 *            7���� 
 *            8����    
 *            
 *            7. �ڹ��� ��� �ڵ��� ����ó���� �����Ѵ�
 *            	 �� ����ô� ������ ����
 *            
 *            => ������ �����ؾߵǴµ� ���� ==> ����ó��
 *            IO
 *            System.out.println() => ����ó���� ������ ����
 *            System.in.read() => ����ó���� ������ �� ����
 *            *** ������ �� �� ������ => Ư���� ��쿡�� ����ó���� �� �� �˾ƾ� �Ѵ�
 *            	  ====
 *            		���ǹ����� �ַ� ó�� => ���ǹ����� ó���� ����� ��쿡 ����ó�� ���
 *            		=> ����ó���� �⺻ ���ǹ�
 *            
 *             int a=10;
 *                 int b=0;
 *                 
 *                 if(b==0)
 *                   System.out.println("0���� ���� �� ����");
 *                 else
 *                   System.out.println(a/b);
 *                   
 *                 
 *                 try
 *                 {
 *                    int a=10;
 *                    int b=0;
 *                    System.out.println(a/b);
 *                 }catch(Exception ex)
 *                 {
 *                    System.out.println("0���� ���� �� ����");
 *                 }
 *                 
 *            *** ���� ���� �� if���� ���� �����غ���
 *            
 *            
 *            8. ����ó���� �ݵ�� ó���ؾ��ϴ� Ŭ������ ����
 *            	 ==============
 *            		IO�� ���� **********
 *            		������� ���� **********
 *            		��Ʈ��ũ ����
 *            		�����ͺ��̽� ���� **********
 *            	 
 */
import javax.swing.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	        String num1=JOptionPane.showInputDialog("ù��° ���� �Է�:");
	        String num2=JOptionPane.showInputDialog("�ι�° ���� �Է�:");
	        // �迭�� ÷�� 
	        int[] arr=new int[2];
	        // ���ڿ��� ������ ��ȯ 
	        arr[0]=Integer.parseInt(num1);// ���� ==> "10" "1 0" " 10"
	        arr[1]=Integer.parseInt(num2);
	        
	        int result=arr[0]/arr[1];
	        System.out.println("result="+result);
		}
//	    catch(NumberFormatException e)
//		{
//			System.out.println("������ �Է�");
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("�迭���� �ʰ�");
//		}catch(ArithmeticException e)
//		{
//			System.out.println("0���� ���� �� ����");
//		}
	   
	        catch(RuntimeException e) //���� 3�� ��ſ� RuntimeException �ϳ��� ����ص� �ȴ� ������ ������ ������ � ������ �߻��ߴ��� ��
	    {
//	    	System.out.println("�����߻�");
	        	
	    	e.printStackTrace(); //���� ��� �ڵ� p.422
	    }
	    
		System.out.println("ó������ �ٽ� �Է�!!");
		
	}

}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
