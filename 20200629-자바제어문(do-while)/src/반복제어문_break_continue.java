//202006299(4)

//updown ���� ==> �߸��� �Է� => �������
//���� => �Է°��� => continue, ������� => break;
//���ڸ� ���⶧���� ������ ��� => while


import java.util.*;
public class �ݺ����_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		// ������ ���ڸ� ���� => ����(com)
		// => i=1 ~~ i=10 ==> i++
		// => break, continue
		// main => ������ �Ұ���
		// ���α׷��� ���α׷��Ӱ� ������ �� ������ ����
		// ���پ� �����Ѵ�
		// ���� ���� => Ƚ����  ������ ���� ���
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("1~100���� ������ ���� �Է�:");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
			System.out.println("�߸��� �Է� ���Դϴ�");
			continue;
			
		}
		
		//��
		
		if(user>com)
		{
			System.out.println("�Է°����� ���� ������ �Է��ϼ���");
		}
		else if(user<com)
		{
			System.out.println("�Է°����� ���� ������ �Է��ϼ���");
		}
		else (user==com)
		{
		}
		System.out.println("Game Over!");
		break;	// System.exit(0)
		// �ݺ��� ����
	}

}
