package 작업스레드생성과_실행;

// 작업스레드생성과 실생
// 스레드의 이름
// 메인 스레드 이름 출력 및 UserThread 생성 및 시작

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();	//이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());	//스레드 이름 얻기
		
		ThreadA threadA = new ThreadA();	//ThreadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();	//ThreadA 시작
		
		ThreadB threadB = new ThreadB();	//ThreadB생성
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();	//ThreadB시작
	}
}
