package 스레드상태_제어;

// 스레드상태 제어
// 스레드의 안전한 종료(stop 플래그, interrupted())
// interrupt() 메소드를 이용하는 방법
// 무한 반복해서 출력하는 스레드

public class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);	//InterruptedException 발생
			}
		} catch(InterruptedException e) {}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}

/*
// 수정본
// interrupt()가 호출되었는지 확인

public class Thread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.intterupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
*/