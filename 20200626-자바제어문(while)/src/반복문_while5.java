/*
 * 
 * 		주의점
 * 		1) while은 조건이 없는 경우 error => for(;;)
 * 		   while()
 *			{
 *			}    ==> 오류발생  => ()조건식이 없어서
 * 		2) while에서 무한루프
 * 			=> for(;;) => while(true):가장 많이 등장
 * 
 * 			for(int 1=0;i<10;i++)  ==> 프로그래머 경향은__을 많이 쓴다
 * 
 * 			int i=0;
 * 			while(i<10)
 * 			{
 * 				i++;
 * 			}
 */

//	5 ~ 1~5 
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // 사용자가 요청한 변수
		int i=1; // 사용자가 요청한 변수까지 증가(후프변수)
		int sum=0; // 누적해아할 변수(합)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		user=scan.nextInt();
		
		while(i<=user)
		{
			sum+=i;;
			i++;;
		}
		// 여기까지 i=6
		System.out.println("sum="+sum);
		
		i=1; //다시 초기값 다시 설정 ==> 1~5
		System.out.println("i="+i);
		/*
		 *   i=1  i=5  
		 */
		while(i<=5)
		{
			System.out.print(i);
			i++;
		}
		//i=6
		System.out.print(i);
		
		 i=5;
		
		while(i>=0)
		{
			System.out.print(i);
			i--;
		}
		
		//i=0
		//int j=1;
		
//		for(int j=1;j<=10;j++)
//		{
//			
//		}
//		System.out.println(j);    		=> j는 메모리에서 사라진다 가로로 끝나면 변수j는 없어진다
		
//		
//		
//		
		
		
		
		
		}
	}


