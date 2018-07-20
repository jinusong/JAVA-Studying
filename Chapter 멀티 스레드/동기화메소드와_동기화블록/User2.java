package 동기화메소드와_동기화블록;

// 동기화메소드와 동기화 블록
// 공유객체를 사용할 때의 주의할 점
// User2 스레드

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");	//스레드 이름을 User2로 설정
		this.calculator = calculator;	//공유 객체인 Calculator를 필드에 저장
	}
	
	public void run() {
		calculator.setMemory(50);	//공유 객체인 Calculator의 메모리에 50을 저장
	}
}
