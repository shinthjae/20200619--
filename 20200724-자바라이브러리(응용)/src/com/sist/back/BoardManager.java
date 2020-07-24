package com.sist.back;
import java.util.*;
public class BoardManager {
	private static ArrayList<BoardVO> list=new ArrayList<BoardVO>();
	
	//자동 증가번호 제작
	public int sequance() 
	{
		int max=0;
		for(BoardVO vo:list)
		{
			if(max<vo.getNo())
				max=vo.getNo();
		}
		return max+1;
	}
	
	//vo데이터 추가
	public void insert(BoardVO vo) 
	{
		vo.setRegdate(new Date()); //오늘 날짜 default라
		vo.setNo(sequance()); 
		list.add(vo);
	}
	
	//목록 출력
	public ArrayList<BoardVO> select()
	{
		return list;
	}
	
	
			
}
