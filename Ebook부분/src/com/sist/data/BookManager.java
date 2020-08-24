package com.sist.data;

import java.util.*;

import java.io.*;



public class MovieManager {
	
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	
	static
	{
		try
		{
			
			FileInputStream fr=new FileInputStream("c:\\javaDev\\naverseries_ebook3.txt");
	
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			
			while(true)
			{
				String movie=in.readLine(); 
				if(movie==null) break; 
				String[] datas=movie.split("\\|");
				
				
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(datas[0]));
					
					vo.setCno(Integer.parseInt(datas[1]));
					
					vo.setTitle(datas[2]);
					
					vo.setPoster(datas[3]);
					
					vo.setWriter(datas[4]);
					
					
					vo.setPublisher(datas[5]);
					
					vo.setCategory(datas[6]);
					
					vo.setGrade(datas[7]);
					
					vo.setPrice(datas[8]);
					
					vo.setStory(datas[9]);
					
					
					
					list.add(vo);
				}
			
			
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
	
		for(MovieVO vo:list)
		{
			if(i<10 && j>=pagecnt) 
			{
				movies.add(vo);
				i++; 
			}
			j++; 
		}
		return movies;
	}
	
	public int movieTotalPage()
	{
		
		return (int)(Math.ceil(list.size()/10.0));
						 
	}
	
	
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1); 
	}
	
	
	public ArrayList<MovieVO> movieAllData(int cno) 
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				movies.add(vo);
			}
		}
		return movies;
		
	}
	
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); 
		
		for(MovieVO vo:list)
		{
			if(vo.getTitle().contains(ss)) 
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("∆‰¿Ã¡ˆ:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		
		ArrayList<MovieVO> list=m.movieListData(page);
		for(MovieVO vo:list) 
		{
			System.out.println(vo.getTitle());
		}
		
	}
}
