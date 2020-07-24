import javax.swing.*; // 윈도우 관련 클래스

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.*;	// 레이아웃(화면배치)
import java.awt.event.*; // 버튼, 텍스트에 엔터 =>행위(이벤트)
import java.net.URL;
// 자바에서 지원하는 윈도우의 모드 기능을 사용한다 ==> 상속(extends) ==> 자바에서 상속은 한개만 가능 (단일 상속)

public class MovieMainForm extends JFrame implements ActionListener,MouseListener{
	
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("찾기");
	JMenuItem exit=new JMenuItem("종료");
	// 실행 => 윈도우를 보여준다 => 생성자
	
	CardLayout card=new CardLayout();
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	
	int curpage=1;
	int totalpage=194;
	//명시적인 초기화
	
	MovieMainForm() {
		
		// 메뉴 설정
		JMenu menu=new JMenu();
		menu.add(home);
		menu.add(find);
		menu.addSeparator();
		menu.add(exit);
		bar.add(menu);
		
		//윈도우에 설정
		setJMenuBar(bar);
		
		//레이아웃 설정
		setLayout(card);
		add("ML",ml);
		add("MD",md);
		add("MF",mf);
		
		
		// 윈도우 크기 결정
		setSize(1300, 1000);
		
		// 윈도우 보여준다
		
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);	
		
		ml.b1.addActionListener(this); //이전
		ml.b2.addActionListener(this); //이전
		moviePrint(1);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].addMouseListener(this);
				
			}
		}
	}
	void moviePrint(int page)
	{
		MovieVO[] movies=MovieManager.movieListData(page);
		int k=0;
		/*
		 *  0 [0][0]   	0/5 = 0
		 *  1 [0][1]	1/5 = 0
		 *  2 [0][2]	2/5 = 0
		 *  3 [0][3]	3/5 = 0
		 *  4 [0][4]	4/5 = 0
		 *  
		 *  5 [1][0]	4/5 = 0
		 *  6 [1][1]	0/5 = 0
		 *  7 [1][2]	0/5 = 0
		 *  8 [1][2]	0/5 = 0
		 *  9 [1][3]	0/5 = 0
		 * 
		 */
		for(MovieVO vo:movies)
		{
			try
			{
				//포스터읽기
				URL url=new URL(vo.poster);
				Image img=getImage(new ImageIcon(url),
						ml.movie[0][0].getWidth().ml.movie[0][0].getHeight());
				
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
				k++;
						
			}catch(Exception ex) {System.out.println(ex.getMessage());}
		}
		
		ml.pLa.setText(curpage+"page / "+totalpage+" pages");
	}
	static Image getimImage(ImageIcon ii,int w,int h)
	{
		Image dimg=ii.getImage().getScaledInstance(w,h,Image.SCALE_SMOOTH);
	return dimg;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); //예외처리 필요
		new MovieMainForm(); //생성자는 반드시 new 생성자()
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home)
		{
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find)
		{
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==exit)
		{
			System.exit(0);
		}
		else if(e.getSource()==ml.b1) //이전
		{
			if(curpage>1)
			{
				curpage--;
				moviePrint(curpage);
			}
		}
		else if(e.getSource()==ml.b2) //다음
		{
			if(curpage>totalpage)
			{
				curpage++;
				moviePrint(curpage);
			}
		}
		
		
		
	
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
