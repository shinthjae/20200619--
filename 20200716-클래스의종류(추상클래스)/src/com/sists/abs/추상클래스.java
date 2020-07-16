package com.sists.abs;

/**
	 * 
	 */
	
//20200716(1) p.390
/*
 * 		클래스의 종류
 * 			============
 * 			= 추상 클래스
 * 			= 인터페이스 => 추상클래스의 확장
 * 						여러개의 클래스를 모아서 관리 (서로 다른 클래스를 연결해서 사용)
 * 						*** 결합성이 낮은 프로그램	
 * 							====
 * 							= 결합성 = 클래스를 수집하면 다른 클래스 영향
 * 							= 응집성 = 한개의 기능 수행할 수 있는 능력(메소드)
 * 						*** 주로사 사용 용도
 * 							1. 기능이 여러개로 나눠지는 경우
 * 							예) 버튼
 * 							   ===== 로그인, 취소, 퍼즐, 시작, 종료 
 * 							2.여러개의 클래스를 한개의 클래스로 제어할땨
 * 
 * 
 * 					추상클래스			인터페이스
 * 			1,   		단일상속			단일상속
 *			2.      구현이 안된 메소드 		구현이 안된 메소드만 가지고 있다
 *					 구현이 된 메소드
 *			========================================================
 *          3.   형식 , 추상 클래스
 *              public abstract class A
 *              {
 *                  public abstract void display();
 *                  public void aaa()
 *                  {
 *                  }
 *              }
 *              
 *              인터페이스 
 *              public interface B
 *              {
 *                  void display(); ==> public abstract void display();
 *                  void aaa();     ==> public abstract void aaa();
 *              }
 *        ===============================================
 *        4.  멤버변수 
 *            public abstract class A
 *            {
 *                private int a;
 *            }
 *            
 *            public interface B
 *            {
 *                int a; ==> error
 *                ======
 *                 인터페이스가 가지고 있는 변수 => 상수형변수 
 *                 int a; ==> public final static int a; => 변수값을 지정 
 *                 int a=10;
 *            }
 *            ==> 단점 : 기능 설정 => 추가하면 모든 클래스가 error
 *            ==> 인터페이스 , 추상클래스를 사용 ==> 상속 
 *                반드시 구현이 안된 메소드는 구현해서 사용 
 *                
 *            예)
 *                public interface A
 *                {
 *                   public void aaa();
 *                   public void bbb();
 *                }
 *                
 *                class B implements A
 *                {
 *                    
 *                }
 *        ===============================================
 *     ============= 같은 역할 
 *     = 내부클래스 => 멤버클래스
 *     = 내부클래스 => 익명클래스 
 *     
 *     구현된 메소드 => defaul
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 추상클래스 extends JFrame implementsm MouseListener
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
