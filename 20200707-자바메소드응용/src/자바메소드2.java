// ���� ���� ���� => ����, ���, ����
// =========   ===  ===  ===
import java.util.*;
public class �ڹٸ޼ҵ�2 {
	
	//�Է�
	
	//������
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+"���� �Է�:");
		int score=scan.nextInt();
		return score;
	}
	//����
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	// ���
	static void avg(int total)
	{
		System.out.printf("���:%.2f\n",total/3.0);
	}
	//����
	
//	static void hakjum(int total)
//	{
//	
//		if(total>=90)
//		{
//			System.out.println("A����Դϴ�");
//		}
//		else if(total>=80)
//		{
//			System.out.println("B����Դϴ�");
//		}
//		else if(total>=70)
//		{
//			System.out.println("C����Դϴ�");
//		}
//		else if(total>=60)
//		{
//			System.out.println("D����Դϴ�");
//		}
//		else
//		{
//			System.out.println("F����Դϴ�");
//		}
//			
//	}
//	
	static int hakjum2(int kor,int eng,int math)
	{
		return (kor+eng+math)/30;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=userInput("����");
		int eng=userInput("����");
		int math=userInput("����");
		int total=total(kor,eng,math); //������,�޼ҵ�� ���Ƶ���
		
		//���
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);
		System.out.println("����:"+total);
		avg(total);
//		hakjum(total);
		
		switch((kor+eng+math)/30)
		{
		case 10:
		case 9:
			System.err.println("A");
			break;
		case 8:
			System.err.println("B");
			break;
		case 7:
			System.err.println("C");
			break;
		case 6:
			System.err.println("D");
			break;
			
		default:
			System.out.println("F");
		}
		
	}

}
