/*
 * 		���� => ������ ������� Ŭ������ ��� ( �ݺ� �ڵ��� ����)
 * 			1) ��� (is-a)
 * 				�̹� ������� ����� �����ؼ� ���
 * 				public class MyWindow extends JFrame
 * 									  =======
 * 									   Ȯ��� Ŭ����
 * 			2) ���� (has-a)
 * 				�̹� ������� ����� ������� �״�� ���
 * 				public class MyWidow 
 * 				{
 * 					JFrame f=new JFrame();
 * 				}
 */

/*
 * 			public class A
 * 			{
 * 				String name;
 * 				int age;
 * 				public void display();
 * 			}
 * 		
 * 			public class B extends A
 * 			{
 * 				String name;
 * 				int age;
 * 				public void display();
 * 			}
 * 
 *          // ����� �޾��� ��� �ڵ����� A�� ��� ���� �޴´� 
 *          										������  private , static , ������ �� ��� ����
 *             ��ӹ޴� B�� ������ �ٲ� A�� ������ ����
 *          
 *          // super
 *             this
 *             
 *          // ����� ����
 *             => ***�ڹ� ����� ���� ���  => ����ִ¾ְ� 1��  �޴¾� ���� �������    //Ŭ���� ���̾�׷� (ȭ��ǥ �ݴ���� ����صα�)
 *							  ====== <=> ���߻�� �ݴ�� ����  ����ִ¾ְ� �ϳ� �� ���� ���(������ �Ҽ���)
 *
 *          // ��κ� ����Ŭ������ ��		
 *          	
 */

import javax.swing.*;
public class MainClass extends JFrame{                        // String�� ��Ӹ��� final
	/*
	 * public MainClass() // �����ڴ� �������̸� public�޼ҵ�� ����� {
	 * 
	 * }
	 */
	public MainClass() {                                      //=> Main ctrl+space 
		// ���
		setSize(300, 300); // this.setSize(300, 300); => this ��������
		setVisible(true); // this.setVisible(true); => this ��������
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
