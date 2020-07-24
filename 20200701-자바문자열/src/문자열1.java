//20200701(6)


/*
 * 		문자열 비교 : equals()
 * 		=================== (==)
 * 		문자찾기 : contains() => 검색창 글자(한글자도)적으면 비슷한 연관검색어 찾아줌,관련검색어       **** 자바스크립트랑 같음
 * 		시작문자열 : startsWith() => 
 * 		끝나는 문자열 : endsWidth()
 * 		문자열 자르기 : substring()
 * 		문자 추출 : charAt()
 * 		문자의 갯수 : length()
 * 		공백문자 제거 : trim()
 * 		문자의 위치 찾기 : indexOf()  ,  lastIndexOf()
 * 			aaa.java
 * 		형변환 : valueOf()
 */

// 로그인 처리
import java.util.*;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ID, PW
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID를 입력:");
		String id=scan.nextLine();
		System.out.println("비밀번호 입력:");
		String pwd=scan.nextLine();
		
		/*
		 *  equals : 대소문자 구분해서 비교
		 *  equalsIgnoreCase : 대소문자 구분없이 비교
		 */
		
		//결과
		
		if(id.equals(ID) && pwd.equals(PWD)) {       // 문자열에서는 (==) 사용하지맛 " 변수.equals(변수)
			System.out.println("로그인 되셨습니다.");
		} else {
			System.out.println("ID나 비밀번호가 틀립니다");
		}

	}

}
