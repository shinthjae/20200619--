//202006299(2)
// do~while
// ����ڰ� �Է��� ������ �ش�Ǵ� ������

import java.util.*; //  Ű���� �Է°��� �޾ƿ��� ��� => Scanner
// BufferreadReader => ����ó��
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����
//		int user=0; // ����ڰ� �Է��� �� ���� �޸� ����
//		int i=1; // 1~9���� �����ϴ� ���� ==> 9�� ����(������)
//		
//		// Ű���� �Է°� �ޱ�
//		Scanner scan=new Scanner(System.in);    	// ��� Ŭ������ �޸𸮿� �����Ҷ� new �̿� �Ѵ�
//													// ���� ==> Math.random() => static�޼ҵ�: ���۰� ���ÿ� �޸𸮿� �ڵ� ����
//		System.out.println("2~9���� ������ ���� �Է�:");	// => Scanner => ����, ���ͽÿ� ���� �޸𸮿� ����
//		user=scan.nextInt();						// ����ڰ� Ű����� �Է��� ������ �о�ͼ� ���� => user��� ������ ����
//		
//		do 
//		{	
//			System.out.printf("%d * %d = %d\n",user,i,user*i);			// printf ==> %n, \n ==> �����ٿ� ���
//			i++;														// pritn, println ==> \n		
//		} while (i<=9);
//		
		
		int user=0; 
		int i=9; 
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("2~9���� ������ ���� �Է�:");
		user=scan.nextInt();
		
		do 
		{	
			System.out.printf("%d * %d = %d\n",user,i,user*i);
			i--;
		} while (i>=1);
		
		
		

	}

}
