package ���������_����;

// ��������� ����
// �������� ������ ����(stop �÷���, interrupted())
// interrupt() �޼ҵ带 �̿��ϴ� ���
// 1�� �� ��� �����带 ������Ŵ

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		thread.interrupt();	//�����带 �����Ű�� ���� InterryptedException�� �߻���Ŵ
	}
}
