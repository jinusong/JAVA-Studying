package 스레드_그룹;

import 데몬_스레드.AutoSaveThread;
import java.util.Map;
import java.util.Set;

// 스레드 그룹
// 스레드 그룹 이름 얻기
// 현재 실행 중인 스레드 정보

public class ThreadInfoExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();	//프로세스에서 실행하는 모든 Thread를 가져오는 코드
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {	//Thread를 하나씩 가져와 루핑시킴
			System.out.println("Name: " + thread.getName() + 
					((thread.isDaemon())?"(데몬)": "(주)"));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}
}

/*
// 스레드 그룹
// 스레드 그룹 생성

스레드 그룹 만들기
ThreadGroup tg = new ThreadGroup(String name);
ThreadGroup tg = new ThreadGroup(ThreadGroup parent, String name);

스레드 그룹을 매개값으로 갖는 Thread 생성자 4가지
Thread t = new Thread(ThreadGroup group, Runnable target);
Thread t = new Thread(ThreadGroup group, Runnable target, String name);
Thread t = new Thread(ThreadGroup group, Runnable target, String name, long stackSize);
Thread t = new Thread(ThreadGroup group, String name);

*/