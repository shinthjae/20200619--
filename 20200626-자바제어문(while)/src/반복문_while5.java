/*
 * 
 * 		������
 * 		1) while�� ������ ���� ��� error => for(;;)
 * 		   while()
 *			{
 *			}    ==> �����߻�  => ()���ǽ��� ���
 * 		2) while���� ���ѷ���
 * 			=> for(;;) => while(true):���� ���� ����
 * 
 * 			for(int 1=0;i<10;i++)  ==> ���α׷��� ������__�� ���� ����
 * 
 * 			int i=0;
 * 			while(i<10)
 * 			{
 * 				i++;
 * 			}
 */

//	5 ~ 1~5 
import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // ����ڰ� ��û�� ����
		int i=1; // ����ڰ� ��û�� �������� ����(��������)
		int sum=0; // �����ؾ��� ����(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		user=scan.nextInt();
		
		while(i<=user)
		{
			sum+=i;;
			i++;;
		}
		// ������� i=6
		System.out.println("sum="+sum);
		
		i=1; //�ٽ� �ʱⰪ �ٽ� ���� ==> 1~5
		System.out.println("i="+i);
		/*
		 *   i=1  i=5  
		 */
		while(i<=5)
		{
			System.out.print(i);
			i++;
		}
		//i=6
		System.out.print(i);
		
		 i=5;
		
		while(i>=0)
		{
			System.out.print(i);
			i--;
		}
		
		//i=0
		//int j=1;
		
//		for(int j=1;j<=10;j++)
//		{
//			
//		}
//		System.out.println(j);    		=> j�� �޸𸮿��� ������� ���η� ������ ����j�� ��������
		
//		
//		
//		
		
		
		
		
		}
	}


