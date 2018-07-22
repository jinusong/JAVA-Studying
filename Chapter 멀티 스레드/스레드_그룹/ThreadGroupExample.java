package 스레드_그룹;

// 스레드 그룹
// 스레드 그룹의 일괄 interrupt()
// 스레드 그룹을 이용한 일괄 그룹 예제

public class ThreadGroupExample {
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");	//myGroup에 두 스레드를 포함시킴
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();
	}
}
