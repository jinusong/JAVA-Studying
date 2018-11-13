package 스레드_상태;

// 스레드 상태
// 타겟 스레드

public class TargetThread extends Thread{
	public void run() {
		for(long i=0; i<1000000000; i++) {}
		
		try {
			//1.5초간 일시정지
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(int i=0; i<1000000000; i++) {}
	}
}
