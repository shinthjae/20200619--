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
	JLabel la = new JLabel("��ȭ �˻�",JLabel.CENTER);
	JLabel la2 = new JLabel("Search");
	JTextField tf = new JTextField();//�˻�â�̴�
	JTable table;
	DefaultTableModel model;
	TableColumn column;

	MovieFind() {
		setLayout(null);
		la.setFont(new Font("�ü�ü", Font.BOLD,45)); 
		la.setBounds(10, 15, 1260, 50);
		add(la);
		
		la2.setBounds(100,75,100,35); 
		add(la2);
		tf.setBounds(210, 75,300,35);
		add(tf);
		
		String[] col= {"����","��ȭ��","����","�帣","�⿬"};
		Object[][] row = new Object[0][6];
		
		model= new DefaultTableModel(row,col);
		table=new JTable(model);
		table.setRowHeight(40);
		table.getTableHeader().setReorderingAllowed(false); //��� �������� �ʰ� �ϴ� �κ� 
		JScrollPane js = new JScrollPane(table); //������ �������� ���ϼ� �ִ°� ��ũ�� �г�
		
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
		
		for(int i=0;i<5;i++) //�ش� �÷��� ����� ���Ѵ� 
		{
			column=table.getColumnModel().getColumn(i); //�ش� �÷��� ��ȣ�� �����ͼ� ����� ���� 
			//TableCellRenderer render = column.getCellRenderer();
			if(i==0)
			{
				column.setPreferredWidth(50); //0��° �÷��� ������� 50�̴�,
			}
			else if(i==1)
			{
				column.setPreferredWidth(250); // 1��° �÷��� ������� 150
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
