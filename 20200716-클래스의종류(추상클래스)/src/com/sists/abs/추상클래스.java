package com.sists.abs;

/**
	 * 
	 */
	
//20200716(1) p.390
/*
 * 		Ŭ������ ����
 * 			============
 * 			= �߻� Ŭ����
 * 			= �������̽� => �߻�Ŭ������ Ȯ��
 * 						�������� Ŭ������ ��Ƽ� ���� (���� �ٸ� Ŭ������ �����ؼ� ���)
 * 						*** ���ռ��� ���� ���α׷�	
 * 							====
 * 							= ���ռ� = Ŭ������ �����ϸ� �ٸ� Ŭ���� ����
 * 							= ������ = �Ѱ��� ��� ������ �� �ִ� �ɷ�(�޼ҵ�)
 * 						*** �ַλ� ��� �뵵
 * 							1. ����� �������� �������� ���
 * 							��) ��ư
 * 							   ===== �α���, ���, ����, ����, ���� 
 * 							2.�������� Ŭ������ �Ѱ��� Ŭ������ �����ҋx
 * 
 * 
 * 					�߻�Ŭ����			�������̽�
 * 			1,   		���ϻ��			���ϻ��
 *			2.      ������ �ȵ� �޼ҵ� 		������ �ȵ� �޼ҵ常 ������ �ִ�
 *					 ������ �� �޼ҵ�
 *			========================================================
 *          3.   ���� , �߻� Ŭ����
 *              public abstract class A
 *              {
 *                  public abstract void display();
 *                  public void aaa()
 *                  {
 *                  }
 *              }
 *              
 *              �������̽� 
 *              public interface B
 *              {
 *                  void display(); ==> public abstract void display();
 *                  void aaa();     ==> public abstract void aaa();
 *              }
 *        ===============================================
 *        4.  ������� 
 *            public abstract class A
 *            {
 *                private int a;
 *            }
 *            
 *            public interface B
 *            {
 *                int a; ==> error
 *                ======
 *                 �������̽��� ������ �ִ� ���� => ��������� 
 *                 int a; ==> public final static int a; => �������� ���� 
 *                 int a=10;
 *            }
 *            ==> ���� : ��� ���� => �߰��ϸ� ��� Ŭ������ error
 *            ==> �������̽� , �߻�Ŭ������ ��� ==> ��� 
 *                �ݵ�� ������ �ȵ� �޼ҵ�� �����ؼ� ��� 
 *                
 *            ��)
 *                public interface A
 *                {
 *                   public void aaa();
 *                   public void bbb();
 *                }
 *                
 *                class B implements A
 *                {
 *                    
 *                }
 *        ===============================================
 *     ============= ���� ���� 
 *     = ����Ŭ���� => ���Ŭ����
 *     = ����Ŭ���� => �͸�Ŭ���� 
 *     
 *     ������ �޼ҵ� => defaul
 */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class �߻�Ŭ���� extends JFrame implementsm MouseListener
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
