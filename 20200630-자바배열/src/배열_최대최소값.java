// 20200630(4)


//		임의의 정수 => 5개를 저장한 후에
//		최대값,최소값 구하는 프로그램 
public class 배열_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// <난수 발생>
		// 정수 5개를 저장하는 공간을 만든다 ==> 배열
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5개의 값을 변경
		for(int i=0;i<5;i++) {
			// 시작 = 0 ....<
			arr[i]=(int)(Math.random()*100)+1;      //Math.random() => 0.00~0.99 
			//      2            1         3        //double default
			//       		0.0~99.0
			//  정수변환(0~99)
			//							  1~100
		}
		
		//출력
		//int i==> index가 아니라 => 실제 저장된 값을 대입
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n====== 결과 ======");
		// 최소값 저장 공간
		int min=arr[0]; // 이게 정석. 최대, 최소를 몰라서
		/*
		 *		20 30 50 60 80
		 */
		// 최대값을 저장 공간
		int max=arr[0];
		
		//최소값
		for(int i=0;i<5;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("최소값:"+min);
		
		for(int i=0;i<5;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("최대값:"+max);
		
		for(int j=0;j<5;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
			if(max<arr[j]) {
				max=arr[j];
			}
		}
		System.out.println("최소값:"+min+" 최대값:"+max);
	}

}
