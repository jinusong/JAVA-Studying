package 작업스레드생성과_실행;

import java.awt.Toolkit;

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
