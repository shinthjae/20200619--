package com.sist.manager;
/*
 * 		1. 데이터베이스 => 테이블 제작
 * 		2. DML 연습(SELECT,INSERT,UPDATE,DELETE)
 * 		3. 자바에서 제어(SQL) => 오라클 전송
 * 		4. 화면에 출력(HTML,CSS)
 * 		5. JavaScript
 * 
 * 		==> 1. 오라클 
 * 		==> 2. 자바
 * 		==> 3. HTML
 * 		==> 4. CSS/JavaScript
 */
//사용자정의 데이터형
public class NewsVO {
    private String title;
    private String poster;
    private String link;
    private String content;
    private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
}
