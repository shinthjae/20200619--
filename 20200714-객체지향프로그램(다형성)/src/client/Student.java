package client;

public class Student {
	private int hakbun;
	public String name;
	String subject; // 아무것도 안붙으면 default 같은 패키지일때 사용, 다른패키지지만 상속
	protected String tel;
	
	public int getHakbun() {   
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;                         // 변수명이 충돌되며 this 있어야. 멤버변수. 없으면 지역변수
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
		name="홍길동";
		subject="물리";
		tel="010-1111-1111";
	}

}
