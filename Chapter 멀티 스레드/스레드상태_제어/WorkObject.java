package ���������_����;

// ������ ���� ����
// ������ �� ����(wait(), notify(), notifyAll())
// �� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü

public class WorkObject {
	public synchronized void methodC() {
		System.out.println("ThreadA�� methodC() �۾� ����");
		notify();	//�Ͻ� ���� ���¿� �ִ� ThreadD�� ���� ��� ���·� ����
		try {
			wait();	//ThreadC�� �Ͻ� ���� ���·� ����
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodD() {
		System.out.println("ThreadB�� methodD() �۾� ����");
		notify();	// �Ͻ� ���� ���¿� �ִ� ThreadC�� ���� ��� ���·� ����
		try {
			wait();	// ThreadD�� �Ͻ� ���� ���·� ����
		} catch (InterruptedException e) {
		}
	}
}
