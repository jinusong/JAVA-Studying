package ���������_����;

// ������ ���� ����
// ������ �� ����(wait(), notify(), notifyAll())
// �� �������� �۾� ������ ����ȭ �޼ҵ�� �ۼ��� ���� ��ü

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}	//data�ʵ尡 null�̸� �Һ��� �����带 �Ͻ� ���� ���·� ����
		}
		String returnValue = data;
		System.out.println("ConsummerTHrea�� ���� ������: " + returnValue);
		data = null;	//data �ʵ带 null�� ����� ������ �����带 ���� ��� ���·� ����
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}	//data�ʵ尡 null�̸� ������ �����带 �Ͻ� ���� ���·� ����
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: " + data);	//data �ʵ带 null�� ����� �Һ��� �����带 ���� ��� ���·� ����
		notify();
	}
}
