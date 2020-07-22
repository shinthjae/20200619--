package com.sist.client;
//(1) => 클래스 5개 생성 => 왼쪽 메뉴바 고정, 하단 채팅 고정, 나머지 고정이 안되는 부분 레이아웃 변경해줄수 있는 'ControllPanel' (따로 안바꿔줄 경우 죄다 난리남 그래서 따로 클래스(controllpanel)만든)
//(2) => 제이타투 

//(3) => MenuForm
//(4) => chatform
//(5) => listform setBackground(Color.pink);

//(6)=> 메인클래스-setLayout(null);

//(7) => 메인클래스 타이틀
//(8)~(10) 

//(11) => 메인클래스-채팅폼추가
// 컨트롤패널 1,2
//(12)
//(13)implements ActionListener

//영역배경지우기

//(14) 챗폼클래스- 콤보박스, 사용자 색상 선택하면 선택색상으로 바뀌는거 








//===============================================================================

// 윈도우창만들기 => JFrame
// 윈도우와 관련된 클래스를 읽어온다 => 
import javax.swing.*;
import java.awt.*; // 색상, 배치
import java.awt.event.*; // 인터페이스
import java.awt.FlowLayout;

/*
 *    재사용 
 *      = 상속 (is-a) : 기존의 클래스를 변경해서 사용
 *      public class ClientMainFrame extends JFrame
 *                   ===============
 *                    JFrame의 기능을 전체 가지고 온다 
 *      class A
 *      {
 *         O X W
 *      }
 *      class B extends A
 *      {
 *          O X W
 *      }
 *      = 포함 (has-a) : 기존의 클래스를 변경없이 사용
 *      public class ClientMainFrame
 *      {
 *          JFrame f=new JFrame();
 *      }
 *      
 */
public class ClientMainFrame extends JFrame implements ActionListener{ //(13)implements ActionListener
    // 윈도우 크기 결정  => 생성자에서 사용  ==> 291 page
	
	JLabel title=new JLabel("레시피 & 맛집추천사이트",JLabel.CENTER); //(7) 타이틀
	
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm(); //(8)
	
	ControllPanel cp=new ControllPanel();//(12)

	
	public ClientMainFrame()
	{
		/*
		 *   클래스에서 생성자 사용 => 선언이 아니라 => 구현할때 
		 *   예)
		 *       데이터베이스 : 오라클연결 
		 *       네트워크 : 셋팅 => IP,PORT => 핸드폰 (개통)
		 *       웹 : 쿠키에서 값읽기 => 지동로그인 
		 */
		
			
		//< 타이틀부분>
		title.setOpaque(true);
//		title.setBackground(Color.magenta); //타이틀 배경색
		add(title); //(9) 
		
		title.setFont(new Font("굴림체",Font.BOLD,55));
		title.setBounds(10, 15, 1570, 100);
		add(title);  //(7-1)
		
		
		//<왼쪽메뉴바>
		add(mf);//(10-1) 왼쪽메뉴 추가
		mf.setBounds(10, 95, 100, 400); //(8-1)
//		mf.setBounds(10, 95, 1600, 300); //가운데
	
		
		
		//<채팅폼>
		cf.setBounds(115, 760, 1465, 200);
		add(cf); //(11)
		
		//<출력화면>
		cp.setBounds(115, 120, 1465, 635); //(12-1)
		
		
		setLayout(null); //(6) 사용자 정의 배치-> null
//		getContentPane().setLayout(null);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);// X버튼 클릭시 종료
		
		mf.b1.addActionListener(this); 
		mf.b2.addActionListener(this); //(13-1)
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // 생성자는 호출시에 반드시  => new 생성자()
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); //2
		
		new ClientMainFrame();
		
	}
	
	public static Image getImage(ImageIcon ii,int w,int h) //라벨크기에 맞게 이미지크기조절 [6]
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }

	@Override
	public void actionPerformed(ActionEvent e) { //(13-2)
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}

