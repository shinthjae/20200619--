//20200702(4)
/*
 * 		indexOf , lastIndexOf => ������ ��ġ ã�� => ����
 * 		     ��		     ��
 * 		//�����ڸ��� => substring() �̶� ���� ���� ���δ�
 */
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="sjfjlj.fejfejfjfjsadfklj.java";
		System.out.println(msg.indexOf(".")); //=>6 ���� ��
		System.out.println(msg.lastIndexOf(".")); //=>24 ���� ��
		System.out.println("Ȯ����:"+msg.substring(msg.lastIndexOf(".")+1)); //=> Ȯ����:java  => +1�� �� �������� ��� 
		System.out.println(msg.indexOf(".")+1); //=>7
	}

}
