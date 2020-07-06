//20200702(4)
/*
 * 		indexOf , lastIndexOf => 문자의 위치 찾기 => 정수
 * 		     앞		     뒤
 * 		//문자자르기 => substring() 이랑 같이 자주 쓰인다
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="sjfjlj.fejfejfjfjsadfklj.java";
		System.out.println(msg.indexOf(".")); //=>6 앞의 점
		System.out.println(msg.lastIndexOf(".")); //=>24 뒤의 점
		System.out.println("확장자:"+msg.substring(msg.lastIndexOf(".")+1)); //=> 확장자:java  => +1은 점 다음부터 출력 
		System.out.println(msg.indexOf(".")+1); //=>7
	}

}
