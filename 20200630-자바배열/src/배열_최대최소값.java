// 20200630(4)


//		������ ���� => 5���� ������ �Ŀ�
//		�ִ밪,�ּҰ� ���ϴ� ���α׷� 
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// <���� �߻�>
		// ���� 5���� �����ϴ� ������ ����� ==> �迭
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5���� ���� ����
		for(int i=0;i<5;i++) {
			// ���� = 0 ....<
			arr[i]=(int)(Math.random()*100)+1;      //Math.random() => 0.00~0.99 
			//      2            1         3        //double default
			//       		0.0~99.0
			//  ������ȯ(0~99)
			//							  1~100
		}
		
		//���
		//int i==> index�� �ƴ϶� => ���� ����� ���� ����
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n====== ��� ======");
		// �ּҰ� ���� ����
		int min=arr[0]; // �̰� ����. �ִ�, �ּҸ� ����
		/*
		 *		20 30 50 60 80
		 */
		// �ִ밪�� ���� ����
		int max=arr[0];
		
		//�ּҰ�
		for(int i=0;i<5;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("�ּҰ�:"+min);
		
		for(int i=0;i<5;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("�ִ밪:"+max);
		
		for(int j=0;j<5;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
			if(max<arr[j]) {
				max=arr[j];
			}
		}
		System.out.println("�ּҰ�:"+min+" �ִ밪:"+max);
	}

}
