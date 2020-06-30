//202006299(1)

/*
 * 		반복문 => 반드시 한번 이상을 수행해야 할때(do-while)
 * 		형식)
 * 			초기값 ==> int i=1; ①
 * 			do {
 * 						↓
 * 					반복 수행문장 출럭
 * 					System.out.print(i+" "); ②
 * 						↓
 * 					증가식
 * 					i++;③
 * 						↓
 * 			   } while(조건식); ==> i<=5; ④
 * 			   
 * 		       i=1
 * 				1 => i++ (i=2) ==> i<=5 비교 true => do 안으로 이동
 * 				1=2
 * 					1 2 i++ (i=3) ==> i<=5 비교 true => do 안으로 이동
 *				1=2
 * 					1 2 3 i++ (i=4) ==> i<=5 비교 true => do 안으로 이동
 * 				1=2
 * 					1 2 3 4 i++ (i=5) ==> i<=5 비교 true => do 안으로 이동
 *				1=2
 * 					1 2 3 4 5 i++ (i=6) ==> i<=5 비교 true => do 안으로 이동
 * 				1=2
 * 					1 2 3 4 5 6 i++ (i=3) ==> i<=5 비교 true => do 안으로 이동
 *
 * 
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//초기값
		int i=1; //루프변수 => 횟수 지정
		do 
		{
			System.out.print(i+" "); // 반복실행문장(여러문장 실행이 가능)
			i++; // i가 5가 될때 증가 =>횟수지정
		} while (i<=5);
		// ==> i=6
		
		System.out.println("\n===== while =====");
		
		// 초기값
		i=1; // int j=1; // i값 다시 초기값 주기
		while(i<=5)
		{
			System.out.println(i+" ");
			i++;
		}
		// i=6
		System.out.println("\n===== for ======");
		
		for (i=1;i<=5;i++)
		{
			System.out.print(i+" ");
		}

	}

}
