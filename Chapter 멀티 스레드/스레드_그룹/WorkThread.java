package ������_�׷�;

// ������ �׷�
// ������ �׷��� �ϰ� interrupt()
// InterruptedException�� �߻��� �� �����尡 ����ǵ��� ��

public class WorkThread extends Thread{
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);	//������ �׷�� ������ �̸��� ����
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {	//InterruptedException�� �߻��� ��, while���� �������� �����带 �����Ŵ
				System.out.println(getName() + " interrupted");	
				break;
			}
		}
		System.out.println(getName() + " �����");
	}
}
