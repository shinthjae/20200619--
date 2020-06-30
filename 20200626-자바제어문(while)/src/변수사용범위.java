
/*
 * 		변수 Scope
 * 		========
 * 		변수종류
 * 		======
 * 			= 지역변수
 * 			= 멤버변수
 * 			= 공유변수
 * 
 * 			public class A
 * 			{
 * 				int a; =======> 멤버변수 =======> 클래스A가 저장이 될때마다 생성
 * 				static int b; ==>공유변수 +++. JVM class를 로드할때
 * 				public static void main(String[] args)
 *				
 *				{
 *					int c; // 지역변수 ==>
 *				}  // c변수 => main에서만 사용이 가능
 *			}
 *
 *			 for(----;---;---)
 *			 {
 *
 *			 }
 *				i=사용X
 *
 *
 *			int i=1;
 *			do
 *			[
 *
 */
public class 변수사용범위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("i="+i);
//		}// i는 삭제 (메모리)
//		System.out.println("i="+i);
//		
////		System.gc(); ======> 메모리 회수(가비지 컬렉션)
//		i=1;
//		System.out.println("i="+i);
		
		int i=1;
		for(i=1;i<=5;i++)
			
			while(i<=5)
		{
			System.out.println(i+" ;");
			i++;
		}
		System.out.println(i+" ");
		i=1;
		do 
		{
			System.out.println(i+" ");
			i++;
		} while (i<=5);

}
}
