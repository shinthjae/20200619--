/*

 * 		영화를 선택


 * 		=======
 * 			현재상업영화
 * 			개봉예정영화
 * 			박스오피스(주간);
 * 			박스오피스(월간);
 * 			박스오피스(연간);
 * 
 * 
 * 							<div class="wrap_movie">
								<div class="info_tit">
																			<em class="ico_movie ico_15rating">15세이상관람가</em>
																		<a href="/moviedb/main?movieId=134684" class="name_movie" data-tiara-layer="moviename" data-tiara-ordnum="1" data-tiara-id="134684" data-tiara-type="movie">#살아있다</a>
								</div>
								
								<span class="info_grade">
								
																		
									<a href="/moviedb/grade?movieId=134684&type=netizen" class="link_grade" data-tiara-layer="point" data-tiara-ordnum="1">
										<span class="txt_grade">네티즌</span>
										<span class="wrap_grade grade_netizen">
											<span class="ico_star ico_14star">등급</span>
											<span class="num_grade num_05">05</span>
											<span class="num_grade grade_dot">.</span>
											<span class="num_grade num_00">00</span>
										</span>
									</a>
																										</span>
								<span class="info_state">

 *
 */

import java.util.Scanner;





import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 자바메소드4 {
	static int menuSelsect()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴를 선택하세요:");
		int no=scan.nextInt();
		return no;
	}
	static void menu()
	{
		System.out.println("====== Menu ======");
		System.out.println("1.현재상영영화");
		System.out.println("2.개봉예정영화");
		System.out.println("3.박스오피스(주간)");
		System.out.println("4.박스오피스(월간)");
		System.out.println("5.박스오피스(연간)");
		System.out.println("6.종료");
		System.out.println("==================");
	
	}
	static void movieData(int no) throws Exception
	{
		
		String[] site= {
				
				"https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20200712&tg=4",
			    "https://movie.naver.com/movie/sdb/rank/rmovie.nhn?sel=pnt&date=20200712&tg=1",
			    "https://movie.daum.net/boxoffice/weekly",
			    "https://movie.daum.net/boxoffice/monthly",
			    "https://movie.daum.net/boxoffice/yearly"
			};
		
		
		
		String[] subject= {
		
		"현재상영영화",
		"개봉예정영화",
		"박스오피스(주간)",
		"박스오피스(월간)",
		"박스오피스(연간)"
		};
		
		
		
		
		//출력
		System.out.println("★★★★★"+subject[no-1]+"★★★★★");
		
		Document doc=Jsoup.connect(site[no-1]).get();
		
		Elements title=doc.select("div class=\"tit5\"");
		for(int i=0;i<title.size();i++)
		{
			System.out.println((i+1)+"."+title.get(i).text());
		}
		
	}

	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		while(true)
		{
			menu();
			int no=menuSelsect();
			
			if(no==6)
			{
				System.out.println("프로그램 종료");
				break;
			}
			movieData(no);
		}
		

	}
}


