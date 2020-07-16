package com.sist.oop;

/*
 * 		오버라이딩
 * 		========
 * 		1. 반드시 상속관계
 * 		2. 메소드명이 동일
 * 		3. 매가변수가 동일(갯수, 데이터형)
 * 		4. 리턴형도 동일
 * 		5. 접근지정어는 확장, 축소할 수 없다
 * 		   ========
 * 		   	   public  >  protected  >  default  >  private
	 *      ================================================
	 *                같은 클래스  같은 패키지   다른 패키지  모든 클래스
	 *                                    상속
	 *      ================================================
	 *      private      O        X         X
	 *      ================================================
	 *      default      O        O         X
	 *      ================================================
	 *      protected    O        O         O
	 *      ================================================
	 *      public       O        O         O         O
	 *      ================================================
 * 			
 * =>  class A
 * 			    {
 * 					private void display(){}
 * 			    }
 * 			    class b extends A
 * 				{
 * 					1. private void display(){}
 * 					2. void display(){}
 * 					3. protected void display(){}
 * 					4. public void display(){}
 * 				}
 */
public class 오버라이딩_메소드재정의 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
