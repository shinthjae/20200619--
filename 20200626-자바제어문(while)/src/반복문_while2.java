import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

//202006226(2)

//	����ڰ� ���ĺ��� �Է��ϸ� B ==> AB
//	D �Է��ϸ� => ABCD ���� ���
// char==> scan.nest().charAt(0)
/*
 * 		"ABCDE" ==> scan.next()   //next() ���������γ���
 * 		=======
 * 		 'A' => charAt(0)         //next�� 0��°
 * 		 'B' => charAt(1)				  1��°
 * 
 * 		���� ���� ==> �ݺ�������� ����
 * 		====== ����
 */
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char user=' ';
		//while ==> ������ false�ɶ����� �����ϴ� ���� : ��������
		char c='A';
		Scanner scan=new Scanner(System.in);
		System.out.println("���ĺ� �Է�(�빮��):");
		user=scan.next().charAt(0);
		
		while(c<=user)
		{
			System.out.print(c);
			c++;
		}
		
		

	}

}
