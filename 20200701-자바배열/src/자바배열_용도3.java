//20200701(4)

// ����ڰ� �Է�(����) ==> 2���� ���
// bit => 16bit ==> 32767
// 17���� ���� �� ==> 01(16)
// 0000 0000 0000 1010 => 16�ڸ��� 0,1�� ���� ������ ���� 16��, �������� �Է°� 10(�迭�� ����X) ���� 1�� �� 17�� ��

/*
 * 		�뷡����, ������, �ٹ�, ������, ����	
 * 		
 * 		=> 50��  �̶�� => ������ 250�� �� => ���� 5�� ��� �뷡����~���� ���ε��� 
 */

/*
 * 		����
 * 			���
 * 			����	
 * 			�ݺ� = for (Ƚ���� ���� => �ڵ�����)
 * 			   = while (��������� �ݵ�� �Է�)
 * 			���곪 => ���������, ����
 * 	     	���ǹ� = ��, ����, �� (if,for����,while����)
 */
import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] binary=new int[16]; //0,1�� ����
		int user=0; //����ڰ� ��û�� ����
		int index=15; // �迭 ���� ��Ȱ, ������ �ڿ��� ���(�ڿ������� ����)�ϴ°� ���� (0000 0000 0000 1010)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�(0~32767):");
		user=scan.nextInt();
		
		
//		System.out.println("========== Library �̿� ===========");
//		System.out.println(Integer.toBinaryString(user));
		
		
		while(true) {   //Ƚ���� �������� �ʾұ� ������ while ��, �������(break)����(while�� for���� �ٸ��� ���ѷ��� �ɸ� ������)
			
			binary[index]=user%2;  // binary[15�ڸ�]
			
			user=user/2;			// 1/2=0
			
			if(user==0)
				break;    
				index--;       // 15���� �Ųٷ� ����
	}
		
		// ��� ���
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)    // if ������ ��Ȱ // 0%4=0 
				System.out.print(" "); 
				System.out.print(binary[i]);
			}
		}
}
