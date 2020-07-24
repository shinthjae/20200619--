package com.sist.lang;

class B
{
	int x,y;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Call By Value => ���� ����
			int x=10;
			int y=20;
			
			int i=x;
			int j=y;  //=> �Ű�����
			
			int temp=i;
			i=j;
			j=temp;
			
			System.out.println("i="+i+",j="+j); //i=20,j=10
			System.out.println("x="+x+",y="+y); //x=10,y=20
			 
			
		// Call By Reference => �ּ� ����
			B b=new B();
			b.x=10;
			b.y=20;
			B c=b; // b ��� �ּҰ� ���� ������ ������� �൵ ������� 
				   // ���� => swap(B c) ==> swap(b)
			c.x=100;
			c.y=200;
			
			System.out.println("b="+b); //b=com.sist.lang.B@15db9742
			System.out.println("c="+c); //c=com.sist.lang.B@15db9742 =b���� c�� �ּҰ� ���۵Ǿ� �ּҰ� ����, �ּҰ��� ������ ���� ����ȴ�
			System.out.println(b.x); //100
			System.out.println(b.y); //200 
			
			/*
			 *  �Ű����� => class,�迭 ==> (�ּ�) ���� 
			 *  �Ű����� => �⺻��������,String ==> (�޸�) ���纻
			 *  
			 *  �޸�(Ŭ����) => ���� ��� (����)
			 *  �޸�(Ŭ����) => �̹� ������� Ŭ������ ��� => ���� => clone()
			 *  �޸�(Ŭ����) => ���ο� ����(ó������ ���) => new
			 */
	}

}
