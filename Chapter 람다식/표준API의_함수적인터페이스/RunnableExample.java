package ǥ��API��_�Լ����������̽�;

// ǥ�� API�� �Լ��� �������̽�
// �Լ��� �������̽��� ���ٽ�

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for(int i = 0; i<10; i++) {
				System.out.println(i);	//���ٽ�( �����尡 �����ϴ� �ڵ� )
			}
		}; 
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}