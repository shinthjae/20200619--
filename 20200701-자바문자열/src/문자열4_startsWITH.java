//p.208,209


// startsWith / endsWith / contains =====> �˻��Ҷ����
// �˻� �� ù�ܾ� �����˻��� startsWith
// aaffajfffajavadkajlaj => contain�� �߰��� java�� ã�������� 
// ���μ�



import java.util.*;
public class ���ڿ�4_startsWITH {

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
		System.out.print("�˻����Է�:"	);
		String ss=scan.nextLine();     // next()=>enter,space   nextLine()=>enter
		for(String s:data) {
//			if(s.startsWith(ss)) {
//				System.out.println(s);    // �ڵ��ϼ�(suggest)
//				Thread.sleep(500);
				
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);    // �ΰ�ã��
				Thread.sleep(500);
			}
		}
		     

	}

}
