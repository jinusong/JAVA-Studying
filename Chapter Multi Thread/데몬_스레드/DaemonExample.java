package ����_������;

// ���� ������
// ���� �����尡 �����ϴ� �ڵ�

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);	//AutoSaveThread�� ���� ������� ����
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("���� ������ ����");
		}
	}
}
