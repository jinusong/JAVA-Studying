package 작업스레드생성과_실행;

// 작업스레드생성과 실생
// Thread 클래스부터 직접 생성
// 메인 스레드와 작업 스레드가 동신에 실행

public class BeepPrintExample2 {
	public static void main(String[] args) {	//메인 스레드
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); }
				catch(Exception e) {}
		}
	}
}
