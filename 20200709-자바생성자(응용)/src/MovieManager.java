import java.io.*;//���� �����
import java.util.Scanner;

/*
 * 				��������
 */
public class MovieManager {
	static MovieVO[] movies=new MovieVO[1938]; 
																		// ��� Ŭ�������� ������ �� ��� static ���
	static 																// ���α׷��� ������ �Ǹ� �ڵ����� => ������ �о �迭�� ����
	 {																	// �ʱ�ȭ �� {} => �ν��Ͻ��� �׳� ���θ�
		 try // File�� �д� ��쿡��  �ݵ�� ����ó��
		 { 		
			 StringBuffer data=new StringBuffer(); // ������		
			 
			 FileReader fr=new FileReader("c:\\javaDev\\movie.txt");  
			
			 int i=0;
			 
			 while((i=fr.read())!=-1)
			 {
				 data.append(String.valueOf((char)i)); //char=>String
			 }
			 
			 fr.close();
			 
			 String[] movieData=data.toString().split("\n"); // split �ڸ���
			 
			 int k=0;
			 
			 for(String s:movieData)
			 {
				 String[] ss=s.split("\\|"); 
				 /*
				  *  ss={1|���ũ Ż��|���|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|�� �κ�(�ص� ��������), ��� ������(������ ���̵� ���� ����)|2016 .02.24 �簳��, 1995 .01.28 ����|15�� ������|����ũ �ٶ�Ʈ
				  *  
				  *   |  ���Ʒ� ������
				  */
				 movies[k]=new MovieVO(); // �ʱ�ȭ. �޸𸮿� ����
				 movies[k].mno=Integer.parseInt(ss[0]); //���ڿ�==> ������ ��ȭ "1" ==> 1
				 movies[k].title=ss[1];
				 movies[k].genre=ss[2];
				 movies[k].poster=ss[3];
				 movies[k].actor=ss[4];
				 movies[k].regdate=ss[5];
				 movies[k].grade=ss[6];
				 movies[k].director=ss[7];
				 
				 k++;
			 }
		 }catch(Exception ex){}	//����ó��
	 }
//	public static void main(String[] args) {
//		//System.out.println(data.toString());
//		for(MovieVO vo:movies)
//		{
//			System.out.println("��ȭ��ȣ:"+vo.mno);
//			System.out.println("��ȭ��:"+vo.title);
//			System.out.println("�帣:"+vo.genre);
//			System.out.println("�⿬:"+vo.actor);
//			System.out.println("����:"+vo.director);
//			System.out.println("���:"+vo.grade);
//			System.out.println("������:"+vo.regdate);
//			System.out.println("===================================================================");
//			
//		}
//	}
	
	
	// **������  ������**
	static MovieVO[] movieListData(int page)
	{
		MovieVO[] m=new MovieVO[10];
		int i=0;	// 10���� �����ִ� ����
		int j=0;	// for�� Ƚ��
		int rowSize=10;	// �� �������� �
		int pagecnt=(page*rowSize)-rowSize;	// ������ġ
		/*
		 * 	1 page => 0 ~ 9
		 * 	2 page => 10 ~ 19
		 */
		for(MovieVO vo:movies)
		{
			if(i<10 && j<=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;	
		}
		return m;
	}
	
	static MovieVO[] movieFindData(int page)
	{
		MovieVO[] m=new MovieVO[10];
		int i=0;	// 10���� �����ִ� ����
		int j=0;	// for�� Ƚ��
		int rowSize=50;	// �� �������� �
		int pagecnt=(page*rowSize)-rowSize;	// ������ġ
		/*
		 * 	1 page => 0 ~ 9
		 * 	2 page => 10 ~ 19
		 */
		for(MovieVO vo:movies)
		{
			if(i>50) break;
			if(i<50 && j<=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;	
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է�:");
		int page=scan.nextInt();
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("��ȭ��ȣ:"+vo.mno);
			System.out.println("��ȭ��"+vo.title);
			System.out.println("=========================");
			
		}
	}
		
}
																			
	
		
	
		