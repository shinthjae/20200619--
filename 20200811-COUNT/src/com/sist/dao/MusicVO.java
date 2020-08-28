package com.sist.dao;
/* 
 MNO                                                NUMBER(3)
 TITLE                                              VARCHAR2(300)
 SINGER                                             VARCHAR2(100)
 ALBUM                                              VARCHAR2(200)
 POSTER                                             VARCHAR2(1000)
 STATE                                              CHAR(6)
 IDCREMENT                                          NUMBER(3)
 KEY                                                VARCHAR2(50)
 */
public class MusicVO {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String poster;
	private String state;
	private int idcrement;
	private String key;
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
