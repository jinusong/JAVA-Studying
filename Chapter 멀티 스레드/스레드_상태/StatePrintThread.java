package ������_����;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {	//���¸� ������ ������
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();	//������ ���� ���
			System.out.println("Ÿ�� ������ ����: " + state);
			
			if(state == Thread.State.NEW) {	//��ü ���� ������ ��� ���� ��� ���·� ����
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {	//���� ������ ��� while���� ������
				break;
			}
			try {
				//0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}
