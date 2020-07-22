/*
 *  MovieDetail
 *  MovieFind
 *  MovieList
 *  MoviMainForm
 */
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class MovieFind extends JPanel{
	JLabel la = new JLabel("영화 검색",JLabel.CENTER);
	JLabel la2 = new JLabel("Search");
	JTextField tf = new JTextField();//검색창이다
	JTable table;
	DefaultTableModel model;
	TableColumn column;

	MovieFind() {
		setLayout(null);
		la.setFont(new Font("궁서체", Font.BOLD,45)); 
		la.setBounds(10, 15, 1260, 50);
		add(la);
		
		la2.setBounds(100,75,100,35); 
		add(la2);
		tf.setBounds(210, 75,300,35);
		add(tf);
		
		String[] col= {"순위","영화명","감독","장르","출연"};
		Object[][] row = new Object[0][6];
		
		model= new DefaultTableModel(row,col);
		table=new JTable(model);
		table.setRowHeight(40);
		table.getTableHeader().setReorderingAllowed(false); //헤더 움직이지 않게 하는 부분 
		JScrollPane js = new JScrollPane(table); //밑으로 내려가서 보일수 있는게 스크롤 패널
		
		MovieVO[] movies = MovieManager.movieFindData(1);
		for(MovieVO vo:movies)
		{
			String[] temp= {
					String.valueOf(vo.mno),
					vo.titlel,
					vo.director,
					vo.gener,
					vo.actor
			};
			for(String i:temp)
			{
				System.out.println(i);
			}
			model.addRow(temp);
		}
		js.setBounds(10, 120, 1260, 750);
		add(js);
		
		for(int i=0;i<5;i++) //해당 컬럼의 사이즈를 정한다 
		{
			column=table.getColumnModel().getColumn(i); //해당 컬럼의 번호를 가져와서 사이즈를 조정 
			//TableCellRenderer render = column.getCellRenderer();
			if(i==0)
			{
				column.setPreferredWidth(50); //0번째 컬럼의 사이즈는 50이다,
			}
			else if(i==1)
			{
				column.setPreferredWidth(250); // 1번째 컬럼의 사이즈는 150
			}
			else if(i==2)
			{
				column.setPreferredWidth(220);
			}
			else if(i==3)
			{
				column.setPreferredWidth(150);
			}
			else if(i==4)
			{
				column.setPreferredWidth(450);
			}
			
		}
	}
}
