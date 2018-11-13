package ���������_����;

// ������ ���� ����
// ������ �� ����(wait(), notify(), notifyAll())
// WorkObject�� methodC()�� �����ϴ� ������ 

public class ThreadC extends Thread {
	private WorkObject workObject;
	
	public ThreadC(WorkObject workObject) {
		this.workObject = workObject;	//���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodC();	//���� ��ü�� methodC()�� 10�� �ݺ� ȣ��		
		}
	}
}
