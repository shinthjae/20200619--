//20200701(6)


/*
 * 		���ڿ� �� : equals()
 * 		=================== (==)
 * 		����ã�� : contains() => �˻�â ����(�ѱ��ڵ�)������ ����� �����˻��� ã����,���ð˻���       **** �ڹٽ�ũ��Ʈ�� ����
 * 		���۹��ڿ� : startsWith() => 
 * 		������ ���ڿ� : endsWidth()
 * 		���ڿ� �ڸ��� : substring()
 * 		���� ���� : charAt()
 * 		������ ���� : length()
 * 		���鹮�� ���� : trim()
 * 		������ ��ġ ã�� : indexOf()  ,  lastIndexOf()
 * 			aaa.java
 * 		����ȯ : valueOf()
 */

// �α��� ó��
import java.util.*;
public class ���ڿ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ID, PW
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID�� �Է�:");
		String id=scan.nextLine();
		System.out.println("��й�ȣ �Է�:");
		String pwd=scan.nextLine();
		
		/*
		 *  equals : ��ҹ��� �����ؼ� ��
		 *  equalsIgnoreCase : ��ҹ��� ���о��� ��
		 */
		
		//���
		
		if(id.equals(ID) && pwd.equals(PWD)) {       // ���ڿ������� (==) ��������� " ����.equals(����)
			System.out.println("�α��� �Ǽ̽��ϴ�.");
		} else {
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�");
		}

	}

}
