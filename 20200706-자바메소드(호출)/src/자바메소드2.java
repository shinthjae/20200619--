//��Ģ���� ó��
import java.util.*;
public class �ڹٸ޼ҵ�2 {
	static int plus(int a,int b)
	{
		return a+b;
	}
	static int minus(int a,int b)
	{
		return a-b;
	}
	static int god(int a,int b)
	{
		return a*b;
	
	}
	
	static void div(int a,int b)
	{
		if(b==0)
			System.out.println("0���� ���� �� �����ϴ�");
		else 
			System.out.printf("%d/%d=%.2g\n",a,b,a/(double)b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�(5 20):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("������ �Է�(+,-,*,/):");
		String op=scan.next();
		int result=0;
		
		//�޼��� ȣ��
		switch(op)
		{
		case "+":
			result=plus(a,b);
			System.out.printf("%d + %d=%d\n",a,b,a+b);
			break;
		case "-":
			result=minus(a,b);
			System.out.printf("%d - %d=%d\n",a,b,a-b);
			break;
		case "*":
			result=god(a,b);
			System.out.printf("%d * %d=%d\n",a,b,a*b);
			break;
		case "/":
			div(a,b);
			break;
		default:
			System.out.println("�߸��� �������Դϴ�!!");
		}
		
		

	}

}
