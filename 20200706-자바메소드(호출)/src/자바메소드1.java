
//		���α׷�(����� ������ + ��ɹ�)
//		���� ==> �迭 ==>Ŭ���� ==> ���� ==> �����ͺ��̽�
//		==========
//		��ɹ� ==:> �޼ҵ�(�Ѱ��� ����) ==> Ŭ���� ==> ��Ű�� ==> .jar(���̺귯��)
//		====		


//		�޼ҵ� 
//			= ��������� �żҵ�
//				=����)
//						��ȯ�� �޼ҵ��(�Ű�����...)
//						{
//							return ��; => ��=��ȯ��
//							��ȯ���� ���� ��쿡�� => void, return�� ������ ����
//						}
//						
//						==>�޼ҵ�ȿ��� ó��> ���
//						   ======�Ϲ� ����
//						==>�޼ҵ�ȿ��� ó�� => ����� ���� �� �� �ִ� 
//						   ====== ��, ������
//						   
//				=ȣ��)
//					�޼ҵ�
//					=>void method(int a,int b)
//					=>method(10,20)
//					�޼ҵ带 ȣ���ϰ� ==> �޼ҵ尡 ������ ����
//					=�ٽ� ȣ��� ��ġ�� ���ƿ´�
//					
//					=>int method()
//					=>ȣ��
//					int a=method()
//					
//					=> String 
//					
//					=> double methoid(int a)
//						=> ȣ��
//						double d=method(10) => int a=10
//				   void peintln()
//						
//						
//						
//					=>double random()
//					=> String substing(int s)
//					=>boolean equals(Sting s)
//					=>void printlm()
//					
//					
//					��ȯ��(������) �Ű�����
//						0		0 String substring(int s, inte)
//						0	    X int length()
//							      double random!
//						X       0 sysout
//						X       X
//						
//						
//						
//						
//	    = ���̺귯��
//		�޼ҵ� : Ư�� �۾��� �����ϱ� ���� ��ǻ�� ��ɹ��� ����
//			  *** �Ѱ��� �ϸ� ����
//			  *** ����ȭ �۾�
//			  	  ======= ������ ���� ==> import
//			  	  ����: ���뼺, �ߺ��� �ڵ� ����
//			  	  ����: ����ȭ(�ܶ�(���))
//			  	  
//			  ��) ���� �߱� ����
//			    = 3�ڸ� ������ ���� �߻�
//				= ����ڿ��� �Է��� ��û
//				= ������ ����� �Է°��� ��
//				= ��Ʈ
//				= ������ ��쿡 ����
//				= �ٽ� ������ ���� ���� Ȯ��
				
// �������� => �޼ҵ尡 �����ؾ� => �ٸ� ������ �����Ѵ�				

/*
 * 			1)���ã��
 * 			2) ã��(�˻�)
 * 			3) ����
 * 			4) ���� 
 * 			5) �߰�
 * 			  ====> �ǹ�
 */
public class �ڹٸ޼ҵ�1 {
	static void aaa()
	{
		System.out.println(" ȣ�����..."); //ù��° ȣ��
		bbb(); //bbb() �̵�
		System.out.println("aaa() ȣ������...");
	}
	static void bbb()
	{
		System.out.println("bbb() ȣ�����...");
		ccc();//2
		System.out.println("bbb() ȣ������...");
	}
		
	static void ccc()
	{
		System.out.println("ccc() ȣ�����..."); //3
		ddd();
		System.out.println("ccc() ȣ������...");
	}
	static void ddd()
	{
		System.out.println("ddd() ȣ�����..."); //14
		System.out.println("ddd() ȣ������...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa(); //�����ϴ� �޼ҵ带 ȿ��(

	}

}
