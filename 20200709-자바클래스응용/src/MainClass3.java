import javax.swing.*;
/*
 * 		class JFrame{
 * 		}
 * 
 * 
 *		void aaa() 
 *		int aaa(int a)
 *		double aaa()
 *		char aaa(char c)
 *
 *
 *		생성자 ==> 매개변수가 없는 경우 ==> 초기값을 항상 동일하게 만들 경우
 *				  매개변수가 존재 ==> 초기값을 변경해서 사용
 *      
 *      
 *      //호출
 *		void aaa(double d, double d1, double d2)
 *		void aaa(char d, doube d1, int d2)
 *		void aaa(int d, float d1, double d2)
 *		void aaa(float d, double d1, double d2)
 *
 *		aaa(4.5 , 'A', 100) double , char int 
 *
 *		void aaa(double d) double d=10
 *		
 *		aaa(10)
 *
 *		
 *		작은 데이터 호출 , 큰 데이터 호출X
 *		오버로딩 => 하나의 변수만 가능 
 */
public class MainClass3 {
	String name;
	static void aaa(double d) {
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JFrame f=new JFrame("aaa");
//		f.setSize(300,200);
//		f.setVisible(true);
		aaa(10);
		aaa('A');
		aaa(10.5F);
		
		
		

	}

}
