//20200701(4)

// 사용자가 입력(정수) ==> 2진법 출력
// bit => 16bit ==> 32767
// 17개의 변수 必 ==> 01(16)
// 0000 0000 0000 1010 => 16자리에 0,1이 들어가기 때문에 변수 16개, 개별적인 입력값 10(배열에 포함X) 변수 1개 총 17개 必

/*
 * 		노래제목, 가수명, 앨범, 포스터, 순위	
 * 		
 * 		=> 50곡  이라면 => 변수는 250개 必 => 먼저 5개 잡고 노래제목~순위 따로따로 
 */

/*
 * 		사용법
 * 			제어문
 * 			조건	
 * 			반복 = for (횟수가 지정 => 자동종료)
 * 			   = while (종료시점을 반드시 입력)
 * 			연산나 => 산술연산자, 대입
 * 	     	조건문 = 비교, 부정, 논리 (if,for조건,while조건)
 */
import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
public class 자바배열_용도3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] binary=new int[16]; //0,1만 저장
		int user=0; //사용자가 요청한 정수
		int index=15; // 배열 제어 역활, 진법은 뒤에서 출력(뒤에서부터 저장)하는게 좋다 (0000 0000 0000 1010)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		user=scan.nextInt();
		
		
//		System.out.println("========== Library 이용 ===========");
//		System.out.println(Integer.toBinaryString(user));
		
		
		while(true) {   //횟수가 지정되지 않았기 때문에 while 씀, 종료시점(break)주의(while은 for문과 다르게 무한루프 걸릴 수도有)
			
			binary[index]=user%2;  // binary[15자리]
			
			user=user/2;			// 1/2=0
			
			if(user==0)
				break;    
				index--;       // 15부터 거꾸로 간다
	}
		
		// 결과 출력
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)    // if 공백띄는 역활 // 0%4=0 
				System.out.print(" "); 
				System.out.print(binary[i]);
			}
		}
}
