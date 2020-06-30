/*
 * 		영화 => 정보 저장하는 변수
 * 		변수 => 변경이 가능
 * 		
		#살아있다(2020)상영중  	=>String 상영중 boolean
		#alive 평점 06 . 7 		=>String
		한국						=>String
		2020.06.24 개봉			
		 98분, 15세이상관람가
		감독 조일형 주연 유아인, 박신혜
		예매 1위 누적관객357,069명 
		
		결백(2019)상영중       => 상영중 boolean
		潔白 평점 08 . 8
		드라마
		한국
		2020.06.10 개봉
		 110분, 15세이상관람가
		감독 박상현 주연 신혜선, 배종옥, 허준호
		예매 2위 누적관객617,898명 
 */
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제목
//			String title""#살아있다(2020)"";
//			
//			#살아있다(2020)상영중  	=>String 상영중 boolean

					String title="#살아있다(2020)";
					boolean isOpen=true;
					double score=6.7;
					String na="한국";
					String genre="";
					String regdate="2020.06.24";
					String director="조일형";
					String actor="유아인,박신혜";
					int time=98;
					int grade=15;
					int rank=1;
					int showUser=357069;
					
					
					System.out.println("========= 영화정보 ==========");
					System.out.print("영화명:"+title);
					System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
					System.out.println("기타:"+na+" "+grade);
					System.out.println("시간:"+time+"분");
					System.out.println("개봉일:"+regdate+"개봉");
					System.out.println("감독:"+director);
					System.out.println("출연:"+actor);
					System.out.println("순위:"+rank);
					System.out.println("누적관객수:"+showUser);
							
					title="결백(2019)";
					isOpen=true;
					score=8.8;
					na="한국";
					genre="";
					regdate="2020.06.10";
					director="박상현";
					actor="신혜선, 배종옥, 허준호";
					time=110;
					grade=15;
					rank=2;
					showUser=617898;
					
					System.out.println("========= 영화정보 ==========");
					System.out.print("영화명:"+title);
					System.out.println(" "+(isOpen==true?"상영중":"미개봉"));
					System.out.println("기타:"+na+" "+grade);
					System.out.println("시간:"+time+"분");
					System.out.println("개봉일:"+regdate+"개봉");
					System.out.println("감독:"+director);
					System.out.println("출연:"+actor);
					System.out.println("순위:"+rank);
					System.out.println("누적관객수:"+showUser);
					
//					title="#살아있다(2020)";
//					isOpen=true;
//					score=6.7;
//					na="한국";
//					genre="";
//					regdate="2020.06.24";
//					directir="조일형";
//					actor="유아인,박신혜";
//					time=98;
//					grade=15;
//					rank=1;
//					showUser=357069;
					

	}

}
