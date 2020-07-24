/*
 * 		재사용 => 기존에 만들어진 클래스를 사용 ( 반복 코딩을 제거)
 * 			1) 상속 (is-a)
 * 				이미 만들어진 기능을 변경해서 사용
 * 				public class MyWindow extends JFrame
 * 									  =======
 * 									   확장된 클래스
 * 			2) 포함 (has-a)
 * 				이미 만들어진 기능을 변경없이 그대로 사용
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
 *          // 상속을 받았을 경우 자동으로 A의 모든 것을 받는다 
 *          										하지만  private , static , 생성자 는 상속 예외
 *             상속받는 B의 내용이 바뀌어도 A에 영향은 없다
 *          
 *          // super
 *             this
 *             
 *          // 상속의 단점
 *             => ***자바 상속은 단일 상속  => 상속주는애가 1개  받는애 수는 상관없음    //클래스 다이어그램 (화살표 반대방향 기억해두기)
 *							  ====== <=> 다중상속 반대로 생각  상속주는애가 하나 면 단일 상속(줄줄이 소세지)
 *
 *          // 대부분 포함클래스가 多		
 *          	
 */

import javax.swing.*;
public class MainClass extends JFrame{                        // String은 상속못함 final
	/*
	 * public MainClass() // 생성자는 가급적이면 public메소드로 만든다 {
	 * 
	 * }
	 */
	public MainClass() {                                      //=> Main ctrl+space 
		// 기능
		setSize(300, 300); // this.setSize(300, 300); => this 생략가능
		setVisible(true); // this.setVisible(true); => this 생략가능
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
