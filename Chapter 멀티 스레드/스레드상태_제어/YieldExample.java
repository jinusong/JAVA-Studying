package 스레드상태_제어;

// 스레드상태 제어
// 다른 스레드에게 실행 양보(yeield())
// 스레드 실행 양보 예제


public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();	//ThreadA, ThreadB 모두 실행
		threadB.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.work = false;	//ThreadB만 실행
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadB.work = true;	//ThreadA, ThreadB 모두 실행
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		threadA.stop = true;	//ThreadA, ThreadB 모두 종료
		threadB.stop = true;
	}
}
