//p.208,209


// startsWith / endsWith / contains =====> 검색할때사용
// 검색 중 첫단어 연관검색어 startsWith
// aaffajfffajavadkajlaj => contain은 중간에 java를 찾아주지만 
// 가로수



import java.util.*;
public class 문자열4_startsWITH {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String[] data= {
				"Java Program",
				"Oracle Program",
				"JSP Program",
				"Oracle AND Java",
				"Java AND JSP",
				"Ajax Program",
				"Spring AND Mobile",
				"Kotlin Program",
				"XML AND Annotation",
				"Java AND JQuery"
		};
		
		// startsWith
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어입력:"	);
		String ss=scan.nextLine();     // next()=>enter,space   nextLine()=>enter
		for(String s:data) {
//			if(s.startsWith(ss)) {
//				System.out.println(s);    // 자동완성(suggest)
//				Thread.sleep(500);
				
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);    // 두개찾기
				Thread.sleep(500);
			}
		}
		     

	}

}
