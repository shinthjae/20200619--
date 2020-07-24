import java.io.*;//파일 입출력
import java.util.Scanner;

/*
 * 				변수설정
 */
public class MovieManager {
	static MovieVO[] movies=new MovieVO[1938]; 
																		// 모든 클래스에서 공유를 할 경우 static 사용
	static 																// 프로그램이 구동이 되면 자동으로 => 파일을 읽어서 배열에 저장
	 {																	// 초기화 블럭 {} => 인스턴스는 그냥 가로만
		 try // File을 읽는 경우에는  반드시 예외처리
		 { 		
			 StringBuffer data=new StringBuffer(); // 빠르게		
			 
			 FileReader fr=new FileReader("c:\\javaDev\\movie.txt");  
			
			 int i=0;
			 
			 while((i=fr.read())!=-1)
			 {
				 data.append(String.valueOf((char)i)); //char=>String
			 }
			 
			 fr.close();
			 
			 String[] movieData=data.toString().split("\n"); // split 자르기
			 
			 int k=0;
			 
			 for(String s:movieData)
			 {
				 String[] ss=s.split("\\|"); 
				 /*
				  *  ss={1|쇼생크 탈출|드라마|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|2016 .02.24 재개봉, 1995 .01.28 개봉|15세 관람가|프랭크 다라본트
				  *  
				  *   |  오아로 끊어줌
				  */
				 movies[k]=new MovieVO(); // 초기화. 메모리에 저장
				 movies[k].mno=Integer.parseInt(ss[0]); //문자열==> 정수로 변화 "1" ==> 1
				 movies[k].title=ss[1];
				 movies[k].genre=ss[2];
				 movies[k].poster=ss[3];
				 movies[k].actor=ss[4];
				 movies[k].regdate=ss[5];
				 movies[k].grade=ss[6];
				 movies[k].director=ss[7];
				 
				 k++;
			 }
		 }catch(Exception ex){}	//예외처리
	 }
//	public static void main(String[] args) {
//		//System.out.println(data.toString());
//		for(MovieVO vo:movies)
//		{
//			System.out.println("영화번호:"+vo.mno);
//			System.out.println("영화명:"+vo.title);
//			System.out.println("장르:"+vo.genre);
//			System.out.println("출연:"+vo.actor);
//			System.out.println("감독:"+vo.director);
//			System.out.println("등급:"+vo.grade);
//			System.out.println("개봉일:"+vo.regdate);
//			System.out.println("===================================================================");
//			
//		}
//	}
	
	
	// **페이지  나누기**
	static MovieVO[] movieListData(int page)
	{
		MovieVO[] m=new MovieVO[10];
		int i=0;	// 10개씩 나눠주는 변식
		int j=0;	// for문 횟수
		int rowSize=10;	// 각 페이지당 몇개
		int pagecnt=(page*rowSize)-rowSize;	// 시작위치
		/*
		 * 	1 page => 0 ~ 9
		 * 	2 page => 10 ~ 19
		 */
		for(MovieVO vo:movies)
		{
			if(i<10 && j<=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;	
		}
		return m;
	}
	
	static MovieVO[] movieFindData(int page)
	{
		MovieVO[] m=new MovieVO[10];
		int i=0;	// 10개씩 나눠주는 변식
		int j=0;	// for문 횟수
		int rowSize=50;	// 각 페이지당 몇개
		int pagecnt=(page*rowSize)-rowSize;	// 시작위치
		/*
		 * 	1 page => 0 ~ 9
		 * 	2 page => 10 ~ 19
		 */
		for(MovieVO vo:movies)
		{
			if(i>50) break;
			if(i<50 && j<=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;	
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지 입력:");
		int page=scan.nextInt();
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("영화번호:"+vo.mno);
			System.out.println("영화명"+vo.title);
			System.out.println("=========================");
			
		}
	}
		
}
																			
	
		
	
		