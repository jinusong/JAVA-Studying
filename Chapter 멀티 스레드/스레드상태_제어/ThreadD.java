package ���������_����;

// ������ ���� ����
// ������ �� ����(wait(), notify(), notifyAll())
// WorkObject�� methodD()�� �����ϴ� ������


public class ThreadD extends Thread {
	private WorkObject workObject;
	
	public ThreadD(WorkObject workObject) {
		this.workObject = workObject;	//���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodD();	//���� ��ü�� methodC()�� 10�� �ݺ� ȣ��	
		}
	}
}
