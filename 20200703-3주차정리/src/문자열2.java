//20200703(7)

// trim() , replace()

public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=" Hello Java ";
		System.out.println(s);
		System.out.println(s.trim()); // ��� ������ ������� �¿� ���鸸
//		System.out.println(s=s.trim()); // ����(s) �ǵ帮��
		
		System.out.println(s.replace("l","K")); //=> HeKKo Java 
		System.out.println(s.replace(" ","-")); //=> -Hello-Java-
		System.out.println(s.substring(1,6)); //=> Hello

		
	}

}
