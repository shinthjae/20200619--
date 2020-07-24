import java.util.*;

// 성적계산
// 학생 정보 데이터형을 제작 => 사용자정의 데이터 타입

// 배열안에 클래스명 확인하기
// 문자열은 == 을 사용하여 비교하지 말고 .equals를 사용
// null
// static은 자동저장 멤버 변수는 new를 사용하여 저장공간 만들어야
// ===================  =====================
//   하나씩밖에 저장 안됨      		여러개 저장 가능 
//   그래서 함부로 사용하면 안돼             그래서 멤버변수(인스턴스)많이 사용

class Student{
	String name; //null => 모든클래스는 (주소)를 가짐, 없는 경우 (null)
	int kor; // 0
	int eng;
	int math;
	int total;
	double avg; // 0.0
	int rank;
}
public class MainClass {
	
	static void process()
	{
		Student[] std=new Student[3]; //3명
		/*
		 * int[] arr=new int[3] ==> {0.0.0} 클래스 ==> null 입력 => 초기값
		 */
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			
			//메모리 할당
			std[i]=new Student();
			System.out.print("이름 입력:");
			std[i].name=scan.nextLine();
			
			System.out.print("국어 점수 입력:");
			std[i].kor=scan.nextInt();
			
			System.out.print("영어 점수 입력:");
			std[i].eng=scan.nextInt();
			
			System.out.print("수학 점수 입력:");
			std[i].math=scan.nextInt();
			
			std[i].total=std[i].kor+std[i].eng+std[i].math;
			std[i].avg=std[i].total/3.0;	
		}
		
		//출력
		for(Student s:std)
		{
			System.out.println(s.name+" "
							   +s.kor+" "+s.eng+" "+s.math+" "
							   +s.total+" "+s.avg);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
