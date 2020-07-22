package com.sist.data;

/*주소	대구광역시 중구 달구벌대로443길 15-25
지번 대구시 중구 삼덕동2가 290-6
전화번호	010-6861-5478
음식 종류	카페 / 디저트
가격대	만원 미만
주차	유료주차 가능
영업시간	09:00 - 21:00*/

// 맛집 하나에 대한 정보
public class FoodHouseVO { //(5) 
	private int no;
	private int cno; //1번 이미지를 누르면 다음 나오는 정보들도 같은 번호여야 => CategoryVO의 cno의 이름이 같아야 
	private String poster; // 가게 상세정보에 나오는 사진 //splite
	private String review; // [2]
	private String title;
	private double score;
	private String address;
	private String tel;
	private String type;
	private String price;
	private String parking;  // ★만약 불러오는 정보에서 카테고리중 빠진다면 오류날 수있기때문에 예외처리를 해야한다★
	private String time;
	private int good;
	private int soso;
	private int bad;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getSoso() {
		return soso;
	}
	public void setSoso(int soso) {
		this.soso = soso;
	}
	public int getBad() {
		return bad;
	}
	public void setBad(int bad) {
		this.bad = bad;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	
}
