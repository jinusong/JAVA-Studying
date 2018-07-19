package 작업스레드생성과_실행;

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
