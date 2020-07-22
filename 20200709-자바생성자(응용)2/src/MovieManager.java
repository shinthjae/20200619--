/*
 *  Try catch�� ����ڰ� ���������� ��´�
 *  thorws Exception �� ��ǻ�Ϳ��� ������ �ñ�� .
 */
import java.io.*; // io ->���� ����� 
import java.util.Scanner;
/*
 *  ���� ���� : �ʱⰪ
 *  	= ����� ���ÿ� �� ����
 *  	= ������
 *  	= �ʱ�ȭ ���
 *  		= �ν��Ͻ� �ʱ�ȭ
 *  			Class A
 *  			{
 *  				int a;
 *  				{
 *  					a=10;
 *  				}
 *  			}
 *  		= Static �ʱ�ȭ
 * 				Class A
 * 				{
 * 					static int a;
 * 					static
 * 					{
 * 						a=10;
 * 					}	  
 * 				}		  
 * 						  
 * 				=> ����� �ʱ�ȭ 
 * 				//�ʱ�ȭ ���� Ŭ���� -> �ʱ�ȭ �� -> ������ ������ ���� �ٲ��
 * 								===============================���� ����ϴ� �󵵰� ���� ����.
 * 				class A
 * 				{	
 * 					int a=10;
 * 					{
 * 						a=100;
 * 					}
 * 					A(){
 * 						a=1000;
 * 					}
 * 				}
 */
public class MovieManager { // Ŭ�����ȿ����� �������� �����ϴ� ������ �Ұ���
	static MovieVO[] movies = new MovieVO[1938];
	static StringBuffer data=new StringBuffer();

	// ��� Ŭ�������� ������ �� ���
	// ���α׷��� ������ �Ǹ� �ڵ����� => ������ �о �迭�� ����
	// Ŭ���� �ʱ�ȭ
	/*
	 * static{ }
	 */
	// �ν��Ͻ� �ʱ�ȭ ��
	/*
	 * {
	 * 
	 * }
	 */
	// �ʱ�ȭ ���
	static // ������ �޼ҵ�� ���α׷� ó������ ����Ǵµ� �� �����ڸ޼ҵ帻�� �ʱ�ȭ�����������𸣰���
	{
		try 
		{
			//File�� �д� ��쿡�� �ݵ�� ����ó��
			FileReader fr= new FileReader("c:\\javaDev\\movie.txt");

			int i=0;
			while((i=fr.read())!=-1) //fr.read �ѱ��ھ� �о�´�  , ���������������� �о�´�.
			{
				data.append(String.valueOf((char)i)); // char�� string���� ��ȯ�Ҷ� ����Ѵ�
			}
			fr.close();
			String[] movieData=data.toString().split("\n"); // *** 1)ó���� ���پ� ©���!!!
			int k=0;
			for(String s:movieData)
			{
				String[] ss=s.split("\\|");                 // *** 2)���� ¥�� ���Ŀ� |�������� ©��� �ٸ� |�� ȥ�ڻ���� �� ���� \\|�� ����Ѵ�,.
				/*
				 * 
				 */
				movies[k]=new MovieVO();
				movies[k].mno=Integer.parseInt(ss[0]);
				//���ڿ� ==> ������ ��ȯ "1" ==>1
				movies[k].titlel=ss[1]; //�ѹ��� �������� ���� �帣 ������.. �� ��� �����͸� �־��ش�.
				//System.out.println("movies["+k+"].title =:"+movies[k].titlel);
				//System.out.println("ss[1]"+ss[1]);
				movies[k].gener=ss[2];
				//System.out.println("movies["+k+"].gener =:"+movies[k].gener);
				movies[k].poster=ss[3];
				//System.out.println("ss[3]"+ss[3]);
				movies[k].actor=ss[4];
				System.out.println(movies[k].actor);
				movies[k].regdate=ss[5];
				movies[k].grade=ss[6];
				movies[k].director=ss[7];
				k++;

			}
		} catch (Exception e) {
			// TODO: handle exception
		} 
	}
	static MovieVO[] movieListData(int page)
	{
		MovieVO[] m = new MovieVO[10];
		int i=0;
		int j=0;
		int rowSize=10;
		int pagecnt=(page*rowSize)-rowSize;
		for(MovieVO vo:movies)
		{
			if(i<10 && j>=pagecnt)
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
		MovieVO[] m = new MovieVO[50];
		int i=0;
		int j=0;
		int rowSize=50;
		int pagecnt=(page*rowSize)-rowSize;
		for(MovieVO vo:movies)
		{
			if(i>50) break;
			if(i<50 && j>=pagecnt)
			{
				m[i]=vo;
				i++;
			}
			j++;
		}
		return m;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է�:");
		int page=scan.nextInt();
		
		MovieVO[] movie=movieListData(page);
		for(MovieVO vo:movie)
		{
			System.out.println("��ȭ ��ȣ:["+vo.mno+"]");
			System.out.println("��  ȭ  ��:["+vo.titlel+"]");
			System.out.println("=========================");
			
		}
		
	}
	/*
	public static void main(String[] args) { 
		System.out.println(data.toString());	
		
		for(MovieVO vo:movies)
		{
			System.out.println("��ȭ ��ȣ:"+vo.mno); 
			System.out.println("��  ȭ  ��:"+vo.titlel);
			System.out.println("��       ��:"+vo.gener);
			System.out.println("��       ��:"+vo.actor);
			System.out.println("��       ��:"+vo.director);
			System.out.println("��       ��:"+vo.grade);
			System.out.println("��  ��  ��:"+vo.regdate);
			System.out.println("=======================");
			
		}
	
	}
		*/
}
