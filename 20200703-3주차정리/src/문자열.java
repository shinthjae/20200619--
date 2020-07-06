//20200703(6)

/*
 * 		문자열 => 저장하는 공간(String)
 * 		기본형 => 정수,실수,논리,문자
 * 		====================================
 * 		참조형 => 실제 저장장소 다른곳에 있고 => 저장은 주소
 * 		====
 * 		 = 배열 , 클래스 , 사용자 정의 클래스
 * 			=> 웹,모바일 => 문자열
 * 		1) 저장 방법
 * 			String s="문자저장"; ==> 많이 사용된다
 * 			String s=new String("")
 * 		2) 주요 기능
 * 			문자를 제어할 수 있는 기능 (메소드) => 라이브러리 핵심 (메소드)
 * 			***** 주의점
 * 			원본 변경되지 않는다
 * 			
 * 			=> length() : 문자 갯수
 * 
 * 			=> substring() : 문자를 자를 때
 * 			   substring(int start)
 * 			   substring(int start, int end) => end는 제외
 * 							 start ~~ end-1
 * 
	 * 			예)
	 * 				Stirng s="Hello Java!!";
	 * 
	 * 				s.substirng(0,5) ==> Hello  s="Hello Java!!"
	 * 				
	 * 				==> s=s.substring(0,5) ==> s="Hello"
 * 			
 * 			=> contains() : 문자열중에 포함된 단어가 있는지 확인
 * 				=> 단어 찾는 경우 => 오라클(LIKE)
 * 
 * 			=>  startsWith , endsWith : suggest(자동완성기), 검색기
 * 				=====================
 * 					포털 : 검색한 유저의 데이터를 모아서 처리
 * 					쿠키 , 세션
 * 				
 * 			=> trim() : 좌우의 공백제거
 * 				String s="Hello Java ";
 * 				s.trim() ==> "Hello Java" => trim은 중간 공백은 관여하지 않음 replace를 씀
 * 				=> 사용자 입력창 (로그인 => ID,PWD,회원가입)
 * 					" admin" "admin" "admin " => ※공백주의
 * 
 * 			=> equals() : 문자열을 비교할때 사용 but 대소문자 구분 못함(단점)
 * 
 * 			=> split() : 문자를 구분해서 배열로 만들어 준다
 * 					==
 * 					구분문자를 포함한다
 * 			
 * 			=> replace , replaceAll : 문자를 변경할 경우
 * 			   =======   ==========
 * 				  일반		   패턴(정규식)
 * 
 * 			=> valueOf() : 모든 데이터형을 문자열로 변경
 * 
 * 			=> toLowerCase() : 소문자 변환
 * 			=> toUpperCase() : 대문자 변환				
 * 				
 */

import javax.swing.*;
import java.awt.event.*;
public class 문자열 extends JFrame implements ActionListener{
	JTextField tf=new JTextField();
	JTextField tf1=new JTextField();
	public 문자열()
	{
		add("North",tf);
		add("South",tf1);
		//tf.setText(String.valueOf(20));

		setSize(350,300);
		setVisible(true);
		
		tf.addActionListener(this); // tf에서 엔터 => actionPerformed 호출
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==tf) //tf에서 입력 => 엔터
		{
			tf1.setText(tf.getText().toUpperCase());
			//tf1.setText(tf.getText().toLowerCase());
		}
		
	}

}
