//202020708(1)

// 	영화 
//	1.영화명, 2.출연, 3.감독, 4.예매율, 5.순위     ===> 관리 영화 5개 있다 => 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title= {
				"#살아있다(2020)",
				"밤쉘: 세상을 바꾼 폭탄선언(2019)",
				"다크 나이트 라이즈(2012)",
				"원 데이(2011)",
				"결백(2019)"

				};
		String[] actor= {
				"유아인, 박신혜",
				"샤를리즈 테론, 니콜 키드먼, 마고 로비",
				"크리스찬 베일, 마이클 케인, 게리 올드만, 앤 해서웨이, 톰 하디, 마리옹 꼬띠아",
				"앤 해서웨이,짐 스터게스 ",
				"신혜선, 배종옥, 허준호"
		};
		String[] director={
			"조일형",
			"제이 로치",
			"크리스토퍼 놀란",
			"론 쉐르픽",
			"박상현"
		};
		double[] reserve={
			17.3,12.6,7.8,1.3,1.0
			
		};
		int[] rank={1,2,3,4,5}; 
		
		for(int i=0;i<5;i++)
		{
			System.out.println("영화명:"+title[i]);
			System.out.println("감독:"+director[i]);
			System.out.println("출연:"+actor[i]);
			System.out.println("예매율:"+reserve[i]);
			System.out.println("영화순위:"+rank[i]);
			System.out.println("====================");
			
		}

	}

}
