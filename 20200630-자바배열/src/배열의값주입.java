// 20200630 (3)

/*		�迭�� �� ����
		=========
		1. ��������
		2. ����ڰ� �Է��� �� => Scanner
		3. �����̿�
		===========================
		4. File�б�
		5. web���� �о ����
		6. ����Ŭ
		
		===========================
		�迭 ==> 0������ �Է� 
		   ==> �ǵں��� �Է��ϴ� ���
		   
		===========================*/
		   
import java.util.*;		
public class �迭�ǰ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3���� �л� �������� => ����,����,���� => ����, ���, ����, ���
		
		//3���� �л� ����3 ����3 ����3
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		
		/*
		 * 		for(int i=0;i<3;i++){
		 * 			Scanner scan=new Scanner(System.in);
		 * 		} 
		 * 	
		 * 		==> for���ȿ� �Ⱦ��� ���� => 0~3���� �ݺ� => new => ���ο� (�Ⱦ���)������ ���� => �޸𸮸� ������
		 * 		==> Scanner�� ���� ������ ���� �� �ִ�
		 */
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d��° �������� �Է�:",i+1);
			kor[i]=scan.nextInt();
			
			System.out.printf("%d��° �������� �Է�:",i+1);
			eng[i]=scan.nextInt();
			
			System.out.printf("%d��° �������� �Է�:",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i]; // math[0] ==> �Ϲݺ���
			avg[i]=total[i]/3.0;
		}
		
		// ��ϵ� ������ ���(for-each�� �迭�� �ϳ��� ��� ���� �̰� 3������)
		// ���� ���
		for(int i=0;i<3;i++) {
			char c='A';
			switch(total[i]/30) {     // ��� (int)avg[i]/3
			case 10:
			case 9:
				c='A';
				break;
			case 8: 
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
			break;
				
			}
			hakjum[i]=c;
		}
		/*
		 * 		%-5d
		 * 		80000  =>����
		 * 
		 * 		%5d
		 * 		00008  =>������	
		 * 
		 * 		%7d
		 * 		0000240
		 * 
		 * 		�ѱ� ==> 1���� (2byte)
		 * 		000000
		 * 		==
		 * 		��
		 */
		// ��� ���
		/*
		 * 		240	  230	250
		 * 			rank=1+1+1 ==> 3
		 * 		rank=1+1 ==> 2
		 * 
		 * 		240	  230	250
		 */
		for(int i=0;i<3;i++) {
			rank[i]=1;
			for(int j=0;j<3;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
		/*
		 * 		%c => char
		 * 		%s => String
		 * 		%d => int
		 * 		%f => double
		 */
//		�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
//		�ڡڡڡڡ�������ɡڡڡڡڡ�
//		�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		System.out.printf("%-6s%-6s%-6s%-7s%-7s%-6s%-6s\n","����","����","����","����","���","����","���");
		
		for(int i=0;i<3;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c\n",kor[i],eng[i],math[i],total[i],avg[i],hakjum[1],rank[1]);
		}
			

			
			
	

	}

}
