//20200625(9)
/*
 * 		������Ī�� => �ĺ���
 * 		1) ���ĺ�(��ҹ���), �ѱ۷� ������
 * 		2) ���ڴ� ��� ���� (�տ� ������)
 * 		3) Ű����� ��� �� �� ����
 * 		4) _ , $ ����� ����
 * 		============================= ���� (Ŭ������, �޼ҵ��)
 * 
 * 		for ����)
 * 		
 * 			for(�ʱ�ȭ ; ���ǽ�; ������){
 * 				�ݺ����� ����
 * 				���๮��
 * 			}
 * 
 * 			for(�ʱ�ȭ ; ���ǽ�; ������)
 * 				�ݺ����� ����
 * 				���๮��
 * 			
 * 			��� ===>
 * 				AaBbDd.....Zz
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			System.out.println("Hello!!");
//			System.out.println("Java=>For");    // ��Ͼȿ� ������  for�� �Ҽ� => ��� �׻� ����! 
//		}
//		
//		System.out.println("===========");
//		
//		for(int i=1;i<=5;i++) {
//			System.out.println("Hello!!");
//			System.out.println("Java=>For");	// ��� ������ ���ε��� for�� �ҼӾƴ�
			
			char c='a';
			for(char ch='A';ch<='Z';ch++) {
				System.out.print(ch+""+c++);
			}
		
//			//char c='a';
//			for(char ch='A';ch<='Z';ch++) {
//				System.out.print(ch+""+(char)(ch+32));
//			}	
//			
//			char d='a';
//			for(char ch='A';ch<='Z';ch++) {
//				System.out.print(ch+""+d);
//				d++;
		
		//������ ���� 1~10 ==> Ȧ���� ���
		
//			for(int i=1;i<=10;i+=2) {
//				System.out.printf("%d\t",i);
//				System.out.print(i+"\t");
		
		// ¦����
		
//			for(int o=2;o<=10;o+=2) {
//				System.out.printf("%d\t",ii);
//				System.out.print(o+"\t");
//			}
			
		//1~5 ==> 1,2,3,4,5
	
//			for(int i=1;i<=5;i++) {
//				System.out.print(i);
//				if(i<5)
//					System.out.print(",");
//			}
			
		
//		// 10 ==> 1010      15 ==> 1111
//		
//			System.out.println();
//			int su=10;
//			String s="";
//			
//			for(;;) {
//				int a=su%2;
//				System.out.print(a);
//				s+=a+"";
//				su=su/2;
//				if(su==0)
//					break;
//				System.out.print();
//			}
//			for(int i=s.length()-1; i>=0;i--) {
//				System.out.print(s.charAt(i));
//			}

	}

	}


