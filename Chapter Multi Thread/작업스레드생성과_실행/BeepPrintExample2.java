package �۾������������_����;

// �۾������������ �ǻ�
// Thread Ŭ�������� ���� ����
// ���� ������� �۾� �����尡 ���ſ� ����

public class BeepPrintExample2 {
	public static void main(String[] args) {	//���� ������
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); }
				catch(Exception e) {}
		}
	}
}
