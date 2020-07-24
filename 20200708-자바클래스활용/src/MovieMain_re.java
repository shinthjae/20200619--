import java.util.*;
import java.awt.*;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.net.*;

public class MovieMain_re JFrame {
	JButton b1,b2,b3,b4,b5; // 멤버변수의 초기화
    //JLabel la=new JLabel();// 그림출력 
    static MovieVO[] movies=new MovieVO[20];
    JPanel pan=new JPanel();
    // MovieMain m=new MovieMain()
    MovieMain() {
		b1=new JButton("현재상영영화");
		b2=new JButton("개봉예정영화");
		b3=new JButton("박스오피스(주간)");
		b4=new JButton("박스오피스(월간)");
		b5=new JButton("박스오피스(연간)");
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);
		add(p);
		setLayout(null);
		p.setBounds(10, 15, 1280, 35);
		pan.setBounds(10, 60, 1280, 900);
		try
		{
			URL url=new URL("https://t1.daumcdn.net/movie/3651b17dc201e5b4ea6409b364f1e950a14b96a3");
			//la.setIcon(new ImageIcon(getImage(new ImageIcon(url),200,350)));
		}catch(Exception ex){}
		add(pan);
		setSize(1300, 1000);
		try
	    {
	    	movieData(1);
	    	imagePrint();
	    }catch(Exception ex) {}
		setVisible(true);
	    
	}
    Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
    void imagePrint() throws Exception
    {
       pan.setLayout(new GridLayout(4,5,8,8));	
       for(MovieVO vo:movies)
       {
    	   URL url=new URL(vo.poster);
    	   pan.add(new JLabel(new ImageIcon(getImage(new ImageIcon(url),250,280))));
       }
    }
    static void movieData(int no) throws Exception
    {
    	String url="";
    	switch(no)
    	{
    	case 1:
    		url="https://movie.daum.net/premovie/released";
    		break;
    	case 2:
    		url="https://movie.daum.net/premovie/scheduled";
    		break;
    	case 3:
    		url="https://movie.daum.net/boxoffice/weekly";
    		break;
    	case 4:
    		url="https://movie.daum.net/boxoffice/monthly";
    		break;
    	case 5:
    		url="https://movie.daum.net/boxoffice/yearly";
    		break;
    	}
    	/*
    	 *  <div class="info_movie">
    	 *    <h1>aaa</h1> => text
				<span class="thumb_movie bg_noimage">
				<img src="//img1.daumcdn.net/thumb/C236x340/?fname=https://t1.daumcdn.net/movie/3986610f921d4371be92d6184bf75dc1c74d80e2" class="img_g" alt="" onload="noImageOnLoad($(this))">
    	 */
    	
    	// //img1.daumcdn.net/thumb/C236x340/?fname=https://t1.daumcdn.net/movie/3986610f921d4371be92d6184bf75dc1c74d80e2
    	Document doc=Jsoup.connect(url).get();
    	Elements image=doc.select("div.info_movie span.thumb_movie img.img_g");
    	for(int i=0;i<20;i++)
    	{
    		movies[i]=new MovieVO();
    		String temp=image.get(i).attr("src");
    		movies[i].poster=temp.substring(temp.indexOf("=")+1);
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        new MovieMain();
	}
	

}
