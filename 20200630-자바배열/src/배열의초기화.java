import com.sun.jndi.url.dns.dnsURLContext;

/*// 20200630 (2)

	=> �迭 ����
	      ��������[] �迭��;
	=> �迭 �ʱ�ȭ (�޸𸮾ȿ� ���� ����)
		��)
			int[] arr={10,20,30,40,50}; // ����� ���ÿ� �ʱⰪ
			int[] arr=new int[5]; // �޸� ������ ���� => ���߿� ���� ä���
			int[] arr; // ����
			arr[0]=10;
			arr[1]=20;
			....
			....
			========================
			Ȱ�� => ���(for , while)
			
			for			=> ����
			for-each	=> ��� ���*/
public class �迭���ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���
		String[] names= {"ȫ�浿","�ڹ���","�̼���","������","��û��"};
		for(int i=0;i<names.length;i++)  // ���ǽ� ����,������ �𸦶� �迭��.length
		{
			System.out.println(names[i]); //name[0]~names[4]
		}
		
		System.out.println("=========== for-each ============");
		
		for(String name:names)
		{
			System.out.println(name);     // for���� ������ ���氡�� for-each�� �Ұ���(�����͸� �״�� �������⶧��)
		}
		
	
	}

}
