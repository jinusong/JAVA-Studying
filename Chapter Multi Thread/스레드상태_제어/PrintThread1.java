package 스레드상태_제어;

// 스레드상태 제어
// 스레드의 안전한 종료(stop 플래그, interrupted())
// stop 플래그를 이용하는 방법
// 무한 반복해서 출력하는 스레드

public class PrintThread1 extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		
		System.out.println("자원 정리");	//stop이 true가 될 때
		System.out.println("실행 종료");
	}
}
