package �۾������������_����;

import java.awt.Toolkit;

// �۾������������ �ǻ�
// Thread ���� Ŭ�����κ��� ����
// �������� ����ִ� ������

public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {		//������ ���� ����
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}
}
