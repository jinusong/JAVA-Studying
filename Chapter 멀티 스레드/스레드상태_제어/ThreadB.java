package ���������_����;

// ��������� ����
// �ٸ� �����忡�� ���� �纸(yield())
// ������ ���� �纸 ����


public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop�� true�� �Ǹ� while�� ����
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();	//Work�� false�� �Ǹ� �ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("ThreadB ����");
	}
}
