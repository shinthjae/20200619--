//20200703(1)

/* 
 *		변수 : 필요 => 변견해서 사용할 수 있는 메모리 기억공간
 *		상수 : 변경할 수 없는 값
 *		
 *		변수의 종류
 *		========
 *		1) 한개의 데이터 공간	=========>	변수
 *		2) 같은 타입 여러개를 저장하는 공간	==========> 배열(연속적으로 메모리에 저장 => 인덱스)
 *		3) 다른 타입 여러개를 저장하는 공간	==========> 클래스
 *												= 변수로만 사용하는 방법 (사용자 정의 데이터형) : 데이터형 클래스
 *												= 기능만 설정 : 액션 클래스
 *		*** 변수 => 메모리에 저장 => 프로그램이 종료하면 자동으로 메모리에서 사라진다
 *		
 *		변수를 사용
 *		========
 *		메모리에 저장 => 메모리 크기, 사용범위 => {}안에서만 사용이 가능
 *		public class A
 *		{
 *			변수 => 클래스 전체에서 사용 (전역변수)
 *			public static void main(String[] arg)
 *			{
 *				변수 => main안에서 사용 (지역변수)
 *				if(조건문)
 *				{
 *					변수 => if에서만 사용
 *				}
 *			}
 *		}
 *
 *		
 *		변수의 용도
 *		======== 프로그램 (변경되는 데이터)
 *		
 *		변수명을 만드는 방법 ==> 메모리는 주소(0번~~~~~메모리 크기까지)
 *		=> 4byte로 분할 => 정수 한개를 저장하는 공간 => int
 *		=> 주소 => 저장된 위치를 확인할 수 없다 => 별칭(변수) => 저장된 데이터 찾기 => 식별자
 *
 *		변수 => 기본형(자바에서 제공하는 메모리 크기)
 *			=> 정수 저장(int=>일반프로그램, long=>빅데이터)
 *			=> 실수 저장(boolean)
 *			=> true.false => boolean => 존재여부 확인 (while안에서 종료)
 *			=> 문자를 여러개 저장 ==> String
 *	
 *		변수선언 
 *		 
 *		정수선언
 *		======
 *		int a;
 *		long a;
 *
 *		문자열 선언
 *		========
 *		String s;
 *
 *		논리 선언
 *		======
 *		boolean b;
 *		
 *		실수 선언
 *		=======
 *		double a;
 *
 *		변수초기화
 *			변수명 = 값
 *			=========> int a=10; long a=10(10L)
 *					   boolean a=true/false
 *					   double a= 10.0
 *
 *		
 *
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10개의  데이터(정수) => 배열
		// 두개의 정수 => 일반 int
		// 문자를 여러개 저장 => char[] , String
		// true/false ==> boolean
		
//		int[] com=new int[10]; //숫자를 저장 1~10 => 중복이 안되게 임의로 추출(난수)
		
//		//10개 데이터에 초기값 주입
//		for(int i=0;i<10;i++) {
//			com[i]=(int)(Math.random()*10)+1;
//		}
//		
//		//확인 =출력
//		for(int i:com) {
//			System.out.print(i+" ");
//		}
		
		
//중복되지 않는 1~10 난수 
		
		int[] com=new int[10];
		int su=0; //난수값 저장 
		//중복이 없으면 => 저장(false) , 중복이 되면(true) => 난수를 다시 발생
		boolean bCheck=false;
		//변수를 잡을 때 중요한것 => 경우의 수
		//ex) 로그인 => 경우의 수 3개 => String , int , char
		//			  =========(ID , PWD , LOGIN 틀릴 경우)
		for(int i=0;i<10;i++) {
			
			bCheck=true;//중복여부확인, 중복이 되면 ==> 다시 난수 발생
			
			while(bCheck) {
				
				su=(int)(Math.random()*10)+1;//난수
				
				bCheck=false;//종료확인
				
				for(int j=0;j<i;j++) {	//비교 => 같은수가 저장되었는지 확인
					
					if(com[j]==su) {
						
						bCheck=true;
						break;
					}
				}
			}
			//while end
			com[i]=su;
		}
		for(int i:com) {
			System.out.print(i+" ");
		}

	}

}
