package ���������_����;

// ��������� ����
// �ٸ� �����忡�� ���� �纸(yeield())
// ������ ���� �纸 ����


public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();	//ThreadA, ThreadB ��� ����
		threadB.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false;	//ThreadB�� ����
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadB.work = true;	//ThreadA, ThreadB ��� ����
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;	//ThreadA, ThreadB ��� ����
		threadB.stop = true;
	}
}
