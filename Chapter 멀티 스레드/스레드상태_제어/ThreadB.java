package 스레드상태_제어;

// 스레드상태 제어
// 다른 스레드에게 실행 양보(yield())
// 스레드 실행 양보 예제


public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {	//stop이 true가 되면 while문 종료
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();	//Work가 false가 되면 다른 스레드에게 실행 양보
			}
		}
		System.out.println("ThreadB 종료");
	}
}
