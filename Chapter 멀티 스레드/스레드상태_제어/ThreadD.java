package 스레드상태_제어;

// 스레드 상태 제어
// 스레드 간 협업(wait(), notify(), notifyAll())
// WorkObject의 methodD()를 실행하는 스레드


public class ThreadD extends Thread {
	private WorkObject workObject;
	
	public ThreadD(WorkObject workObject) {
		this.workObject = workObject;	//공유 객체를 매개값으로 받아 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			workObject.methodD();	//공유 객체의 methodC()를 10번 반복 호출	
		}
	}
}
