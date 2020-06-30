
/*
 *		1차for ==> 5 ==> 1~5
 *		2차for ==> 1-1, 2-2, 3-3, 4-4, 5-5
 *			  ==> i=j ==>
 *			 
 * 
 * 		1
 * 		22
 * 		333
 * 		4444
 * 		55555
 * 
 * 		1
 * 		12
 * 		123
 * 		1234
 * 		12345
 * 
 * 		11111
 * 		2222
 * 		333
 * 		44
 * 		5
 * 
 */
public class 반복문_2차for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=5;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.println(i);
//			}
//			System.out.println();	
//		}
		
		
//		=====================================================
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();	
		}
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();	
		}
//		
//		11111
//		2222
//		333
//		44
//		5
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=1-i;j++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();	
//		}

		for(int i=1;i<=5;i++) {
			System.out.println(i);	
		}

	}

}
