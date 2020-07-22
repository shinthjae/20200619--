/*
 *  MovieDetail

 *  MovieFind
 *  MovieList
 *  MoviMainForm
 */
import javax.swing.*;	//������ ���� Ŭ����
import javax.swing.border.LineBorder;

import java.awt.*;		//���̾ƿ�          
import java.awt.event.*;//��ư, �ؽ�Ʈ�� ���� => ����(�̺�Ʈ)
import java.net.URL;
//�ڹ� ���� �����ϴ�  �������� ��� ����� ����Ѵ�.
//�ڹٿ��� ����� �Ѱ��� ���� �ϴ� (���� ���)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener {
	JMenuBar bar= new JMenuBar(); 
	JMenuItem home = new JMenuItem("home"); //�޴�
	JMenuItem find = new JMenuItem("ã ��");
	JMenuItem exit= new JMenuItem("�� ��");
	//���� => �����츦 �����ش� =>
	CardLayout card = new CardLayout();
	MovieDetail md = new MovieDetail();
	MovieList ml = new MovieList();
	MovieFind mf = new MovieFind();
	
	static int curpage=1;
	static int totalpage=194; //�����ڿ� ���ִ°� �ƴ϶� ���̷�Ʈ�� ���� ���� �� �ִ�
	MovieMainForm(){
		//�޴� ���� 
		JMenu menu=new JMenu("�޴�");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); //�����̵Ǵ� �κ�   [�μ�ǰ�ȿ� �μ�ǰ] [�޴� ���� �޴�]
		menu.add(exit);
		bar.add(menu);
		
		//�����쿡 ����
		setJMenuBar(bar); 
		
		//������ ũ�� ����
		setSize(1300, 1000); 
		//���̾ƿ� ����
		setLayout(card);
		add("ML",ml);
		add("MD",md);
		add("MF",mf);
		//������ �����ش�
		
		setVisible(true);
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this); //������ư
		ml.b2.addActionListener(this); //������ư 
		
		moviePrint(1);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				ml.movie[i][j].addMouseListener(this); //5���߿� �����ϴ°� ã�ƿ´�.
			}
		}
	}
	void moviePrint(int page)
	{													  //static�̴ϱ� �׳� Ŭ����.�޼ҵ� �����ϴ� �ٸ� static�� �ƴϸ� MovieManager�� Ŭ���� ������ �����ؾ���
		MovieVO[] movies = MovieManager.movieListData(page); //MovieManager.movieListData(10); ��ȯ���� MovieVO
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
				//������ �б� 
				URL url = new URL(vo.poster); //������Ʈ���� �ּ� �о���� �Լ�  
				Image img=getImage(new ImageIcon(url), //����Ŭ������������ ������ �����ϴ�.
						ml.movie[0][0].getWidth(),
						ml.movie[0][0].getHeight());
				
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img)); //���� 2�� 5�� �� [1��1����] 0��° [1��2����] 1��° [1��3����] 2��°..... 
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
		new MovieMainForm(); //�����ڴ� �ݵ�� new ������();
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
	public void mouseClicked(MouseEvent e) { //���콺 Ŭ��������
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
					LineBorder line = new LineBorder(Color.white,5); //Color.white�� ������ �ǹ��ϰ� 5�� �׵θ� ����� �ǹ��Ѵ�.
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