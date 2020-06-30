// 20200630 (3)

/*		배열에 값 주입
		=========
		1. 직접주입
		2. 사용자가 입력한 값 => Scanner
		3. 난수이용
		===========================
		4. File읽기
		5. web에서 읽어서 주입
		6. 오라클
		
		===========================
		배열 ==> 0번부터 입력 
		   ==> 맨뒤부터 입력하는 방식
		   
		===========================*/
		   
import java.util.*;		
public class 배열의값주입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3명의 학생 성적관리 => 국어,영어,수학 => 총점, 평균, 학점, 등수
		
		//3명의 학생 국어3 영어3 수학3
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		/*
		 * 		for(int i=0;i<3;i++){
		 * 			Scanner scan=new Scanner(System.in);
		 * 		} 
		 * 	
		 * 		==> for문안에 안쓰는 이유 => 0~3까지 반복 => new => 새로운 (안쓰는)공간이 생김 => 메모리만 차지함
		 * 		==> Scanner는 여러 변수를 받을 수 있다
		 */
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d번째 국어점수 입력:",i+1);
			kor[i]=scan.nextInt();
			
			System.out.printf("%d번째 영어점수 입력:",i+1);
			eng[i]=scan.nextInt();
			
			System.out.printf("%d번째 수학점수 입력:",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i]; // math[0] ==> 일반변수
			avg[i]=total[i]/3.0;
		}
		
		// 등록된 점수를 출력(for-each는 배열의 하나만 출력 가능 이건 3개씩임)
		// 학점 계산
		for(int i=0;i<3;i++) {
			char c='A';
			switch(total[i]/30) {     // 평균 (int)avg[i]/3
			case 10:
			case 9:
				c='A';
				break;
			case 8: 
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			break;
				
			}
			hakjum[i]=c;
		}
		/*
		 * 		%-5d
		 * 		80000  =>왼쪽
		 * 
		 * 		%5d
		 * 		00008  =>오른쪽	
		 * 
		 * 		%7d
		 * 		0000240
		 * 
		 * 		한글 ==> 1글자 (2byte)
		 * 		000000
		 * 		==
		 * 		국
		 */
		// 등수 계산
		/*
		 * 		240	  230	250
		 * 			rank=1+1+1 ==> 3
		 * 		rank=1+1 ==> 2
		 * 
		 * 		240	  230	250
		 */
		for(int i=0;i<3;i++) {
			rank[i]=1;
			for(int j=0;j<3;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
		/*
		 * 		%c => char
		 * 		%s => String
		 * 		%d => int
		 * 		%f => double
		 */
//		★★★★★★★★★★★★★★★
//		★★★★★출력조심★★★★★
//		★★★★★★★★★★★★★★★
		System.out.printf("%-6s%-6s%-6s%-7s%-7s%-6s%-6s\n","국어","영어","수학","총점","평균","학점","등수");
		
		for(int i=0;i<3;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c\n",kor[i],eng[i],math[i],total[i],avg[i],hakjum[1],rank[1]);
		}
			

			
			
	

	}

}
