package 작업스레드생성과_실행;

// 작업스레드생성과 실생
// 스레드의 이름
// ThreadA 클래스

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");	//스레드 이름 설정
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");	//ThreadA 실행 내용
		}
	}
}
