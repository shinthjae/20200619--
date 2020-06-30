//20200625(9)
/*
 * 		변수명칭법 => 식별자
 * 		1) 알파벳(대소문자), 한글로 시작한
 * 		2) 숫자는 사용 가능 (앞에 사용금지)
 * 		3) 키워드는 사용 할 수 없다
 * 		4) _ , $ 사용이 가능
 * 		============================= 적용 (클래스명, 메소드명)
 * 
 * 		for 형식)
 * 		
 * 			for(초기화 ; 조건식; 증감식){
 * 				반복수행 문장
 * 				실행문장
 * 			}
 * 
 * 			for(초기화 ; 조건식; 증감식)
 * 				반복수행 문장
 * 				실행문장
 * 			
 * 			출력 ===>
 * 				AaBbDd.....Zz
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			System.out.println("Hello!!");
//			System.out.println("Java=>For");    // 블록안에 있으면  for문 소속 => 블록 항상 주의! 
//		}
//		
//		System.out.println("===========");
//		
//		for(int i=1;i<=5;i++) {
//			System.out.println("Hello!!");
//			System.out.println("Java=>For");	// 블록 없으면 따로따로 for문 소속아님
			
			char c='a';
			for(char ch='A';ch<='Z';ch++) {
				System.out.print(ch+""+c++);
			}
		
//			//char c='a';
//			for(char ch='A';ch<='Z';ch++) {
//				System.out.print(ch+""+(char)(ch+32));
//			}	
//			
//			char d='a';
//			for(char ch='A';ch<='Z';ch++) {
//				System.out.print(ch+""+d);
//				d++;
		
		//조건이 없이 1~10 ==> 홀수만 출력
		
//			for(int i=1;i<=10;i+=2) {
//				System.out.printf("%d\t",i);
//				System.out.print(i+"\t");
		
		// 짝수만
		
//			for(int o=2;o<=10;o+=2) {
//				System.out.printf("%d\t",ii);
//				System.out.print(o+"\t");
//			}
			
		//1~5 ==> 1,2,3,4,5
	
//			for(int i=1;i<=5;i++) {
//				System.out.print(i);
//				if(i<5)
//					System.out.print(",");
//			}
			
		
//		// 10 ==> 1010      15 ==> 1111
//		
//			System.out.println();
//			int su=10;
//			String s="";
//			
//			for(;;) {
//				int a=su%2;
//				System.out.print(a);
//				s+=a+"";
//				su=su/2;
//				if(su==0)
//					break;
//				System.out.print();
//			}
//			for(int i=s.length()-1; i>=0;i--) {
//				System.out.print(s.charAt(i));
//			}

	}

	}


