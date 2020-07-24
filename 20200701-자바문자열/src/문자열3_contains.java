import java.util.*;

import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
public class 문자열3_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title={
				"#살아있다",
				"결백",
				"사라진 시간",
				"침입자",
				"온워드: 단 하루의 기적",
				"야구소녀",
				"반도",
				"엔딩스 비기닝스",
				"배트맨 비긴즈",
				"위대한 쇼맨"
		};
		String[] actor= {
				"유아인(오준우), 박신혜(김유빈)",
				"신혜선(정인), 배종옥(화자), 허준호(추시장)",
				"조진웅(박형구), 배수빈(김수혁), 정해균(정해균)",
				"송지효(유진), 김무열(서진)",
				"톰 홀랜드(이안 라이트풋 목소리), 크리스 프랫",
				"이주영(주수인), 이준혁(최진태)",
				"강동원, 이정현",
				"쉐일린 우들리(다프네), 제이미 도넌(잭), 세바스찬 스탠(프랭크)",
				"크리스찬 베일(브루스 웨인/배트맨), 마이클 케인(알프레드)",
				"휴 잭맨(P.T. 바넘), 잭 에프론(필립 칼라일), 미셸 윌리엄스"
		};
		
		// 출연자명을 입력
		String name=JOptionPane.showInputDialog("출연자명을 입력");
		for(int i=0;i<actor.length;i++) {
			if(actor[i].contains(name)) {                              // contains 
				System.out.println("출연 영화: "+title[i]);
				break;												   // 정보(데이터)가 많으면 break걸면 X(여러편이 있을수 있으니까)
				
			}
		}

		
	}

}
