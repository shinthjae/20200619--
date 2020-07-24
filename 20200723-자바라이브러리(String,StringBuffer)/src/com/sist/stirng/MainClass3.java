package com.sist.stirng;
// valueOf() : 모든 데이터형을 문자열로 변환 ==> static
// String.vlaueOf(int) ==> 이렇게 쓰는 함수는 vlueOf밖에 없음 => 윈도우,웹,모바일 => 취급을 문자열
import java.awt.*;
import javax.swing.*; 
public class MainClass3 extends JFrame{
	JTextField tf=new JTextField();
    JLabel la=new JLabel();
    public MainClass3()
    {
    	tf.setText(String.valueOf(10));
    	la.setText(String.valueOf(10.5));
    	add("North",tf);
    	add("South",la);
    	setSize(350, 200);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass3();
	}

}
