/*
 * 
 *		������
 *		 = Container : Component�� ������ ��� ȭ�� ���
 *			= JFrame : ������â 
 *			= JWindow : Ÿ��Ʋ�ٰ� ���� â (����â������)
 *			= JDialog : ������â���� ���� ���� â (�α���â, ����â, �ڹ�������Ʈ, Ŭ���� ����â)
 *				= ��޸���
 *				= �𵨸��� : â���� �Ʒ� â Ŭ������
 *			======================================== �ܵ����� ������ ����
 *			= JPanel : �ܵ����� ������ �Ұ��� => JFrame, JWindow, JDialog
 *
 *		 = Component : �Ѱ��� ��ɸ� ������ �ִ�
 *					JLabel => �Ϲ� ���ڿ� ���, �̹��� ���
 *			= ��ư ����
 *				= �Ϲݹ�ư
 *					JButton
 *				= ��۹�ư
 *					JRadioButton
 *					JCheckBox
 *				= �޴� 
 *			= �Է�â
 *				= �����Է� : JTextField  
 *				= ��й�ȣ : JPasswordField
 *				= �������Է� : JTextArea => �Ұ�, �������, �޸���
 *				= �������Է� : JTextPane => ä��, ����
 *			= ���â
 *				= ����â : JComboBox : (ȭ��ǥ)��ư������ ������ ��� �������� ��
 *				= ��ü���� : JList : â���� ��� 
 *				= JTree : ��޵� ���� ���� ���â
 *				= JTable
 *			= ȭ�����
 *				= JTabbedPane
 *				= JSpiltPane : <div> => ȭ�� ������
 *				= JInteralFrame : ������â �ȿ� ���� ���ʰ� ���� ���� -> ���� �Ⱦ���
 *		====================================================================== ���� interface
 *
 *
 *		===> ��ġ (Layout) , ����� ���� ��ġ
 *			1) BordwrLayout
 *			2) FlowLayout
 *			3) GridLayout
 *			4) CarLayout
 *			5) ******����� ����  setBounds(10,20,800,900)
 *
 *		===> ������Ʈ : ����. ��Ʈ��ũ �帧�ľ�
 *					  		����Ŭ
 *							JSP
 *							Spring
 *							Kotlin
 *			1. �α��� ======> �������� ����
 *			2. ȸ������ 
 *			============================== ���� �� �κ�
 *			3. ��� ���
 *			4. �󼼺���
 *			5. ����, ��ٱ��� 
 *			6. ����������, ������������
 *			7. ä��
 *			==============================
 *			
 */

import javax.swing.*; // J�ø��� ���������
import java.awt.*; // ��ġ, ��ɵ�
/* 
 * 		���� ============================> (������) �����͸� ����� => ����ȭ => private
 * 		   �Ϲݺ��� 
 *        ===== => �⺻��
 * 		   �迭
 * 		   Ŭ����
 * 		  ===== => ��������
 * 		========
 * 		�޼ҵ� 
 * 		������
 * 		======== �ٸ� Ŭ������ �����ϴ� ��Ȱ ==> public
 */
public class MainFrom extends JFrame{
	private CardLayout card=new CardLayout(); // ���� Ŭ����
	// ȭ��UI => ������ => �����ϸ� �ٷ� �����ش�
	// ������ => �ѹ��� ȣ���� �����ϰ� ���۰� ���ÿ� ȣ���� �Ǵ� �޼ҵ� 
	// �����ڴ� ��� Ŭ�������� ȣ���� �����ؾ� �Ѵ� ==> public => �ٸ� Ŭ�������� ����� ���ϱ� ������ 
	Login2 login=new Login2();
	public MainFrom()
	{
		// Layout ����
		setLayout(card);
		add("LOGIN",login);
		/*
		 *  JFrame, JWindow, JDialog ==> BorderLayout
		 *  JPanel ==> FlowLayout
		 *  
		 *  ==> ����� ���� ��� ==> setLayout(null)
		 */
		setBounds(100, 30, 1000, 500);  // ������â�� ����� ��� ��ġ�� ��� ���ΰ� -> 400,60 �߾�
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrom();

	}

}
