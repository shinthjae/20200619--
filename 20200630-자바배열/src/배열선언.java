// 20200630 (1)
/*
 *		배열 :
 *			1) 같은 타입의 여러개의 변수를 묶어서 관리하는 프로그램
 *			   =======	
 *			 숫자형(정수, 실수, 문자), 문자열, 
 *			 예외) doduble[] a={100,10.5,...} => 큰데이터는 가능
 *			
 *			2) 한개의 변수명을 이용해서 => 여러개의 변수를 제어
 *			   =============== 구분자: 번호로 구분한다
 *								     ========= 인덱스번호
 *									  인덱스번호 => 0번부터 시작한다
 *				예) in[] arr={10,20,30,40,50} => 크게 늘릴 수 있다
 *
 *					메모리 주소 이용해 접근하는 변수 ==> 참조변수( 배열, 클래스)
 *							  arr[0] arr[1] arr[2] arr[3] arr[4]
 *					==arr==   =====================================
 *					  100   	    10		 20	    30	     40	  
 *					=======   ======================================
 *							 100	104		108		112		116
 *							 100+0
 *								100+1		100+2		100+3		100+4
 *
 *			==> 배열 선언 방식
 *				=========
 *				데이터형[] 배열명;
 *						===== 변수의 명칭법
 *				데이터 형 배열명[i]
 *
 *			예)
 *				영화제목을 10개 모아서 관리
 *				String[] title=new String[10];  => null
 *				10명의 학생의 학점을 관리	
 *				char[] hakjum=new char[10];		=>'\0'	
 *				10명의 학생의 총점을 관리
 *				int[] total=new int[10];
 *				==> new를 사용하면 메모리 공간이 생성 ==> 0값으로 초기화 된다
 *
 *				double => 0.0
 *				float => 0.0f
 *				long => 0L
 *			예) 직접 값을 주입하는 방법
 *				int[] arr={10,20,30,40,50}
 *
 *				int a;
 *				a=10
 *				int a=10;
 *	
 *				=> 주의점
 *					1. 배열의 크기를 초과하면 error : ArrayIndexOutBoundsExceotion
 *					   ============
 *						n개 ==> 0~n-1 ==> 만약에 객수를 모르는 경우 : length
 *					2. 제어문을 이용시에는 => 주로 for문을 이용해서 처리
 *
 */
public class 배열선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명레 대한 점수 => 저장 , 총점  , 평균
		int a=80;
		int b=90;
		int c=75;
		int d=90;
		int e=85;
		
		int total=a+b+c+d+e;
		double avg=total/5.0;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		
		
		//배열
		int[] score= {80,90,75,90,85};
		// 80 => score[0]
		// 90 => score[1]
		int total2=0;
		double avg2=0.0;
		for(int i=0;i<score.length;i++)
		{
			total2+=score[i];
		}
		avg2=total2/5.0;
		
		System.out.println("총점:"+total2);
		System.out.println("평균:"+avg2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
