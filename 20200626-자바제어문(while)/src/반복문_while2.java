import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

//202006226(2)

//	사용자가 알파벳을 입력하면 B ==> AB
//	D 입력하면 => ABCD 까지 출력
// char==> scan.nest().charAt(0)
/*
 * 		"ABCDE" ==> scan.next()   //next() 순차적으로나옴
 * 		=======
 * 		 'A' => charAt(0)         //next중 0번째
 * 		 'B' => charAt(1)				  1번째
 * 
 * 		일정 패턴 ==> 반복문사용이 가능
 * 		====== 수열
 */
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char user=' ';
		//while ==> 종건이 false될때까지 변경하는 변수 : 루프변수
		char c='A';
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 입력(대문자):");
		user=scan.next().charAt(0);
		
		while(c<=user)
		{
			System.out.print(c);
			c++;
		}
		
		

	}

}
