
/*
 * 		���� Scope
 * 		========
 * 		��������
 * 		======
 * 			= ��������
 * 			= �������
 * 			= ��������
 * 
 * 			public class A
 * 			{
 * 				int a; =======> ������� =======> Ŭ����A�� ������ �ɶ����� ����
 * 				static int b; ==>�������� +++. JVM class�� �ε��Ҷ�
 * 				public static void main(String[] args)
 *				
 *				{
 *					int c; // �������� ==>
 *				}  // c���� => main������ ����� ����
 *			}
 *
 *			 for(----;---;---)
 *			 {
 *
 *			 }
 *				i=���X
 *
 *
 *			int i=1;
 *			do
 *			[
 *
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("i="+i);
//		}// i�� ���� (�޸�)
//		System.out.println("i="+i);
//		
////		System.gc(); ======> �޸� ȸ��(������ �÷���)
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
