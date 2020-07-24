package com.sist.exception;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryVO[] cate=MainClass3.categoryListData();  //(12)데이터모으기 끝 ======> 20200717 UI 
		for(CategoryVO vo:cate)
		{
			System.out.println(vo.getCno());
			System.out.println(vo.getTitle());
			System.out.println(vo.getSubject());
			System.out.println(vo.getPoster());
			System.out.println("================================");
		}
	}

}
