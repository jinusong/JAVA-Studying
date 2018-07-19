package 동기화메소드와_동기화블록;


/*
public synchronized void method(){
	임계 영역; //단 하나의 스레드만 실행
}
 */

public class Calculator1 {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
	}
	
	/*
	public void setMemory(int memory) {
		synchronized (this) {	//공유 객체인 Calculator의 참조(잠금 대상)
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": " +this.memory+" 저장");
		}
	}
	*/
}