package com.sist.cgv;

/*�˶�� �������
Aladdin

������ 10.3%  98%
���� : ���� ��ġ / ��� : 
�޳� ������ ,  �� ���̽� ,  ������ ����
�帣 : ��庥ó, ����, ȯŸ�� / �⺻ : 
��ü, 128��, �̱�
���� : 
2020.07.22(�簳��)*/

public class MovieVO { //(1)
	private int mno; //��ȭ ������ȣ 
	private String title; //�̸�
	private String reserve; //������
	private String director; //����
	private String actor; //���
	private String genre; //�帣
	private String grade; //������
	private String time; //����ð�
	private String from; //����
	private String regdate; //������
	private String story; //�ٰŸ�
	private String poster;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
	
}
