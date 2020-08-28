package com.sist.manager;
/*
 * 		1. �����ͺ��̽� => ���̺� ����
 * 		2. DML ����(SELECT,INSERT,UPDATE,DELETE)
 * 		3. �ڹٿ��� ����(SQL) => ����Ŭ ����
 * 		4. ȭ�鿡 ���(HTML,CSS)
 * 		5. JavaScript
 * 
 * 		==> 1. ����Ŭ 
 * 		==> 2. �ڹ�
 * 		==> 3. HTML
 * 		==> 4. CSS/JavaScript
 */
//��������� ��������
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
