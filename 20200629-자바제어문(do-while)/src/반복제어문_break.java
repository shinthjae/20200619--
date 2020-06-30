import com.sun.org.apache.bcel.internal.generic.I2F;

//202006299(3)

/*
 * 		반복제어문
 * 			= break => 반복문을 종료할때
 * 			= continue => 특정부분을 제외하고 싶은 경우
 * 			= 조건문과 같이 사용한다(if)
 * 		    =  	★ break, continue는 한개의 반복문만 제어 할 수 있다.
 * 			            ★ break => 반복문 전체(for, do~while, while),switch
 * 				★ continue => 반복문에서만 사용이 가능
 * 				★ return => 보류(메소드 종료)
 * 
 */
public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		============================= break ====================================
		
		// 1~10까지 출력 ==> 5일때 종료 ==> break;
		for (int i=1;i<=10;i++)
		{
			if(i==5)	// 5일때
				break;	// 종료
			System.out.print(i+" ");
		}
		
		for (int i=1;i<=10;i++)
		{
			System.out.print(i+" "); 	// 실행문 위치에 따라 출력 값이 달라진다
			if(i==5)	
				break; 	//종료
		}
		
//		============================= continue ======================================
		
		// 1~10까지 홀수만 출력
		// 1) 조건문 2) 2씩 증가 3) continue 사용
		
		System.out.println("\n====  조건문 ===="); //조건문
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)		// i%2==0(짝수) i%2!=0(홀수)
							// i%2==1      !(i%2==0)
				System.out.print(i+" ");
		}
		
		System.out.println("\n====  2씩증가 ====");//2씩증가
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n====  conitnue ====");//continue 
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			continue;	//짝수만 제외	// i++로 이동
							//증가식으로 이동
			System.out.print(i+" ");
		}
		
		/*
		 * 		break => while, for, do~while이 동일
		 * 		continue => while
		 * 					for
		 * 		
		 * 		for(int i=1;i<=10;i++)
		 * 		{
		 * 			if(i==6)
		 * 				continue; ======> i++
		 * 		}
		 * 
		 * 		while(true)
		 * 		{
		 * 			==> 처음부터 다시 수행할 경우 
		 * 		}
		 * 
		 */
		
		System.out.println("\n==== while =====");
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
				continue;
			System.out.println(i+" ");
			i++;
		}
		
	
	

	}

}
