package 스레드상태_제어;

// 스레드 상태 제어
// 스레드 간 협업(wait(), notify(), notifyAll())
// 두 스레드의 작업 내용을 동기화 메소드로 작성한 공유 객체

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}	//data필드가 null이면 소비자 스레드를 일시 정지 상태로 만듦
		}
		String returnValue = data;
		System.out.println("ConsummerTHrea가 읽은 데이터: " + returnValue);
		data = null;	//data 필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만듦
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}	//data필드가 null이면 생산자 스레드를 일시 정지 상태로 만듦
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);	//data 필드를 null로 만들고 소비자 스레드를 실행 대기 상태로 만듦
		notify();
	}
}
