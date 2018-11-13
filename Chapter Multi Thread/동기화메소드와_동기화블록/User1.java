package 동기화메소드와_동기화블록;

// 동기화메소드와 동기화 블록
// 공유객체를 사용할 때의 주의할 점
// User1 스레드

public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");	//스레드 이름을 User1로 설정
		this.calculator = calculator;	//공유 객체인 Calculator를 필드에 저장
	}
	
	public void run() {
		calculator.setMemory(100);	//공유 객체인 Calculator의 메모리에 100을 저장
	}
}
