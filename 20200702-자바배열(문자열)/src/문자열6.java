//20200702(6)

/*
 * 		valueOf() : 모든 데이터형을 문자열로 변환
 * 		
 * 		valueOf(10) ==> "10"
 * 		valueOf(true) ==> "true"
 * 		char[] c={'H','e','l','l','o'};
 * 		valueOf(c) ==> "Hello"
 */
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c={'H','e','l','l','o'};
		String msg=String.valueOf(c); //char[] 변환=> String
		System.out.println(msg); //=> Hello
		
		String ss="Hello Java!!";
		char[] cc=ss.toCharArray(); //String 변환=> char[]
		System.out.println(cc);
		
		int a=10;
		int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b)); //=> 1020 => "10"+"20"
																 //=> valueOf 쓰면 모두 문자가 됨
		

	}

}
