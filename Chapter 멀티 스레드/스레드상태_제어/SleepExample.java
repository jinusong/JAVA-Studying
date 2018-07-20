package 스레드상태_제어;

import java.awt.Toolkit;

// 스레드상태 제어
// 주어진 시간동안 일시 정지(sleep())
// 3초 주기로 10번 비프음 발생

/*
try {
	Thread.sleep(1000);
} catch(InterruptedException e) {
	// interrupt() 메소드가 호출되면 실행
}
*/

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);	//3초 동안 메인 스레드를 일시 정지 상태를 만듦
			} catch (InterruptedException e) {}
		}
	}
}
