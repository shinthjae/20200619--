package client;

public class Student {
	private int hakbun;
	public String name;
	String subject; // �ƹ��͵� �Ⱥ����� default ���� ��Ű���϶� ���, �ٸ���Ű������ ���
	protected String tel;
	
	public int getHakbun() {   
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;                         // �������� �浹�Ǹ� this �־��. �������. ������ ��������
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Student()
	{
		hakbun=1;
		name="ȫ�浿";
		subject="����";
		tel="010-1111-1111";
	}

}
