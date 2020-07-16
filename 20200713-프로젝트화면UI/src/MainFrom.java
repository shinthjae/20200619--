/*
 * 
 *		윈도우
 *		 = Container : Component를 여러개 묶어서 화면 출력
 *			= JFrame : 윈도우창 
 *			= JWindow : 타이틀바가 없는 창 (광고창같은거)
 *			= JDialog : 윈도우창위에 위에 띄우는 창 (로그인창, 오류창, 자바프로젝트, 클래스 생성창)
 *				= 모달리스
 *				= 모델리스 : 창띄우면 아래 창 클릭가능
 *			======================================== 단독으로 실행이 가능
 *			= JPanel : 단독으로 실행이 불가능 => JFrame, JWindow, JDialog
 *
 *		 = Component : 한개의 기능만 가지고 있다
 *					JLabel => 일반 문자열 출력, 이미지 출력
 *			= 버튼 종류
 *				= 일반버튼
 *					JButton
 *				= 토글버튼
 *					JRadioButton
 *					JCheckBox
 *				= 메뉴 
 *			= 입력창
 *				= 한줄입력 : JTextField  
 *				= 비밀번호 : JPasswordField
 *				= 여러줄입력 : JTextArea => 소개, 내용출력, 메모장
 *				= 여러줄입력 : JTextPane => 채팅, 워드
 *			= 목록창
 *				= 선택창 : JComboBox : (화살표)버튼누르면 줄줄이 목록 내려오는 거
 *				= 전체내용 : JList : 창으로 목록 
 *				= JTree : 계급도 같이 생긴 목록창
 *				= JTable
 *			= 화면분할
 *				= JTabbedPane
 *				= JSpiltPane : <div> => 화면 나누기
 *				= JInteralFrame : 윈도우창 안에 오류 수십개 나듯 나옴 -> 별로 안쓰임
 *		====================================================================== 다음 interface
 *
 *
 *		===> 배치 (Layout) , 사용자 정의 배치
 *			1) BordwrLayout
 *			2) FlowLayout
 *			3) GridLayout
 *			4) CarLayout
 *			5) ******사용자 정의  setBounds(10,20,800,900)
 *
 *		===> 프로젝트 : 목적. 네트워크 흐름파악
 *					  		오라클
 *							JSP
 *							Spring
 *							Kotlin
 *			1. 로그인 ======> 서버에서 저장
 *			2. 회원가입 
 *			============================== 오늘 할 부분
 *			3. 목록 출력
 *			4. 상세보기
 *			5. 예매, 장바구니 
 *			6. 마이페이지, 관리자페이지
 *			7. 채팅
 *			==============================
 *			
 */

import javax.swing.*; // J시리즈 담아져있음
import java.awt.*; // 배치, 기능들
/* 
 * 		변수 ============================> (가급적) 데이터를 감춘다 => 은닉화 => private
 * 		   일반변수 
 *        ===== => 기본형
 * 		   배열
 * 		   클래스
 * 		  ===== => 참조변수
 * 		========
 * 		메소드 
 * 		생성자
 * 		======== 다른 클래스와 연결하는 역활 ==> public
 */
public class MainFrom extends JFrame{
	private CardLayout card=new CardLayout(); // 포함 클래스
	// 화면UI => 생성자 => 시작하면 바로 보여준다
	// 생성자 => 한번만 호출이 가능하고 시작과 동시에 호출이 되는 메소드 
	// 생성자는 모든 클래스에서 호출이 가능해야 한다 ==> public => 다른 클래스에서 사용을 못하기 때문에 
	Login2 login=new Login2();
	public MainFrom()
	{
		// Layout 설정
		setLayout(card);
		add("LOGIN",login);
		/*
		 *  JFrame, JWindow, JDialog ==> BorderLayout
		 *  JPanel ==> FlowLayout
		 *  
		 *  ==> 사용자 정의 사용 ==> setLayout(null)
		 */
		setBounds(100, 30, 1000, 500);  // 윈도우창을 모니터 어느 위치에 띄울 것인가 -> 400,60 중앙
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrom();

	}

}
