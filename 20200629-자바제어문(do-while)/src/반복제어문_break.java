import com.sun.org.apache.bcel.internal.generic.I2F;

//202006299(3)

/*
 * 		�ݺ����
 * 			= break => �ݺ����� �����Ҷ�
 * 			= continue => Ư���κ��� �����ϰ� ���� ���
 * 			= ���ǹ��� ���� ����Ѵ�(if)
 * 		    =  	�� break, continue�� �Ѱ��� �ݺ����� ���� �� �� �ִ�.
 * 			            �� break => �ݺ��� ��ü(for, do~while, while),switch
 * 				�� continue => �ݺ��������� ����� ����
 * 				�� return => ����(�޼ҵ� ����)
 * 
 */
public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		============================= break ====================================
		
		// 1~10���� ��� ==> 5�϶� ���� ==> break;
		for (int i=1;i<=10;i++)
		{
			if(i==5)	// 5�϶�
				break;	// ����
			System.out.print(i+" ");
		}
		
		for (int i=1;i<=10;i++)
		{
			System.out.print(i+" "); 	// ���๮ ��ġ�� ���� ��� ���� �޶�����
			if(i==5)	
				break; 	//����
		}
		
//		============================= continue ======================================
		
		// 1~10���� Ȧ���� ���
		// 1) ���ǹ� 2) 2�� ���� 3) continue ���
		
		System.out.println("\n====  ���ǹ� ===="); //���ǹ�
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)		// i%2==0(¦��) i%2!=0(Ȧ��)
							// i%2==1      !(i%2==0)
				System.out.print(i+" ");
		}
		
		System.out.println("\n====  2������ ====");//2������
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n====  conitnue ====");//continue 
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			continue;	//¦���� ����	// i++�� �̵�
							//���������� �̵�
			System.out.print(i+" ");
		}
		
		/*
		 * 		break => while, for, do~while�� ����
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
		 * 			==> ó������ �ٽ� ������ ��� 
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
