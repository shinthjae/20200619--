/*
 * 
 * 			�޼ҵ� �뵵
 * 			=======
 * 				= ���, �Է�, ���
 * 				= ����
 * 				= ������ => main()
 */


//import java.io.FileReader;
public class �ڹٸ޼ҵ�5 {
	static String[] title= {
			"#����ִ�",
			"���",
			"�¿���: �� �Ϸ��� ����",
			"�Ҹ���",
			"�κ����� 2020",
			"��ũ ����Ʈ",
			"������ ���",
			"Ʈ���� ���ͽ� ��",
			"�߱��ҳ�",
			"�ƹ�ư, �ƴ�"
	};

	static void titleMax()
	{
//		String[] title= {
//				"#����ִ�",
//				"���",
//				"�¿���: �� �Ϸ��� ����",
//				"�Ҹ���",
//				"�κ����� 2020",
//				"��ũ ����Ʈ",
//				"������ ���",
//				"Ʈ���� ���ͽ� ��",
//				"�߱��ҳ�",
//				"�ƹ�ư, �ƴ�"
//		};
		
		int max=0;
		for(int i=0;i<title.length;i++)
		{
			if(max<title[i].length())
				max=title[i].length(); // ���� �� �۾� ã��
		}
		
		for(int i=0;i<title.length;i++)
		{
			if(max==title[i].length())
				System.out.println(title[i]);
		}
	}
	static void process()
	{
		System.out.println("���� �� ��ȭ��:");
		titleMax();
	}
	//=============================================================================================
	static void titleMin()
	{
//		String[] title= {
//				"#����ִ�",
//				"���",
//				"�¿���: �� �Ϸ��� ����",
//				"�Ҹ���",
//				"�κ����� 2020",
//				"��ũ ����Ʈ",
//				"������ ���",
//				"Ʈ���� ���ͽ� ��",
//				"�߱��ҳ�",
//				"�ƹ�ư, �ƴ�"
//		};
		
		int min=100;
		for(int i=0;i<title.length;i++)
		{
			if(min>title[i].length())
				min=title[i].length(); // ���� �� �۾� ã��
		}
		
		for(int i=0;i<title.length;i++)
		{
			if(min==title[i].length())
				System.out.println(title[i]);
		}
	}
		static void process1()
		{
			System.out.println("���� ª�� ��ȭ��:");
			titleMin();
		}
	
		
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		process();
		process1();
	}

}
