package ���������_����;

// ������ ���� ����
// ������ �� ����(wait(), notify(), notifyAll())
// �����͸� ����(����)�ϴ� ������

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;	//���� ��ü�� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);	//���ο� �����͸� ����
		}
	}
}
