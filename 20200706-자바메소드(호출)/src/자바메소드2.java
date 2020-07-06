//사칙연산 처리
import java.util.*;
public class 자바메소드2 {
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
			System.out.println("0으로 나눌 수 없습니다");
		else 
			System.out.printf("%d/%d=%.2g\n",a,b,a/(double)b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력(5 20):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/):");
		String op=scan.next();
		int result=0;
		
		//메서드 호출
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
			System.out.println("잘못된 연산자입니다!!");
		}
		
		

	}

}
