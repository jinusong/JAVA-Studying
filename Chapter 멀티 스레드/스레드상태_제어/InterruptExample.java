package 스레드상태_제어;

// 스레드상태 제어
// 스레드의 안전한 종료(stop 플래그, interrupted())
// interrupt() 메소드를 이용하는 방법
// 1초 후 출력 스레드를 중지시킴

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		thread.interrupt();	//스레드를 종료시키기 위해 InterryptedException을 발생시킴
	}
}
