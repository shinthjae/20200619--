package com.sist.inter;

interface A
{
	public void display();
	
}

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 요렇게 만드는게 "익명의 클래스" => 인터페이스를 이용한 다형성 => 오버라이딩
		// 아래와 같이 class가 implements 없이 인터페이스를 구현 할 수 있다 => 방법론은 다양해서 틀린건 아니다 => 그래도 특별한 경우 아니면 implements를 사용한다
		
		A a=new A() {
			public void display() {
				System.out.println("A:displayCall...");
			}
		};
		a.display();
	}

}
