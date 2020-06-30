// 20200630(5)

/*
 * 		Math.random() ==> 임의로 컴퓨터 추출(난수)
 * 					      ============
 * 							0.0 ~ 0.99
 * 							=> 로또
 * 							1~45	==> (int)(Math.random()*45)+1
 * 										=========================
 * 												0~44
 */
public class 배열_난수발생 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 로또 번호 저장하는 공간 ==> 6
		int[] lotto=new int[6];
			for(int i=0;i<6;i++) {
				lotto[i]=(int)(Math.random()*45)+1;
			}
			//출력
			for(int i:lotto) {
				System.out.print(i+" ");
			}

	}

}
