package com.sist.data;

import java.util.*;

import java.io.*;



public class EbookManager {
	
	private static ArrayList<EbookVO> list=new ArrayList<EbookVO>();
	
	static
	{
		try
		{
			
			FileInputStream fr=new FileInputStream("c:\\javaDev\\naverseries_ebook.txt");
	
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			
			while(true)
			{
				String ebook=in.readLine(); 
				if(ebook==null) break; 
				StringTokenizer st=new StringTokenizer(ebook,"|");
				
				while(st.hasMoreTokens())
				{
					EbookVO vo=new EbookVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					
					vo.setCno(Integer.parseInt(st.nextToken()));
					
					vo.setTitle(st.nextToken());
					
					vo.setPoster("https:"+st.nextToken());
					
					vo.setWriter(st.nextToken());
					
					vo.setPublisher(st.nextToken());
					
					vo.setCategory(st.nextToken());
					
					vo.setGrade(st.nextToken());
					
					vo.setPublish(st.nextToken());
					
					vo.setPrice(st.nextToken());
					
					vo.setStory(st.nextToken());
					
					
					list.add(vo);
				}
			}
			
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<EbookVO> ebookListData(int page)
	{
		ArrayList<EbookVO> ebooks=new ArrayList<EbookVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
	
		for(EbookVO vo:list)
		{
			if(i<10 && j>=pagecnt) 
			{
				ebooks.add(vo);
				i++; 
			}
			j++;
		}
		return ebooks;
	}
	
	public int ebookTotalPage()
	{
		
		return (int)(Math.ceil(list.size()/10.0));
						 
	}
	
	////�󼼺���
	public EbookVO ebookDetailData(int mno)
	{
		return list.get(mno-1); 
	}
	
	//* ��ȭ ��ü �б� => ����ڰ� ��û�Ҷ����� ����Ʈ �б�
	public ArrayList<EbookVO> ebookAllData(int cno)  
	{
		ArrayList<EbookVO> ebooks=new ArrayList<EbookVO>();
		for(EbookVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				ebooks.add(vo);
			}
		}
		return ebooks;
		
	}
	
	public ArrayList<EbookVO> ebookFindData(String ss)
	{
		ArrayList<EbookVO> ebooks=new ArrayList<EbookVO>(); 
		//list
		for(EbookVO vo:list)
		{
			if(vo.getTitle().contains(ss)) 
			{
				ebooks.add(vo);
			}
		}
		return ebooks;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("������:");
		int page=scan.nextInt();
		
		EbookManager m=new EbookManager();
		System.out.println(page+" page / "+m.ebookTotalPage()+" pages");
		
		//�������б�
		ArrayList<EbookVO> list=m.ebookListData(page);
		for(EbookVO vo:list) 
		{
			System.out.println(vo.getTitle());
		}
		
	}

	
}

