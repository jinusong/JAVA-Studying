package ���������_����;

// ��������� ����
// �������� ������ ����(stop �÷���, interrupted())
// interrupt() �޼ҵ带 �̿��ϴ� ���
// ���� �ݺ��ؼ� ����ϴ� ������

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				Thread.sleep(1);	//InterruptedException �߻�
			}
		} catch(InterruptedException e) {}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}

/*
// ������
// interrupt()�� ȣ��Ǿ����� Ȯ��

public class Thread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("���� ��");
			if(Thread.intterupted()) {
				break;
			}
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
*/