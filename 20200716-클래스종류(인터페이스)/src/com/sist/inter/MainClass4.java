package com.sist.inter;

interface A
{
	public void display();
	
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �䷸�� ����°� "�͸��� Ŭ����" => �������̽��� �̿��� ������ => �������̵�
		// �Ʒ��� ���� class�� implements ���� �������̽��� ���� �� �� �ִ� => ������� �پ��ؼ� Ʋ���� �ƴϴ� => �׷��� Ư���� ��� �ƴϸ� implements�� ����Ѵ�
		
		A a=new A() {
			public void display() {
				System.out.println("A:displayCall...");
			}
		};
		a.display();
	}

}
