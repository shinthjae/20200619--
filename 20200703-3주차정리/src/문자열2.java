//20200703(7)

// trim() , replace()

public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" Hello Java ";
		System.out.println(s);
		System.out.println(s.trim()); // 가운데 공백은 영향없음 좌우 공백만
//		System.out.println(s=s.trim()); // 원본(s) 건드리기
		
		System.out.println(s.replace("l","K")); //=> HeKKo Java 
		System.out.println(s.replace(" ","-")); //=> -Hello-Java-
		System.out.println(s.substring(1,6)); //=> Hello

		
	}

}
