//20200702(8)

public class 이차원배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	i		  0   1   2   3  4
		
//	0				  1
//	1			  2   3   4
//	2		  5   6   7   8   9
//	3			  10  11  12
//	4			      13
				
//				j시작   j끝   => for(int j=?;j<=?;j++)
//		i=0      2    2
//		i=1	     1    3
//		i=2		 0    4   => i+j=2 => j=2-i       i+2=j => j=i+2   for(int j=2-i;j<=i+2;j++) 
//		i=3		 1	  3	**역순이면 더함											for(int j=2-i;j<=6-i;j++) 
//		i=4		 2	  2
		
		
		int[][] arr=new int[5][5];
		int k=1;
		
		for(int i=0;i<3;i++) 
		{
			for(int j=2-i;j<=i+2;j++) 
			{
				arr[i][j]=k;
				k++;
		
			}
		}
		
		for(int i=3;i<=4;i++) 
		{
			for(int j=i-2;j<=6-i;j++) 
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		//출력
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<5;j++) 
			{
				if(arr[i][j]==0) 
						System.out.printf("\t");
				else 
					System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println("\n");
		}
		
		
	}

}
