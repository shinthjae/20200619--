//202006226(1)

/*
 *  while => ���ѷ���(�����ͺ��̽�(����Ŭ), �����б�, ��������, ����)
 *  	           ===============		  =======
 *  				����:XML, JSON
 *  				=> break(����)
 *  
 *  ����)
 *  		�ʱⰪ			===== 1
 *  		while(���ǽ�)		===== 2 ==> true => {��Ͼȿ� �ִ� �������}/false
 *  		{
 *  			�ݺ����๮�� 	===== 3
 *  			������		===== 4 ==> ���ǽĺ�
 *  		}	
 *  
 *  		1~10���� ������ ���
 *  		1) 1~10���� ����Ǵ� ���� => ��������
 *  
 *  		   int i=1;		=> 1 (����)
 *  		   while(i<=10) =>10 
 *  		   {
 *  				System.out.println(i)
 *  				i++; // i=2 ==> i<=10 .... i=11 i<=10 => ����
 * 				}
 * 
 * 
 * 			�ʱⰪ����  i=1
 * 			������ ���� ==> ���ǽ�
 * 			i�� ��� ����  i++, i+=2, i+=3 ....		
 */

// �������� �޾Ƽ� ==> ���� ���� ���� ��ŭ ���� ���
import java.util.*;
public class �ݺ���_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int i=1; //��뤷�� ��û�Ѱ����� ������ ���� => while���� ����ϴ� ����
		
		//�������� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է�:");
		user=scan.nextInt();
		
		while(i<=user)
		{
			System.out.print("��");
		 // System.out.println("��");	 
			i++; //user�� ������ �ɶ����� ��������
		}
	}

}
