package ���������_����;

// ������ ���� ����
// ������ �� ����(wait(), notify(), notifyAll())
// �� �����带 �����ϰ� �����ϴ� ���� ������


public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();	//���� ��ü ����
		
		ThreadC threadC = new ThreadC(sharedObject);
		ThreadD threadD = new ThreadD(sharedObject);
		
		threadC.start();
		threadD.start();
	}
}
