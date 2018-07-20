package 작업스레드생성과_실행;

import java.awt.Toolkit;

// 작업스레드생성과 실생
// Thread 클래스부터 직접 생성
// 비프음을 들려주는 작업 정의

public class BeepTask implements Runnable{
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//스레드 실행 내용
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
