/*
 *  MovieDetail
 *  MovieFind
 *  MovieList
 *  MoviMainForm
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.Color.*;
import java.util.Set;

import javax.swing.*;
/*
 * 	���̾ƿ� ����
 * 	BorderLayout
 * 	GridLayout 
 * 	
 * 
 */
public class MovieList extends JPanel {
	JLabel la = new JLabel("��ȭ ���",JLabel.CENTER); //��������� �տ� �ٿ���(��ư,�ؽ�Ʈâ ���) �κ�
	JLabel[][] movie = new JLabel[2][5]; //���� �ϳ��� �� �ϳ����ΰ�???  || �迭�� ���� �� ���°� �ʱ�ȭ�� ���ޤ���
	//JLabel ==> ����, �̹��� ���
	JLabel pLa = new JLabel("0 page / 0 pages");
	JPanel pan = new JPanel();
	JButton b1 = new JButton("����"); //������ �� �� �ѱ� ��ư 
	JButton b2 = new JButton("����"); //������ �� �� �ѱ� ��ư     //����Ŭ����
	
	
	MovieList()
	{
		setLayout(null); //���̾ƿ��� �Ⱦ��ٴ� �ǹ� 
						 // setLayout �� ���ϸ� ���ٿ� ����� �ϱ⶧���� null�� ����Ѵ�.
		la.setFont(new Font("�ü�ü",Font.BOLD,45)); //�۾�ü
		la.setBounds(10,15,1260,50); 
		add(la);
			
		pan.setLayout(new GridLayout(2,5,5,5)); //2�ٿ� 5���� ��ġ�� �ϰڴ� 
		for(int i=0;i<2;i++)
		{	
			for(int j=0;j<5;j++)
			{
				movie[i][j]= new JLabel();
				/*
				movie[i][j].setOpaque(true);
				movie[i][j].setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
				 */
				pan.add(movie[i][j]);
			}
		}	
		// ��ġ 
		pan.setBounds(10,75,1260,800);// y����  la �� 15+50���� Ŀ���Ѵ�
		
		add(pan);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(pLa);
		p.add(b2);
		
		p.setBounds(10,885,1260,35);
		add(p);
	}
}
