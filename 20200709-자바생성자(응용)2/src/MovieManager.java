/*
 *  Try catch는 사용자가 직접오류를 잡는다
 *  thorws Exception 는 컴퓨터에게 오류를 맡긴다 .
 */
import java.io.*; // io ->파일 입출력 
import java.util.Scanner;
/*
 *  변수 설정 : 초기값
 *  	= 선언과 동시에 값 주입
 *  	= 생성자
 *  	= 초기화 블록
 *  		= 인스턴스 초기화
 *  			Class A
 *  			{
 *  				int a;
 *  				{
 *  					a=10;
 *  				}
 *  			}
 *  		= Static 초기화
 * 				Class A
 * 				{
 * 					static int a;
 * 					static
 * 					{
 * 						a=10;
 * 					}	  
 * 				}		  
 * 						  
 * 				=> 명시적 초기화 
 * 				//초기화 순서 클래스 -> 초기화 블럭 -> 생성자 순으로 값이 바뀐다
 * 								===============================같이 사용하는 빈도가 거의 없다.
 * 				class A
 * 				{	
 * 					int a=10;
 * 					{
 * 						a=100;
 * 					}
 * 					A(){
 * 						a=1000;
 * 					}
 * 				}
 */
public class MovieManager { // 클래스안에서는 변수선언만 가능하다 구현은 불가능
	static MovieVO[] movies = new MovieVO[1938];
	static StringBuffer data=new StringBuffer();

	// 모든 클래스에서 공유를 할 경우
	// 프로그램이 구동이 되면 자동으로 => 파일을 읽어서 배열에 저장
	// 클래스 초기화
	/*
	 * static{ }
	 */
	// 인스턴스 초기화 블럭
	/*
	 * {
	 * 
	 * }
	 */
	// 초기화 블록
	static // 생성자 메소드는 프로그램 처음돌때 시행되는데 왜 생성자메소드말고 초기화블럭을쓰는지모르겠음
	{
		try 
		{
			//File을 읽는 경우에는 반드시 예외처리
			FileReader fr= new FileReader("c:\\javaDev\\movie.txt");

			int i=0;
			while((i=fr.read())!=-1) //fr.read 한글자씩 읽어온다  , 파일을끝날때까지 읽어온다.
			{
				data.append(String.valueOf((char)i)); // char를 string으로 변환할때 사용한다
			}
			fr.close();
			String[] movieData=data.toString().split("\n"); // *** 1)처음에 한줄씩 짤라라!!!
			int k=0;
			for(String s:movieData)
			{
				String[] ss=s.split("\\|");                 // *** 2)한줄 짜른 이후에 |구분으로 짤라라 다만 |는 혼자사용할 수 없고 \\|를 써야한다,.
				/*
				 * 
				 */
				movies[k]=new MovieVO();
				movies[k].mno=Integer.parseInt(ss[0]);
				//문자열 ==> 정수로 반환 "1" ==>1
				movies[k].titlel=ss[1]; //한바퀴 돌때마다 제목 장르 포스터.. 에 계속 데이터를 넣어준다.
				//System.out.println("movies["+k+"].title =:"+movies[k].titlel);
				//System.out.println("ss[1]"+ss[1]);
				movies[k].gener=ss[2];
				//System.out.println("movies["+k+"].gener =:"+movies[k].gener);
				movies[k].poster=ss[3];
				//System.out.println("ss[3]"+ss[3]);
				movies[k].actor=ss[4];
				System.out.println(movies[k].actor);
				movies[k].regdate=ss[5];
				movies[k].grade=ss[6];
				movies[k].director=ss[7];
				k++;

			}
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	static MovieVO[] movieListData(int page)
	{
		MovieVO[] m = new MovieVO[10];
		int i=0;
		int j=0;
		int rowSize=10;
		int pagecnt=(page*rowSize)-rowSize;
		for(MovieVO vo:movies)
		{
			if(i<10 && j>=pagecnt)
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
		MovieVO[] m = new MovieVO[50];
		int i=0;
		int j=0;
		int rowSize=50;
		int pagecnt=(page*rowSize)-rowSize;
		for(MovieVO vo:movies)
		{
			if(i>50) break;
			if(i<50 && j>=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;
		}
		return m;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("페이지 입력:");
		int page=scan.nextInt();
		
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("영화 번호:["+vo.mno+"]");
			System.out.println("영  화  명:["+vo.titlel+"]");
			System.out.println("=========================");
			
		}
		
	}
	/*
	public static void main(String[] args) { 
		System.out.println(data.toString());	
		
		for(MovieVO vo:movies)
		{
			System.out.println("영화 번호:"+vo.mno); 
			System.out.println("영  화  명:"+vo.titlel);
			System.out.println("장       르:"+vo.gener);
			System.out.println("출       연:"+vo.actor);
			System.out.println("감       독:"+vo.director);
			System.out.println("등       급:"+vo.grade);
			System.out.println("개  봉  일:"+vo.regdate);
			System.out.println("=======================");
			
		}
	
	}
		*/
}
