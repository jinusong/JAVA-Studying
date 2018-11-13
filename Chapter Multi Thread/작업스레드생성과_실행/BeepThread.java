package 작업스레드생성과_실행;

import java.awt.Toolkit;

// 작업스레드생성과 실생
// Thread 하위 클래스로부터 생성
// 비프음을 들려주는 스레드

public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {		//스레드 실행 내용
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}
}
