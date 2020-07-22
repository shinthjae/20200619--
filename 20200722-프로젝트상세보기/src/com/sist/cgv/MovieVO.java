package com.sist.cgv;

/*알라딘 현재상영중
Aladdin

예매율 10.3%  98%
감독 : 가이 리치 / 배우 : 
메나 마수드 ,  윌 스미스 ,  나오미 스콧
장르 : 어드벤처, 가족, 환타지 / 기본 : 
전체, 128분, 미국
개봉 : 
2020.07.22(재개봉)*/

public class MovieVO { //(1)
	private int mno; //영화 고유번호 
	private String title; //이름
	private String reserve; //예매율
	private String director; //간독
	private String actor; //배우
	private String genre; //장르
	private String grade; //관람가
	private String time; //영상시간
	private String from; //국가
	private String regdate; //개봉일
	private String story; //줄거리
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
