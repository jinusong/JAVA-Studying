package ���������_����;

// ��������� ����
// �������� ������ ����(stop �÷���, interrupted())
// stop �÷��׸� �̿��ϴ� ���
// 1�� �� ��� �����带 ������Ŵ

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(1000); } catch (InterruptedException e) {}
		
		printThread.setStop(true);	//�����带 �����Ű�� ���� stop �ʵ带 true�� ����
	}
}
