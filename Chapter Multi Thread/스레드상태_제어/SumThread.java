package 스레드상태_제어;

// 스레드상태 제어
// 다른 스레드의 종료를 기다림(join())
// 1부터 100까지 합을 계산하는 스레드

public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i=0; i<=100; i++) {
			sum+=i;
		}
	}
}
