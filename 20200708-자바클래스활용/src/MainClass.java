import java.util.*;

// �������
// �л� ���� ���������� ���� => ��������� ������ Ÿ��

// �迭�ȿ� Ŭ������ Ȯ���ϱ�
// ���ڿ��� == �� ����Ͽ� ������ ���� .equals�� ���
// null
// static�� �ڵ����� ��� ������ new�� ����Ͽ� ������� ������
// ===================  =====================
//   �ϳ����ۿ� ���� �ȵ�      		������ ���� ���� 
//   �׷��� �Ժη� ����ϸ� �ȵ�             �׷��� �������(�ν��Ͻ�)���� ���

class Student{
	String name; //null => ���Ŭ������ (�ּ�)�� ����, ���� ��� (null)
	int kor; // 0
	int eng;
	int math;
	int total;
	double avg; // 0.0
	int rank;
}
public class MainClass {
	
	static void process()
	{
		Student[] std=new Student[3]; //3��
		/*
		 * int[] arr=new int[3] ==> {0.0.0} Ŭ���� ==> null �Է� => �ʱⰪ
		 */
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			
			//�޸� �Ҵ�
			std[i]=new Student();
			System.out.print("�̸� �Է�:");
			std[i].name=scan.nextLine();
			
			System.out.print("���� ���� �Է�:");
			std[i].kor=scan.nextInt();
			
			System.out.print("���� ���� �Է�:");
			std[i].eng=scan.nextInt();
			
			System.out.print("���� ���� �Է�:");
			std[i].math=scan.nextInt();
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;	
		}
		
		//���
		for(Student s:std)
		{
			System.out.println(s.name+" "
							   +s.kor+" "+s.eng+" "+s.math+" "
							   +s.total+" "+s.avg);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
