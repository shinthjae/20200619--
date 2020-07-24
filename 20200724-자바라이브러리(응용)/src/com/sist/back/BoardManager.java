package com.sist.back;
import java.util.*;
public class BoardManager {
	private static ArrayList<BoardVO> list=new ArrayList<BoardVO>();
	
	//�ڵ� ������ȣ ����
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
	
	//vo������ �߰�
	public void insert(BoardVO vo) 
	{
		vo.setRegdate(new Date()); //���� ��¥ default��
		vo.setNo(sequance()); 
		list.add(vo);
	}
	
	//��� ���
	public ArrayList<BoardVO> select()
	{
		return list;
	}
	
	
			
}
