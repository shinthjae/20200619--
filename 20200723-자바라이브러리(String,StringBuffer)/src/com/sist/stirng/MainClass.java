package com.sist.stirng;

/*
 * 		java.lang
 * 		=========
 * 
 * 		  String / StirngBuffer
 * 		  ======
 * 			1) ���ڿ��� �ּҴ� => "Hello","Java"...
 * 			2) char[] => �����ϴ� Ŭ����
 * 			3) �ֿ� ����(�޼ҵ�)
 * 					1. langth()
 * 					2. trim() : �¿� ��������
 * 					3. substring() : ���ں���
 * 					4. indexOf() , lastIntexOf() : ������ġ
 * 					5. equals() : ����� ���ڸ� ��
 * 					6. ã�� ==>
 * 						���� : contains
 * 						���� : startsWith
 * 						 ��   : endsWith
 * 			============================================== ������� �ν��Ͻ� �޼ҵ�
 * 					7. static �޼ҵ� : valueOf() => ��� ������� ���ڿ��� ����
 * 
 * 
 *			String s1="Hello"
 *				s1.length()
 *			String s2="Hello Java"                                                                                                                                                                                                      
 * 				s2.length()
 * 
 * 			Stirng.valueOf()
 */
public class MainClass {
	
	/*
	 * 	String s="0123456789"
	 * 	s.substring(3,7) end-1
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڿ� �ڸ���
		String s="background-image: url('https://mp-seoul-image-production-s3.mangoplate.com/a4283e5725fb56755b9bbeb8f285d0dc.jpg');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'")); //s.substring�� �� �տ����� �ڸ��⶧���� +1������Ѵ� �ݸ� lastIndexOf�� �տ��� ���ܵǹǷ� ������
		System.out.println(temp.trim()); //�ڸ� ���� ������ ������ url��� ����ϱ⶧���� trim���� �������� �����
		
		
		//���ڿ��� ��� �������� ���� �������°� ���� +> ...
		String ss="���� ���عٴٸ� ���鼭 ���� �����ʹ�Ƽ. ���ĸԴ� �� ���� �䰡 �ÿ����� ������ �ƽ����� �� ���� �� ���ĸ� �����⿡ ������ �ʴ�. ������ġ��";
		if(ss.length()>20) //ss ���ڿ��� 20���ں��� ũ�ٸ�
		{
			String sss=ss.substring(0,20)+"...";
			System.out.println(sss);
		}
		
		
		//new ����ϸ� ���ο� �����ڰ� ���ܼ� �޸�(�ּ�)�� �ٸ��� ������  == ��������ʰ� equals�� ����Ѵ� 
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		/*
		 * if(s1==s3) { System.out.println("s1==s3"); } else {
		 * System.out.println("s1!=s3"); }
		 */
		
		/*
		 * 	equalsIgnoreCase : ��ҹ��� ������ ���� => ��)�˻����
		 * 	equals : ��ҹ��� ���� ���� => ��)�α���,�ߺ�üũ
		 */
		if(s1.equals(s3))
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		} //=> s1==s3
		
		if(s1.equalsIgnoreCase(s3))
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		} //=>s1==s3
		
		
	}

}
