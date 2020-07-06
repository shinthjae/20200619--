//20200701(3) 다시 반복반복반복

// ex야구게임

//		===========
//		  3  6  9
//		=========== int[] com= {3,6,9};       //숫자 맞으면 S
//		
//		======= 결과 ========
//		S:●●●
//		B:
//		====================
//		3 9 6 
//		3 6 9
//		
//		3 8 7
//		======= 결과 ========
//		S:●
//		B:
//		====================
//
//		8 7 3
//		======= 결과 ========
//		S:●
//		B:
//		====================

import java.util.*;
public class 자바배열_용도2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com= {3,6,9};
		// 사용자가 입력한 값 저장
		int[] user=new int[3];
		
		// 입력 받기
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수를 입력:"); 	//100~999
			// 조건따지기	
			int input=scan.nextInt();
			if(input<100 || input>999) {
//				|| => 잘못된 입력일 경우에 주로처리
//				&& => 정상적으로 입력이 된 경우에 처리
				System.out.println("잘못된 입력입니다!!"); //while 처음으로 이동
				continue; // while의 조건식으로이동
			}
			// 잘못된 입력
			// 중복된 수가 있으면 안된다 
			// 저장 ==> 123 입력
			user[0]=input/100; // 123/100 => 1
			user[1]=(input%100)/10; // 123%100 ==> 23/10 => 2
			user[2]=input%10; // 화폐매수 구하기
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다!!");
				continue;
			}
			
			// 비교
			int s=0,b=0;
			for(int i=0;i<3;i++) {		  // com
				for(int j=0;j<3;j++){	  // user
					if(com[i]==user[j]) {  // 같은 수가 있는지 여부 확인
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			// 결과값출력
			System.out.println("====== 결과 ========");
			System.out.print("S:");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.println("\nB:");
			System.out.print("S:");
			for(int i=0;i<b;i++) {
				System.out.print("●");
			}
			System.out.println("\n==================");
			
			// while 종료여부
			if(s==3) {
				System.out.println("Game Over!!");
				break;
			}
		}
		

	}

}
