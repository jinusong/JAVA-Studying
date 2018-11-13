package 동기화메소드와_동기화블록;

// 동기화메소드와 동기화 블록
// 공유객체를 사용할 때의 주의할 점
// 공유객체

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {	//계산기 메모리에 값을 저장하는 메소드
		this.memory = memory;	//매개값을 memory 필드에 저장
		try {
			Thread.sleep(2000);	//스레드를 2초간 일시 정지시킴
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);	//스레드이름 + 메모리값
	}
}