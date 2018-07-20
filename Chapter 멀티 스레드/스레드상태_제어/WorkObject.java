package 스레드상태_제어;

// 스레드 상태 제어
// 스레드 간 협업(wait(), notify(), notifyAll())
// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체

public class WorkObject {
	public synchronized void methodC() {
		System.out.println("ThreadA의 methodC() 작업 실행");
		notify();	//일시 정지 상태에 있는 ThreadD를 실행 대기 상태로 만듦
		try {
			wait();	//ThreadC를 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodD() {
		System.out.println("ThreadB의 methodD() 작업 실행");
		notify();	// 일시 정지 상태에 있는 ThreadC를 실행 대기 상태로 만듦
		try {
			wait();	// ThreadD를 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
		}
	}
}
