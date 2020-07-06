/*
 * 		5���� ������ ������
 * 		5�� ���� => SORT => ����
 * 				 ====
 * 				select
 * 
 * 
 * ==========================================
 * 	1) �޼ҵ� : ���� ���� (����� ���ϰ� ����)
 * 	   		    �ݺ� X
 * 
 * 		select()
 * 		{
 * 			����Ŭ ����
 * 			select���� ����
 * 			����Ŭ �ݱ�
 * 		}
 * 		delete()
 * 		{
 * 			����Ŭ ����
 * 			delete���� ����
 * 			����Ŭ �ݱ�
 * 		}
 * 		update()
 * 		{
 * 			����Ŭ ����
 * 			update���� ����
 * 			����Ŭ �ݱ�
 * 		}
 * 		find()
 * 		{	
 * 			����Ŭ ����
 * 			find���� ����
 * 			����Ŭ �ݱ�
 * 		}
 * 		insert()
 * 		{	
 * 			����Ŭ ����
 * 			insert���� ����
 * 			����Ŭ �ݱ�
 * 		}
 */
public class �ڹٸ޼ҵ�1 {
	/*
	 * 		10  40  30  50  20
	 * 		==  ==
	 * 		10  40
	 * 		==      ==
	 * 		10      30
	 * 		==		    ==
	 * 		10		    50
	 * 		==			    ==
	 * 		10			    20
	 * 		===================> for => i=0
	 * 		10  40  30  50  20
	 * 			==  ==
	 * 			30  40
	 * 			==      ==
	 * 			10      30
	 * 			==		    ==
	 * 			10		    50
	 * 		===================> for => i=1
	 * 		10  40  30  50  20
	 */
	
	//���������� �޼ҵ�
//	static int[] sort(int[] arr)
//	{
//		//sort
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr;
//	}
//	
	//�ø������� �޼ҵ�
//	static int[] sort(int[] arr)
//	{
//		//sort
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]<arr[j])   //���� ���� <
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr;
//	}
	
	static int[] sort(int[] arr, String type)
	{
		//sort
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(type.equals("ASC"))
				{
				if(arr[i]>arr[j])   
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			    }
				if(type.equals("DESC"))
				{
				if(arr[i]<arr[j])  
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			    }
		    }
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {10,40,30,50,20};    // sort => ���� => 10,20,30,40,50
//		System.out.println("���� ��:");
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println("\n���� ��:");
//		int[] result=sort(arr);
//		for(int i:result)
//		{
//			System.out.print(i+" ");
//		}
		
		int[] arr= {10,40,30,50,20};    // sort => ���� => 10,20,30,40,50
		System.out.println("���� ��:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���� ��:");
		int[] result=sort(arr,"ASC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		result=sort(arr,"DESC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}

	}

}
