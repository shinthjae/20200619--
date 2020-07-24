import java.util.*;
public class 메소드_재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//달력만들기_메소드사용.process();
		
		int year=달력만들기_메소드사용.userInput("년도");
		boolean bCheck=달력만들기_메소드사용.isYear(year);
		if(bCheck==true)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년 아님");
	}

}
