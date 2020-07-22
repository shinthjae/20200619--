/*
 *  MovieDetail

 *  MovieFind
 *  MovieList
 *  MoviMainForm
 */
import javax.swing.*;	//윈도우 관련 클래스
import javax.swing.border.LineBorder;

import java.awt.*;		//레이아웃          
import java.awt.event.*;//버튼, 텍스트에 엔터 => 행위(이벤트)
import java.net.URL;
//자바 에서 지원하는  윈도우의 모든 기능을 사용한다.
//자바에서 상속은 한개만 가능 하다 (단일 상속)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener {
	JMenuBar bar= new JMenuBar(); 
	JMenuItem home = new JMenuItem("home"); //메뉴
	JMenuItem find = new JMenuItem("찾 기");
	JMenuItem exit= new JMenuItem("종 료");
	//실행 => 윈도우를 보여준다 =>
	CardLayout card = new CardLayout();
	MovieDetail md = new MovieDetail();
	MovieList ml = new MovieList();
	MovieFind mf = new MovieFind();
	
	static int curpage=1;
	static int totalpage=194; //생성자에 값넣는게 아니라 다이렉트로 값을 넣을 수 있다
	MovieMainForm(){
		//메뉴 설정 
		JMenu menu=new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); //구분이되는 부분   [부속품안에 부속품] [메뉴 속의 메뉴]
		menu.add(exit);
		bar.add(menu);
		
		//윈도우에 설정
		setJMenuBar(bar); 
		
		//윈도우 크기 결정
		setSize(1300, 1000); 
		//레이아웃 설정
		setLayout(card);
		add("ML",ml);
		add("MD",md);
		add("MF",mf);
		//윈도우 보여준다
		
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this); //이전버튼
		ml.b2.addActionListener(this); //다음버튼 
		
		moviePrint(1);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].addMouseListener(this); //5개중에 동작하는걸 찾아온다.
			}
		}
	}
	void moviePrint(int page)
	{													  //static이니까 그냥 클래스.메소드 가능하다 다만 static이 아니면 MovieManager의 클래스 변수를 생성해야함
		MovieVO[] movies = MovieManager.movieListData(page); //MovieManager.movieListData(10); 반환값이 MovieVO
		int k=0;
		/*
		 *  0 [0][0]  
		 *  1 [0][1]  
		 *  2 [0][2]
		 *  3 [0][3]
		 *  4 [0][4]
		 *  
		 *  5 [1][0]
		 *  6 [1][1]
		 *  :
		 *  :
		 *  9 [1][4]
		 */
		for(MovieVO vo:movies)
		{
			try {
				//포스터 읽기 
				URL url = new URL(vo.poster); //웹사이트에서 주소 읽어오는 함수  
				Image img=getImage(new ImageIcon(url), //본인클래스에있으면 생략이 가능하다.
						ml.movie[0][0].getWidth(),
						ml.movie[0][0].getHeight());
				
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img)); //사진 2행 5열 중 [1행1열이] 0번째 [1행2열이] 1번째 [1행3열이] 2번째..... 
				k++;
			} catch (Exception e) {}		
		}
		
		ml.pLa.setText(curpage+"page / "+totalpage+" pages");
	}
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    } 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		   UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm(); //성상자는 반드시 new 생성자();
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
		else if(e.getSource() == ml.b1)
		{
			if(curpage>1)
			{
				curpage--;
				moviePrint(curpage);
			}
		}
		else if(e.getSource() == ml.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				moviePrint(curpage);
				
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) { //마우스 클릭했을대
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
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(e.getSource()==ml.movie[i][j])
				{
					LineBorder line = new LineBorder(Color.white,5); //Color.white는 색상을 의미하고 5는 테두리 사이즈를 의미한다.
					ml.movie[i][j].setBorder(line);
				}
			}
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}