package �۾������������_����;

import java.awt.Toolkit;

// �۾������������ �ǻ�
// Thread Ŭ�������� ���� ����
// ���� �����常 �̿��� ���

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit ��ü ���
		for(int i=0; i<5; i++) {
			toolkit.beep();		//������ �߻�
			try { Thread.sleep(500);} catch(Exception e) { }	//0.5�� �Ͻ�����
		}
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500);} catch(Exception e) { }	//0.5�� �Ͻ�����
		}
	}
}
