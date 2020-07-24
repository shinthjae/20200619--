import javax.swing.*;
import java.awt.*;
public class MainView extends JPanel{
	Image back;
	//image에 대한 초기화
	public MainView()
	{
		//이미지 정보 읽기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
	}
	// 메소드 내용 변경
	@Override
	protected void paintComponent(Graphics g) {
		 g.drawImage(back, 0, 0, getWidth(), getHeight(),this);
	}
	

}
