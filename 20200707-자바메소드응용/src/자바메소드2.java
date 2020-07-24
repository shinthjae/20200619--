// 국어 영어 수학 => 총점, 평균, 학점
// =========   ===  ===  ===
import java.util.*;
public class 자바메소드2 {
	
	//입력
	
	//국영수
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+"점수 입력:");
		int score=scan.nextInt();
		return score;
	}
	//총점
	static int total(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	// 평균
	static void avg(int total)
	{
		System.out.printf("평균:%.2f\n",total/3.0);
	}
	//학점
	
//	static void hakjum(int total)
//	{
//	
//		if(total>=90)
//		{
//			System.out.println("A등급입니다");
//		}
//		else if(total>=80)
//		{
//			System.out.println("B등급입니다");
//		}
//		else if(total>=70)
//		{
//			System.out.println("C등급입니다");
//		}
//		else if(total>=60)
//		{
//			System.out.println("D등급입니다");
//		}
//		else
//		{
//			System.out.println("F등급입니다");
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
		
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math); //변수명,메소드명 같아도됨
		
		//출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
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
