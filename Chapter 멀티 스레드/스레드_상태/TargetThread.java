package ������_����;

// ������ ����
// Ÿ�� ������

public class TargetThread extends Thread{
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		try {
			//1.5�ʰ� �Ͻ�����
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(int i=0; i<1000000000; i++) {}
	}
}
