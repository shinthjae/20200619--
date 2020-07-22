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
 * 	레이아웃 종류
 * 	BorderLayout
 * 	GridLayout 
 * 	
 * 
 */
public class MovieList extends JPanel {
	JLabel la = new JLabel("영화 목록",JLabel.CENTER); //기능은없고 앞에 붙여줄(버튼,텍스트창 등등) 부분
	JLabel[][] movie = new JLabel[2][5]; //사진 하나당 라벨 하나씩인가???  || 배열은 선언만 한 상태고 초기화를 안햇ㅇㅁ
	//JLabel ==> 구분, 이미지 출력
	JLabel pLa = new JLabel("0 page / 0 pages");
	JPanel pan = new JPanel();
	JButton b1 = new JButton("이전"); //페이지 앞 뒤 넘길 버튼 
	JButton b2 = new JButton("다음"); //페이지 앞 뒤 넘길 버튼     //포함클래스
	
	
	MovieList()
	{
		setLayout(null); //레이아웃을 안쓴다는 의미 
						 // setLayout 을 안하면 한줄에 다출력 하기때문에 null을 줘야한다.
		la.setFont(new Font("궁서체",Font.BOLD,45)); //글씨체
		la.setBounds(10,15,1260,50); 
		add(la);
			
		pan.setLayout(new GridLayout(2,5,5,5)); //2줄에 5개씩 배치를 하겠다 
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
		// 배치 
		pan.setBounds(10,75,1260,800);// y값은  la 의 15+50보다 커야한다
		
		add(pan);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(pLa);
		p.add(b2);
		
		p.setBounds(10,885,1260,35);
		add(p);
	}
}
