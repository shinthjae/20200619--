// 20200630(8) 
// build path => configure~~ => 

// 네이버영화 영화랭킹 평점순
// 웹 정보(사진포함) 싹다 긁어오기 
public class 배열_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] title=new String[1900];
		//String[] actor=new String[1900];
		
		// String 에서 제공하는 기능 (메소드)
		String[] title={
				"#살아있다",
				"결백",
				"사라진 시간",
				"침입자",
				"온워드: 단 하루의 기적",
				"야구소녀",
				"반도",
				"엔딩스 비기닝스",
				"배트맨 비긴즈",
				"위대한 쇼맨"
		};
		String[] actor= {
				"유아인(오준우), 박신혜(김유빈)",
				"신혜선(정인), 배종옥(화자), 허준호(추시장)",
				"조진웅(박형구), 배수빈(김수혁), 정해균(정해균)",
				"송지효(유진), 김무열(서진)",
				"톰 홀랜드(이안 라이트풋 목소리), 크리스 프랫",
				"이주영(주수인), 이준혁(최진태)",
				"강동원, 이정현",
				"쉐일린 우들리(다프네), 제이미 도넌(잭), 세바스찬 스탠(프랭크)",
				"크리스찬 베일(브루스 웨인/배트맨), 마이클 케인(알프레드)",
				"휴 잭맨(P.T. 바넘), 잭 에프론(필립 칼라일), 미셸 윌리엄스"
		};
		
		System.out.println("====== 영화 인기 Top 10 ======");
		for(int i=0;i<title.length;i++) {
			System.out.println("영화명:"+title[i]);
			System.out.println("출연:"+actor[i]);
			System.out.println("==============================================");
		}
		
		

	}

}
