package 작업스레드생성과_실행;

// 작업스레드생성과 실생
// Thread 하위 클래스로부터 생성
// 메인 스레드와 작업 스레드가 동시에 실행

public class BeepPrintExample3 {
	public static void main(String[] args) {	//메인 스레드
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); }
			catch ( Exception e) {}
		}
	}
}
