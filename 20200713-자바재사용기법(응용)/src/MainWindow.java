import javax.swing.*;

/*
 *  윈도우 내용을 변경 => 상속
 *  class A extends JFrame
 *  
 *  있는 그대로 => 포함
 *  
 *  
 *  class A
 *  {
 *  	JFrame f=new JFrame();
 * 	}
 *  
 */

public class MainWindow extends JFrame{
	// 실행하자마자 => 윈도우를 생성
	// 생성자
	public MainWindow()
	{
		// 윈도우 화면 설계
		setSize(8090, 600); // JFrame = 메소드 상속
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자
		new MainWindow();
	}

}
