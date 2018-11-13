package 작업스레드생성과_실행;

import java.awt.Toolkit;

// 작업스레드생성과 실생
// Thread 클래스부터 직접 생성
// 메인 스레드만 이용한 경우

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();		//비프음 발생
			try { Thread.sleep(500);} catch(Exception e) { }	//0.5간 일시정지
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch(Exception e) { }	//0.5간 일시정지
		}
	}
}
