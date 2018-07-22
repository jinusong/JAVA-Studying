package ������_�׷�;

import ����_������.AutoSaveThread;
import java.util.Map;
import java.util.Set;

// ������ �׷�
// ������ �׷� �̸� ���
// ���� ���� ���� ������ ����

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();	//���μ������� �����ϴ� ��� Thread�� �������� �ڵ�
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {	//Thread�� �ϳ��� ������ ���ν�Ŵ
			System.out.println("Name: " + thread.getName() + 
					((thread.isDaemon())?"(����)": "(��)"));
			System.out.println("\t" + "�Ҽӱ׷�: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}

/*
// ������ �׷�
// ������ �׷� ����

������ �׷� �����
ThreadGroup tg = new ThreadGroup(String name);
ThreadGroup tg = new ThreadGroup(ThreadGroup parent, String name);

������ �׷��� �Ű������� ���� Thread ������ 4����
Thread t = new Thread(ThreadGroup group, Runnable target);
Thread t = new Thread(ThreadGroup group, Runnable target, String name);
Thread t = new Thread(ThreadGroup group, Runnable target, String name, long stackSize);
Thread t = new Thread(ThreadGroup group, String name);

*/