//20200701(2)

// 가위 바위 보
/*
 * 		0 => 가위
 * 		1 => 바위
 * 		2 => 보
 */

//입력
import java.util.*;

public class 자바배열_용도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 컴퓨터 => 난수
		int com = (int) (Math.random() * 3); // 0~2
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("0(가위),1(바위),2(보):");
		int user = scan.nextInt();
		
		  // 입력된 결과 확인 
//		  if(com==0) 
//			  System.out.println("컴퓨터:가위"); 
//		  else if(com==1)
//			  System.out.println("컴퓨터:바위"); 
//		  else if(com==2) 
//			  System.out.println("컴퓨터:보");
//		 
//		  if(user==0) 
//			  System.out.println("Player:가위"); 
//		  else if(user==1)
//			  System.out.println("Player:바위"); 
//		  else if(user==2)
//			  System.out.println("Player:보");
		  
		 
		String[] result = { "가위", "바위", "보" };
		System.out.println("컴퓨터:" + result[com]);
		System.out.println("Player:" + result[user]);
	}
}
