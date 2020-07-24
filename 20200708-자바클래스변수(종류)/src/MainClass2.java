
// 사용자가 직접 데이터형을 만든다
class MovieInfo{ // public 오류
	// 멤버변수, 인스터스 변수 => 메모리 공간을 생성 ==> new
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name; // 공통
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		// int m1=10
		//m1 => 메모리에 저장되어 있는 변수의 초기값 MovieInfo[] m=mew MovieInfo
		m1.title="#살아있다(2020)";
		m1.director="조일형";
		m1.actor="유아인, 박신혜";
		m1.reserve=17.3;
		m1.rank=1;
		m1.site_name="CGV";
		
		MovieInfo m2=new MovieInfo();
		//m1 => 메모리에 저장되어 있는 변수의 초기값
		m2.title="밤쉘: 세상을 바꾼 폭탄선언(2019)";
		m2.director="제이 로치";
		m2.actor="샤를리즈 테론, 니콜 키드먼, 마고 로비";
		m2.reserve=12.6;
		m2.rank=2;
		m2.site_name="롯데시네마";
		
		MovieInfo m3=new MovieInfo();
		//m1 => 메모리에 저장되어 있는 변수의 초기값
		m3.title="다크 나이트 라이즈(2012)";
		m3.director="크리스토퍼 놀란";
		m3.actor="크리스찬 베일, 마이클 케인, 게리 올드만, 앤 해서웨이, 톰 하디, 마리옹 꼬띠아";
		m3.reserve=7.8;
		m3.rank=3;
		m3.site_name="메가박스";
		
		MovieInfo.site_name="서울극장";
		
		System.out.println("영화관:"+m1.site_name);
		m3.title="웜데이";
		System.out.println();		
		
		// 데이터를 통으로 모아 놓고 데이터 관리 제어 
		
	}

}
