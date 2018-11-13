package 작업스레드생성과_실행;

// 작업스레드생성과 실생
// 스레드의 이름
// ThreadB 클래스

public class ThreadB extends Thread{
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");	//ThreadB 실행 내용
		}
	}
}
