package ���������_����;

import java.awt.Toolkit;

// ��������� ����
// �־��� �ð����� �Ͻ� ����(sleep())
// 3�� �ֱ�� 10�� ������ �߻�

/*
try {
	Thread.sleep(1000);
} catch(InterruptedException e) {
	// interrupt() �޼ҵ尡 ȣ��Ǹ� ����
}
*/

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);	//3�� ���� ���� �����带 �Ͻ� ���� ���¸� ����
			} catch (InterruptedException e) {}
		}
	}
}
