package 스레드_상태;

// 스레드 상태
// 실행 클래스

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = 
				new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
