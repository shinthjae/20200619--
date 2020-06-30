// 20200630(6) p.202, p.203

/*		20 10 40 50 30
		
		=> DESC(내림차순) 50 40 30 20 10
		=> ASC(올림차순) 	10 20 30 40 50
		
		1.선택정렬 ==> 왼쪽고정 => 
			20 10 40 50 30
			==
			   ==
			10 20
			==	  ==
			10	  40
			==       ==
			10       50
			==			==
			10			30
			===================== 1ROUND
			10 20 40 50 30
			   == ==
			   20 40
			   ==    ==
			   20    50
			   ==       ==
			   20       30
		    ===================== 2ROUND
		    10 20 40 50 30
		    	  == ==
		    	  40 50
		    	  ==    ==
		    	  30 50 40
		    ===================== 3ROUND
		    10 20 40 50 40
		    		 == ==
		    		 40 50
		    ===================== 4ROUND
		    10 20 30 40 50
		    			=======> n ==> n-1
		    
		2.버블정렬   ==> 맨뒤 고정 => 가장 흔함(정렬중)
		
			20 10 40 50 30 
			== ==
			10 20
			   == ==
			   20 40
			      == ==
			      40 50
			         == ==
			         30 50
		    ================== 
		    10 20 40 30 50
		    == ==
		       == ==
		          == ==
		             == ==
		    ==================
		    10 20 30 40 50
		    == ==
		       == ==
		    ==================
		    10 20 30 40 50
		    == ==
		    ==================
		    10 20 30 40 50
		    
		    
		    
		    //i는 0부터 시작 j는 1부터 비교	   i=0 j=1
			//                         20 30 10 40 50    
			//                             i=1 j=2
			 * 
			 * int a=10;
			 * int b=20;
			 * 
			 * a=b; ==> a=20
			 * =>20
			 * b=a; ==> b=20
			 * 
			 * int temp=a;
			 * a=b;
			 * 
			 * 10 ==> b=10
			 * 
		    */
		    
public class 배열_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,10,40,20,50}; // ASC => DESC
		System.out.println("정렬 전:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후:");
		
//		// 선택정렬
//		for(int i=0;i<arr.length-1;i++) {  		//i는 0부터 시작 j는 1부터 비교	   i=0 j=1
//			for(int j=i+1;j<arr.length;j++) {	//                         20 30 10 40 50    
//				if(arr[i]>arr[j]) {				//                             i=1 j=2
//					int temp=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//				}
//			}
//		}
//		
//		
//		for(int i:arr) {
//			System.out.print(i+" ");
//	}
//		
		
		for(int i=0;i<arr.length-1;i++) {  		//i는 0부터 시작 j는 1부터 비교	   i=0 j=1
			for(int j=i+1;j<arr.length;j++) {	//                         20 30 10 40 50    
				if(arr[i]<arr[j]) {				//                             i=1 j=2
					int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
	}


}
}
