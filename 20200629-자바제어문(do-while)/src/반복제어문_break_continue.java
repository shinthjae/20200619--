//202006299(4)

//updown 게임 ==> 잘못된 입력 => 성적계산
//게임 => 입력관련 => continue, 종료관련 => break;
//숫자를 맞출때까지 게임을 계속 => while


import java.util.*;
public class 반복제어문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		// 임의의 숫자를 저장 => 난수(com)
		// => i=1 ~~ i=10 ==> i++
		// => break, continue
		// main => 재사용이 불가능
		// 프로그램은 프로그래머가 명형을 한 순서로 진해
		// 한줄씩 수행한다
		// 무한 루프 => 횟수가  지정이 없는 경우
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("1~100까지 사이의 정수 입력:");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
			System.out.println("잘못된 입력 값입니다");
			continue;
			
		}
		
		//비교
		
		if(user>com)
		{
			System.out.println("입력값보다 낮은 정수를 입력하세요");
		}
		else if(user<com)
		{
			System.out.println("입력값보다 높은 정수를 입력하세요");
		}
		else (user==com)
		{
		}
		System.out.println("Game Over!");
		break;	// System.exit(0)
		// 반복문 종료
	}

}
