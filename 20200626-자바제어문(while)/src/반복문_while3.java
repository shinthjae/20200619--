//202006226(3)
/*
 * 		��������
 * 		======
 * 			����
 * 			= byte (-128~127)
 * 			= int (-21��4õ~21��4õ)
 * 			= long
 * 			�Ǽ�
 * 			= double
 * 			����
 * 			= char
 * 			��
 * 			= boolean(true/false)
 * 			============================ �⺻��
 * 			
 * 		 	������ ����: �迭,Ŭ����
 * 			========
 * 		  	���ڿ� ���� ���� => String
 * 		  	����)
 * 				char c='A' => ���� �Ѱ��� ����
 * 				String s="ABCDEFG" ==> ��,������ (��� ������ ���ڿ�)
 * 				====== =
 * 				��������   ����
 * 				
 * 				==> String : Ŭ����
 * 					��� (����)
 * 
 * 					=> ���� ����
 * 					    String s="ABXDEF";
 * 						s.length() => 6��   ===> ex) ��й�ȣ
 * 
 * 					=> String s="ABXDEF";
 * 						=> s.charAt(0) ==> 'A'
 * 
 *  	p.468~478 String�� ��� �ܿ��
 * 
 * 
 */
// ����ڰ� ���ڿ��� �Է�
// �빮�� ����, �ҹ��� ���� Ȯ��

import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="ABXDEFG"; // ���� ������ ����
//		System.out.println(s); 
		
		String s=""; 
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���>>");
		s=scan.next(); //String���� ���� ���� ����
//		s=scan.nextLine(); //�����ν�(Scanner�� ������ �ָ� �ٸ� ������ �ν��ϱ� ������ ���⼭  nextLine�� ���� ������ �������)
		System.out.println(s);
		System.out.println("����:"+s.length());  
		
		
		//a=>�ҹ��� ����, b=�빮�� ����
		
//		int a=0,b=0; 
//		int i=0; //������ ������ŭ �����ϴ� ���� => ��������
//		/*
//		 * 		ABCDEFG  ==>7
//		 * 		======
//		 * 		0123456
//		 */
//		while (i<s.length())
//		{
//			char c=s.charAt(i);
//			if(c>='A' && c<='Z')
//				b++; // ���� Ȯ ==> ��+=
//			if(c>='a' && c<='z')
//				a++;
//			i++;
//		}
//			System.out.println("�빮�� ����:+b");
//			System.out.println("�ҹ��� ����:+a");
		}

	}


