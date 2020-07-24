import javax.swing.*;
public class MainWindow3 extends JFrame{
	MainView mv=new MainView();
	public MainWindow3()
	{
		add("Center",mv);
		setSize(800, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWindow3();
	}

}