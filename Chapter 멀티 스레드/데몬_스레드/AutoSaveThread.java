package ����_������;

// ���� ������
// 1�� �ֽ÷� save() �޼ҵ带 ȣ���ϴ� ���󽺷���

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("�۾� ������ ������");
	}
	
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
