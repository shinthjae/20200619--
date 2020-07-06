//20200702(2)


import java.util.*;
public class 문자열ppt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
		
//		int[] a= {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0;i<a.length;i++) {      //	for(int i:a)
//		if(i%3==0) {
//			System.out.println(i)	
//		}
//
//		}
		
		//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
		
//		int[] arr=new int[10];  //10개의 메모리 공간 생성
//		
//		for(int i=0;i<10;i++) {
//			arr[i]=(int)(Math.random()*10)+1; //필요한 값 설정
//		}
//		
//		int total=0;
//		for(int i:arr) {
//			total+=i;
//		} 
//		
//		System.out.println("평균:"+total/10.0);
		
		
		String[] course={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] jumsu={95, 88, 76, 62, 55};
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("과목이름:");
//		String subject=scan.nextLine();
//		boolean bCheck=false;
//		
//		for(int i=0;i<course.length;i++) {
//			if(subject.equals(course[i])) {
//				bCheck=true;
//				System.out.println(jumsu[i]);
//			}
//		}
//		
//		if(bCheck==false) {
//			System.out.println("없는 과목입니다!!");
//		}
//		
		
		
		
		
		
		// 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
		//String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		//int course[]={95, 88, 76, 62, 55};
		//그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. "그만"을 입력받으면 종료한다. 
		//※ 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야 한다.


		
		Scanner scan=new Scanner(System.in);
		boolean bCheck=false;
		
		while(true) {
			bCheck=false;
			System.out.print("과목이름:");
			String subject=scan.nextLine();
			if(subject.equals("그만")) {
				break;
			}
		for(int i=0;i<course.length;i++) {
			if(subject.equals(course[i])) {
				bCheck=true;
				System.out.println(jumsu[i]);
			}
		}
		
		if(bCheck==false) {
			System.out.println("없는 과목입니다!!");
		}
}
}
}

