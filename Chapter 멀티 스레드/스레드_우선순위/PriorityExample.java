package ������_�켱����;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);	//������ �̸�
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);	//���� ���� �켱 ���� ����
			} else { 
				thread.setPriority(Thread.MAX_PRIORITY);	//���� ���� �켱 ���� ����
			}
			thread.start();
		}
	}
}
