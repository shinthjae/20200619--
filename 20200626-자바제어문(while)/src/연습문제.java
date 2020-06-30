import java.util.*;

public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7의 배수 갯수 ,합
		int count=0;
		int sum=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0) 
				sum+=i;
				count++;	
		}
		System.out.println("for7의 배수의 갯수:"+count);
		System.out.println("for7의 배수의 합:"+sum);	
//		
//		int sum1=0;
//		int count1=0;
//		int i1=100;
//		while(i1<=999)
//		{
//			if(i1%7==0) 
//				sum1+=i1;
//			i1++;
//			count1++;
//		}
//		System.out.println("while7의 배수의 갯수:"+count1);
//		System.out.println("while7의 배수의 합:"+sum1);
		
//		//4의 배수가 아닌 갯수,합
//			
//		int count2=0;
//		int sum2=0;
//		for(int ii=100;ii<=999;ii++)
//		{
//			if(ii%4!=0) 
//				sum2+=ii;
//				count2++;			
//		}
//		System.out.println("for4의 배수의 아닌 갯수:"+count2);
//		System.out.println("for4의 배수의 아닌 합:"+sum2);
		
		
//		int sum3=0;
//		int count3=0;
//		int i3=100;
//		while(i3<=999)
//		{
//			if(i3%4!=0) 
//				sum3+=i3;
//			i3++;
//			count3++;
//		}
//		System.out.println("while4의 배수의 아닌 갯수:"+count3);
//		System.out.println("while4의 배수의 아닌 합:"+sum3);
			
		
//		// 1~30 짝수 홀수 합
//		
//		int even=0;
//		int odd=0;
//		
//		for(int i=1;i<=30;i++)
//		{
//			if(i%2==0)
//			{
//				even+=i;
//			} else 
//			{
//				odd+=i;
//			}
//		}
//		System.out.println("for짝수의 합:"+even);
//		System.out.println("for홀수의 합:"+odd);
//		
//		int even1=0;
//		int odd1=0;
//		int ii=1;
//		while(ii<=30)
//		{
//			if(ii%2==0)
//			{
//				even1+=ii;
//			} else 
//			{
//				odd1+=ii;
//			}
//			ii++;
//		}
//		System.out.println("while짝수의 합:"+even);
//		System.out.println("while홀수의 합:"+odd);

		//1~100 3의 배수이고 5의 배수 출력
		
//		for(int aa=1;aa<=100;aa++)
//		{
//			if(aa%3==0 && aa%5==0)
//				System.out.print(aa+" ");
//		}
//		
//		int aaa=1;
//		
//		while(aaa<=100)
//		{
//		if(aaa%3==0 && aaa%5==0)
//			System.out.print(aaa+" ");
//			aaa++;
//		}
//		
		//1~1000 7의배수, 9의배수, 7,9배수의 합
//		int se=0;
//		int ni=0;
//		int senisum=0;
//		
//		for(int i=1;i<=1000;i++)
//		{
//			if(i%7==0)
//			{
//				se+=i;
//			}
//
//			if(i%9==0)
//			{
//				ni+=i;
//			}			
//		}
//		System.out.println("for 7의 배수 합:"+se);
//		System.out.println("for 9의 배수 합:"+ni);
//		System.out.println("for 7,9의 배수 합:"+(se+ni));
//		
//		int sewh=0;
//		int niwh=0;
//		int senib=1;
//		
//		while(senib<=1000)
//		{
//			if(senib%7==0)
//			{
//				sewh+=senib;
//			}
//			if(senib%9==0)
//			{
//				niwh+=senib;		
//			}
//			senib++;
//		}
//		System.out.println("while 7의 배수 합:"+sewh);
//		System.out.println("while 9의 배수 합:"+niwh);
//		System.out.println("while 7,9의 배수 합:"+(sewh+niwh));
		
		//1~100 같은 자리에 정수를 
		
	}

}
