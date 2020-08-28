package com.sist.manager;
/*
 MNO    NOT NULL NUMBER        
CATENO          NUMBER        
TITLE  NOT NULL VARCHAR2(300) 
POSTER NOT NULL VARCHAR2(260) 
SINGER NOT NULL VARCHAR2(100) 
ALBUM  NOT NULL VARCHAR2(100) 
 */
public class MelonVO {
	private int mno;
	private int cateno;
	private String title;
	private String poster;
	private String singer;
	private String album;
	private int rank;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCateno() {
		return cateno;
	}
	public void setCateno(int cateno) {
		this.cateno = cateno;
	}
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
