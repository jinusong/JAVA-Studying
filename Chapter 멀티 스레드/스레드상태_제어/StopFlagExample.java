package 스레드상태_제어;

// 스레드상태 제어
// 스레드의 안전한 종료(stop 플래그, interrupted())
// stop 플래그를 이용하는 방법
// 1초 후 출력 스레드를 중지시킴

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {Thread.sleep(1000); } catch (InterruptedException e) {}
		
		printThread.setStop(true);	//스레드를 종료시키기 위해 stop 필드를 true로 변경
	}
}
