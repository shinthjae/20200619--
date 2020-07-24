package com.sist.ab;
//(1)

/*
 * 		1. 클래스 종류
 * 
 * 			= 일반클래스 (핵심)
 * 
 * 				형식)
 * 					public class className
 * 					{
 * 						멤버변수, 공유변수
 * 						생성자
 * 						메소드
 * 					}
 * 						
 * 					1) 데이터형으로만 사용
 * 						=> 필요한 데이터를 모아서 관리 (캡슐화) => 데이터를 은닉화 ,메소드를 통해 접근
 * 													   ========== ============
 * 														peivate	  getter/setter
 * 
 * 					2) 액션 ==> 기능만 가지고 있다 = (메소드)
 * 					3) 변수 + 메소드 = 혼합
 * 			==================
 * 
 * 			= 추상클래스
 * 
 * 				형식) 
 * 					public abstract class clsaaName
 * 					{
 * 						멤버변수 / 공유변수
 * 						구현이 안된 메소드
 * 						구현이 된 메소드
 * 					}
 * 				
 * 					1) 자신이 메모리 할당이 불가능
 * 					2) 생선 ==> 상속받는 클래스를 통해서 메모리에 저장
 * 					3) 단일 상속
 * 					4) 상속을 받은 클래스는 반드시 구현이 안된 메소드를 구현해서 사용
 * 					5) 여러개 클래스 가 있는 경우 => 공통으로 적용된 메소드가 있는 경우레 추상클래스 제작
 * 					6) 구분 => 메모리 할당시 => 클래스선언 => 생성자
 * 						A a=new A()
 * 						A a=new B()
 * 					7) 메소드 구현이 애매한 경우 (경우의 수가 많다)
 * 						예)
 * 							먹는다()
 * 								개,소,돼지,말 => 따로 구현이 가능
 * 						예)	
 * 							버튼클릭()
 * 					8) 기본 틀이 제작 => 구현이 쉽다 
 * 					9) 요구사항 분석 
 * 
 * 			= 인터페이스 : 웹프로그램
 * 				1. 추상클래스의 일종
 * 				2. 다중 상속
 * 				3. 형식) 
 * 						public interface interfaceNmame
 * 						{
 * 							변수 : 상수형 변수 ==>  public final static 데이터형=값
 * 								       		  ===================
 * 												생략시에는 자동으로 추가(pivate, protected는 사용금지)
 * 							메소드 : 구현이 안된 메소드만 가지고 있다
 * 
 * 						}
 * 
 * 				4. 인터페이스 또한 클래스이기 때문에 상속을 내려서 상위클래스로 사용이 가능하다★★★
 * 					* 인터페이스는 클래스로부터 상속을 받을 수 없다
 * 					* 인터페이스 => 인터페이스 => extends
 * 					* 인터페이스 => 클래스       => implements
 * 						 예)
 *                interface A
 *                interface B extends A
 *                
 *                interface A
 *                class B implements A
 *                =================================
 *                  다중상속 
 *                =================================
 *                interface A
 *                class B
 *                class C extends B implements A
 *                
 *                interface A
 *                interface B
 *                class C implements A,B
 * 
 * 							=> 여러개의 관련이 없는 클래스를 연결해서 사용하는 프로그램
 * 							=> 결합성(다른 클래스 영향?)이 낮은 프로그램읗 만들 경우에 주로 사용( -> Spring
 *
 * 			================== 관련된 클래스가 여러개 => 묶어서 사용(통합)
 * 								= 데이터베이스 연결
 * 								= 웹프로그램 (MVC)
 * 
 * 			= 내부클래스 : 애플리케이션 (p.403)
 * 				= 멤버클래스 : 두개이상의 클래스에서 한개의 데이터 공유할 경우
 * 							네트워크 프로그램, 쓰레드 프로그램, 빅데이터 (에서 많이 사용됨)
 * 				
		 * 				 class A
		 *             {
		 *                 O , X , K
		 *             }
		 *             class B
		 *             {
		 *                 A a=new A();
		 *                 a.O , a.X , a.K
		 *             }
		 *             
		 *             ==> B b=new B();
		 *                 B b1=new B();
		 *                 
		 *            class A
		 *            {
		 *                 O,K,X
		 *                 A()
		 *                 {
		 *                     B b=new B();
		 *                 }
		 *                 class B
		 *                 {
		 *                 }
		 *            }
		 * 
		 * 			//A도 B도 공통으로 가지고 있는 프로그램을 만들때 
 * 
 * 
 * 				
 * 				= 익명의클래스 : 상속받지 않고 => 오버라이딩(윈도우 클래스)
 * 
		 *           class A
		 *           {
		 *           }
		 *           class B
		 *           {
		 *           }
		 *           class C extends A,B ==> error
		 *           {
		 *           }
		 *           
		 *           class C extends A
		 *           {
		 *              B b=new B(){
		 *                 오버라이딩이 가능하다 
		 *              }
		 *           }
		 *           
		 *           내부 클래스 
		 *           class A
		 *           {
		 *              class B
		 *              {
		 *                 class C
		 *                 {
		 *                 }
		 *              }
		 *           }
		 *           
		 *           A.B.C
		 *           ==> B b=new B(); => 사용할 수 없다              // 포함클래스에서 오버라이딩이 가능하다
		 *           
		 *           class C
		 *           {
		 *              B b=new B();(X)
		 *              A.B b;
		 *           }
		 *           
		 *           // 생성할때 B만 가지고 올 수 없어서 A.B b;를 사용해준다 (A.B b; A클래스 밑 b클래스 의 b) 
 * 
 * 
 * 				
 * 
 * 
 *				
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
