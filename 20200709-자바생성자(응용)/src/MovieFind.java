import javax.swing.*;

import java.awt.*;

import javax.swing.table.*;
public class MovieFind extends JPanel{

//		setBackground(Color.CYAN);
		
		JLabel la= new JLabel("��ȭ�˻�",JLabel.CENTER);
		JLabel la2= new JLabel("Search");
		JTextField tf=new JTextField();
		JTable table;
		DefaultTableModel model;
		TableColumn column;
		MovieFind(){
			setLayout(null);
			la.setFont(new Font("����ü",Font.BOLD,45));
			la.setBounds(10, 15, 1260, 50);
			add(la);
			
			la2.setBounds(10, 75, 100, 35);
			add(la2);
			tf.setBounds(205, 75, 300, 35);
			add(tf);
			
			String[] col= {"����","��ȭ��","����","�帣","�⿬"};
			Object[][] row=new String[0][6];
			
			model=new DefaultTableModel(row,col);
			table=new JTable(model);
			table.setRowHeight(40); //setRowHeight=> ���� ���̰� �þ (���ڰ� �� �Ⱥ��̱⶧���� �÷����)
			table.getTableHeader().setReorderingAllowed(false); //getTableHeader().setReorderingAllowed=> Ÿ��Ʋ ���� (Ÿ��Ʋ �̵��ϸ� �ȵǼ� �������������)
			JScrollPane js=new JScrollPane(table);
			
			MovieVO[] movies=MovieManager.movieFindData(1);
			
			for(MovieVO vo:movies)
			{
					String[] temp= {
							String.valueOf(vo.mno),
							vo.title,
							vo.director,
							vo.genre,
							vo.actor
					};
					model.addRow(temp);
					
			}
			
			js.setBounds(10, 120, 1260, 750);
			add(js);
			
			for(int i=0;i<5;i++)
			{
				column=table.getColumnModel().getColumn(i);
			
				if(i==0)
				{
					column.setPreferredWidth(50); // column => ���̺� ���̸� �����Ҷ�  ���
				}
				else if(i==1)
				{
					column.setPreferredWidth(250); //Ÿ��Ʋ
				}
				else if(i==2)
				{
					column.setPreferredWidth(220); //����
				}
				else if(i==3)
				{
					column.setPreferredWidth(150); //�帣
				}
				else if(i==4)
				{
					column.setPreferredWidth(450); //�⿬��
				}
				
			}
		}
		
	}

	


